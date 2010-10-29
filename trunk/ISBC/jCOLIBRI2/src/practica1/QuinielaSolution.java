/**
 * 
 */
package practica1;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

/**
 * @author anicetobacter
 *
 */
public class QuinielaSolution implements CaseComponent {

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
		resultado = resultado;
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbrcore.CaseComponent#getIdAttribute()
	 */
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("Resultado", this.getClass());
	}

}
