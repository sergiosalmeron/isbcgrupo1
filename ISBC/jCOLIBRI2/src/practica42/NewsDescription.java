package practica42;

import java.util.ArrayList;
import java.util.Collection;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
import jcolibri.datatypes.Text;
import jcolibri.extensions.textual.IE.representation.IEText;

public class NewsDescription implements CaseComponent {

	String id;
	IEText text;
	Text title;
	Collection<String> Politico = new ArrayList<String>();
	Collection<String> Deporte = new ArrayList<String>();
	Collection<String> Deportista = new ArrayList<String>();
	Collection<String> Economia = new ArrayList<String>();
	Collection<String> Tecnologia = new ArrayList<String>();
	/**
	 * @return the politico
	 */
	public Collection<String> getPolitico() {
		return Politico;
	}



	/**
	 * @param politico the politico to set
	 */
	public void setPolitico(Collection<String> politico) {
		this.Politico = politico;
	}



	/**
	 * @return the deporte
	 */
	public Collection<String> getDeporte() {
		return Deporte;
	}



	/**
	 * @param deporte the deporte to set
	 */
	public void setDeporte(Collection<String> deporte) {
		Deporte = deporte;
	}



	/**
	 * @return the deportista
	 */
	public Collection<String> getDeportista() {
		return Deportista;
	}



	/**
	 * @param deportista the deportista to set
	 */
	public void setDeportista(Collection<String> deportista) {
		Deportista = deportista;
	}



	/**
	 * @return the economia
	 */
	public Collection<String> getEconomia() {
		return Economia;
	}



	/**
	 * @param economia the economia to set
	 */
	public void setEconomia(Collection<String> economia) {
		Economia = economia;
	}



	/**
	 * @return the tecnologia
	 */
	public Collection<String> getTecnologia() {
		return Tecnologia;
	}



	/**
	 * @param tecnologia the tecnologia to set
	 */
	public void setTecnologia(Collection<String> tecnologia) {
		Tecnologia = tecnologia;
	}



	/**
	 * @return the nombres
	 */
	public Collection<String> getNombres() {
		return nombres;
	}



	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(Collection<String> nombres) {
		this.nombres = nombres;
	}



	/**
	 * @return the verbos
	 */
	public Collection<String> getVerbos() {
		return verbos;
	}



	/**
	 * @param verbos the verbos to set
	 */
	public void setVerbos(Collection<String> verbos) {
		this.verbos = verbos;
	}



	Collection<String> nombres;
	Collection<String> verbos;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public IEText getText() {
		return text;
	}



	public void setText(IEText text) {
		this.text = text;
	}



	public Text getTitle() {
		return title;
	}



	public void setTitle(Text title) {
		this.title = title;
	}



	@Override
	public String toString() {
		return "NewsDescription [\n\tid=" + id + "\n\ttitle=" + title + "\n\ttext="	+ text + "\n]";
	}



	@Override
	public Attribute getIdAttribute() {
		return new Attribute("id", this.getClass());
	}

}
