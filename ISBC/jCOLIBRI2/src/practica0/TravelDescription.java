/**
 * 
 */
package practica0;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

/**
 * @author Grupo 1
 *
 */
public class TravelDescription implements CaseComponent {

	/**
	 * 
	 */
	String caseId;
	String HolidayType;
	Integer NumberOfPersons;
	String Region;
	String Trasportation;
	Integer Duration;
	String Season;
	String Accomodation;
	public TravelDescription() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbrcore.CaseComponent#getIdAttribute()
	 */
	@Override
	public Attribute getIdAttribute() {
		return new Attribute ("caseId", TravelDescription.class);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TravelDescription [caseId=" + caseId + ", HolidayType="
				+ HolidayType + ", NumberOfPersons=" + NumberOfPersons
				+ ", Region=" + Region + ", Trasportation=" + Trasportation
				+ ", Duration=" + Duration + ", Season=" + Season
				+ ", Accomodation=" + Accomodation + "]";
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

	/**
	 * @return the holidayType
	 */
	public String getHolidayType() {
		return HolidayType;
	}

	/**
	 * @param holidayType the holidayType to set
	 */
	public void setHolidayType(String holidayType) {
		HolidayType = holidayType;
	}

	/**
	 * @return the numberOfPersons
	 */
	public Integer getNumberOfPersons() {
		return NumberOfPersons;
	}

	/**
	 * @param numberOfPersons the numberOfPersons to set
	 */
	public void setNumberOfPersons(Integer numberOfPersons) {
		NumberOfPersons = numberOfPersons;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return Region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		Region = region;
	}

	/**
	 * @return the trasportation
	 */
	public String getTrasportation() {
		return Trasportation;
	}

	/**
	 * @param trasportation the trasportation to set
	 */
	public void setTrasportation(String trasportation) {
		Trasportation = trasportation;
	}

	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return Duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		Duration = duration;
	}

	/**
	 * @return the season
	 */
	public String getSeason() {
		return Season;
	}

	/**
	 * @param season the season to set
	 */
	public void setSeason(String season) {
		Season = season;
	}

	/**
	 * @return the accomodation
	 */
	public String getAccomodation() {
		return Accomodation;
	}

	/**
	 * @param accomodation the accomodation to set
	 */
	public void setAccomodation(String accomodation) {
		Accomodation = accomodation;
	}

}
