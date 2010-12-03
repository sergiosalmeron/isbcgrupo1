package practica3;

import java.util.ArrayList;
import java.util.Collection;

import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;

public class Rango implements LocalSimilarityFunction {


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
	public Rango(){}

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
    	String primero="";
    	primero = primero + ((String)o2).charAt(0);
    	if (((String)o2).charAt(1)=='1' || ((String)o2).charAt(1)=='2' ||((String)o2).charAt(1)=='3' ||((String)o2).charAt(1)=='4' ||
    	((String)o2).charAt(1)=='5' || ((String)o2).charAt(1)=='6' ||((String)o2).charAt(1)=='7' ||
    	((String)o2).charAt(1)=='8' || ((String)o2).charAt(1)=='9' || ((String)o2).charAt(1)=='0' )
    		primero = primero + ((String)o2).charAt(1);
    	int first = Integer.parseInt(primero);
    	String ultimo="";
    	if (((String)o2).charAt(((String)o2).length()-2)=='1' || ((String)o2).charAt(((String)o2).length()-2)=='2' ||((String)o2).charAt(((String)o2).length()-2)=='3' ||((String)o2).charAt(((String)o2).length()-2)=='4' ||
    	    	((String)o2).charAt(((String)o2).length()-2)=='5' || ((String)o2).charAt(((String)o2).length()-2)=='6' ||((String)o2).charAt(((String)o2).length()-2)=='7' ||
    	    	((String)o2).charAt(((String)o2).length()-2)=='8' || ((String)o2).charAt(((String)o2).length()-2)=='9' || ((String)o2).charAt(((String)o2).length()-2)=='0' )
    		ultimo = ultimo + ((String)o2).charAt(((String)o2).length()-2);
    		ultimo = ultimo + ((String)o2).charAt(((String)o2).length()-1);
    		
    	int last = Integer.parseInt(ultimo);
    	
    	int user = 0;
    	try {
    		user = Integer.parseInt((String)o1);
    	}
    	catch(Exception e){
    	}
    	if (user>=first && user<=last)
    		s=1;
        	return s;
        }
}