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
		Attribute nombreLocal = new Attribute("nombreLocal", QuinielaCaso.class);
		//Aqui vienen las funciones de similitud particulares para cada campo
		simConfig.setDescriptionSimFunction(new Average());
		simConfig.addMapping(nombreLocal, new Equal());
		simConfig.setWeight(nombreLocal, 0.4);
		
		Attribute nombreVisitante = new Attribute("nombreVisitante", QuinielaCaso.class);
		simConfig.addMapping(nombreVisitante, new Equal());
		simConfig.setWeight(nombreLocal, 0.4);
		
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
		
		
		// A bit of verbose
		System.out.println("Query Description:");
		System.out.println(query.getDescription());

		System.out.println();
		
		// Ejecutamos el NN
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		VotacionSimple voto = new VotacionSimple();
		//Evaluamos por numero de votos
		QuinielaSolution solucion = new QuinielaSolution();
		solucion = (QuinielaSolution)voto.getPredictedSolution(eval);
		System.out.println("por votacion Simple " +solucion);
		JOptionPane.showMessageDialog(null, solucion.toString());
		//Evaluamos por similitud de los casos
		VotacionPonderada votoP = new VotacionPonderada();
		QuinielaSolution solucionP = new QuinielaSolution(); 
		solucionP = (QuinielaSolution)votoP.getPredictedSolution(eval);
		JOptionPane.showMessageDialog(null, solucionP.toString());
		//System.out.println("por votacion ponderada " +solucionP);
		//System.out.println(solucionP.getConfidence());
		//CBRCase solucion = jcolibri.method.reuse.classification.AbstractKNNClassificationMethod.class.
		Collection<CBRCase> casos = new ArrayList<CBRCase>();
		System.out.println("Casos Recuperados: ");
		for(RetrievalResult nse: eval){
		//	System.out.println(nse);
		//	System.out.println(nse.get_case().getSolution());
		casos.add(nse.get_case());
		//}
		}
		DisplayCasesTableMethod.displayCasesInTableBasic(casos);
		
/*
//Aqui empieza el codigo del cycle para las evaluaciones
		double prediccion;
			CBRCase _case = (CBRCase)query;
			QuinielaSolution sol = (QuinielaSolution)_case.getSolution();//Esto no esta bien inicializado hay que ver como se trata
		if(!sol.equals(_case.getResult()))
			prediccion = 1.0;
		else prediccion = 0.0;
		
		Evaluator.getEvaluationReport().addDataToSeries("Errores", new Double (prediccion));
		QuinielaSolution predict;
		predict = new QuinielaSolution();
		//Esto no esta bien inicializado hay que ver como se trata*/
		//aqui acaba el codigo de las evaluaciones del cycle
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
			InterfazA a = new InterfazA();
			a.setVisible(true);
			a.setEnabled(true);
			
			//do {
				/*Collection<Attribute> c = new ArrayList<Attribute>();
				Map<Attribute,String> m = new HashMap<Attribute,String>();
				m.put((new Attribute("nombreLocal", QuinielaCaso.class)),"nombre Local");
				c.add(new Attribute("resultLocal", QuinielaCaso.class));
				c.add(new Attribute("resultVisit", QuinielaCaso.class));
				m.put((new Attribute("nombreVisitante", QuinielaCaso.class)),"nombre Visitante");
				c.add(new Attribute("temporada", QuinielaCaso.class));
				c.add(new Attribute("division",QuinielaCaso.class));
				c.add(new Attribute("difPos",QuinielaCaso.class));
				c.add(new Attribute("difPuntos",QuinielaCaso.class));*/
				//ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query,null,null);
				//ObtainQueryWithFormMethod.obtainQueryWithInitialValues(query,c , m);

				//Me preparo la Query despues de obtenerla
				a.setVisible(true);
				a.setEnabled(true);
				while (a.getQuery() == null || query.getDescription() == null)
					query = a.getQuery();
				QuinielaCaso s = (QuinielaCaso)query.getDescription();
				
				if(s.getPosLocal()!=null&&s.getPosVis()!=null)	s.setDifPos((Integer)(s.getPosLocal()-s.getPosVis()));
				if (s.getJornada()!=null){
					if(s.getPuntosLocal()!=null && s.getPuntosVis()!=null)	s.setDifPuntos((Double)((s.getPuntosLocal()-s.getPuntosVis())/s.getJornada()));
					if(s.getGolesContraLocal()!=null)	s.setGolesContraLocal((Double)(s.getGolesContraLocal())/s.getJornada());
					if(s.getGolesContraVis()!=null)	s.setGolesContraVis((Double)(s.getGolesContraVis())/s.getJornada());
					if(s.getGolesFavorLocal()!=null)	s.setGolesFavorLocal((Double)((s.getGolesFavorLocal())/s.getJornada()));
					if(s.getGolesFavorVis()!=null)	s.setGolesFavorVis((Double)((s.getGolesFavorVis())/s.getJornada()));
					if(s.getPuntosCasaLocal()!=null)	s.setPuntosCasaLocal((Double)((s.getPuntosCasaLocal())/s.getJornada()));
					if(s.getPuntosFueraVis()!=null)s.setPuntosFueraVis((Double)((s.getPuntosFueraVis())/s.getJornada()));
				}
				a.setVisible(false);
				quiniela.cycle(query);
				a.setQuery();
			//}while (JOptionPane.showConfirmDialog(null,"¿Continuar?") == JOptionPane.OK_OPTION);
			
			
/*			//Aqui empieza el codigo del main para las evaluaciones.
			Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
			double avg = 0.0;
			for (Double d: vec)
				avg+=d;
			avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
			Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
			System.out.println(Evaluator.getEvaluationReport());
			jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluacion Quinielas",false);
			//Aqui acaba el codigo del main para las evaluaciones.*/
		} catch (ExecutionException e) {
			org.apache.commons.logging.LogFactory.getLog(SolucionadorQuinielas.class).error(e);
		}
	}

}
