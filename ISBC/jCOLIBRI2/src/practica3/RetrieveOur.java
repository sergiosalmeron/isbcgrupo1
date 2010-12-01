package practica3;
import practica3.*;
import jcolibri.cbrcore.CBRCase;
import jcolibri.method.retrieve.RetrievalResult;

public class RetrieveOur extends RetrievalResult {

	/** Constant used to retrieve all the cases in the retrieval methods. */
	public static final int RETRIEVE_ALL = Integer.MAX_VALUE;
	
	private CBRCase _case;
	private double  eval;
	
	/**
	 * Constructor
	 * @param _case retrieved
	 * @param eval is the similiarty with the query
	 */
	public RetrieveOur(CBRCase _case, Double eval)
	{	
		super(_case,eval);
		this._case = _case;
		this.eval = eval;
	}

	/**
	 * @return Returns the _case.
	 */
	public CBRCase get_case() {
		return _case;
	}

	/**
	 * @param _case The _case to set.
	 */
	public void set_case(CBRCase _case) {
		this._case = _case;
	}

	/**
	 * @return Returns the eval.
	 */
	public double getEval() {
		return eval;
	}

	/**
	 * @param eval The eval to set.
	 */
	public void setEval(double eval) {
		this.eval = eval;
	}
	
	public String toString()
	{
		return _case + " -> "+ eval;
	}

	public int compareTo(Object o) {
		if(!(o instanceof RetrievalResult))
			return 0;
		RetrievalResult other = (RetrievalResult)o;
		if(other.getEval()< eval)
			return -1;
		else if(other.getEval() > eval)
			return 1;
		else
			return 0;
	}

}
