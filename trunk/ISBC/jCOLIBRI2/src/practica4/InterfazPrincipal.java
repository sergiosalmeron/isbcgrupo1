package practica4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jAcciones2 = new javax.swing.JCheckBox();
        jPropiedades2 = new javax.swing.JCheckBox();
        jConsulta2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jParteI = new javax.swing.JMenu();
        jRT1 = new javax.swing.JMenuItem();
        jHoldOut1 = new javax.swing.JMenuItem();
        jLeaveOneOut1 = new javax.swing.JMenuItem();
        jNFold1 = new javax.swing.JMenuItem();
        jVisualizacion1 = new javax.swing.JMenuItem();
        jParteII = new javax.swing.JMenu();
        jAIG2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jParteII.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jParteIIMousePressed(evt);
            }
        });

        jAIG2.setText("Ampliacion de la Interfaz");
        jParteII.add(jAIG2);

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
                    .addComponent(jButton1))
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
                .addComponent(jButton1)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    private void jRT1MousePressed(java.awt.event.MouseEvent evt) {
    	Practica42 test = new Practica42();
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
                    	    NewsDescription queryDescription = new NewsDescription();
                    	    queryDescription.setText(new IEText(queryString));
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
		Collection<CBRCase> cases = _caseBase.getCases();
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

    private void jParteIIMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }
    
    
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
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
    private javax.swing.JCheckBox jAcciones2;
    private javax.swing.JButton jButton1;
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
    // End of variables declaration

}