package practica3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JOptionPane;
import practica3.*;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.recommendation.casesDisplay.DisplayCasesTableMethod;
import jcolibri.extensions.recommendation.navigationByAsking.ObtainQueryWithAttributeQuestionMethod;

public class RecomendadorJuegosGrupo implements StandardCBRApplication {
	static Collection<CBRCase> casos;

	@Override
	public void configure() throws ExecutionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub

	}

	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane s = new JOptionPane();
		casos = new ArrayList<CBRCase>();
		int z = 0;
		HashMap<Attribute,String> labels = new HashMap<Attribute,String>();
		labels.put(new Attribute("subdomains",JuegosCaso.class), "Selecciona un Subdominio");
		labels.put(new Attribute("mechanics",JuegosCaso.class), "Selecciona una Mecanica");
		labels.put(new Attribute("categories",JuegosCaso.class), "Selecciona una Categoría");
		Collection<Attribute> oculta = new ArrayList<Attribute>();
		oculta.add(new Attribute("artists",JuegosCaso.class));
		oculta.add(new Attribute("publishers",JuegosCaso.class));
		oculta.add(new Attribute("designers",JuegosCaso.class));
		while (z == 0){
			try{
				z = Integer.parseInt(s.showInputDialog("Introduzca el numero de personas que forman su grupo"));
			}catch(Exception e){JOptionPane.showInternalMessageDialog(null, "Por favor introduce un entero");}

		}
		RecomendadorJuegos jugador = new RecomendadorJuegos();
		try {
			jugador.configure();
			jugador.preCycle();
			jugador.preCycle2();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<z; i++){
			CBRQuery query = new CBRQuery();
			query.setDescription(new JuegosCaso());
			NuestraQueryAttribute.obtainQueryWithAttributeQuestion(query, new Attribute("categories",JuegosCaso.class), labels, casos);
			try {
				jugador.cycle(query);
				casos.addAll(jugador.getEleccion());
				jugador.setEleccion(new ArrayList<CBRCase>());
				
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			jugador.postCycle();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NuestroMuestraCasos.displayCasesInTableBasic(casos);
		System.exit(0);
	}

}
