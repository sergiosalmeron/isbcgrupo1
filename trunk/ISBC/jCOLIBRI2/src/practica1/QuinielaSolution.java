/**
 * 
 */
package practica1;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
import jcolibri.extensions.classification.ClassificationSolution;

/**
 * @author grupo 1
 *
 */
public class QuinielaSolution implements CaseComponent, ClassificationSolution {

	/**
	 * 
	 */
	String resultado;
	//String CaseId;
	public QuinielaSolution() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuinielaSolution [Resultado=" + resultado + "]";
	}

	/**
	 * @return the resultado
	 */
	public String getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbrcore.CaseComponent#getIdAttribute()
	 */
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("resultado", this.getClass());
	}

	public String getConfidence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClassification() {
		// TODO Auto-generated method stub
		return null;
	}


}
