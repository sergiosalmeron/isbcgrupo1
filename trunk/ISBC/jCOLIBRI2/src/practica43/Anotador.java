package practica43;

import es.ucm.fdi.gaia.ontobridge.OntoBridge;
import es.ucm.fdi.gaia.ontobridge.test.gui.PnlSelectInstance;

public class Anotador {



	public void anotarFotografiaApareceEn(OntoBridge ob,
		PnlSelectInstance tree, String urlFotografia,int indice,String relacion) {
		String nombreFoto = "Foto_" + indice;
		ob.createOntProperty(nombreFoto, relacion, tree.getSelectedInstance());

	}
	
	public void anadirNuevoIndividuo(OntoBridge ob, String nombreInstancia, String conceptoPrimitivo) {
		ob.createInstance(conceptoPrimitivo, nombreInstancia);
	}
	
	public void anadirNuevoConcepto(OntoBridge ob, String nombreConcepto, String conceptoPrimitivo, boolean check) {
		ob.createClass(nombreConcepto);
		if (check) 
		ob.setSubClass(nombreConcepto, conceptoPrimitivo);
	}
	
	
	public void anotarFotografiaEsUn(OntoBridge ob,
			String Clase, String urlFotografia,int indice) {
			String nombreFoto = "Foto_" +indice;
			ob.createOntProperty(nombreFoto,"esUn",Clase);
	}
	
	public void anadirRelacionInstancias(OntoBridge ob,
			String origen, String relacion,String destino) {
			ob.createOntProperty(origen,relacion,destino);
	}
	
}
