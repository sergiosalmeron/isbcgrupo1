package practica43;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import practica4.NewsConnector;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.test.main.SwingProgressBar;
import es.ucm.fdi.gaia.ontobridge.OntoBridge;
import es.ucm.fdi.gaia.ontobridge.OntologyDocument;
import es.ucm.fdi.gaia.ontobridge.test.gui.PnlConceptsAndInstancesTree;
import es.ucm.fdi.gaia.ontobridge.test.gui.PnlConceptsTree;
import es.ucm.fdi.gaia.ontobridge.test.gui.PnlSelectInstance;

public class GUI_marcador extends JFrame{

		private static final long serialVersionUID = 1L;
		private JPanel jContentPane = null;
		private JLabel imgEtiquetar = null;
		private JButton botonAtras = null;
		private JButton botonAdelante = null;
		private JButton botonEsUn = null;

		private ArrayList<String> arrayFotosNoticias = null; // @jve:decl-index=0:
		private int indiceImagen = 1;
		private JLabel labelTituloFoto = null;
		private JPanel panelOntologia = null;
		private JButton botonApareceEn = null;
		private PnlSelectInstance tree = null; // Árbol de la ontología
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
		private JLabel labelContadorEtiquetadas = null;
		private int numeroAnotadas = 0;
		private JButton botonAgregarInstancia = null;
		private JLabel labelAlConcepto = null;
		private String[] listaInstancias = null;
		
		Connector _connector;
	    CBRCaseBase _caseBase;

		// ontología

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
			this.setSize(729, 784);
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
			Iterator<String> erl = ob.listProperties("Noticias");
			Iterator<String> erl2 = ob.listProperties("Persona");
			Iterator<String> erl3 = ob.listProperties("Temas");
			Iterator<String> irl = ob.listInstances("Noticias");
			Iterator<String> irl2 = ob.listInstances("Persona");
			Iterator<String> irl3 = ob.listInstances("Temas");
			Iterator<String> it = ob.listSubClasses("Noticias", false);
			Iterator<String> it2 = ob.listSubClasses("Persona", false);
			Iterator<String> it3 = ob.listSubClasses("Temas", false);
			ArrayList<String> ar = new ArrayList<String>();
			Iterator<String> inst = ob.listInstances("Noticias");
			
			while (it.hasNext())
				ar.add(it.next());
			
			String[] listaNoticias = new String[ar.size()];
			for (int i = 0; i < listaNoticias.length; i++) {
				String aux = ar.get(i);
				listaNoticias[i] = ob.getShortName(aux);
			}
			
			while (it2.hasNext())
				ar.add(it2.next());
			while (it3.hasNext())
				ar.add(it3.next());
			
			listaConceptos = new String[ar.size()];
			for (int i = 0; i < listaConceptos.length; i++) {
				String aux = ar.get(i);
				listaConceptos[i] = ob.getShortName(aux);
			}
			
			ArrayList<String> ar2 = new ArrayList<String>();
			
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
			// Rellenamos con conceptos de nuestra ontología
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
				// Obtenemos las fotografías de la carpeta Noticias y almacenamos su
				// ruta en un ArrayList
				labelContadorEtiquetadas = new JLabel();
				labelContadorEtiquetadas.setBounds(new Rectangle(27, 503, 153, 28));
				labelContadorEtiquetadas.setText("Lleva etiquetadas: "
						+ numeroAnotadas);
				labelTituloFoto = new JLabel();
				labelTituloFoto.setBounds(new Rectangle(208, 5, 392, 34));
				labelTituloFoto.setHorizontalAlignment(SwingConstants.CENTER);
				labelTituloFoto.setText("Fotografía:");
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
				jContentPane.add(labelContadorEtiquetadas, null);
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

