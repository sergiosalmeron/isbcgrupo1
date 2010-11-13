package practica1;

import java.util.Collection;

import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.extensions.classification.ClassificationSolution;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.reuse.classification.KNNClassificationMethod;

public class VotacionPonderada implements KNNClassificationMethod {

	@Override
	public ClassificationSolution getPredictedSolution(
			Collection<RetrievalResult> cases) {
		double a = 0;
		double b = 0;
		double c = 0;
		for(RetrievalResult nse: cases){
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("1")) a = a+(nse.getEval());
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("X")) b = b+(nse.getEval());
			if(((QuinielaSolution)(nse.get_case().getSolution())).getResultado().equals("2")) c = c+(nse.getEval());
			
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

	@Override
	public CBRCase getPredictedCase(CBRQuery query,
			Collection<RetrievalResult> cases) {
		// TODO Auto-generated method stub
		return null;
	}

}
