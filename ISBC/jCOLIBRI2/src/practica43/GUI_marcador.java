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

		private ArrayList<String> arrayFotosNoticias = null; // @jve:decl-index=0:
		private int indiceImagen = 1;
		private JLabel labelTituloFoto = null;
		private JPanel panelOntologia = null;
		private JButton botonApareceEn = null;
		private PnlSelectInstance tree = null; // Árbol de la ontología
		private OntoBridge ob = null; // Referencia a OntoBridge
		private JComboBox comboConceptos = null;
		private String[] listaConceptos = null; // Lista de conceptos de nuestra
		private JPanel panelConceptoPrimitivo = null;
		private JPanel panelRelacionIndividuo = null;
		private JLabel labelInstancia = null;
		private JLabel labelContadorEtiquetadas = null;
		private int numeroAnotadas = 0;
		private JButton botonAgregarInstancia = null;
		private JLabel labelAlConcepto = null;
		
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
			this.setSize(729, 584);
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
			ob.createClass("Fotos_Noticia");		
		//	ob.createOntProperty("Fotos_Noticia", "URLFoto", "Fotos_Noticia");
			Collection<CBRCase> c= _caseBase.getCases();
			Iterator<CBRCase> itFoto =c.iterator();
			int j=0;
			while (itFoto.hasNext()){
				practica4.NewsSolution a = (practica4.NewsSolution) itFoto.next().getSolution();
				arrayFotosNoticias.add(a.getImgURL());
				ob.createInstance("Fotos_Noticia", /*a.getImgURL()*/ "Foto" + "_"+ String.valueOf(j));
			//	ob.createOntProperty("Foto" + "_"+ String.valueOf(j), "URLFoto", "Foto" + "_"+ String.valueOf(j));
			//	ob.createDataTypeProperty("Foto" + "_"+ String.valueOf(j), "URLFoto", a.getImgURL());
				j++;
				
			}
			
			
			this.setContentPane(getJContentPane());
			this.setTitle("Marcado de noticias");

			
			// Creamos el objeto Ontobridge

			ArrayList<OntologyDocument> subOntologias = new ArrayList<OntologyDocument>();
			OntologyDocument ontoPrincipal = new OntologyDocument(null,
					"file:src/practica43/P4.owl");
			ob.loadOntology(ontoPrincipal, subOntologias, false);
			Iterator<String> it = ob.listSubClasses("Noticias", false);
			Iterator<String> it2 = ob.listSubClasses("Persona", false);
			Iterator<String> it3 = ob.listSubClasses("Temas", false);
			ArrayList<String> ar = new ArrayList<String>();
			while (it.hasNext())
				ar.add(it.next());
			while (it2.hasNext())
				ar.add(it2.next());
			while (it3.hasNext())
				ar.add(it3.next());
			

			listaConceptos = new String[ar.size()];
			for (int i = 0; i < listaConceptos.length; i++) {
				String aux = ar.get(i);
				listaConceptos[i] = ob.getShortName(aux);
			}
			// Rellenamos con conceptos de nuestra ontología
			this.getComboConceptos().setModel(
					new javax.swing.DefaultComboBoxModel(listaConceptos));
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
													.get(indiceImagen - 1));
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
				panelConceptoPrimitivo.setBorder(BorderFactory.createTitledBorder(null, "Agregar nuevo individuo", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
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

