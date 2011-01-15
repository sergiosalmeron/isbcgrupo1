package practica4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import practica42.EvaluadorAppAccionesObjetos;
import practica42.EvaluadorAppAccionesPropiedades;
import practica42.EvaluadorAppPropiedades;
import practica42.NewsDescription;
import practica42.Practica42;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.datatypes.Text;
import jcolibri.evaluation.Evaluator;
import jcolibri.evaluation.evaluators.HoldOutEvaluator;
import jcolibri.evaluation.evaluators.LeaveOneOutEvaluator;
import jcolibri.evaluation.evaluators.NFoldEvaluator;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.textual.IE.opennlp.IETextOpenNLP;
import jcolibri.extensions.textual.IE.representation.IEText;
import jcolibri.extensions.textual.lucene.LuceneIndexSpanish;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.textual.LuceneTextSimilaritySpanish;


/**
 *
 * @author usuario_local
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /** Creates new form IR */
    public InterfazPrincipal() {
    	
        initComponents();
        this.setSize(500, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        
        jTextField1 = new javax.swing.JTextField();
        jAcciones2 = new javax.swing.JCheckBox();
        jPropiedades2 = new javax.swing.JCheckBox();
        jConsulta2 = new javax.swing.JLabel();
        jRecuperar2 = new javax.swing.JButton();
        jEvaluar2 = new javax.swing.JButton();
  //      jEvaluarNFold2 = new javax.swing.JButton();
    //    jEvaluarHoldOut2 = new javax.swing.JButton();
      //  jEvaluarLeaveOneOut2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jParteI = new javax.swing.JMenu();
        jRT1 = new javax.swing.JMenuItem();
        jHoldOut1 = new javax.swing.JMenuItem();
        jLeaveOneOut1 = new javax.swing.JMenuItem();
        jNFold1 = new javax.swing.JMenuItem();
        jVisualizacion1 = new javax.swing.JMenuItem();
        jParteII = new javax.swing.JMenu();
        jAIG2 = new javax.swing.JMenuItem();
        jEvaluacionNFold2 = new javax.swing.JMenuItem();
        jEvaluacionHoldOut2 = new javax.swing.JMenuItem();
        jEvaluacionLeaveOneOut2 = new javax.swing.JMenuItem();
        eva=0;
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEnabled(false);
        jTextField1.setVisible(false);
/*        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });*/

        jAcciones2.setText("Comparar Acciones y Objetos");
        jAcciones2.setEnabled(false);
        jAcciones2.setVisible(false);

        jPropiedades2.setText("Comparar Propiedades del Texto");
        jPropiedades2.setEnabled(false);
        jPropiedades2.setVisible(false);

        jConsulta2.setText("Consulta");
        jConsulta2.setEnabled(false);
        jConsulta2.setVisible(false);
        
        jRecuperar2.setText("Recuperar");
        jRecuperar2.setEnabled(false);
        jRecuperar2.setVisible(false);
        jRecuperar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	jRecuperar2MousePressed(evt);
            }
        });
        
        jEvaluar2.setText("Evaluar");
        jEvaluar2.setEnabled(false);
        jEvaluar2.setVisible(false);
        jEvaluar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	jEvaluar2MousePressed(evt);
            }
        });
        
        jParteI.setText("ParteI");

        jRT1.setText("Recuperacion de texto");
        jRT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRT1MousePressed(evt);
            }
        });
        jParteI.add(jRT1);

        jHoldOut1.setText("HoldOut");
        jHoldOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jHoldOut1MousePressed(evt);
            }
        });
        jParteI.add(jHoldOut1);

        jLeaveOneOut1.setText("LeaveOneOut");
        jLeaveOneOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLeaveOneOut1MousePressed(evt);
            }
        });
        jParteI.add(jLeaveOneOut1);

        jNFold1.setText("NFold");
        jNFold1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jNFold1MousePressed(evt);
            }
        });
        jParteI.add(jNFold1);

        jVisualizacion1.setText("Visualizacion");
        jVisualizacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jVisualizacion1MousePressed(evt);
            }
        });
        jParteI.add(jVisualizacion1);        
        
        jMenuBar1.add(jParteI);

        jParteII.setText("ParteII");
