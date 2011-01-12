package practica42;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;

public class Contains implements LocalSimilarityFunction {


	/**
	 * Applies the similarity function.
	 * 
	 * @param o1
	 *            Object.
	 * @param o2
	 *            Object.
	 * @return the result of apply the similarity function.
	 */
       
    /** Applicable to any class only to ArrayList */
	public Contains(){}

	public boolean isApplicable(Object o1, Object o2)
	{
		if ((o1 instanceof Collection) && (o2 instanceof Collection)) return true;
		return false;
	}

	@Override
	public double compute(Object o1, Object o2)
			throws NoApplicableSimilarityFunctionException {
    	int s = 0;
    	if ((o1 == null) || (o2 == null))
            return s;
        if (((Collection)o1).size()<((Collection)o2).size()){
        	Iterator iterador = ((Collection)o1).iterator();
        	while(iterador.hasNext()){
        		if (((Collection)o2).contains(iterador.next())) s = s+1/((Collection)o1).size();
        	}
        	return s;
        }else{
           	Iterator iterador = ((Collection)o2).iterator();
        	while(iterador.hasNext()){
        		if (((Collection)o1).contains(iterador.next())) s = s+1/((Collection)o2).size();
        	}
        	return s;
        }
	}
}