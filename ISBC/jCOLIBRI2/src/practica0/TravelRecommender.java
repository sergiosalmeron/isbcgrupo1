/**
 * 
 */
package practica0;

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
import jcolibri.connector.DataBaseConnector;
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
import jcolibri.test.test1.TravelDescription;

/**
 * @author anicetobacter
 *
 */
public class TravelRecommender implements StandardCBRApplication {

	/**
	 * 
	 */
	Connector _connector;
	
	CBRCaseBase _caseBase;
	public TravelRecommender() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#configure()
	 */
	@Override
	public void configure() throws ExecutionException {
		// TODO Auto-g
		try {
			
			_connector = new DataBaseConnector();
			
			_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("practica0/databaseconfig.xml"));
			
			_caseBase = new LinealCaseBase();
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
		for (CBRCase c: cases)
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
		// Set the average() global similarity function for the description of the case
		simConfig.setDescriptionSimFunction(new Average());
		// The accomodation attribute uses the equal() local similarity function
		simConfig.addMapping(new Attribute("HolidayType", TravelDescription.class), new Equal());
		simConfig.addMapping(new Attribute("NumberOfPersons", TravelDescription.class), new Interval(12));
		simConfig.addMapping(new Attribute("Region", TravelDescription.class), new Equal());
		simConfig.addMapping(new Attribute("Transportation", TravelDescription.class), new Equal());
		simConfig.addMapping(new Attribute("Duration", TravelDescription.class), new Interval(21));
		simConfig.addMapping(new Attribute("Season", TravelDescription.class), new Equal());
		simConfig.addMapping(new Attribute("Accomodation", TravelDescription.class), new Equal());
		
		
		
		
		// A bit of verbose
		System.out.println("Query Description:");
		System.out.println(query.getDescription());
		System.out.println();
		
		// Execute NN
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		Collection<CBRCase> casos = new ArrayList<CBRCase>();
		System.out.println("Casos Recuperados: ");
		for(RetrievalResult nse: eval){
			System.out.println(nse);
			casos.add(nse.get_case());
		}
		DisplayCasesTableMethod.displayCasesInTableBasic(casos);

	}

	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.StandardCBRApplication#postCycle()
	 */
	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		this._caseBase.close();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lanzar el SGBD
		jcolibri.test.database.HSQLDBserver.init();
		//Crear el objeto que implementa la aplicacion CBR
		TravelRecommender trApp = new TravelRecommender();
		try {
			//configuracion
			trApp.configure();
			//preciclo
			trApp.preCycle();
			// Creamos el objeto que almacena la consulta
			CBRQuery query = new CBRQuery();
			query.setDescription(new TravelDescription());
			
			do {
				ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query,null,null);
				trApp.cycle(query);
			}while (JOptionPane.showConfirmDialog(null, "¿Continuar?") == JOptionPane.OK_OPTION);
		}catch (Exception e){
			org.apache.commons.logging.LogFactory.getLog(TravelRecommender.class).error(e);
		}
		jcolibri.test.database.HSQLDBserver.shutDown();

	}

}
