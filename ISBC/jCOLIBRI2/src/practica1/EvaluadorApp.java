
package practica1;

import java.util.*;

import jcolibri.casebase.CachedLinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.evaluation.Evaluator;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.selection.SelectCases;

/**
 * @author Grupo 1
 *
 *
 */
public class EvaluadorApp implements StandardCBRApplication {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	
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
			s.setDifPuntos((Double)((s.getPuntosLocal()-s.getPuntosVis())));
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
		
		Attribute nombreLocal = new Attribute("nombreLocal", QuinielaCaso.class);
		simConfig.setDescriptionSimFunction(new Average());
		simConfig.addMapping(nombreLocal, new Equal());
		simConfig.setWeight(nombreLocal, 2.0);
		
		Attribute nombreVisitante = new Attribute("nombreVisitante", QuinielaCaso.class);
		simConfig.addMapping(nombreVisitante, new Equal());
		simConfig.setWeight(nombreLocal, 2.0);
		
		Attribute temporada = new Attribute("temporada", QuinielaCaso.class);
		simConfig.addMapping(temporada, new Interval(3));
		simConfig.setWeight(temporada, 0.5);
		
		Attribute puntosCasaLocal = new Attribute("puntosCasaLocal", QuinielaCaso.class);
		simConfig.addMapping(puntosCasaLocal, new Interval(3));
		simConfig.setWeight(puntosCasaLocal, 1.5);
		
		Attribute puntosFueraVis = new Attribute("puntosFueraVis", QuinielaCaso.class);
		simConfig.addMapping(puntosFueraVis, new Interval(3));
		simConfig.setWeight(puntosFueraVis, 1.5);
		
		Attribute golesLocal = new Attribute("golesFavorLocal", QuinielaCaso.class);
		simConfig.addMapping(golesLocal, new Interval(3));
		simConfig.setWeight(golesLocal, 1.0);
		
		Attribute golesVisitante = new Attribute("golesFavorVis", QuinielaCaso.class);
		simConfig.addMapping(golesVisitante, new Interval(3));
		simConfig.setWeight(golesVisitante, 1.0);
		
		Attribute golesContraLocal = new Attribute("golesContraLocal", QuinielaCaso.class);
		simConfig.addMapping(golesContraLocal, new Interval(3));
		simConfig.setWeight(golesLocal, 1.0);
		
		Attribute golesContraVisitante = new Attribute("golesContraVis", QuinielaCaso.class);
		simConfig.addMapping(golesContraVisitante, new Interval(3));
		simConfig.setWeight(golesVisitante, 1.0);
		
		Attribute difPuntos = new Attribute("difPuntos", QuinielaCaso.class);
		simConfig.addMapping(difPuntos, new Interval(30));
		simConfig.setWeight(difPuntos, 2.0);
		
		Attribute difPos = new Attribute("difPos", QuinielaCaso.class);
		simConfig.addMapping(difPos, new Interval(20));
		simConfig.setWeight(difPos, 2.0);
		
		
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 10);
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
		Evaluator.getEvaluationReport().addDataToSeries("Confianza", new Double (solucion.getConfianza()/*1-confianza/cont*/));
	
	}

	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
//		_connector.close();

	}


}