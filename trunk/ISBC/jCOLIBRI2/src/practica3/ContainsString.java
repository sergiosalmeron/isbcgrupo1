package practica3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;

public class ContainsString implements LocalSimilarityFunction {


	/**
	 * Applies the similarity function.
	 * 
	 * @param o2
	 *            Object.
	 * @param o2
	 *            Object.
	 * @return the result of apply the similarity function.
	 */
       
    /** Applicable to any class only to ArrayList */
	public ContainsString(){}

	public boolean isApplicable(Object o2, Object o1)
	{
		if ((o2 instanceof String) && (o2 instanceof String)) return true;
		return false;
	}

	@Override
	public double compute(Object o2, Object o1)
			throws NoApplicableSimilarityFunctionException {
    	int s = 0;
    	if ((o2 == null) || (o2 == null))
            return s;
    	ArrayList<Integer> maq = new ArrayList<Integer>();
/*    	ArrayList<Integer> maq = new ArrayList<Integer>();
    	int i=0;
    	while (i<((String)o2).length()){
    		String num="";
    		while ((((String)o2).charAt(i)=='1' || ((String)o2).charAt(i)=='2' ||((String)o2).charAt(i)=='3' ||
    				((String)o2).charAt(i)=='4' || ((String)o2).charAt(i)=='5' || ((String)o2).charAt(i)=='6' ||
    				((String)o2).charAt(i)=='7' || ((String)o2).charAt(i)=='8' || ((String)o2).charAt(i)=='9' || 
    				((String)o2).charAt(i)=='0') && (i<((String)o2).length())){
    			
    			num=num+((String)o2).charAt(i);
    			i=i+1;
    		}
    		if(!num.equals("")){
    			maq.add(Integer.parseInt(num));
    		}
    		i=i+1;
    	}	
    	*/
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
    		s=1;
    		if (maq.contains(aux) && s==1){
    	   		s=1;
    	   	}
    		else{
    			s=0;
    		}
    	}
        return s;
	}  
}