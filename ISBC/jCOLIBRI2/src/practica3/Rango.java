package practica3;

import java.util.ArrayList;
import java.util.Iterator;

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
	public double compute(Object o2, Object o1)
			throws NoApplicableSimilarityFunctionException {
    	int s = 0;
    	if ((o1 == null) || (o2 == null))
            return s;
    	String primero="";
    	primero = primero + ((String)o1).charAt(0);
    	if (((String)o1).length()>1){
       	if (((String)o1).charAt(1)=='1' || ((String)o1).charAt(1)=='2' ||((String)o1).charAt(1)=='3' ||((String)o1).charAt(1)=='4' ||
        	((String)o1).charAt(1)=='5' || ((String)o1).charAt(1)=='6' ||((String)o1).charAt(1)=='7' ||
        	((String)o1).charAt(1)=='8' || ((String)o1).charAt(1)=='9' || ((String)o1).charAt(1)=='0' )
        		primero = primero + ((String)o1).charAt(1);
    	}
        	int first = Integer.parseInt(primero);
        	int last=0;
        	String ultimo="";

        	if(((String)o1).length()!=1){
    	    	if (((String)o1).charAt(((String)o1).length()-2)=='1' || ((String)o1).charAt(((String)o1).length()-2)=='2' ||((String)o1).charAt(((String)o1).length()-2)=='3' ||
    					((String)o1).charAt(((String)o1).length()-2)=='4' || ((String)o1).charAt(((String)o1).length()-2)=='5' || ((String)o1).charAt(((String)o1).length()-2)=='6' ||
    					((String)o1).charAt(((String)o1).length()-2)=='7' || ((String)o1).charAt(((String)o1).length()-2)=='8' || ((String)o1).charAt(((String)o1).length()-2)=='9' || 
    					((String)o1).charAt(((String)o1).length()-2)=='0')
    	    		ultimo = ultimo + ((String)o1).charAt(((String)o1).length()-2);
    	    		ultimo = ultimo + ((String)o1).charAt(((String)o1).length()-1);
    	    		
    	    	last = Integer.parseInt(ultimo);
        	}
        	else{
        		last = first;
        	}
    	ArrayList<Integer> user = new ArrayList<Integer>();
    	int i=0;
    	Boolean seguir=true;
    	String num="";
    	while (seguir){
    	    if (i<((String)o2).length()){

    		if ((((String)o2).charAt(i)=='1' || ((String)o2).charAt(i)=='2' ||((String)o2).charAt(i)=='3' ||
    				((String)o2).charAt(i)=='4' || ((String)o2).charAt(i)=='5' || ((String)o2).charAt(i)=='6' ||
    				((String)o2).charAt(i)=='7' || ((String)o2).charAt(i)=='8' || ((String)o2).charAt(i)=='9' || 
    				((String)o2).charAt(i)=='0') && (i<((String)o2).length())){
    			
                num = num + ((String)o2).charAt(i);
                i=i+1;
            }
            else {
                seguir=false;
            }
        }
        else {
            seguir=false;
        }
    }	
    	Iterator<Integer> it = user.iterator();
    	while(it.hasNext()){
    		Integer aux = it.next();
    		if (aux>=first && aux<=last){
    	   		s=1;
    	   	}
    	}
        return s;
	}   
}