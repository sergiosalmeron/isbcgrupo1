/**
 * 
 */
package practica1;

import java.util.*;

import javax.swing.JOptionPane;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.evaluation.Evaluator;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.recommendation.casesDisplay.DisplayCasesTableMethod;
import jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.test.test16.EmailSolution;
import jcolibri.test.test6.Test6;
import jcolibri.test.test8.TravelDescription;

/**
 * @author anicetobacter
 *
 */
public class SolucionadorQuinielas implements StandardCBRApplication {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	public SolucionadorQuinielas() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#configure()
	 */
	@Override
	public void configure() throws ExecutionException {
		// TODO Auto-generated method stub
		try{
			_connector = new PlainTextConnector();
			_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("practica1/plaintextconfig.xml"));
			_caseBase  = new LinealCaseBase();
			} catch (Exception e){
				throw new ExecutionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#preCycle()
	 */
	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		_caseBase.init(_connector);
		java.util.Collection<CBRCase> cases = _caseBase.getCases();
		for(CBRCase c: cases)
			System.out.println(c);
		return _caseBase;
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#cycle(jcolibri.cbrcore.CBRQuery)
	 */
	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		// TODO Auto-generated method stub
		NNConfig simConfig = new NNConfig();
		//Aquivienen las funciones de similitud particulares para cada campo
		simConfig.setDescriptionSimFunction(new Average());
		simConfig.addMapping(new Attribute("nombreLocal", QuinielaCaso.class), new Equal());
		simConfig.addMapping(new Attribute("resultLocal", QuinielaCaso.class), new Equal());
		simConfig.addMapping(new Attribute("resultVisit", QuinielaCaso.class), new Equal());
		simConfig.addMapping(new Attribute("nombreVisitante", QuinielaCaso.class), new Equal());
		simConfig.addMapping(new Attribute("jornada", QuinielaCaso.class), new Interval(20));
		
		// A bit of verbose
		System.out.println("Query Description:");
		System.out.println(query.getDescription());
		System.out.println();
		
		// Ejecutamos el NN
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		Collection<CBRCase> casos = new ArrayList<CBRCase>();
		System.out.println("Casos Recuperados: ");
		for(RetrievalResult nse: eval){
			System.out.println(nse);
			casos.add(nse.get_case());
		}
		DisplayCasesTableMethod.displayCasesInTableBasic(casos);


		double prediccion;
			CBRCase _case = (CBRCase)query;
			QuinielaSolution sol = (QuinielaSolution)_case.getSolution();//Esto no esta bien inicializado hay que ver como se trata
		if(!sol.equals(_case.getResult()))
			prediccion = 1.0;
		else prediccion = 0.0;
		
		Evaluator.getEvaluationReport().addDataToSeries("Errores", new Double (prediccion));
		QuinielaSolution predict;
		predict = new QuinielaSolution();//Esto no esta bien inicializado hay que ver como se trata*/
	}
	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#postCycle()
	 */
	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		_connector.close();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolucionadorQuinielas quiniela = new SolucionadorQuinielas();
		try {
			quiniela.configure();
			quiniela.preCycle();
//			QuinielaCaso hola = new QuinielaCaso();
//			hola.setDivision(1);
//			hola.setNombreLocal("Deportivo");
//			hola.setNombreVisitante("Sporting");
			CBRQuery query = new CBRQuery();
			query.setDescription(new QuinielaCaso());
			do {
				ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query,null,null);
				quiniela.cycle(query);
			}while (JOptionPane.showConfirmDialog(null, "¿Continuar?") == JOptionPane.OK_OPTION);
			
			
			Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
			double avg = 0.0;
			for (Double d: vec)
				avg+=d;
			avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
			Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
			System.out.println(Evaluator.getEvaluationReport());
			jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluacion Quinielas",false);
		} catch (ExecutionException e) {
			org.apache.commons.logging.LogFactory.getLog(SolucionadorQuinielas.class).error(e);
		}
	}

}
