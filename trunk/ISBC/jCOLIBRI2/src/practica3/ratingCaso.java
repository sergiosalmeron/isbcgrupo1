package practica3;

import java.util.ArrayList;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class ratingCaso implements CaseComponent{
	
	String userName;
	ArrayList<Integer> codigoJuego;
	ArrayList<Double> puntuacion;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ArrayList<Integer> getCodigoJuego() {
		return codigoJuego;
	}
	public void setCodigoJuego(ArrayList<Integer> codigoJuego) {
		this.codigoJuego = codigoJuego;
	}
	public ArrayList<Double> getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(ArrayList<Double> puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String toString(){
		String s = "rating de: " + userName + "para " + codigoJuego.toString() + "es " + puntuacion.toString();
		return s;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("userName", ratingCaso.class);
	}

}

	