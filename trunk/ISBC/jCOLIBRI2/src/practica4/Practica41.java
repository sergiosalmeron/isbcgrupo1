package practica4;




import java.util.Collection;
import java.util.Iterator;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.datatypes.Text;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.textual.lucene.LuceneIndexSpanish;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.textual.LuceneTextSimilaritySpanish;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.test.main.SwingProgressBar;
import practica4.ResultFrame;

/**
 * This test shows how to use the Apache Lucene search engine in a Restaurant recommender. 
 * <br>
 * It uses a custum connector (RestaurantConnector) that loads cases from a normal txt file.
 * <br>
 * To compare the texts it uses the Lucene similarity function implemented in jcolibri.method.retrieve.NNretrieval.similarity.local.textual.LuceneTextSimilarity
 * <br>
 * Test13a shows whot tu use other textual similarity function from the jcolibri.method.retrieve.NNretrieval.similarity.local.textual package.
 * 
 * @author Juan A. Recio-Garcia
 * @version 1.0
 * @see jcolibri.method.retrieve.NNretrieval.similarity.local.textual.LuceneTextSimilarity
 * @see jcolibri.test.test13.connector.RestaurantsConnector
 */
public class Practica41 implements StandardCBRApplication
{

    Connector _connector;
    CBRCaseBase _caseBase;
    LuceneIndexSpanish luceneIndex;
    
    /*
     * (non-Javadoc)
     * 
     * @see jcolibri.cbraplications.BasicCBRApplication#configure()
     */
    public void configure() throws ExecutionException
    {
	try
	{
	    _connector = new NewsConnector("src/practica4/noticias",150);
	    _caseBase = new LinealCaseBase();
	    
	    jcolibri.util.ProgressController.clear();
	    SwingProgressBar pb = new SwingProgressBar();
	    jcolibri.util.ProgressController.register(pb);   
	} catch (Exception e)
	{
	    throw new ExecutionException(e);
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see jcolibri.cbraplications.StandardCBRApplication#preCycle()
     */
    public CBRCaseBase preCycle() throws ExecutionException
    {
	_caseBase.init(_connector);

	//Here we create the Lucene index
	luceneIndex = jcolibri.method.precycle.LuceneIndexCreatorSpanish.createLuceneIndex(_caseBase);
	
	return _caseBase;
    }

    /*
     * (non-Javadoc)
     * 
     * @see jcolibri.cbraplications.StandardCBRApplication#cycle(jcolibri.cbrcore.CBRQuery)
     */
    public void cycle(CBRQuery query) throws ExecutionException
    {
	Collection<CBRCase> cases = _caseBase.getCases();
	
	NNConfig nnConfig = new NNConfig();
	nnConfig.setDescriptionSimFunction(new Average());
	
	
	//We only compare the "description" attribute using Lucene
	Attribute texto = new Attribute("text", NewsDescription.class);
	nnConfig.addMapping(texto, new LuceneTextSimilaritySpanish(luceneIndex,query,texto, true));
	nnConfig.setWeight(texto, 0.75);
	Attribute titulo = new Attribute("title", NewsDescription.class);
	nnConfig.addMapping(titulo, new LuceneTextSimilaritySpanish(luceneIndex,query,titulo, true));
	nnConfig.setWeight(titulo, 0.25);

	
	System.out.println("RESULT: ");
	
	Collection<RetrievalResult> res = NNScoringMethod.evaluateSimilarity(cases, query, nnConfig);
	res = SelectCases.selectTopKRR(res, 25);
	Iterator<RetrievalResult> ite = res.iterator();
	for(RetrievalResult rr: res){
	    System.out.println(rr);
	
	    NewsDescription qrd = (NewsDescription)query.getDescription();
		CBRCase mostSimilar = ite.next().get_case();
		NewsDescription rrd = (NewsDescription)mostSimilar.getDescription();
		NewsSolution sol = (NewsSolution)mostSimilar.getSolution();
		new ResultFrame(qrd.getText().toString(), rrd.getTitle().toString(),sol.getCategory(), rrd.getText().toString(), sol.getImgURL());
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see jcolibri.cbraplications.StandardCBRApplication#postCycle()
     */
    public void postCycle() throws ExecutionException
    {
	_connector.close();

    }

    
    public static void main(String[] args)
    {
	Practica41 test = new Practica41();
	try
	{
	    test.configure();
	    
	    CBRCaseBase caseBase = test.preCycle();
	   
	    System.out.println("CASE BASE: ");
	    for(CBRCase c: caseBase.getCases())
		System.out.println(c);
	    System.out.println("Total: "+caseBase.getCases().size()+" cases");

	    boolean _continue = true;
	    while(_continue)
	    {
	    		//String titulo = javax.swing.JOptionPane.showInputDialog("Realiza la busqueda de las noticias");
        	    String queryString = javax.swing.JOptionPane.showInputDialog("Realiza la busqueda de las noticias");
        	    if(queryString == null)
        		_continue = false;
        	    else
        	    {	
                	    CBRQuery query = new CBRQuery();
                	    NewsDescription queryDescription = new NewsDescription();
                	    queryDescription.setText(new Text(queryString));
                	    queryDescription.setTitle(new Text(queryString));
                	    query.setDescription(queryDescription);
                	    
                	    test.cycle(query);
        	    }
	    }
	    test.postCycle();
	    
	} catch (ExecutionException e)
	{
	    org.apache.commons.logging.LogFactory.getLog(Practica41.class).error(e);
	}
    }
}
