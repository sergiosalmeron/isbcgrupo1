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
		Double a = 0.0;
		Double b = 0.0;
		Double c = 0.0;
		for(RetrievalResult nse: cases){
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("1")) a+=1.0;
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("X")) b+=1.0;
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("2")) c+=1.0;
			
		}
		QuinielaSolution s  = new QuinielaSolution();
		Double confidence = 0.0;
		
		if (a>b && a>c){ 
			s.setResultado("1"); 
			confidence= (a/(a+b+c));
			
		}
		else if (b>a && b>c){
			s.setResultado("X");
			confidence= (b/(a+b+c));
			
		}
		else if (c>a && c>b){
			s.setResultado("2");
			confidence= (c/(a+b+c));
			
		}
		else if(a==b && a>c){
			s.setResultado("1");
			confidence= (a/(a+b+c));
			
		}
		else if(a==c && a>b){
			s.setResultado("1");
			confidence= (a/(a+b+c));
			
		}
		else if(c==b && b>a){
			s.setResultado("X");
			confidence= (b/(a+b+c));
			
		}
		s.setConfianza(confidence);
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
