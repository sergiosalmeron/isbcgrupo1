package practica3;

import java.util.ArrayList;
import java.util.Collection;

import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;

public class ContainsString implements LocalSimilarityFunction {


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
	public ContainsString(){}

	public boolean isApplicable(Object o1, Object o2)
	{
		if ((o1 instanceof String) && (o2 instanceof String)) return true;
		return false;
	}

	@Override
	public double compute(Object o1, Object o2)
			throws NoApplicableSimilarityFunctionException {
    	int s = 0;
    	if ((o1 == null) || (o2 == null))
            return s;
        if (((String)o1).length()<((String)o2).length()){        	
        	for (int i = 0; i<((String)o1).length();i++){
        		if (((String)o2).contains(((String)o1).charAt(i))) s = s+1/((String)o1).size();
        	}
        	return s;
        }else{
        	for (int i = 0; i<((String)o2).size();i++){
        		if (((String)o1).contains(((String)o2).get(i))) s = s+1/((String)o2).size();
        	}
        	return s;
        }
	}
}