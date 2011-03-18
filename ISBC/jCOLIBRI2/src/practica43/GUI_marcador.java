package practica43;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import practica4.NewsConnector;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import es.ucm.fdi.gaia.ontobridge.OntoBridge;
import es.ucm.fdi.gaia.ontobridge.OntologyDocument;
import es.ucm.fdi.gaia.ontobridge.test.gui.PnlSelectInstance;

public class GUI_marcador extends JFrame{

		private static final long serialVersionUID = 1L;
		private JPanel jContentPane = null;
		private JLabel imgEtiquetar = null;
		private JButton botonAtras = null;
		private JButton botonAdelante = null;
		private JButton botonEsUn = null;
		private JComboBox comboFoto = null;
		private ArrayList<String> arrayFotosNoticias = null; // @jve:decl-index=0:
		private int indiceImagen = 0;
		private JLabel labelTituloFoto = null;
		private JPanel panelOntologia = null;
		private JButton botonApareceEn = null;
		private PnlSelectInstance tree = null; // �rbol de la ontolog�a
		private OntoBridge ob = null; // Referencia a OntoBridge
		private JComboBox comboConceptos = null;
		private JComboBox comboNoticias = null;
		private JComboBox comboTodasInstancias = null;
		private JComboBox comboPropiedades = null;
		private JComboBox comboAlgunasInstancias = null;
		private JButton botonRelacionar = null;
		private String[] listaConceptos = null; // Lista de conceptos de nuestra
		private JPanel panelConceptoPrimitivo = null;
		private JPanel panelRelacionIndividuo = null;
		private JPanel panelEsUn = null;
		private JPanel panelRelacionPropiedad = null;
		private JLabel labelInstancia = null;
		private JButton botonAgregarInstancia = null;
		private JButton botonAgregarConcepto = null;
		private JLabel labelAlConcepto = null;
		private String[] listaInstancias = null;
		private JCheckBox checkConcepto = null; 
		
		private JTextField campoConsulta = null;
		private JButton botonConsultar = null;
		private JPanel panelConsulta = null;
		
		private JLabel LabelPersonas=null;
		private JLabel labelmgConsultadas = null;
		private JLabel imgConsultadas = null;
		private JButton botonAtras2 = null;
		private JButton botonAdelante2 = null;
		
		Connector _connector;
	    CBRCaseBase _caseBase;

		// ontolog�a

		/**
		 * This is the default constructor
		 */
		public GUI_marcador() {
			super();
			initialize();
		}

		/**
		 * This method initializes this
		 * 
		 * @return void
		 */
		
		   public CBRCaseBase preCycle() throws ExecutionException
		    {
			_caseBase.init(_connector);

			//Here we create the Lucene index
		//	luceneIndex = jcolibri.method.precycle.LuceneIndexCreatorSpanish.createLuceneIndex(_caseBase);
			
			return _caseBase;
		    }
		
