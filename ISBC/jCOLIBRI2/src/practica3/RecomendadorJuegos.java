package practica3;

import java.util.Collection;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.exception.ExecutionException;
 


public class RecomendadorJuegos implements StandardCBRApplication{
	
	ConnectorJuegos _connector;
	CBRCaseBase _caseBase;
	Collection<CBRCase> casos;
	
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
		
	}

	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		_caseBase.init(_connector);
		casos=_connector.retrieveAllCases();
		//java.util.Collection<CBRCase> cases = _caseBase.getCases();
		return _caseBase;
	}
	public static void main(String[] args) {
		RecomendadorJuegos recomendador = new RecomendadorJuegos();
		
		try {
			recomendador.configure();
			recomendador.preCycle();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
