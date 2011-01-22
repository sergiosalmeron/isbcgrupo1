package practica4;




import java.util.ArrayList;
import java.util.Collection;
import jcolibri.casebase.CachedLinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.evaluation.Evaluator;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.textual.IE.common.FeaturesExtractor;
import jcolibri.extensions.textual.IE.common.StopWordsDetectorSpanish;
import jcolibri.extensions.textual.IE.common.TextStemmerSpanish;
import jcolibri.extensions.textual.IE.opennlp.OpennlpPOStaggerSpanish;
import jcolibri.extensions.textual.IE.opennlp.OpennlpSplitterSpanish;
import jcolibri.extensions.textual.IE.representation.IEText;
import jcolibri.extensions.textual.IE.representation.Token;
import jcolibri.extensions.textual.lucene.LuceneIndexSpanish;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.textual.LuceneTextSimilaritySpanish;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.test.main.SwingProgressBar;


public class EvaluadorAppAccionesPropiedades implements StandardCBRApplication
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
	    _connector = new NewsConnector2("src/practica4/noticias",100);
	    _caseBase = new CachedLinealCaseBase();
	    
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
	Collection<CBRCase> cases = _caseBase.getCases();
	// Divide el texto en párrafos, frases y palabras
	OpennlpSplitterSpanish.split(cases);
	// Borra las palabras vacías
	StopWordsDetectorSpanish.detectStopWords(cases);
	// Extrae las raíces de cada palabra
	TextStemmerSpanish.stem(cases);
	// Realiza el etiquetado morfológico
	OpennlpPOStaggerSpanish.tag(cases);
	// Extraer los nombres y verbos almacenándolos en
	//los atributos "nombres" y "verbos"
	extractMainTokens(cases);
	FeaturesExtractor.loadRules("src/practica4/rules.txt");
	FeaturesExtractor.extractFeatures(cases);
	NuestroExtractor.extractInformation(cases);

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
	Attribute texto = new Attribute("text", NewsDescription2.class);
	nnConfig.addMapping(texto, new LuceneTextSimilaritySpanish(luceneIndex,query,texto, true));
	nnConfig.setWeight(texto, 0.7);
	Attribute titulo = new Attribute("title", NewsDescription2.class);
	nnConfig.addMapping(titulo, new LuceneTextSimilaritySpanish(luceneIndex,query,titulo, true));
	nnConfig.setWeight(titulo, 0.25);
	Attribute nombres = new Attribute("nombres", NewsDescription2.class);
	nnConfig.addMapping(nombres, new Contains());
	nnConfig.setWeight(nombres, 0.30);
	Attribute verbos = new Attribute("verbos", NewsDescription2.class);
	nnConfig.addMapping(verbos, new Contains());
	nnConfig.setWeight(verbos, 0.30);
	Attribute politico = new Attribute("Politico", NewsDescription2.class);
	nnConfig.addMapping(politico, new Contains());
	nnConfig.setWeight(politico, 0.25);
	Attribute Tecnologia = new Attribute("Tecnologia", NewsDescription2.class);
	nnConfig.addMapping(Tecnologia, new Contains());
	nnConfig.setWeight(Tecnologia, 0.25);
	Attribute Economia = new Attribute("Economia", NewsDescription2.class);
	nnConfig.addMapping(Economia, new Contains());
	nnConfig.setWeight(Economia, 0.25);
	Attribute Deporte = new Attribute("Deporte", NewsDescription2.class);
	nnConfig.addMapping(Deporte, new Contains());
	nnConfig.setWeight(Deporte, 0.25);
	Attribute Deportista = new Attribute("Deportista", NewsDescription2.class);
	nnConfig.addMapping(Deportista, new Contains());
	nnConfig.setWeight(Deportista, 0.25);
	System.out.println("RESULT: ");
	
	Collection<RetrievalResult> res = NNScoringMethod.evaluateSimilarity(cases, query, nnConfig);
	res = SelectCases.selectTopKRR(res, 5);
	VotacionPonderada p = new VotacionPonderada();
	//Iterator<RetrievalResult> ite = res.iterator();
	NewsSolution solucion = (NewsSolution)p.getPredictedSolution(res);
	double prediccion;
	CBRCase _case = (CBRCase)query;
	NewsSolution sol = (NewsSolution)_case.getSolution();//Esto no esta bien inicializado hay que ver como se trata
	if(!(solucion.getCategory().equals(sol.getCategory()))){

		prediccion = 1.0;
	}
	else prediccion = 0.0;
	
	Evaluator.getEvaluationReport().addDataToSeries("Errores", new Double (prediccion));

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

	public void extractMainTokens(Collection<CBRCase> cases)
	{
		for(CBRCase c: cases)
			extractMainTokens((NewsDescription2)c.getDescription());
	}
	
	public void extractMainTokens(CBRQuery query)
	{
			extractMainTokens((NewsDescription2)query.getDescription());
	}
	
	public void extractMainTokens(NewsDescription2 desc)
	{
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> verbos = new ArrayList<String>();
		
		getMainTokens((IEText)desc.getText(),nombres, verbos);
		desc.setNombres(nombres);
		desc.setVerbos(verbos);
	}

	void getMainTokens(IEText text, Collection<String> names, Collection<String> verbs)
	{
		for(Token t: text.getAllTokens())
		{
			if(t.getPostag().startsWith("N"))
				if(t.getStem()!=null)
					names.add(t.getStem());
			if(t.getPostag().startsWith("V"))
				if(t.getStem()!=null)
					verbs.add(t.getStem());
		}
	}


}
