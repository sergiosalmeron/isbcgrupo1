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
	Double puntosLocal;
	Double golesFavorLocal;
	Double golesContraLocal;
	Double puntosCasaLocal;
	Double puntosFueraLocal;
	Integer posVis;
	Double puntosVis;
	Double golesFavorVis;
	Double golesContraVis;
	Double puntosCasaVis;
	Double puntosFueraVis;
	Double difPuntos;
	Integer difPos;


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



	/**
	 * @return the posLocal
	 */
	public Integer getPosLocal() {
		return posLocal;
	}



	/**
	 * @param posLocal the posLocal to set
	 */
	public void setPosLocal(Integer posLocal) {
		this.posLocal = posLocal;
	}



	/**
	 * @return the puntosLocal
	 */
	public Double getPuntosLocal() {
		return puntosLocal;
	}



	/**
	 * @param puntosLocal the puntosLocal to set
	 */
	public void setPuntosLocal(Double puntosLocal) {
		this.puntosLocal = puntosLocal;
	}



	/**
	 * @return the golesFavorLocal
	 */
	public Double getGolesFavorLocal() {
		return golesFavorLocal;
	}



	/**
	 * @param golesFavorLocal the golesFavorLocal to set
	 */
	public void setGolesFavorLocal(Double golesFavorLocal) {
		this.golesFavorLocal = golesFavorLocal;
	}



	/**
	 * @return the golesContraLocal
	 */
	public Double getGolesContraLocal() {
		return golesContraLocal;
	}



	/**
	 * @param golesContraLocal the golesContraLocal to set
	 */
	public void setGolesContraLocal(Double golesContraLocal) {
		this.golesContraLocal = golesContraLocal;
	}



	/**
	 * @return the puntosCasaLocal
	 */
	public Double getPuntosCasaLocal() {
		return puntosCasaLocal;
	}



	/**
	 * @param puntosCasaLocal the puntosCasaLocal to set
	 */
	public void setPuntosCasaLocal(Double puntosCasaLocal) {
		this.puntosCasaLocal = puntosCasaLocal;
	}



	/**
	 * @return the puntosFueraLocal
	 */
	public Double getPuntosFueraLocal() {
		return puntosFueraLocal;
	}



	/**
	 * @param puntosFueraLocal the puntosFueraLocal to set
	 */
	public void setPuntosFueraLocal(Double puntosFueraLocal) {
		this.puntosFueraLocal = puntosFueraLocal;
	}



	/**
	 * @return the posVis
	 */
	public Integer getPosVis() {
		return posVis;
	}



	/**
	 * @param posVis the posVis to set
	 */
	public void setPosVis(Integer posVis) {
		this.posVis = posVis;
	}



	/**
	 * @return the puntosVis
	 */
	public Double getPuntosVis() {
		return puntosVis;
	}



	/**
	 * @param puntosVis the puntosVis to set
	 */
	public void setPuntosVis(Double puntosVis) {
		this.puntosVis = puntosVis;
	}



	/**
	 * @return the golesFavorVis
	 */
	public Double getGolesFavorVis() {
		return golesFavorVis;
	}



	/**
	 * @param golesFavorVis the golesFavorVis to set
	 */
	public void setGolesFavorVis(Double golesFavorVis) {
		this.golesFavorVis = golesFavorVis;
	}



	/**
	 * @return the golesContraVis
	 */
	public Double getGolesContraVis() {
		return golesContraVis;
	}



	/**
	 * @param golesContraVis the golesContraVis to set
	 */
	public void setGolesContraVis(Double golesContraVis) {
		this.golesContraVis = golesContraVis;
	}



	/**
	 * @return the puntosCasaVis
	 */
	public Double getPuntosCasaVis() {
		return puntosCasaVis;
	}



	/**
	 * @param puntosCasaVis the puntosCasaVis to set
	 */
	public void setPuntosCasaVis(Double puntosCasaVis) {
		this.puntosCasaVis = puntosCasaVis;
	}



	/**
	 * @return the puntosFueraVis
	 */
	public Double getPuntosFueraVis() {
		return puntosFueraVis;
	}



	/**
	 * @param puntosFueraVis the puntosFueraVis to set
	 */
	public void setPuntosFueraVis(Double puntosFueraVis) {
		this.puntosFueraVis = puntosFueraVis;
	}



	/**
	 * @return the difPuntos
	 */
	public Double getDifPuntos() {
		return difPuntos;
	}



	/**
	 * @param difPuntos the difPuntos to set
	 */
	public void setDifPuntos(Double difPuntos) {
		this.difPuntos = difPuntos;
	}



	/**
	 * @return the difPos
	 */
	public Integer getDifPos() {
		return difPos;
	}



	/**
	 * @param difPos the difPos to set
	 */
	public void setDifPos(Integer difPos) {
		this.difPos = difPos;
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
				", puntos FueraVisitante ="+ puntosFueraVis+
				", diferencia de puntos= " +difPuntos + 
				", diferencia de posicion= " +difPos +
				"]";
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
