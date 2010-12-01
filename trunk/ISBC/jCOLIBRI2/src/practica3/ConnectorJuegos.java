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


public class ConnectorJuegos implements Connector {

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
			BufferedReader reader = new BufferedReader(new FileReader("src/practica3/games"));
			String line = null;
			while ((line=reader.readLine())!=null)
			{
				JuegosCaso game = new JuegosCaso();
				game.setUrl(line);
				game.setCode(reader.readLine());
				game.setCodeName(reader.readLine());
				game.setTitle(reader.readLine());
				game.setImage(reader.readLine());
				String artists = reader.readLine();
				artists = artists.substring(1, artists.length()-1);
				game.setArtists(new ArrayList<String>(Arrays.asList(artists.split(","))));
				String designers= reader.readLine();
				designers = designers.substring(1, designers.length()-1);
				game.setDesigners(new ArrayList<String>(Arrays.asList(designers.split(","))));
				String publishers= reader.readLine();
				publishers = publishers.substring(1, publishers.length()-1);
				game.setPublishers(new ArrayList<String>(Arrays.asList(publishers.split(","))));
				game.setYearPublished(reader.readLine());
				game.setNumPlayers(reader.readLine());
				game.setBestNumPlayers(reader.readLine());
				game.setRecNumPlayers(reader.readLine());
				game.setPlayingTime(reader.readLine());
				game.setAge(reader.readLine());
				String subDomains=(reader.readLine());
				subDomains = subDomains.substring(1,subDomains.length()-1);
				game.setSubdomains(new Subdomains(Arrays.asList(subDomains.split(","))));
				String categories=(reader.readLine());
				categories = categories.substring(1,categories.length()-1);
				game.setCategories(new Categories(Arrays.asList(categories.split(","))));
				String mechanics=(reader.readLine());
				mechanics = mechanics.substring(1, mechanics.length()-1);
				game.setMechanics(new Mechanics(Arrays.asList(mechanics.split(","))));
				reader.readLine();
				
				if(!reader.readLine().equals("<GAME>"))
					throw new Exception("File format error");
				
				CBRCase _case = new CBRCase();
				_case.setDescription(game);
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
