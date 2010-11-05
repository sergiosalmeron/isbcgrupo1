/**
 * 
 */
package practica1;

import java.util.Collection;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CaseBaseFilter;
import jcolibri.cbrcore.CaseComponent;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.InitializingException;

/**
 * @author anicetobacter
 *
 */
public class QuinielaCaso implements CaseComponent {

	/**
	 * 
	 */
	String caseId;
	String nombreLocal;
	Integer resultLocal;
	Integer resultVisit;
	String nombreVisitante;
	Integer jornada;
	Integer temporada;
	Integer division;

	/**
	 * @return the jornada
	 */
	public Integer getJornada() {
		return jornada;
	}

	/**
	 * @param jornada the jornada to set
	 */
	public void setJornada(Integer jornada) {
		this.jornada = jornada;
	}

	/**
	 * @return the nombreLocal
	 */
	public String getNombreLocal() {
		return nombreLocal;
	}

	/**
	 * @param nombreLocal the nombreLocal to set
	 */
	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	/**
	 * @return the resultLocal
	 */
	public Integer getResultLocal() {
		return resultLocal;
	}

	/**
	 * @param resultLocal the resultLocal to set
	 */
	public void setResultLocal(Integer resultLocal) {
		this.resultLocal = resultLocal;
	}

	/**
	 * @return the resultVisit
	 */
	public Integer getResultVisit() {
		return resultVisit;
	}

	/**
	 * @param resultVisit the resultVisit to set
	 */
	public void setResultVisit(Integer resultVisit) {
		this.resultVisit = resultVisit;
	}

	/**
	 * @return the nombreVisitante
	 */
	public String getNombreVisitante() {
		return nombreVisitante;
	}

	/**
	 * @param nombreVisitante the nombreVisitante to set
	 */
	public void setNombreVisitante(String nombreVisitante) {
		this.nombreVisitante = nombreVisitante;
	}

	/**
	 * @return the temporada
	 */
	public Integer getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(Integer temporada) {
		this.temporada = temporada;
	}

	/**
	 * @return the division
	 */
	public Integer getDivision() {
		return division;
	}

	/**
	 * @param division the division to set
	 */
	public void setDivision(Integer division) {
		this.division = division;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuinielaCaso [caseId=" + caseId + ", nombreLocal="
				+ nombreLocal + ", resultLocal=" + resultLocal
				+ ", resultVisit=" + resultVisit + ", nombreVisitante="
				+ nombreVisitante + ", jornada=" + jornada + ", temporada="
				+ temporada + ", division=" + division + "]";
	}


	
	public QuinielaCaso() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbrcore.CBRCaseBase#init(jcolibri.cbrcore.Connector)
	 */
	@Override
	public Attribute getIdAttribute(){
		return new Attribute("caseId" , QuinielaCaso.class);
	}
	public void init(Connector connector) throws InitializingException {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the caseId
	 */
	public String getCaseId() {
		return caseId;
	}

	/**
	 * @param caseId the caseId to set
	 */
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbrcore.CBRCaseBase#close()
	 */
	//@Override
//	public void close() {
//		// TODO Auto-generated method stub
//
//	}
//
//	/* (non-Javadoc)
//	 * @see jcolibri.cbrcore.CBRCaseBase#getCases()
//	 */
//	@Override
//	public Collection<CBRCase> getCases() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	/* (non-Javadoc)
//	 * @see jcolibri.cbrcore.CBRCaseBase#getCases(jcolibri.cbrcore.CaseBaseFilter)
//	 */
//	@Override
//	public Collection<CBRCase> getCases(CaseBaseFilter filter) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	/* (non-Javadoc)
//	 * @see jcolibri.cbrcore.CBRCaseBase#learnCases(java.util.Collection)
//	 */
//	@Override
//	public void learnCases(Collection<CBRCase> cases) {
//		// TODO Auto-generated method stub
//
//	}
//
//	/* (non-Javadoc)
//	 * @see jcolibri.cbrcore.CBRCaseBase#forgetCases(java.util.Collection)
//	 */
//	@Override
//	public void forgetCases(Collection<CBRCase> cases) {
//		// TODO Auto-generated method stub
//
//	}


}
