package practica3;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.recommendation.casesDisplay.DisplayCasesTableMethod;
import jcolibri.extensions.recommendation.casesDisplay.UserChoice;
import jcolibri.extensions.recommendation.navigationByAsking.ObtainQueryWithAttributeQuestionMethod;
import jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.GlobalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.selection.SelectCases;
 


public class RecomendadorJuegos implements StandardCBRApplication{
	
	ConnectorJuegos _connector;
	CBRCaseBase _caseBase;
	static ArrayList<CBRCase> casos;
	
	@Override
	public void configure() throws ExecutionException {
		// TODO Auto-generated method stub
		try{
			_connector = new ConnectorJuegos();
			_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("practica3/games"));
			_caseBase  = new LinealCaseBase();
			} catch (Exception e){
				throw new ExecutionException(e);
		}

	}

	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		// TODO Auto-generated method stub
		NuestroNN simConfig = new NuestroNN();
		//Aquivienen las funciones de similitud particulares para cada campo
		simConfig.setDescriptionSimFunction(new Media());
		Attribute ano = new Attribute("yearPublished", JuegosCaso.class);
		Attribute categorias = new Attribute("categories", JuegosCaso.class);
		Attribute subdominios = new Attribute("subdomains", JuegosCaso.class);
		Attribute mecanicas = new Attribute("mechanics", JuegosCaso.class);
		Attribute edad = new Attribute("age", JuegosCaso.class);
		Attribute recplayers = new Attribute("recNumPlayers", JuegosCaso.class);
		Attribute bestplayers = new Attribute("bestNumPlayers", JuegosCaso.class);
		Attribute numPlayers = new Attribute("numPlayers", JuegosCaso.class);
		simConfig.addMapping(ano, new Equal());
		simConfig.addMapping(categorias, new Contains());
		simConfig.addMapping(subdominios, new Contains());
		simConfig.addMapping(mecanicas, new Contains());
		simConfig.addMapping(edad, new Equal());
		simConfig.addMapping(recplayers, new Equal());
		simConfig.addMapping(bestplayers, new Equal());
		simConfig.addMapping(numPlayers, new Equal());
		simConfig.setWeight(ano, 0.2);
		simConfig.setWeight(categorias, 1.0);
		simConfig.setWeight(subdominios, 0.8);
		simConfig.setWeight(mecanicas, 0.8);
		simConfig.setWeight(edad, 0.6);
		simConfig.setWeight(bestplayers, 0.4);
		simConfig.setWeight(recplayers, 0.4);
		simConfig.setWeight(numPlayers, 0.4);
		
		
		// A bit of verbose
		System.out.println("Query Description:");
		System.out.println(query.getDescription());
		System.out.println();
		
		// Ejecutamos el NN
		Collection<RetrievalResult> eval = NNScoring.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		Collection<CBRCase> casos = new ArrayList<CBRCase>();
		System.out.println("Casos Recuperados: ");
		for(RetrievalResult nse: eval){
			System.out.println(nse);
			casos.add(nse.get_case());
		}
		HashMap<Attribute,String> labels = new HashMap<Attribute,String>();
		labels.put(new Attribute("subdomains",JuegosCaso.class), "Selecciona un Subdominio");
		labels.put(new Attribute("mechanics",JuegosCaso.class), "Selecciona una Mecanica");
		labels.put(new Attribute("categories",JuegosCaso.class), "Selecciona una Categoría");
		Collection<Attribute> oculta = new ArrayList<Attribute>();
		oculta.add(new Attribute("artists",JuegosCaso.class));
		oculta.add(new Attribute("publishers",JuegosCaso.class));
		oculta.add(new Attribute("designers",JuegosCaso.class));
		oculta.add(new Attribute("url",JuegosCaso.class));
		oculta.add(new Attribute("image",JuegosCaso.class));
		UserChoice choice = DisplayCasesTableMethod.displayCasesInTableEditQuery(casos);
		while (choice.isRefineQuery()) {			
			ObtainQueryWithFormMethod.obtainQueryWithInitialValues(query, oculta, labels);
			cycle(query);
			choice = DisplayCasesTableMethod.displayCasesInTableEditQuery(casos);
		} 
		if (choice.isBuy()){
			//hacemos aqui el colaborativo
		}
		else {
			System.exit(0);
		}
		
	}

	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		_connector.close();
	}

	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		_caseBase.init(_connector);
		casos=(ArrayList<CBRCase>)_connector.retrieveAllCases();
		//java.util.Collection<CBRCase> cases = _caseBase.getCases();
		return _caseBase;
	}
	public static void main(String[] args) {
		RecomendadorJuegos recomendador = new RecomendadorJuegos();
		int numQuerys;
		try {
			recomendador.configure();
			recomendador.preCycle();
			numQuerys= 1;
/*			try{
				numQuerys = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos usuarios desean participar"));
		}catch (Exception e){};

			recomendador.cuantas = numQuerys;
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
				*/
			HashMap<Attribute,String> labels = new HashMap<Attribute,String>();
			labels.put(new Attribute("subdomains",JuegosCaso.class), "Selecciona un Subdominio");
			labels.put(new Attribute("mechanics",JuegosCaso.class), "Selecciona una Mecanica");
			labels.put(new Attribute("categories",JuegosCaso.class), "Selecciona una Categoría");
			Collection<Attribute> oculta = new ArrayList<Attribute>();
			oculta.add(new Attribute("artists",JuegosCaso.class));
			oculta.add(new Attribute("publishers",JuegosCaso.class));
			oculta.add(new Attribute("designers",JuegosCaso.class));
			
			CBRQuery query=new CBRQuery();
			query.setDescription(new JuegosCaso());
//			ObtainQueryWithFormMethod.obtainQueryWithInitialValues(query, oculta, labels);
			ObtainQueryWithAttributeQuestionMethod.obtainQueryWithAttributeQuestion(query, new Attribute("categories",JuegosCaso.class), labels, casos);
			
			recomendador.cycle(query);
			
		//		JOptionPane.showMessageDialog(null, resultados);
				
		} catch (ExecutionException e) {
			org.apache.commons.logging.LogFactory.getLog(RecomendadorJuegos.class).error(e);
		}
}
}
