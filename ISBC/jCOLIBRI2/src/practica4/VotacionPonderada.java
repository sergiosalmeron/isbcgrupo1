package practica4;

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
		double d = 0;
		double e = 0;
		for(RetrievalResult nse: cases){
			if(((NewsSolution)(nse.get_case().getSolution())).getCategory().equals("deportes")) a = a+(nse.getEval());
			if(((NewsSolution)(nse.get_case().getSolution())).getCategory().equals("economia")) b = b+(nse.getEval());
			if(((NewsSolution)(nse.get_case().getSolution())).getCategory().equals("internacional")) c = c+(nse.getEval());
			if(((NewsSolution)(nse.get_case().getSolution())).getCategory().equals("politica")) d = d+(nse.getEval());
			if(((NewsSolution)(nse.get_case().getSolution())).getCategory().equals("tecnologia")) e = e+(nse.getEval());
			
		}
		NewsSolution s  = new NewsSolution();
		double maximo = a;
		s.setCategory("deportes");
		if (maximo<b){
			maximo = b;
			s.setCategory("economia");
		}
		if (maximo<c){
			maximo = c;
			s.setCategory("internacional");
		}
		if (maximo<d){
			maximo = d;
			s.setCategory("politica");
		}
		if (maximo<e) {
			maximo = e;
			s.setCategory("tecnologia");
		}
		return s;
	}

	@Override
	public CBRCase getPredictedCase(CBRQuery query,
			Collection<RetrievalResult> cases) {
		// TODO Auto-generated method stub
		return null;
	}

}

