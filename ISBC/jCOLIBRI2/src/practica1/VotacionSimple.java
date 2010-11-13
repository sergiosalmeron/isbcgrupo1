/**
 * 
 */
package practica1;

import java.util.Collection;

import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.extensions.classification.ClassificationSolution;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.reuse.classification.KNNClassificationMethod;

/**
 * @author anicetobacter
 *
 */
public class VotacionSimple implements KNNClassificationMethod {

	/**
	 * 
	 */
	public VotacionSimple() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see jcolibri.method.reuse.classification.KNNClassificationMethod#getPredictedSolution(java.util.Collection)
	 */
	@Override
	public ClassificationSolution getPredictedSolution(
			Collection<RetrievalResult> cases) {
		int a = 0;
		int b = 0;
		int c = 0;
		for(RetrievalResult nse: cases){
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("1")) a++;
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("X")) b++;
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("2")) c++;
			
		}
		QuinielaSolution s  = new QuinielaSolution();
		if (a>b && a>c) s.setResultado("1");
		else if (b>a && b>c) s.setResultado("X");
		else if (c>a && c>b) s.setResultado("2");
		else if(a==b && a>c) s.setResultado("1");
		else if(a==c && a>b) s.setResultado("1");
		else if(c==b && b>a) s.setResultado("X");
		return s;
	}

	/* (non-Javadoc)
	 * @see jcolibri.method.reuse.classification.KNNClassificationMethod#getPredictedCase(jcolibri.cbrcore.CBRQuery, java.util.Collection)
	 */
	@Override
	public CBRCase getPredictedCase(CBRQuery query,
			Collection<RetrievalResult> cases) {
		// TODO Auto-generated method stub
		return null;
	}

}
