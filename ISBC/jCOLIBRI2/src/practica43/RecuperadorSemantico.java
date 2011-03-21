/**
 * 
 */
package practica43;

import java.util.ArrayList;
import java.util.Iterator;

import es.ucm.fdi.gaia.ontobridge.OntoBridge;

/**
 * @author ISBC
 *
 */
public class RecuperadorSemantico {

	/**
	 * 
	 */
		public ArrayList<String> consultarOntologia(OntoBridge ob,String categoria) {
			ArrayList<String> rutas = new ArrayList<String>();
			Iterator<String> fotos = ob.listInstances(categoria);
			while (fotos.hasNext()) {
				String instance = fotos.next();
				System.out.println(instance);
				String aux2 = extraeIndice(instance);
				if (!rutas.contains(aux2)){
					rutas.add(aux2);
				}
				Iterator<String> urlFoto = ob.listPropertyValue(instance, "url_foto");
				while (urlFoto.hasNext()) {
					String url = urlFoto.next();
					System.out.println(url);
					String aux = extraeIndice(url);
				}
			}
			
			return rutas;
		}
		
	private String extraeIndice(String url) {
			String auxiliar = "0";
			auxiliar = url.substring(5);
			return auxiliar;
}

}
