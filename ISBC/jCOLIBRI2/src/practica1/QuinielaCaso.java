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
	Integer posLocal;
	Integer puntosLocal;
	Integer golesFavorLocal;
	Integer golesContraLocal;
	Integer puntosCasaLocal;
	Integer puntosFueraLocal;
	Integer posVis;
	Integer puntosVis;
	Integer golesFavorVis;
	Integer golesContraVis;
	Integer puntosCasaVis;
	Integer puntosFueraVis;
	Integer difPuntos;
	Integer difPos;

	public Integer getDifPuntos() {
		return difPuntos;
	}

	public void setDifPuntos(Integer difPuntos) {
		this.difPuntos = difPuntos;
	}

	public Integer getDifPos() {
		return difPos;
	}

	public void setDifPos(Integer difPos) {
		this.difPos = difPos;
	}

	public Integer getPosLocal() {
		return posLocal;
	}

	public void setPosLocal(Integer posLocal) {
		this.posLocal = posLocal;
	}

	public Integer getPuntosLocal() {
		return puntosLocal;
	}

	public void setPuntosLocal(Integer puntosLocal) {
		this.puntosLocal = puntosLocal;
	}

	public Integer getGolesFavorLocal() {
		return golesFavorLocal;
	}

	public void setGolesFavorLocal(Integer golesFavorLocal) {
		this.golesFavorLocal = golesFavorLocal;
	}

	public Integer getGolesContraLocal() {
		return golesContraLocal;
	}

	public void setGolesContraLocal(Integer golesContraLocal) {
		this.golesContraLocal = golesContraLocal;
	}

	public Integer getPuntosCasaLocal() {
		return puntosCasaLocal;
	}

	public void setPuntosCasaLocal(Integer puntosCasaLocal) {
		this.puntosCasaLocal = puntosCasaLocal;
	}

	public Integer getPuntosFueraLocal() {
		return puntosFueraLocal;
	}

	public void setPuntosFueraLocal(Integer puntosFueraLocal) {
		this.puntosFueraLocal = puntosFueraLocal;
	}

	public Integer getPosVis() {
		return posVis;
	}

	public void setPosVis(Integer posVis) {
		this.posVis = posVis;
	}

	public Integer getPuntosVis() {
		return puntosVis;
	}

	public void setPuntosVis(Integer puntosVis) {
		this.puntosVis = puntosVis;
	}

	public Integer getGolesFavorVis() {
		return golesFavorVis;
	}

	public void setGolesFavorVis(Integer golesFavorVis) {
		this.golesFavorVis = golesFavorVis;
	}

	public Integer getGolesContraVis() {
		return golesContraVis;
	}

	public void setGolesContraVis(Integer golesContraVis) {
		this.golesContraVis = golesContraVis;
	}

	public Integer getPuntosCasaVis() {
		return puntosCasaVis;
	}

	public void setPuntosCasaVis(Integer puntosCasaVis) {
		this.puntosCasaVis = puntosCasaVis;
	}

	public Integer getPuntosFueraVis() {
		return puntosFueraVis;
	}

	public void setPuntosFueraVis(Integer puntosFueraVis) {
		this.puntosFueraVis = puntosFueraVis;
	}

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
				+ temporada + ", division=" + division +  ", posicion Local=" +posLocal+
				", puntos Local=" +puntosLocal+
				", goles Favor Local="+golesFavorLocal+
				", goles Contra Local" + golesContraLocal+
				", puntos Casa Local=" + puntosCasaLocal +
				", puntos Fuera Local=" + puntosFueraLocal +
				", posicion Visitante="+ posVis+
				",puntosVisitante=" +puntosVis+
				",goles Favor Visitante="+  golesFavorVis+
				", goles Contra Visitante=" + golesContraVis+
				", puntos Casa Visitante=" + puntosCasaVis+
				", puntos FueraVisitante ="+ puntosFueraVis+"]";
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
