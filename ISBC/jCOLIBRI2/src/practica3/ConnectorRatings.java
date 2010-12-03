package practica3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import antlr.collections.List;

import practica3.JuegosCaso;

import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CaseBaseFilter;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.InitializingException;


public class ConnectorRatings implements Connector {

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCases(Collection<CBRCase> cases) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initFromXMLfile(URL file) throws InitializingException {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<CBRCase> retrieveAllCases() {
		ArrayList<CBRCase> cases = new ArrayList<CBRCase>();
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("src/practica3/ratings"));
			String line = null;
			line = reader.readLine();
			while ((line!=null))
			{
				ratingCaso rating = new ratingCaso();
				ArrayList<Integer> juego = new ArrayList<Integer>();
				ArrayList<Double> puntuacion = new ArrayList<Double>();
				int i=0;
				String d="";
				String username = "";
				while (line.charAt(i)!=','){
					d=d+line.charAt(i);
					i++;
				}
				rating.setUserName(d);
				rating.setPuntuacion(puntuacion);
				rating.setCodigoJuego(juego);
				i++;
				username = d;
				while(d.equals(username)){
					d = "";
					while (line.charAt(i)!=','){
						d=d+line.charAt(i);
						i++;
					}
				if (!rating.getCodigoJuego().contains(Integer.parseInt(d))){
					rating.getCodigoJuego().add(Integer.parseInt(d));
					i++;
					d="";
					while (i<line.length()){
						d=d+line.charAt(i);
						i++;
					}
					if(Double.parseDouble(d)>7.5){
						rating.getPuntuacion().add(Double.parseDouble(d));
					}else rating.getCodigoJuego().remove(rating.getCodigoJuego().size()-1);
				}
						d = "";
						line = reader.readLine();
						i=0;
						if (line!=null){
							while (line.charAt(i)!=','){
								d=d+line.charAt(i);
								i++;
							}
							i++;
					}
				}
				CBRCase _case = new CBRCase();
				_case.setDescription(rating);
				cases.add(_case);
				
			}
			reader.close();

		}catch (Exception e)
		{
			System.out.println(e);
		}
		return cases;
	}

	@Override
	public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void storeCases(Collection<CBRCase> cases) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
