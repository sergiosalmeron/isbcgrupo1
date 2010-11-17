/**
 * 
 */
package practica1;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.recommendation.casesDisplay.DisplayCasesMethod;
import jcolibri.extensions.recommendation.casesDisplay.DisplayCasesTableMethod;
import jcolibri.extensions.recommendation.casesDisplay.UserChoice;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.selection.SelectCases;

/**
 * @author grupo 1
 *
 */
public class SolucionadorQuinielas implements StandardCBRApplication {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	String result = " ";
	int cuantas = 0;
	Integer k=0;
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
			k++;
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
		simConfig.setDescriptionSimFunction(new Average());

		//Aqui vienen las funciones de similitud particulares para cada campo
		Attribute nombreLocal = new Attribute("nombreLocal", QuinielaCaso.class);
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
		result = "El resultado del partido " +((QuinielaCaso)query.getDescription()).getNombreLocal() + " VS "+((QuinielaCaso)query.getDescription()).getNombreVisitante() +" utilizando votacion simple  es " + solucion.toString()+'\n';
		//Evaluamos por similitud de los casos
		VotacionPonderada votoP = new VotacionPonderada();
		QuinielaSolution solucionP = new QuinielaSolution(); 
		solucionP = (QuinielaSolution)votoP.getPredictedSolution(eval);
		result +="El resultado del partido " +((QuinielaCaso)query.getDescription()).getNombreLocal() + " VS "+((QuinielaCaso)query.getDescription()).getNombreVisitante() +" utilizando votacion ponderada es " + solucionP.toString() +'\n';
		CBRCase nuevo = new CBRCase();
		nuevo.setDescription(query.getDescription());
		((QuinielaCaso)nuevo.getDescription()).setCaseId("Case "+k.toString());
		((QuinielaCaso)nuevo.getDescription()).setDivision(1);
		((QuinielaCaso)nuevo.getDescription()).setDifPuntos(0.0);
		((QuinielaCaso)nuevo.getDescription()).setDifPos(0);
		((QuinielaCaso)nuevo.getDescription()).setResultLocal(0);
		((QuinielaCaso)nuevo.getDescription()).setResultVisit(0);
		((QuinielaCaso)nuevo.getDescription()).setTemporada(10);
		nuevo.setSolution(solucionP);
		//System.out.println("por votacion ponderada " +solucionP);
		//System.out.println(solucionP.getConfidence());
		//CBRCase solucion = jcolibri.method.reuse.classification.AbstractKNNClassificationMethod.class.
		Collection<CBRCase> casos = new ArrayList<CBRCase>();
		System.out.println("Casos Recuperados: ");
		CBRCase caso4 = null;
		for(RetrievalResult nse: eval){
		Double j = 0.0;
			if (j<nse.getEval() && ((QuinielaSolution)nse.get_case().getSolution()).getResultado().equals(solucionP.getResultado())){
				caso4 = nse.get_case();
				j = nse.getEval();
			}
		//((QuinielaSolution)nse.get_case().getSolution()).setConfidence(nse.getEval());
		casos.add(nse.get_case());
		//}
		}
		((QuinielaCaso)nuevo.getDescription()).setDivision(((QuinielaCaso) caso4.getDescription()).getDivision());
		((QuinielaCaso)nuevo.getDescription()).setDifPuntos(((QuinielaCaso) caso4.getDescription()).getDifPuntos());
		((QuinielaCaso)nuevo.getDescription()).setDifPos(((QuinielaCaso) caso4.getDescription()).getDifPos());
		((QuinielaCaso)nuevo.getDescription()).setResultLocal(((QuinielaCaso) caso4.getDescription()).getResultLocal());
		((QuinielaCaso)nuevo.getDescription()).setResultVisit(((QuinielaCaso) caso4.getDescription()).getResultVisit());
		((QuinielaCaso)nuevo.getDescription()).setTemporada(11);
		Collection<CBRCase> casos3 = new ArrayList<CBRCase>();
		casos3.add(nuevo);
		
		if (cuantas == 1){
			UserChoice t = DisplayCasesMethod.displayCasesWithEditOption(casos3);
			if(t.isRefineQuery()){
				String s= (JOptionPane.showInputDialog("Introduce el nuevo Resultado"));
				if(s.equals("1")||s.equals("2")||s.equals("X"))
				((QuinielaSolution) ((ArrayList<CBRCase>)casos3).get(0).getSolution()).setResultado(s);
			}
			JOptionPane.showMessageDialog(null,"A continuacion le mostramos los casos m�s similares del partido a modo de justificaci�n");
			DisplayCasesTableMethod.displayCasesInTableBasic(casos);
			if (((ArrayList<CBRCase>)casos3).get(0)!=null)
			_caseBase.learnCases(casos3);
			

		}		

		


	}
	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#postCycle()
	 */
	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		_connector.close();

	}
	public String getResult(){
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolucionadorQuinielas quiniela = new SolucionadorQuinielas();
		int numQuerys;
		try {
			quiniela.configure();
			quiniela.preCycle();
			numQuerys= 1;
			try{
				numQuerys = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca cuantos partidos desea consultar"));
			}catch (Exception e){};
//			QuinielaCaso hola = new QuinielaCaso();
//			hola.setDivision(1);
//			hola.setNombreLocal("Deportivo");
//			hola.setNombreVisitante("Sporting");
			quiniela.cuantas = numQuerys;
			ArrayList<CBRQuery> querys = new ArrayList<CBRQuery>(); 
			for (int i=0; i<numQuerys; i++){
			CBRQuery query = new CBRQuery();
			query.setDescription(new QuinielaCaso());
			InterfazA a = new InterfazA();
			int z = i+1;
			a.setVisible(true);
			a.setTitle("Partido " + z);
			a.setEnabled(true);
			

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
				querys.add(query);
				a.setQuery();
				}
				String resultados = "";
				for (int i = 0; i<numQuerys; i++){
					quiniela.cycle(querys.get(i));
					resultados+=quiniela.getResult();
				}
				JOptionPane.showMessageDialog(null, resultados);
				
		} catch (ExecutionException e) {
			org.apache.commons.logging.LogFactory.getLog(SolucionadorQuinielas.class).error(e);
		}
	}

}
