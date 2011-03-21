package practica43;

import es.ucm.fdi.gaia.ontobridge.OntoBridge;
import es.ucm.fdi.gaia.ontobridge.test.gui.PnlSelectInstance;

public class Anotador {

	// /**
	// * Este método crea instancias de la forma "Foto_i", donde i es un número
	// entre 1
	// * y el total de fotos disponibles. Dentro de cada foto habrá una
	// propiedad
	// * "urlFoto" que apunte a su ubicación
	// *
	// * @param arrayFotos Array con todas las fotos disponibles
	// */
	// public static void crearInstanciasDeFotos(OntoBridge ob,
	// ArrayList<String> arrayFotos) {
	// Iterator it = arrayFotos.iterator();
	// // Contador de fotos
	// int numFoto = 1;
	//		
	// while (it.hasNext()) {
	// //String nombreFoto = String.format("Foto_", numFoto);
	// String nombreFoto = it.next().toString();
	// ob.createInstance("Fotos", nombreFoto);
	// //ob.createDataTypeProperty(nombreFoto, "urlFoto", "noticias/" +
	// nombreFoto);
	// numFoto++;
	// }
	// }

	public void anotarFotografiaApareceEn(OntoBridge ob,
			PnlSelectInstance tree, String urlFotografia,int indice,String relacion) {
		// Creamos la instancia correspondiente a esta foto que vamos a
		// etiquetar
	//	int pos = urlFotografia.indexOf('.');
	//	String indStr = urlFotografia.substring(0, pos);
	//	int indiceFoto = Integer.parseInt(indStr);
		
		String nombreFoto = "Foto_" + indice;
	//	String urlfoto = /*/*"file:noticias/" +*/ /*indiceFoto + ".jpg";*/ urlFotografia;
		//ob.createInstance("Fotos", nombreFoto);
		
		ob.createOntProperty(nombreFoto, relacion, tree.getSelectedInstance());
//		ob.createDataTypeProperty(nombreFoto, "urlfoto", urlfoto);
		//ob.save("ontologias/fotoOnto.owl");
	}
	
	public void anadirNuevoIndividuo(OntoBridge ob, String nombreInstancia, String conceptoPrimitivo) {
		// Si estamos aquí, es porque el individuo no existe ya en el concepto primitivo
		ob.createInstance(conceptoPrimitivo, nombreInstancia);
		//ob.save("src/practica43/P4.owl");
	}
	
	public void anadirNuevoConcepto(OntoBridge ob, String nombreConcepto, String conceptoPrimitivo, boolean check) {
		// Si estamos aquí, es porque el individuo no existe ya en el concepto primitivo
		ob.createClass(nombreConcepto);
		if (check) 
		ob.setSubClass(nombreConcepto, conceptoPrimitivo);
	}
	
	
	public void anotarFotografiaEsUn(OntoBridge ob,
			String Clase, String urlFotografia,int indice) {
			String nombreFoto = "Foto_" +indice;
			//ob.delete(nombreFoto);
			//ob.createInstance(Clase, nombreFoto);
			//ob.mmodifyOntProperty(sourceInstance, propertyName, destInstance)("Fotos", propertyName, destInstance)
			ob.createOntProperty(nombreFoto,"esUn",Clase);
	}
	
	public void anadirRelacionInstancias(OntoBridge ob,
			String origen, String relacion,String destino) {
			ob.createOntProperty(origen,relacion,destino);
	}
	

//	public void anotarFotografiaEsUn(OntoBridge ob, String nombreConceptoPrimitivo, int indiceFoto) {
//		// Creamos la instancia correspondiente a esta foto que vamos a
//		// etiquetar
//		String nombreFoto = "Foto_" + indiceFoto;
//		String urlFoto = "file:noticias/" + indiceFoto + ".jpg";
//		ob.createInstance(nombreConceptoPrimitivo, nombreFoto);
//		ob.createDataTypeProperty(nombreFoto, "url_foto", urlFoto);
//		ob.save("ontologias/fotoOnto.owl");
//	}
}
