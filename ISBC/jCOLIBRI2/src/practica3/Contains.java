package practica3;

import java.util.ArrayList;
import java.util.Collection;

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
		if ((o1 instanceof ArrayList) && (o2 instanceof ArrayList)) return true;
		return false;
	}

	@Override
	public double compute(Object o1, Object o2)
			throws NoApplicableSimilarityFunctionException {
    	int s = 0;
    	if ((o1 == null) || (o2 == null))
            return s;
        if (((ArrayList)o1).size()<((ArrayList)o2).size()){        	
        	for (int i = 0; i<((ArrayList)o1).size();i++){
        		if (((ArrayList)o2).contains(((ArrayList)o1).get(i))) s = s+1/((ArrayList)o1).size();
        	}
        	return s;
        }else{
        	for (int i = 0; i<((ArrayList)o2).size();i++){
        		if (((ArrayList)o1).contains(((ArrayList)o2).get(i))) s = s+1/((ArrayList)o2).size();
        	}
        	return s;
        }
	}
}