		private void initialize() {
			this.setSize(1000, 730);
			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			
			
			
			arrayFotosNoticias = new ArrayList<String>();
			
			//Cargamos las noticias anteriores para extraer sus fotos
			try
			{
			    _connector = new NewsConnector("src/practica4/noticias",5);
			    _caseBase = new LinealCaseBase();
			    
			} catch (Exception e){}
			
		//	_caseBase.init(_connector);
			
			try
			{
				preCycle();			    
			} catch (Exception e){}
			
			// Creamos el objeto Ontobridge
			ob = new OntoBridge();
			ob.initWithPelletReasoner();
		//	ob.createClass("Fotos_Noticia");		
		//	ob.createOntProperty("Fotos_Noticia", "URLFoto", "Fotos_Noticia");
			
			// Creamos el objeto Ontobridge

			ArrayList<OntologyDocument> subOntologias = new ArrayList<OntologyDocument>();
			OntologyDocument ontoPrincipal = new OntologyDocument(null,
					"file:src/practica43/P4.owl");
			ob.loadOntology(ontoPrincipal, subOntologias, false);
			Iterator<String> irl = ob.listInstances("Noticias");
			Iterator<String> irl2 = ob.listInstances("Persona");
			Iterator<String> irl3 = ob.listInstances("Temas");
			Iterator<String> it = ob.listSubClasses("Noticias", true);
			ArrayList<String> ar = new ArrayList<String>();
			while (it.hasNext())
				ar.add(it.next());
			
			String[] listaNoticias = new String[ar.size()];
			for (int i = 0; i < listaNoticias.length; i++) {
				String aux = ar.get(i);
				listaNoticias[i] = ob.getShortName(aux);
			}

			listaConceptos = listaTodasClases();

			ArrayList<String> ar2 = new ArrayList<String>();
			ar2.add("-");
			
			while (irl.hasNext())
				ar2.add(irl.next());
			while (irl2.hasNext())
				ar2.add(irl2.next());
			while (irl3.hasNext())
				ar2.add(irl3.next());

			listaInstancias = new String[ar2.size()];
			for (int i = 0; i < listaInstancias.length; i++) {
				String aux = ar2.get(i);
				listaInstancias[i] = ob.getShortName(aux);
			}


			Collection<CBRCase> c= _caseBase.getCases();
			Iterator<CBRCase> itFoto =c.iterator();
			int j=0;
			while (itFoto.hasNext()){
				practica4.NewsSolution a = (practica4.NewsSolution) itFoto.next().getSolution();
				String s=a.getImgURL();
				arrayFotosNoticias.add(s);
				String nombreFoto="Foto" + "_"+ String.valueOf(j);
				ob.createInstance("Noticias", nombreFoto);
			//	ob.createDataTypeProperty(nombreFoto, "urlfoto", s);
			//	ob.createOntProperty("Foto" + "_"+ String.valueOf(j), "URLFoto", "Foto" + "_"+ String.valueOf(j));
		//		ob.createDataTypeProperty("Foto" + "_"+ String.valueOf(j), "urlfoto", a.getImgURL());
			
				j++;
				
			}
			
			this.setContentPane(getJContentPane());
			this.setTitle("Marcado de noticias");
			// Rellenamos con conceptos de nuestra ontolog�a
			this.getComboConceptos().setModel(
					new javax.swing.DefaultComboBoxModel(listaConceptos));
			this.getComboNoticias().setModel(
					new javax.swing.DefaultComboBoxModel(listaNoticias));
			this.getComboTodasInstancias().setModel(
					new javax.swing.DefaultComboBoxModel(listaInstancias));
			tree = new PnlSelectInstance(ob, false);
			this.getPanelOntologia().add(tree);
			tree.setSize(189, 400);
			tree.setVisible(true);
		}