/*        jParteII.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jParteIIMousePressed(evt);
            }
        })*/;

        jAIG2.setText("Ampliacion de la Interfaz");
        jAIG2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAIG2MousePressed(evt);
            }
        });
        
        jParteII.add(jAIG2);
        
        jEvaluacionNFold2.setText("Evaluaciones A-O-P NFold");
        jEvaluacionNFold2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	eva=0;
            	jEvaluacion2MousePressed(evt);
            }
        });
        
        jParteII.add(jEvaluacionNFold2);
        
        jEvaluacionHoldOut2.setText("Evaluaciones A-O-P HoldOut");
        jEvaluacionHoldOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	eva=1;
            	jEvaluacion2MousePressed(evt);
            }
        });
        
        jParteII.add(jEvaluacionHoldOut2);
        
        jEvaluacionLeaveOneOut2.setText("Evaluaciones A-O-P LeaveOneOut");
        jEvaluacionLeaveOneOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	eva=2;
            	jEvaluacion2MousePressed(evt);
            }
        });
        
        jParteII.add(jEvaluacionLeaveOneOut2);

        jMenuBar1.add(jParteII);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPropiedades2)
                    .addComponent(jAcciones2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jConsulta2)
                    .addComponent(jRecuperar2)
                    .addComponent(jEvaluar2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jConsulta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAcciones2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPropiedades2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRecuperar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEvaluar2)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        

        pack();
    }// </editor-fold>


    private void jRT1MousePressed(java.awt.event.MouseEvent evt) {
    	
    	Practica41 test = new Practica41();
    	try
    	{
    	    test.configure();
    	    
    	    CBRCaseBase caseBase = test.preCycle();
    	   
    	    System.out.println("CASE BASE: ");
    	    for(CBRCase c: caseBase.getCases())
    		System.out.println(c);
    	    System.out.println("Total: "+caseBase.getCases().size()+" cases");

    	    boolean _continue = true;
    	    while(_continue)
    	    {
    	    		//String titulo = javax.swing.JOptionPane.showInputDialog("Realiza la busqueda de las noticias");
            	    String queryString = javax.swing.JOptionPane.showInputDialog("Realiza la busqueda de las noticias");
            	    if(queryString == null)
            		_continue = false;
            	    else
            	    {	
                    	    CBRQuery query = new CBRQuery();
                    	    practica4.NewsDescription queryDescription = new practica4.NewsDescription();
                    	    queryDescription.setText(new Text(queryString));
                    	    queryDescription.setTitle(new Text(queryString));
                    	    query.setDescription(queryDescription);
                    	    
                    	    test.cycle(query);
            	    }
    	    }
    	    test.postCycle();
    	    
    	} catch (ExecutionException e)
    	{
    	    org.apache.commons.logging.LogFactory.getLog(Practica42.class).error(e);
    	}
    	
    	// Extraer los tokens
    	
        }
   


    private void jLeaveOneOut1MousePressed(java.awt.event.MouseEvent evt) {
    	setVisible(false);
		NFoldEvaluator eval = new NFoldEvaluator();
		eval.init(new EvaluadorApp());
		eval.NFoldEvaluation(10, 1);
		
	
		Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
		double avg = 0.0;
		for (Double d: vec)
			avg+=d;
		avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
		Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
		System.out.println(Evaluator.getEvaluationReport());
		jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluacion Quinielas",false);

    }

    private void jNFold1MousePressed(java.awt.event.MouseEvent evt) {
    	setVisible(false);
		LeaveOneOutEvaluator eval = new LeaveOneOutEvaluator();
		eval.init(new EvaluadorApp());
		eval.LeaveOneOut();
		
	
		Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
		double avg = 0.0;
		for (Double d: vec)
			avg+=d;
		avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
		Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
		System.out.println(Evaluator.getEvaluationReport());
		jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluacion Quinielas",false);

    }

    private void jHoldOut1MousePressed(java.awt.event.MouseEvent evt) {
    	setVisible(false);
		HoldOutEvaluator eval = new HoldOutEvaluator();
		eval.init(new EvaluadorApp());
		eval.HoldOut(15, 1);
	
	
		Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
		double avg = 0.0;
		for (Double d: vec)
			avg+=d;
		avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
		Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
		System.out.println(Evaluator.getEvaluationReport());
		jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluador buscador Noticias",false);

    }
    
    private void jVisualizacion1MousePressed(java.awt.event.MouseEvent evt) {
    	setVisible(false);
		try {
	    	jcolibri.util.ProgressController.clear();
	    	jcolibri.util.ProgressController.register(new jcolibri.test.main.SwingProgressBar(), jcolibri.extensions.visualization.CasesVisualization.class);
	    
		//Configure connector and case base
	    	Connector _connector = new NewsConnector("src/practica4/noticias",2);
	    	CBRCaseBase _caseBase = new LinealCaseBase();
		    
		
		// Load cases
		_caseBase.init(_connector);
		
		LuceneIndexSpanish luceneIndex = jcolibri.method.precycle.LuceneIndexCreatorSpanish.createLuceneIndex(_caseBase);
		
		// Configure NN
	//	Iterator<CBRCase> i = new Iterator(_caseBase.getCases());
	//	Collection<CBRCase> cases = _caseBase.getCases();
		Iterator<CBRCase> i = _caseBase.getCases().iterator();
		CBRQuery query= new CBRQuery();
//		while (i.hasNext()){
			query=(CBRQuery)i.next();
		NNConfig nnConfig = new NNConfig();
		nnConfig.setDescriptionSimFunction(new Average());
//		nnConfig.addMapping(new Attribute("id",NewsDescription.class), new Equal());
		Attribute texto = new Attribute("text", NewsDescription.class);
		nnConfig.addMapping(texto, new LuceneTextSimilaritySpanish(luceneIndex,query,texto, true));
		nnConfig.setWeight(texto, 0.01);
		Attribute titulo = new Attribute("title", NewsDescription.class);
		nnConfig.addMapping(titulo, new LuceneTextSimilaritySpanish(luceneIndex,query,titulo, true));
		nnConfig.setWeight(titulo, 01.0);	
		// Visualize the case base
		jcolibri.extensions.visualization.CasesVisualization.visualize(_caseBase.getCases(), nnConfig);
///		}
	} catch (Exception e) {
		org.apache.commons.logging.LogFactory.getLog(visualizacionCasos.class).error(e);
	}


}

    private void jAIG2MousePressed(java.awt.event.MouseEvent evt) {
        this.jAcciones2.setEnabled(true);
        this.jAcciones2.setVisible(true);
        this.jConsulta2.setEnabled(true);
        this.jConsulta2.setVisible(true);
        this.jPropiedades2.setEnabled(true);
        this.jPropiedades2.setVisible(true);
        this.jRecuperar2.setEnabled(true);
        this.jRecuperar2.setVisible(true);
        this.jTextField1.setEnabled(true);
        this.jTextField1.setVisible(true);
    }
    
    private void jEvaluacion2MousePressed(java.awt.event.MouseEvent evt) {
        this.jAcciones2.setEnabled(true);
        this.jAcciones2.setVisible(true);
        this.jPropiedades2.setEnabled(true);
        this.jPropiedades2.setVisible(true);
        this.jEvaluar2.setEnabled(true);
        this.jEvaluar2.setVisible(true);
    }
    
    private void jRecuperar2MousePressed(java.awt.event.MouseEvent evt) {
    	setVisible(false);
    	String queryString =jTextField1.getText();
    	Practica42 test = new Practica42();
    	try
    	{
    	    test.configure();
    	    
    	    CBRCaseBase caseBase = test.preCycle();
    	   
    	    System.out.println("CASE BASE: ");
    	    for(CBRCase c: caseBase.getCases())
    		System.out.println(c);
    	    System.out.println("Total: "+caseBase.getCases().size()+" cases");
    	    
    	    if(queryString != null){
    	
    	    	String tipo="";
    	    	boolean propiedades=false;
    	    	CBRQuery query = new CBRQuery();
    	    	practica42.NewsDescription queryDescription = new practica42.NewsDescription();
    	    	queryDescription.setText(new IETextOpenNLP(queryString));
    	    	queryDescription.setTitle(new IETextOpenNLP(queryString));
    	    	query.setDescription(queryDescription);
    	    	if (jPropiedades2.isSelected()){
    	    		propiedades=true;
    	    	}
    	    	if (jAcciones2.isSelected()){
    	    		tipo="acciones y objetos";
    	    	}
    	    	test.cycle(query,tipo,propiedades);
    	    }
    	
    	
	  test.postCycle();
      
	} 
    catch (ExecutionException e)
	{
	    org.apache.commons.logging.LogFactory.getLog(Practica42.class).error(e);
	}
	
 }   
	// Extraer los tokens	
    private void jEvaluar2MousePressed(java.awt.event.MouseEvent evt) {
    	setVisible(false);
    	if (eva==0){
        	NFoldEvaluator eval = new NFoldEvaluator();
        		if (jPropiedades2.isSelected() && jAcciones2.isSelected()){
        			eval.init(new EvaluadorAppAccionesPropiedades());
        			eval.NFoldEvaluation(5,1);
        		}
        		else if (jPropiedades2.isSelected()){
        			eval.init(new EvaluadorAppPropiedades());
        			eval.NFoldEvaluation(5,1);
        		}
        		else if (jAcciones2.isSelected()){
        			eval.init(new EvaluadorAppAccionesObjetos());
        			eval.NFoldEvaluation(5,1);    			}
        		else {
        			eval.init(new EvaluadorApp());
    				eval.NFoldEvaluation(5,1);
        		}
        	}
    	if (eva==1){
        	HoldOutEvaluator eval = new HoldOutEvaluator();
        		if (jPropiedades2.isSelected() && jAcciones2.isSelected()){
        			eval.init(new EvaluadorAppAccionesPropiedades());
        			eval.HoldOut(15,1);
        		}
        		else if (jPropiedades2.isSelected()){
        			eval.init(new EvaluadorAppPropiedades());
        			eval.HoldOut(15,1);
        		}
        		else if (jAcciones2.isSelected()){
        			eval.init(new EvaluadorAppAccionesObjetos());
        			eval.HoldOut(15,1);
    			}
        		else {
        			eval.init(new EvaluadorApp());
        			eval.HoldOut(15,1);
        		}
        	}
    	if (eva==2){
    	LeaveOneOutEvaluator eval = new LeaveOneOutEvaluator();
    		if (jPropiedades2.isSelected() && jAcciones2.isSelected()){
    			eval.init(new EvaluadorAppAccionesPropiedades());
    			eval.LeaveOneOut();
    		}
    		else if (jPropiedades2.isSelected()){
    			eval.init(new EvaluadorAppPropiedades());
    			eval.LeaveOneOut();
    		}
    		else if (jAcciones2.isSelected()){
    			eval.init(new EvaluadorAppAccionesObjetos());
    			eval.LeaveOneOut();
			}
    		else {
    			eval.init(new EvaluadorApp());
				eval.LeaveOneOut();
    		}
    	}	

		Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
		double avg = 0.0;
		for (Double d: vec)
			avg+=d;
		avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
		Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
		System.out.println(Evaluator.getEvaluationReport());
		jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluador buscador Noticias",false);

      
	} 

    

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazPrincipal a = new InterfazPrincipal();
                a.setVisible(true);
                a.setEnabled(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuItem jAIG2;
    private javax.swing.JMenuItem jEvaluacionNFold2;
    private javax.swing.JMenuItem jEvaluacionHoldOut2;
    private javax.swing.JMenuItem jEvaluacionLeaveOneOut2;
    private javax.swing.JCheckBox jAcciones2;
    private javax.swing.JButton jRecuperar2;
    private javax.swing.JButton jEvaluar2;
    private javax.swing.JLabel jConsulta2;
    private javax.swing.JMenuItem jHoldOut1;
    private javax.swing.JMenuItem jLeaveOneOut1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jNFold1;
    private javax.swing.JMenu jParteI;
    private javax.swing.JMenu jParteII;
    private javax.swing.JCheckBox jPropiedades2;
    private javax.swing.JMenuItem jRT1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jVisualizacion1;
    private int eva;
 //   private javax.swing.JButton jEvaluarNFold2;
 //   private javax.swing.JButton jEvaluarHoldOut2;
 //   private javax.swing.JButton jEvaluarLeaveOneOut2;
    // End of variables declaration

}