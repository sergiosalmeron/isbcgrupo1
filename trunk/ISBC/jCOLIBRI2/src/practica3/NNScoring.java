/**
 * 
 */
package practica3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.GlobalSimilarityFunction;
import jcolibri.util.ProgressController;
import practica3.*;

/**
 * @author anicetobacter
 *
 */
public class NNScoring extends NNScoringMethod {

	/**
	 * 
	 */
	public NNScoring() {
		// TODO Auto-generated constructor stub
	}
	public static Collection<RetrievalResult> evaluateSimilarity(Collection<CBRCase> cases, CBRQuery query, NuestroNN simConfig)
	{
		List<RetrievalResult> res = new ArrayList<RetrievalResult>();
		ProgressController.init(NNScoring.class,"Numeric Similarity Computation", cases.size());
		GlobalSimilarityFunction gsf = simConfig.getDescriptionSimFunction();
		for(CBRCase _case: cases)
		{
			RetrieveOur s = new RetrieveOur(_case, ((Media)gsf).compute(_case.getDescription(), query.getDescription(), _case, query, simConfig));
			if(s.getEval()>0.0)
				res.add(s);//new RetrieveOur(_case, ((Media)gsf).compute(_case.getDescription(), query.getDescription(), _case, query, simConfig)));
			ProgressController.step(NNScoring.class);
		}
		java.util.Collections.sort(res);
		ProgressController.finish(NNScoring.class);
		
		return res;
	}

}
