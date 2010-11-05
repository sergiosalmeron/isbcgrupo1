/**
 * 
 */
package practica1;

import java.util.*;
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
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
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
		simConfig.setDescriptionSimFunction(new Average());
		simConfig.addMapping(new Attribute("nombreLocal", QuinielaCaso.class), new Equal());
		Attribute duration = new Attribute("resultLocal", QuinielaCaso.class);
		simConfig.addMapping(duration, new Interval(31));
		simConfig.setWeight(duration, 0.5);
		simConfig.addMapping(new Attribute("resultVisit", QuinielaCaso.class), new Equal());
		simConfig.addMapping(new Attribute("nombreVisitante", QuinielaCaso.class), new Equal());
		simConfig.addMapping(new Attribute("jornada", QuinielaCaso.class), new Interval(20));
		double prediccion;
		CBRCase _case = (CBRCase)query;
		QuinielaSolution sol = (QuinielaSolution)_case.getSolution();//Esto no esta bien inicializado hay que ver como se trata
		if(!sol.equals(_case.getResult()))
			prediccion = 1.0;
		else prediccion = 0.0;
		
		Evaluator.getEvaluationReport().addDataToSeries("Errores", new Double (prediccion));
		QuinielaSolution predict;
		predict = new QuinielaSolution();//Esto no esta bien inicializado hay que ver como se trata
		Evaluator.getEvaluationReport().addDataToSeries("Confianza", new Double (predict.getConfidence()));
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
			QuinielaCaso hola = new QuinielaCaso();
			hola.setDivision(1);
			hola.setNombreLocal("Deportivo");
			hola.setNombreVisitante("Sporting");
			CBRQuery query = new CBRQuery();
			query.setDescription(hola);
			quiniela.cycle(query);
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