		/**
		 * This method initializes jContentPane
		 * 
		 * @return javax.swing.JPanel
		 */
		private JPanel getJContentPane() {
			if (jContentPane == null) {
				// Obtenemos las fotograf�as de la carpeta Noticias y almacenamos su
				// ruta en un ArrayList

				labelTituloFoto = new JLabel();
				labelTituloFoto.setBounds(new Rectangle(208, 5, 392, 34));
				labelTituloFoto.setHorizontalAlignment(SwingConstants.CENTER);
				labelTituloFoto.setText("Fotograf�a: Foto_0");
				
				labelmgConsultadas = new JLabel();
				labelmgConsultadas.setBounds(new Rectangle(680, 5, 392, 34));
				labelmgConsultadas.setText("Imagenes Consultadas");
				
				
				//FiltroExtensiones filtro = new FiltroExtensiones("jpg");
		//		File carpeta = new File("src/practica4/img/");
		//		File[] listaDeArchivos = carpeta.listFiles();
		//		arrayFotosNoticias = new ArrayList<String>();

			/*	if (listaDeArchivos.length > 0) {
					arrayFotosNoticias = new ArrayList<String>();
					for (int i = 0; i < listaDeArchivos.length; i++) {
						if (listaDeArchivos[i].isFile()) {
							arrayFotosNoticias.add(listaDeArchivos[i].getName());
						}
					}
				}*/
				imgEtiquetar = new JLabel();
				imgEtiquetar.setBounds(new Rectangle(201, 56, 418, 254));
				// Cargamos inicialmente la primera imagen del ArrayList
				imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
						"/practica4/img/" + arrayFotosNoticias.get(0))));

				imgConsultadas = new JLabel();
				imgConsultadas.setBounds(new Rectangle(630, 56, 350, 254));
				// Cargamos inicialmente la primera imagen del ArrayList
				imgConsultadas.setIcon(new ImageIcon(getClass().getResource(
						"/practica4/img/" + arrayFotosNoticias.get(0))));
				
				// Cargamos inicialmente la primera imagen del ArrayList
				jContentPane = new JPanel();
				jContentPane.setLayout(null);
				jContentPane.add(imgEtiquetar, null);
				jContentPane.add(getBotonAtras(), null);
				jContentPane.add(getBotonAdelante(), null);
				jContentPane.add(labelTituloFoto, null);
				jContentPane.add(getPanelOntologia(), null);
				jContentPane.add(getPanelConceptoPrimitivo(), null);
				jContentPane.add(getPanelRelacionIndividuo(), null);
				jContentPane.add(getPanelEsUn(), null);
				jContentPane.add(getPanelRelacionPropiedades(), null);
				jContentPane.add(getPanelConsulta(),null);
				
				jContentPane.add(labelmgConsultadas, null);
				jContentPane.add(imgConsultadas, null);
				jContentPane.add(getBotonAtras2(), null);
				jContentPane.add(getBotonAdelante2(), null);
				
			}
			return jContentPane;
		}

		/**
		 * This method initializes botonAtras
		 * 
		 * @return javax.swing.JButton
		 */
		private JButton getBotonAtras() {
			if (botonAtras == null) {
				botonAtras = new JButton();
				botonAtras.setBounds(new Rectangle(292, 323, 132, 26));
				botonAtras.setText("< Anterior");
				botonAtras.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonAtrasActionPerformed(evt);
					}
				});
			}
			return botonAtras;
		}
		
		private JButton getBotonAtras2() {
			if (botonAtras2 == null) {
				botonAtras2 = new JButton();
				botonAtras2.setBounds(new Rectangle(652, 323, 132, 26));
				botonAtras2.setText("< Anterior");
				botonAtras2.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonAtrasActionPerformed2(evt);
					}
				});
			}
			return botonAtras2;
		}

		protected void botonAtrasActionPerformed(ActionEvent evt) {
			if (indiceImagen>0){
				
				this.indiceImagen--;
				labelTituloFoto.setText("Fotograf�a: Foto_" + indiceImagen);
	
				// Mostramos la siguiente imagen
				try{
				imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
						"/practica4/img/"
								+ arrayFotosNoticias.get(indiceImagen))));
				}
				catch (Exception e){
					imgEtiquetar.setIcon(new ImageIcon());
				}
			}
			// Activamos el bot�n Adelante, si no lo estuviera ya
			botonAdelante.setEnabled(true);
			// Si es la �ltima imagen, desactivamos el bot�n Atr�s
			if (indiceImagen == 0) {
				botonAtras.setEnabled(false);
			}
		}
		
		protected void botonAtrasActionPerformed2(ActionEvent evt) {
			if (indiceImagen>0){
				this.indiceImagen--;
				labelTituloFoto.setText("Fotograf�a: Foto_" + indiceImagen);
	
				// Mostramos la siguiente imagen
				try{
				imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
						"/practica4/img/"
								+ arrayFotosNoticias.get(indiceImagen))));
				}
				catch (Exception e){
					imgEtiquetar.setIcon(new ImageIcon());
				}
			}
			// Activamos el bot�n Adelante, si no lo estuviera ya
			botonAdelante.setEnabled(true);
			// Si es la �ltima imagen, desactivamos el bot�n Atr�s
			if (indiceImagen == 0) {
				botonAtras.setEnabled(false);
			}
		}

		/**
		 * This method initializes botonAdelante
		 * 
		 * @return javax.swing.JButton
		 */
		private JButton getBotonAdelante() {
			if (botonAdelante == null) {
				botonAdelante = new JButton();
				botonAdelante.setBounds(new Rectangle(422, 323, 132, 26));
				botonAdelante.setText("Siguiente >");
				botonAdelante
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(
									java.awt.event.ActionEvent evt) {
								botonAdelanteActionPerformed(evt);
							}
						});

			}
			return botonAdelante;
		}
		
		private JButton getBotonAdelante2() {
			if (botonAdelante2 == null) {
				botonAdelante2 = new JButton();
				botonAdelante2.setBounds(new Rectangle(782, 323, 132, 26));
				botonAdelante2.setText("Siguiente >");
				botonAdelante2
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(
									java.awt.event.ActionEvent evt) {
								botonAdelanteActionPerformed2(evt);
							}
						});

			}
			return botonAdelante2;
		}

		protected void botonAdelanteActionPerformed(ActionEvent evt) {
			
		//	labelTituloFoto.setText("Fotograf�a: Foto_" + indiceImagen);
			this.indiceImagen++;
			labelTituloFoto.setText("Fotograf�a: Foto_" + indiceImagen);
			

			// Mostramos la siguiente imagen
			try{
			imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
					"/practica4/img/" + arrayFotosNoticias.get(indiceImagen))));

			}
			catch (Exception e){
				imgEtiquetar.setIcon(new ImageIcon());
			}
			// Activamos el bot�n Atr�s, si no lo estuviera ya
			botonAtras.setEnabled(true);
			// Si es la �ltima imagen, desactivamos el bot�n Siguiente
			if (indiceImagen == arrayFotosNoticias.size()-1) {
				botonAdelante.setEnabled(false);
			}
		}
		
		protected void botonAdelanteActionPerformed2(ActionEvent evt) {
			//	labelTituloFoto.setText("Fotograf�a: Foto_" + indiceImagen);
				this.indiceImagen++;
				labelTituloFoto.setText("Fotograf�a: Foto_" + indiceImagen);
				

				// Mostramos la siguiente imagen
				try{
				imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
						"/practica4/img/" + arrayFotosNoticias.get(indiceImagen))));

				}
				catch (Exception e){
					imgEtiquetar.setIcon(new ImageIcon());
				}
				// Activamos el bot�n Atr�s, si no lo estuviera ya
				botonAtras.setEnabled(true);
				// Si es la �ltima imagen, desactivamos el bot�n Siguiente
				if (indiceImagen == arrayFotosNoticias.size()-1) {
					botonAdelante.setEnabled(false);
				}
			}

		/**
		 * This method initializes panelOntologia
		 * 
		 * @return javax.swing.JPanel
		 */
		private JPanel getPanelOntologia() {
			if (panelOntologia == null) {
				panelOntologia = new JPanel();
				panelOntologia.setLayout(null);
				// panelOntologia.setBounds(new Rectangle(15, 48, 171, 424));
				panelOntologia.setSize(189, 400);
				panelOntologia.setLocation(new Point(3, 46));
			}
			return panelOntologia;
		}

		/**
		 * This method initializes botonApareceEn
		 * 
		 * @return javax.swing.JButton
		 */
		private JButton getBotonApareceEn() {
			if (botonApareceEn == null) {
				botonApareceEn = new JButton();
				botonApareceEn.setText("Relaciona foto");
				botonApareceEn.setBounds(new Rectangle(300, 25, 153, 23));
				botonApareceEn
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Comprobamos que haya una instancia seleccionada
								// en el �rbol
								if (tree.getSelectedInstance() == null) {
									JOptionPane
											.showMessageDialog(
													null,
													"Debe seleccionar una instancia en el �rbol (tieneLugar-Lugar, aparece-Persona,trataSobre-Temas)",
													"Error", 1);
								} else {
									Iterator<String> it = ob.listPropertyRange(comboFoto.getSelectedItem().toString());
									ArrayList<String> ars = new ArrayList<String>();
									while (it.hasNext()){
										ars.add(ob.getShortName(it.next()));
									}
									Iterator<String> it2 = ob.listBelongingClasses(tree.getSelectedInstance());
									ArrayList<String> ar2 = new ArrayList<String>();
									while (it2.hasNext()){
										ar2.add(ob.getShortName(it2.next()));
									}
									boolean contiene = false;
									for (int j =0; (j<ar2.size() && !contiene);j++){
										contiene = ars.contains(ar2.get(j));
									}
									if(!contiene){
										JOptionPane
										.showMessageDialog(
												null,
												"Debe seleccionar una instancia en el �rbol (tieneLugar-Lugar, aparece-Persona,trataSobre-Temas)",
												"Error", 1);
									}
									else{
										Anotador anotador = new Anotador();
										anotador.anotarFotografiaApareceEn(ob, tree,
												arrayFotosNoticias
														.get(indiceImagen),(indiceImagen), comboFoto.getSelectedItem().toString());
										// Incrementamos el contador de etiquetadas
										// Informamos al usuario de que ha etiquetado
										// con �xito
										JOptionPane
												.showMessageDialog(
														null,
														"La fotograf�a ha sido etiquetada correctamente.",
														"Informaci�n", 1);
										tree.updateUI();
									}
								}
								
								String fotoActual = "Foto_" + indiceImagen;
								String gente="";
								Iterator<String> itProp =ob.listPropertyValue(fotoActual, ob.getURI("aparece"));
								while(itProp.hasNext()){
									String auxiliar=itProp.next();
									if (auxiliar.startsWith("http://gaial.fdi.ucm.es/ontologias/Practica4.owl#")){
										auxiliar=auxiliar.substring(49);
									}
									System.out.println(auxiliar);
									if(gente==""){
										gente = auxiliar;
									}
									else{
										gente = gente + ", " + auxiliar;
									}
									LabelPersonas.setText(gente);
								}
							}
						});
			}
			return botonApareceEn;
		}

		/**
		 * This method initializes comboConceptos
		 * 
		 * @return javax.swing.JComboBox
		 */
		private JComboBox getComboConceptos() {
			if (comboConceptos == null) {
				comboConceptos = new JComboBox();
				
				comboConceptos.setBounds(new Rectangle(50,160 , 190, 26));
			}
			return comboConceptos;
		}
		private JComboBox getComboNoticias() {
			if (comboNoticias == null) {
				comboNoticias = new JComboBox();
				comboNoticias.setBounds(new Rectangle(300, 25, 130, 26));
			}
			return comboNoticias;
		}
		
		private JComboBox getComboTodasInstancias() {
			if (comboTodasInstancias == null) {
				comboTodasInstancias = new JComboBox();
				
				comboTodasInstancias.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if (!(comboTodasInstancias.getSelectedItem().toString().equals("-"))){
							Iterator<String> it1 = ob.listDeclaredBelongingClasses(comboTodasInstancias.getSelectedItem().toString());
							ArrayList<String> listaProp = new ArrayList<String>();
							listaProp.add("-");
							while(it1.hasNext()){
								Iterator<String> it = ob.listProperties(it1.next());
								while(it.hasNext()){
									String auxiliar=it.next();
									if (auxiliar.startsWith("http://gaial.fdi.ucm.es/ontologias/Practica4.owl#")){
										auxiliar=auxiliar.substring(49);
										listaProp.add(auxiliar);
									}
								//listaProp.add(it.next());
									}
							}
							if (listaProp.size()!=0){
								String[] propiedades = new String[listaProp.size()];
								for (int i = 0; i<listaProp.size(); i++){
									propiedades[i] = listaProp.get(i);
								}
								/*this.*/getComboPropiedades().setModel(
										new javax.swing.DefaultComboBoxModel(propiedades));
								comboPropiedades.setVisible(true);
								comboAlgunasInstancias.setVisible(false);
								botonRelacionar.setEnabled(false);
							}
						}
					}
				});
				
				comboTodasInstancias.setBounds(new Rectangle(10, 25, 100, 26));
			}
			return comboTodasInstancias;
		}
		
		private JComboBox getComboPropiedades() {
			if (comboPropiedades == null) {
				comboPropiedades = new JComboBox();
		//		comboPropiedades.getParent().add(getComboAlgunasInstancias());
				comboPropiedades.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if (!(comboPropiedades.getSelectedItem().toString().equals("-"))){
							Iterator<String> it = ob.listPropertyRange(comboPropiedades.getSelectedItem().toString());
							ArrayList<String> listaInst = new ArrayList<String>();
							listaInst.add("-");
							while (it.hasNext()){
								String auxiliar=it.next();
								if (auxiliar.startsWith("http://gaial.fdi.ucm.es/ontologias" +
										"/Practica4.owl#")){
									auxiliar=auxiliar.substring(49);
									Iterator<String> it2 = ob.listInstances(auxiliar);
									while(it2.hasNext()){
										listaInst.add(ob.getShortName(it2.next()));
									}
								}
							}
							if (listaInst.size()!=0){
								String[] instancias = new String[listaInst.size()];
								for (int i = 0; i<listaInst.size(); i++){
									instancias[i] = listaInst.get(i);
								}
								/*this.*/getComboAlgunasInstancias().setModel(
										new javax.swing.DefaultComboBoxModel(instancias));
								comboAlgunasInstancias.setVisible(true);
								botonRelacionar.setEnabled(false);
							}
								
						}
					}
				});
				
				comboPropiedades.setBounds(new Rectangle(115, 25, 100, 26));
			}
			return comboPropiedades;
		}
		
		private JComboBox getComboAlgunasInstancias() {
			if (comboAlgunasInstancias == null) {
				comboAlgunasInstancias = new JComboBox();
		//		comboAlgunasInstancias.getParent().add(getBotonRelacionar());
				comboAlgunasInstancias.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						/*this.*/botonRelacionar.setEnabled(true);
						
					}
				});
				
				comboAlgunasInstancias.setBounds(new Rectangle(220, 25, 100, 26));
			}
			return comboAlgunasInstancias;
		}
		
		private JButton getBotonRelacionar() {
			if (botonRelacionar == null) {
				botonRelacionar = new JButton();
				botonRelacionar.setText("Relacionar");
				botonRelacionar.setBounds(new Rectangle(330, 25, 102, 27));
				botonRelacionar.setEnabled(false);
				botonRelacionar
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								String instanciaOrigen=comboTodasInstancias.getSelectedItem().toString();
								String instanciadestino=comboPropiedades.getSelectedItem().toString();
								String relacion=comboAlgunasInstancias.getSelectedItem().toString();
								if (instanciaOrigen.equals("-"))
									JOptionPane.showMessageDialog(null,"Falta algun campo por definir");
								else{
									Anotador etiq=new Anotador();
									etiq.anadirRelacionInstancias(ob,instanciaOrigen,
											instanciadestino,relacion);
									comboAlgunasInstancias.setVisible(false);
									comboPropiedades.setVisible(false);
									botonRelacionar.setEnabled(false);
								}
							}
						});
			}
			return botonRelacionar;
		}
	    
		/**
		 * This method initializes panelConceptoPrimitivo
		 * 
		 * @return javax.swing.JPanel
		 */
		private JPanel getPanelConceptoPrimitivo() {
			if (panelConceptoPrimitivo == null) {
				labelAlConcepto = new JLabel();
				labelAlConcepto.setBounds(new Rectangle(40, 120, 90, 30));
				labelAlConcepto.setText("al concepto");
				checkConcepto = new JCheckBox();
				checkConcepto.setBounds(new Rectangle(130, 120, 150, 30));
				checkConcepto.setText("es SubClase de");
				panelConceptoPrimitivo = new JPanel();
				panelConceptoPrimitivo.setLayout(null);
				panelConceptoPrimitivo.setBounds(new Rectangle(700, 370, 290, 200));
				panelConceptoPrimitivo.setBorder(BorderFactory.createTitledBorder(null, "Agregar nuevo individuo o concepto", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
				panelConceptoPrimitivo.add(getComboConceptos(), null);
				panelConceptoPrimitivo.add(checkConcepto);
				panelConceptoPrimitivo.add(getBotonAgregarConcepto(),null);
				panelConceptoPrimitivo.add(getBotonAgregarInstancia(), null);
				panelConceptoPrimitivo.add(labelAlConcepto, null);
			}
			return panelConceptoPrimitivo;
		}

		/**
		 * This method initializes panelRelacionIndividuo
		 * 
		 * @return javax.swing.JPanel
		 */
		private JPanel getPanelRelacionIndividuo() {
			if (panelRelacionIndividuo == null) {
				comboFoto = new JComboBox();
				Iterator<String> it = ob.listProperties("Noticias");
				ArrayList<String> aux = new ArrayList<String>();
				while(it.hasNext()){
					String auxiliar = ob.getShortName(it.next());
					if(!auxiliar.equals("urlfoto") && !auxiliar.equals("urltext") && !auxiliar.equals("esUn"))
						aux.add(auxiliar);
				}
				String[] lista = new String[aux.size()];
				for(int i = 0; i<aux.size(); i++){
					lista[i] = aux.get(i);
				}
				comboFoto.setModel(new javax.swing.DefaultComboBoxModel(lista));
//				labelInstancia = new JLabel();
//				labelInstancia.setBounds(new Rectangle(8, 25, 286, 19));
//				labelInstancia
//						.setText("Seleccione una instancia en el �rbol de la izqda.");
				panelRelacionIndividuo = new JPanel();
				panelRelacionIndividuo.setLayout(null);
				comboFoto.setBounds(new Rectangle(25,20,150,30));
				panelRelacionIndividuo.setBounds(new Rectangle(213, 428, 470, 60));
				panelRelacionIndividuo.setBorder(BorderFactory.createTitledBorder(
						null, "Marcador de fotos",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelRelacionIndividuo.add(getBotonApareceEn(), null);
				panelRelacionIndividuo.add(comboFoto, null);
			}
			return panelRelacionIndividuo;
		}

		private JPanel getPanelRelacionPropiedades() {
			if (panelRelacionPropiedad == null) {
				panelRelacionPropiedad = new JPanel();
				panelRelacionPropiedad.setLayout(null);
				panelRelacionPropiedad.setBounds(new Rectangle(213, 486, 470, 60));
				panelRelacionPropiedad.setBorder(BorderFactory.createTitledBorder(
						null, "Relacionar instancias mediante propiedades",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelRelacionPropiedad.add(getBotonRelacionar());
				panelRelacionPropiedad.add(getComboAlgunasInstancias());
				panelRelacionPropiedad.add(getComboPropiedades());
				panelRelacionPropiedad.add(getComboTodasInstancias(), null);
				
				comboPropiedades.setVisible(false);
				comboAlgunasInstancias.setVisible(false);
				botonRelacionar.setEnabled(false);
				
			
			}
			return panelRelacionPropiedad;
		}
		
	/*	private JPanel getPanelEsUn() {
			if (panelEsUn == null) {
				panelEsUn = new JPanel();
				panelEsUn.setLayout(null);
				panelEsUn.setBounds(new Rectangle(213, 370, 470, 60));
				panelEsUn.setBorder(BorderFactory.createTitledBorder(
						null, "Asertar Foto-Noticia",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelEsUn.add(getBotonEsUn(), null);
				panelEsUn.add(getComboNoticias(), null);
			}
			return panelEsUn;
		}
	*/	
		private JPanel getPanelEsUn() {
			if (panelEsUn == null) {
				panelEsUn = new JPanel();
				panelEsUn.setLayout(null);
				panelEsUn.setBounds(new Rectangle(213, 370, 470, 60));
				panelEsUn.setBorder(BorderFactory.createTitledBorder(
						null, "Aparecen en la foto:",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelEsUn.add(getLabel());
			}
			return panelEsUn;
		}
		
		private JLabel getLabel() {
			LabelPersonas = new JLabel();
			LabelPersonas.setBounds(new Rectangle(10, 15, 392, 34));
			LabelPersonas.setHorizontalAlignment(SwingConstants.CENTER);
			LabelPersonas.setText("");
			
			return LabelPersonas;
		}
		
		
		private JButton getBotonEsUn() {
			if (botonEsUn == null) {
				botonEsUn = new JButton();
				botonEsUn.setText("La Foto es de una noticia");
				botonEsUn.setBounds(new Rectangle(45, 25, 181, 23));
				botonEsUn
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Comprobamos que haya una instancia seleccionada
								// en el �rbol
								String s = comboNoticias.getSelectedItem().toString();
								if (s== null) {
									JOptionPane
											.showMessageDialog(
													null,
													"Debe seleccionar un tipo de noticia",
													"Error", 1);
								} else {
									Anotador anotador = new Anotador();
									anotador.anotarFotografiaEsUn(ob, s,null,indiceImagen);
									// Informamos al usuario de que ha etiquetado
									// con �xito
									JOptionPane
											.showMessageDialog(
													null,
													"La fotograf�a ha sido agregada correctamente.",
													"Informaci�n", 1);
									tree.updateUI();
								}
							}
						});
			}
			return botonEsUn;
		}


		/**
		 * This method initializes botonAgregarInstancia
		 * 
		 * @return javax.swing.JButton
		 */
		private JButton getBotonAgregarInstancia() {
			if (botonAgregarInstancia == null) {
				botonAgregarInstancia = new JButton();
				botonAgregarInstancia.setText("Agregar Instancia");
				botonAgregarInstancia.setBounds(new Rectangle(70, 35, 152, 27));
				botonAgregarInstancia
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Mostramos una ventana para que el usuario d� un
								// nombre
								// a esta nueva instancia
								String nombreInstancia = (String) JOptionPane
										.showInputDialog(
												null,
												"Introduzca un nombre para el nuevo individuo:\n",
												"Introduzca nombre",
												JOptionPane.PLAIN_MESSAGE, null,
												null, "Individuo");

								if ((nombreInstancia != null)
										&& (nombreInstancia.length() > 0)) {
									// Llamamos al m�todo para agregar una nueva
									// instancia
									Anotador etiq = new Anotador();
									etiq.anadirNuevoIndividuo(ob, nombreInstancia,
											comboConceptos.getSelectedItem()
													.toString());
									JOptionPane
											.showMessageDialog(
													null,
													"El individuo ha sido agregado correctamente.",
													"Informaci�n", 1);
									tree.updateUI();
									
								}
							}
						});
			}
			return botonAgregarInstancia;
		}
		
		private JButton getBotonAgregarConcepto() {
			if (botonAgregarConcepto == null) {
				botonAgregarConcepto = new JButton();
				botonAgregarConcepto.setText("Agregar Concepto");
				botonAgregarConcepto.setBounds(new Rectangle(70, 70, 152, 27));
				botonAgregarConcepto
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Mostramos una ventana para que el usuario d� un
								// nombre
								// a esta nueva instancia
								String nombreConcepto = (String) JOptionPane
										.showInputDialog(
												null,
												"Introduzca un nombre para el nuevo concepto:\n",
												"Introduzca nombre",
												JOptionPane.PLAIN_MESSAGE, null,
												null, "Concepto");

								if ((nombreConcepto != null)
										&& (nombreConcepto.length() > 0)) {
									// Llamamos al m�todo para agregar una nueva
									// instancia
									Anotador etiq = new Anotador();
									boolean check = checkConcepto.isSelected();
									etiq.anadirNuevoConcepto(ob, nombreConcepto,
											comboConceptos.getSelectedItem()
													.toString(),check);
									JOptionPane
											.showMessageDialog(
													null,
													"El concepto ha sido agregado correctamente.",
													"Informaci�n", 1);
									tree.updateUI();
									
								}
							}
						});
			}
			return botonAgregarConcepto;
		}
		
		
		private JPanel getPanelConsulta() {
			if (panelConsulta == null) {
				panelConsulta = new JPanel();
				panelConsulta.setLayout(null);
				panelConsulta.setBounds(new Rectangle(213, 550, 470, 100));
				panelConsulta.setBorder(BorderFactory.createTitledBorder(
						null, "Consultar relaciones existentes",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelConsulta.add(getBotonConsultar(), null);
				campoConsulta=new JTextField();
				campoConsulta.setEditable(true);
				campoConsulta.setEnabled(true);
				campoConsulta.setVisible(true);
				campoConsulta.setBounds(new Rectangle(30, 40, 250, 26));
				panelConsulta.add(campoConsulta);
			}
			return panelConsulta;
		}
		
		
		private JButton getBotonConsultar() {
			if (botonConsultar == null) {
				botonConsultar = new JButton();
				botonConsultar.setText("Consultar");
				botonConsultar.setBounds(new Rectangle(300, 40, 100, 26));
				botonConsultar
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Comprobamos que haya una instancia seleccionada
								// en el �rbol
								String consulta= campoConsulta.getText();
								RecuperadorSemantico etiq = new RecuperadorSemantico();
								etiq.consultarOntologia(ob,consulta);
							}
						});
			}
			return botonConsultar;
		}
		
		
		public String[] listaTodasClases (){
			Iterator<String> clases = ob.listAllClasses();
			ArrayList<String> listac = new ArrayList<String>();
			while (clases.hasNext()){
				String auxiliar=clases.next();
				if (auxiliar.startsWith("http://gaial.fdi.ucm.es/ontologias/Practica4.owl#")){
					auxiliar=auxiliar.substring(49);
					listac.add(auxiliar);
				}
			}
			String[] listaClases = new String[listac.size()];
			for (int i = 0; i<listac.size();i++){
				listaClases[i] = listac.get(i);
			}
			return listaClases;
		}
	    
	    public static void main(String[] args)
	    {
	    	GUI_marcador este = new GUI_marcador();
	    	este.setVisible(true);
	    }

	}

