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
		//simConfig.addMapping(new Attribute("yearPublished", JuegosCaso.class), new Equal());
		simConfig.addMapping(new Attribute("categories", JuegosCaso.class), new Contains());
		
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
		DisplayCasesTableMethod.displayCasesInTableBasic(casos);
		
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