		protected void botonAtrasActionPerformed(ActionEvent evt) {
			if (indiceImagen>1)
			this.indiceImagen--;

			// Mostramos la siguiente imagen
			try{
			imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
					"/practica4/img/"
							+ arrayFotosNoticias.get(indiceImagen - 1))));
			}
			catch (Exception e){
				imgEtiquetar.setIcon(new ImageIcon());
			}
			// Activamos el botón Adelante, si no lo estuviera ya
			botonAdelante.setEnabled(true);
			// Si es la última imagen, desactivamos el botón Atrás
			if (indiceImagen == 1) {
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

		protected void botonAdelanteActionPerformed(ActionEvent evt) {
			this.indiceImagen++;

			// Mostramos la siguiente imagen
			try{
			imgEtiquetar.setIcon(new ImageIcon(getClass().getResource(
					"/practica4/img/" + arrayFotosNoticias.get(indiceImagen - 1))));

			}
			catch (Exception e){
				imgEtiquetar.setIcon(new ImageIcon());
			}
			// Activamos el botón Atrás, si no lo estuviera ya
			botonAtras.setEnabled(true);
			// Si es la última imagen, desactivamos el botón Siguiente
			if (indiceImagen == arrayFotosNoticias.size()) {
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
				botonApareceEn.setText("Aparece en la foto");
				botonApareceEn.setBounds(new Rectangle(322, 26, 153, 23));
				botonApareceEn
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Comprobamos que haya una instancia seleccionada
								// en el árbol
								if (tree.getSelectedInstance() == null) {
									JOptionPane
											.showMessageDialog(
													null,
													"Debe seleccionar una instancia en el árbol de la izquierda y volver a hacer clic sobre este botón.",
													"Error", 1);
								} else {
									Anotador anotador = new Anotador();
									anotador.anotarFotografiaApareceEn(ob, tree,
											arrayFotosNoticias
													.get(indiceImagen - 1),(indiceImagen - 1));
									// Incrementamos el contador de etiquetadas
									numeroAnotadas++;
									labelContadorEtiquetadas
											.setText("Lleva etiquetadas: "
													+ numeroAnotadas);
									// Informamos al usuario de que ha etiquetado
									// con éxito
									JOptionPane
											.showMessageDialog(
													null,
													"La fotografía ha sido etiquetada correctamente.",
													"Información", 1);
									tree.updateUI();
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
				
				comboConceptos.setBounds(new Rectangle(351, 33, 100, 26));
			}
			return comboConceptos;
		}
		private JComboBox getComboNoticias() {
			if (comboNoticias == null) {
				comboNoticias = new JComboBox();
				comboNoticias.setBounds(new Rectangle(351, 33, 100, 26));
			}
			return comboNoticias;
		}
		
		private JComboBox getComboTodasInstancias() {
			if (comboTodasInstancias == null) {
				comboTodasInstancias = new JComboBox();
				comboTodasInstancias.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Iterator<String> it = ob.listInstanceProperties(comboTodasInstancias.getSelectedItem().toString());
						ArrayList<String> listaProp = new ArrayList<String>();
						while(it.hasNext()){
							String auxiliar=it.next();
							if (auxiliar.startsWith("http://gaial.fdi.ucm.es/ontologias/Practica4.owl#")){
								auxiliar=auxiliar.substring(49);
								listaProp.add(auxiliar);
							}
							//listaProp.add(it.next());
						}
						if (listaProp.size()!=0){
							String[] propiedades = new String[listaProp.size()];
							for (int i = 0; i<listaProp.size(); i++){
								propiedades[i] = listaProp.get(i);
							}
							/*this.*/getComboPropiedades().setModel(
									new javax.swing.DefaultComboBoxModel(propiedades));
							comboTodasInstancias.getParent().add(comboPropiedades);
						}
					}
				});
				
				comboTodasInstancias.setBounds(new Rectangle(10, 33, 100, 26));
			}
			return comboTodasInstancias;
		}
		
		private JComboBox getComboPropiedades() {
			if (comboPropiedades == null) {
				comboPropiedades = new JComboBox();
				comboPropiedades.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Iterator<String> it = ob.listPropertyRange(comboPropiedades.getSelectedItem().toString());
						ArrayList<String> listaInst = new ArrayList<String>();
						while (it.hasNext()){
							String auxiliar=it.next();
							if (auxiliar.startsWith("http://gaial.fdi.ucm.es/ontologias/Practica4.owl#")){
								auxiliar=auxiliar.substring(49);
								listaInst.add(auxiliar);
							}
						}
						if (listaInst.size()!=0){
							String[] instancias = new String[listaInst.size()];
							for (int i = 0; i<listaInst.size(); i++){
								instancias[i] = listaInst.get(i);
							}
							/*this.*/getComboAlgunasInstancias().setModel(
									new javax.swing.DefaultComboBoxModel(listaInstancias));
								comboPropiedades.getParent().add(comboAlgunasInstancias);
						}
					}
				});
				
				comboPropiedades.setBounds(new Rectangle(115, 33, 100, 26));
			}
			return comboPropiedades;
		}
		
		private JComboBox getComboAlgunasInstancias() {
			if (comboAlgunasInstancias == null) {
				comboAlgunasInstancias = new JComboBox();
				comboAlgunasInstancias.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						/*this.*/comboAlgunasInstancias.getParent().add(getBotonRelacionar());
						
					}
				});
				
				comboAlgunasInstancias.setBounds(new Rectangle(220, 33, 100, 26));
			}
			return comboAlgunasInstancias;
		}
		
		private JButton getBotonRelacionar() {
			if (botonRelacionar == null) {
				botonRelacionar = new JButton();
				botonRelacionar.setText("Relacionar");
				botonRelacionar.setBounds(new Rectangle(330, 35, 152, 27));
				botonRelacionar
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Mostramos una ventana para que el usuario dé un
								// nombre
								// a esta nueva instancia
								String instanciaOrigen=comboTodasInstancias.getSelectedItem().toString();
								String instanciadestino=comboPropiedades.getSelectedItem().toString();
								String relacion=comboAlgunasInstancias.getSelectedItem().toString();
								Anotador etiq=new Anotador();
								etiq.anadirRelacionInstancias(ob,instanciaOrigen,
										instanciadestino,relacion);
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
				labelAlConcepto.setBounds(new Rectangle(255, 35, 88, 24));
				labelAlConcepto.setText("al concepto");
				panelConceptoPrimitivo = new JPanel();
				panelConceptoPrimitivo.setLayout(null);
				panelConceptoPrimitivo.setBounds(new Rectangle(213, 370, 489, 78));
				panelConceptoPrimitivo.setBorder(BorderFactory.createTitledBorder(null, "Agregar nuevo individuo o Asignarle concepto", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
				panelConceptoPrimitivo.add(getComboConceptos(), null);
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
				labelInstancia = new JLabel();
				labelInstancia.setBounds(new Rectangle(18, 30, 286, 19));
				labelInstancia
						.setText("Seleccione una instancia en el árbol de la izqda.");
				panelRelacionIndividuo = new JPanel();
				panelRelacionIndividuo.setLayout(null);
				panelRelacionIndividuo.setBounds(new Rectangle(213, 463, 490, 72));
				panelRelacionIndividuo.setBorder(BorderFactory.createTitledBorder(
						null, "Relación-individuo",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelRelacionIndividuo.add(getBotonApareceEn(), null);
				panelRelacionIndividuo.add(labelInstancia, null);
			}
			return panelRelacionIndividuo;
		}

		private JPanel getPanelRelacionPropiedades() {
			if (panelRelacionPropiedad == null) {
				panelRelacionPropiedad = new JPanel();
				panelRelacionPropiedad.setLayout(null);
				panelRelacionPropiedad.setBounds(new Rectangle(213, 620, 490, 72));
				panelRelacionPropiedad.setBorder(BorderFactory.createTitledBorder(
						null, "Relacionar instancias mediante propiedades",
						TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new Font("Dialog",
								Font.BOLD, 12), new Color(51, 51, 51)));
				panelRelacionPropiedad.add(getComboTodasInstancias(), null);
			
			}
			return panelRelacionPropiedad;
		}
		
		private JPanel getPanelEsUn() {
			if (panelEsUn == null) {
				panelEsUn = new JPanel();
				panelEsUn.setLayout(null);
				panelEsUn.setBounds(new Rectangle(213, 545, 490, 72));
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
		private JButton getBotonEsUn() {
			if (botonEsUn == null) {
				botonEsUn = new JButton();
				botonEsUn.setText("La Foto es un");
				botonEsUn.setBounds(new Rectangle(95, 33, 153, 23));
				botonEsUn
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Comprobamos que haya una instancia seleccionada
								// en el árbol
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
									// con éxito
									JOptionPane
											.showMessageDialog(
													null,
													"La fotografía ha sido agregada correctamente.",
													"Información", 1);
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
				botonAgregarInstancia.setBounds(new Rectangle(95, 35, 152, 27));
				botonAgregarInstancia
						.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e) {
								// Mostramos una ventana para que el usuario dé un
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
									// Llamamos al método para agregar una nueva
									// instancia
									Anotador etiq = new Anotador();
									etiq.anadirNuevoIndividuo(ob, nombreInstancia,
											comboConceptos.getSelectedItem()
													.toString());
									JOptionPane
											.showMessageDialog(
													null,
													"El individuo ha sido agregado correctamente.",
													"Información", 1);
									tree.updateUI();
									
								}
							}
						});
			}
			return botonAgregarInstancia;
		}
	    
	    public static void main(String[] args)
	    {
	    	GUI_marcador este = new GUI_marcador();
	    	este.setVisible(true);
	    }

	}

