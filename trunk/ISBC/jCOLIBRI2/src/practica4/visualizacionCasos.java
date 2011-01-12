package practica4;


import java.util.Collection;
import java.util.Iterator;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.extensions.textual.lucene.LuceneIndexSpanish;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.NNretrieval.similarity.local.textual.LuceneTextSimilaritySpanish;


public class visualizacionCasos {

	/**
	 * @param args
	 */

    LuceneIndexSpanish luceneIndex;
    
	
	public static void main(String[] args) {
		
		try {
		    	jcolibri.util.ProgressController.clear();
		    	jcolibri.util.ProgressController.register(new jcolibri.test.main.SwingProgressBar(), jcolibri.extensions.visualization.CasesVisualization.class);
		    
			//Configure connector and case base
		    	Connector _connector = new NewsConnector("src/practica4/noticias",15);
		    	CBRCaseBase _caseBase = new LinealCaseBase();
			    
			
			// Load cases
			_caseBase.init(_connector);
			
			LuceneIndexSpanish luceneIndex = jcolibri.method.precycle.LuceneIndexCreatorSpanish.createLuceneIndex(_caseBase);
			
			// Configure NN
		//	Iterator<CBRCase> i = new Iterator(_caseBase.getCases());
			Collection<CBRCase> cases = _caseBase.getCases();
			Iterator<CBRCase> i = _caseBase.getCases().iterator();
			CBRQuery query= new CBRQuery();
	//		while (i.hasNext()){
				query=(CBRQuery)i.next();
			NNConfig nnConfig = new NNConfig();
			nnConfig.setDescriptionSimFunction(new Average());
			Attribute texto = new Attribute("text", NewsDescription.class);
			nnConfig.addMapping(texto, new LuceneTextSimilaritySpanish(luceneIndex,query,texto, true));
			nnConfig.setWeight(texto, 0.25);
			Attribute titulo = new Attribute("title", NewsDescription.class);
			nnConfig.addMapping(titulo, new LuceneTextSimilaritySpanish(luceneIndex,query,titulo, true));
			nnConfig.setWeight(titulo, 0.75);	
			// Visualize the case base
			jcolibri.extensions.visualization.CasesVisualization.visualize(cases, nnConfig);
	///		}
		} catch (Exception e) {
			org.apache.commons.logging.LogFactory.getLog(visualizacionCasos.class).error(e);
		}


	}

}
