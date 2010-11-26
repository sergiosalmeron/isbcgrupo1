/**
 * 
 */
package practica3;

import java.util.ArrayList;

import practica1.QuinielaCaso;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

/**
 * @author usuario_local
 *
 */
public class JuegosCaso implements CaseComponent {

	public JuegosCaso() {
		
		artists = new MultiValueAttribute();
		designers = new MultiValueAttribute();
		publishers = new MultiValueAttribute();
		subdomains = new MultiValueAttribute();
		categories = new MultiValueAttribute();
		mechanics = new MultiValueAttribute();
		
	}
	/**
	 * 
	 */
	private String url;
	private Integer gameId;
	private String gameCodeName;
	private String gameName;
	private String imageUrl;
	private MultiValueAttribute artists;
	private MultiValueAttribute designers;
	private MultiValueAttribute publishers;
	private Integer yearPublished;
	private String numPlayers;
	private String bestNumPlayers;
	private String recNumPlayers;
	private Integer playingTime;
	private String age;
	private MultiValueAttribute subdomains;
	private MultiValueAttribute categories;
	private MultiValueAttribute mechanics;
	/**
	 * @return the url
	 */
	public String toString() {
		return "Juego [url=" + url + ", gameId=" + gameId + ", gameCodeName="
				+ gameCodeName + ", gameName=" + gameName + ", imageUrl="
				+ imageUrl + ", artist=" + artists + ", designers=" + designers
				+ ", publishers=" + publishers + ", yearPublished="
				+ yearPublished + ", numPlayers=" + numPlayers
				+ ", bestNumPlayers=" + bestNumPlayers + ", recNumPlayers="
				+ recNumPlayers + ", playingTime=" + playingTime + ", age="
				+ age + ", subdomains=" + subdomains + ", categories="
				+ categories + ", mechanics=" + mechanics + "]";
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the gameId
	 */
	public Integer getGameId() {
		return gameId;
	}
	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	/**
	 * @return the gameCodeName
	 */
	public String getGameCodeName() {
		return gameCodeName;
	}
	/**
	 * @param gameCodeName the gameCodeName to set
	 */
	public void setGameCodeName(String gameCodeName) {
		this.gameCodeName = gameCodeName;
	}
	/**
	 * @return the gameName
	 */
	public String getGameName() {
		return gameName;
	}
	/**
	 * @param gameName the gameName to set
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * @return the artists
	 */
	public MultiValueAttribute getArtists() {
		return artists;
	}
	/**
	 * @param artists the artists to set
	 */
	public void setArtists(MultiValueAttribute artists) {
		this.artists = artists;
	}
	/**
	 * @return the designers
	 */
	public MultiValueAttribute getDesigners() {
		return designers;
	}
	/**
	 * @param designers the designers to set
	 */
	public void setDesigners(MultiValueAttribute designers) {
		this.designers = designers;
	}
	/**
	 * @return the publishers
	 */
	public MultiValueAttribute getPublishers() {
		return publishers;
	}
	/**
	 * @param publishers the publishers to set
	 */
	public void setPublishers(MultiValueAttribute publishers) {
		this.publishers = publishers;
	}
	/**
	 * @return the yearPublished
	 */
	public Integer getYearPublished() {
		return yearPublished;
	}
	/**
	 * @param yearPublished the yearPublished to set
	 */
	public void setYearPublished(Integer yearPublished) {
		this.yearPublished = yearPublished;
	}
	/**
	 * @return the numPlayers
	 */
	public String getNumPlayers() {
		return numPlayers;
	}
	/**
	 * @param numPlayers the numPlayers to set
	 */
	public void setNumPlayers(String numPlayers) {
		this.numPlayers = numPlayers;
	}
	/**
	 * @return the bestNumPlayers
	 */
	public String getBestNumPlayers() {
		return bestNumPlayers;
	}
	/**
	 * @param bestNumPlayers the bestNumPlayers to set
	 */
	public void setBestNumPlayers(String bestNumPlayers) {
		this.bestNumPlayers = bestNumPlayers;
	}
	/**
	 * @return the recNumPlayers
	 */
	public String getRecNumPlayers() {
		return recNumPlayers;
	}
	/**
	 * @param recNumPlayers the recNumPlayers to set
	 */
	public void setRecNumPlayers(String recNumPlayers) {
		this.recNumPlayers = recNumPlayers;
	}
	/**
	 * @return the playingTime
	 */
	public Integer getPlayingTime() {
		return playingTime;
	}
	/**
	 * @param playingTime the playingTime to set
	 */
	public void setPlayingTime(Integer playingTime) {
		this.playingTime = playingTime;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the subdomains
	 */
	public MultiValueAttribute getSubdomains() {
		return subdomains;
	}
	/**
	 * @param subdomains the subdomains to set
	 */
	public void setSubdomains(MultiValueAttribute subdomains) {
		this.subdomains = subdomains;
	}
	/**
	 * @return the categories
	 */
	public MultiValueAttribute getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(MultiValueAttribute categories) {
		this.categories = categories;
	}
	/**
	 * @return the mechanics
	 */
	public MultiValueAttribute getMechanics() {
		return mechanics;
	}
	/**
	 * @param mechanics the mechanics to set
	 */
	public void setMechanics(MultiValueAttribute mechanics) {
		this.mechanics = mechanics;
	}
	@Override
	public Attribute getIdAttribute() {
		return new Attribute("url", JuegosCaso.class);
	}
	
}