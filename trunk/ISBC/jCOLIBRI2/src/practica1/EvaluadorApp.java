
package practica1;

import java.util.*;

import javax.swing.JOptionPane;

import org.apache.commons.logging.Log;

import jcolibri.casebase.CachedLinealCaseBase;
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
import jcolibri.extensions.recommendation.navigationByAsking.ObtainQueryWithAttributeQuestionMethod;
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
public class EvaluadorApp implements StandardCBRApplication {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	
	private Log log;
	private double confianza=0.0; 
	private double cont=0.0;
	
	public EvaluadorApp() {
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
			_caseBase  = new CachedLinealCaseBase();
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
		for(CBRCase c: cases){
			QuinielaCaso s = (QuinielaCaso) c.getDescription();
			
			s.setDifPos((Integer)(s.getPosLocal()-s.getPosVis()));
			s.setDifPuntos((Double)((s.getPuntosLocal()-s.getPuntosVis())/s.getJornada()));
			s.setGolesContraLocal((Double)(s.getGolesContraLocal())/s.getJornada());
			s.setGolesContraVis((Double)(s.getGolesContraVis())/s.getJornada());
			s.setGolesFavorLocal((Double)((s.getGolesFavorLocal())/s.getJornada()));
			s.setGolesFavorVis((Double)((s.getGolesFavorVis())/s.getJornada()));
			s.setPuntosCasaVis((Double)((s.getPuntosCasaVis())/s.getJornada()));
			s.setPuntosCasaLocal((Double)((s.getPuntosCasaLocal())/s.getJornada()));
			s.setPuntosFueraVis((Double)((s.getPuntosFueraVis())/s.getJornada()));
			s.setPuntosFueraLocal((Double)((s.getPuntosFueraLocal())/s.getJornada()));
			System.out.println(c);
		}
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
		
		//Aqui vienen las funciones de similitud particulares para cada campo
		Attribute nombreLocal = new Attribute("nombreLocal", QuinielaCaso.class);
		simConfig.addMapping(nombreLocal, new Equal());
		simConfig.setWeight(nombreLocal, 2.4);
		
		Attribute nombreVisitante = new Attribute("nombreVisitante", QuinielaCaso.class);
		simConfig.addMapping(nombreVisitante, new Equal());
		simConfig.setWeight(nombreLocal, 2.4);
		
		Attribute temporada = new Attribute("temporada", QuinielaCaso.class);
		simConfig.addMapping(temporada, new Interval(3));
		simConfig.setWeight(temporada, 0.1);
		
		Attribute puntosCasaLocal = new Attribute("puntosCasaLocal", QuinielaCaso.class);
		simConfig.addMapping(puntosCasaLocal, new Interval(3));
		simConfig.setWeight(puntosCasaLocal, 0.3);
		
		Attribute puntosFueraVis = new Attribute("puntosFueraVis", QuinielaCaso.class);
		simConfig.addMapping(puntosFueraVis, new Interval(3));
		simConfig.setWeight(puntosFueraVis, 0.3);
		
		Attribute golesLocal = new Attribute("golesFavorLocal", QuinielaCaso.class);
		simConfig.addMapping(golesLocal, new Interval(7));
		simConfig.setWeight(golesLocal, 0.2);
		
		Attribute golesVisitante = new Attribute("golesFavorVis", QuinielaCaso.class);
		simConfig.addMapping(golesVisitante, new Interval(7));
		simConfig.setWeight(golesVisitante, 0.2);
		
		Attribute golesContraLocal = new Attribute("golesContraLocal", QuinielaCaso.class);
		simConfig.addMapping(golesContraLocal, new Interval(7));
		simConfig.setWeight(golesLocal, 0.2);
		
		Attribute golesContraVisitante = new Attribute("golesContraVis", QuinielaCaso.class);
		simConfig.addMapping(golesContraVisitante, new Interval(7));
		simConfig.setWeight(golesVisitante, 0.2);


		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		//VotacionSimple voto = new VotacionSimple();	
		VotacionPonderada voto = new VotacionPonderada();
		QuinielaSolution solucion = new QuinielaSolution();
		solucion = (QuinielaSolution)voto.getPredictedSolution(eval);
		

		double prediccion;
		cont++;
		CBRCase _case = (CBRCase)query;
		QuinielaSolution sol = (QuinielaSolution)_case.getSolution();//Esto no esta bien inicializado hay que ver como se trata
		if(!(solucion.getResultado().equals(sol.getResultado()))){
			prediccion = 1.0;
			confianza++;   
		}
		else prediccion = 0.0;
		

		
		Evaluator.getEvaluationReport().addDataToSeries("Errores", new Double (prediccion));
		Evaluator.getEvaluationReport().addDataToSeries("Confianza", new Double (solucion.getConfidence()/*1-confianza/cont*/));
	
	}

	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
//		_connector.close();

	}


}