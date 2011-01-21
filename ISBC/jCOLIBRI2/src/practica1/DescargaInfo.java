package practica1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DescargaInfo {

	int año; //Año en el que empezo la temporada
	int division;
	
	public static void main(String[] args) throws IOException{
		DescargaInfo prueba = new DescargaInfo(9,1);
		prueba.rellenar();
		
	}
	
	public DescargaInfo(int a, int d){
		año=a;
		division=d;
	}
	
	public static String downloadURL(URL url)
	{
		URLConnection connection = null;
		try {
			connection = url.openConnection();
			connection.setConnectTimeout(10000);
			connection.setReadTimeout(10000);
		} catch (IOException e1) {
			return null;
		}

		String line;
		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
			}
			reader.close();
		} 
		catch (IOException e) {
			return null;
		}
		
		return builder.toString();
	}
	
	public void rellenar() throws IOException {
		
		int caso=0;
		String jornada=null;
		int numDatos=0;
		String archivo=null;
		int restaGoles=0;
		String resultado=null;
		String linea=null;
		String equipo1=null;
		String equipo2=null;
		String[][] equipos;
		String posicion=null;
		BufferedReader fichero = new BufferedReader(new FileReader("src/practica1/Todo3.txt"));
		String antes="";
		int s = 0;
		while (s!=-1){
			s= (fichero.read());
			if(!(s==-1))
			antes= antes + (char)s;
		}
		fichero.close();
		BufferedWriter nuevo = new BufferedWriter (new FileWriter("src/practica1/Todo3.txt"));
		nuevo.write(antes);
		String laURL="http://www.lfp.es/?tabid=154&Controltype=cal&g=" + division + "&t=1";
		if(año<10){
			laURL=laURL + "0" + año;
		}
		else{
			laURL=laURL + año;
		}
		URL u= new URL(laURL);
		URL clasificaciones;
		String cadena = downloadURL(u);
		int i=0;
		String palabra=null;
		String dato=null;
		Boolean esJornada=false;
		while (i<cadena.length()-5){
			i=quitarTodos(cadena,' ',i);
		
			if(cadena.charAt(i)=='<'){
				i=quitarTodos(cadena,'\n',i);
				i=i+1;
			}
			else{
				while(cadena.charAt(i)!='\n'){
					if(cadena.charAt(i)!=' ' && cadena.charAt(i)!='\t'){
						if (palabra==null){
							palabra = String.valueOf(cadena.charAt(i));							
						}
						else{
							palabra=palabra + String.valueOf(cadena.charAt(i));
						}
					}
					i=i+1;
				}
				i=i+1;
			}
						
			if(!esRara(palabra)){
				if(palabra.charAt(0)=='J' && palabra.charAt(1)=='o'){
					esJornada=true;
					numDatos=1;
					caso=caso+1;
					linea="Case ";// + caso + ",";
				}
				
				palabra=escribirBien(palabra);
		
				if (esJornada){
					jornada=String.valueOf(palabra.charAt(7));
					if(palabra.charAt(8)!='/'){
						jornada=jornada + String.valueOf(palabra.charAt(8));
					}
				}
				else{
					numDatos=numDatos+1;
					linea=linea + palabra + ",";
					if(numDatos==2){
						equipo1=palabra;
						equipo1=identificarEquipo(palabra);
					}
					if(numDatos==3){
						restaGoles=Integer.parseInt(palabra);
					}
					if(numDatos==4){
						restaGoles=restaGoles - Integer.parseInt(palabra);
					}
					if(numDatos==5){
						equipo2=palabra;
						equipo2=identificarEquipo(palabra);
					}
				}
				esJornada=false;
				palabra=null;
			}
			palabra=null;
			if(numDatos==5){
				numDatos=0;
				int añoReal=año+1;
				if (archivo==null){
					archivo=linea + jornada + "," + añoReal + "," + division;
				}
				else{
					archivo=archivo + linea + jornada + "," + añoReal + "," + division;
				}
				
				if(restaGoles==0){ //Empate
					resultado="X";
				}
				else{
					if(restaGoles>0){ //Gana el equipo Local
						resultado="1";
					}
					else{ //Gana el equipo Visitante
						resultado="2";
					}
				}
				
				//Empezamos a buscar la clasificacion en la tabla de Clasificaciones
				if(jornada.equals("1")){
					archivo=archivo + ",0,0,0,0,0,0,0,0,0,0,0,0" + ",0,0,1," + resultado + '\n';
				}
				else{
					laURL="http://www.lfp.es/?tabid=154&Controltype=detcla&g=";
					laURL=laURL + division + "&t=1";
					if(año<10){
						laURL=laURL + "0" + año;
					}
					else{
						laURL=laURL + año;
					}
					int numJornada= Integer.parseInt(jornada);
					numJornada=numJornada-1;
					laURL=laURL + "&j=" + numJornada;
					clasificaciones = new URL(laURL);
					String cadenaClas = downloadURL(clasificaciones);
					equipos=asignarPosiciones(cadenaClas);
					
					int num=0;
					int k=0;
					while (equipo1.charAt(0)!=cadenaClas.charAt(k) || equipo1.charAt(1)!=cadenaClas.charAt(k+1) ||
							equipo1.charAt(2)!=cadenaClas.charAt(k+2) || equipo1.charAt(3)!=cadenaClas.charAt(k+3)){
						
						k=k+1;
					}
					
					posicion = buscarPosicion(equipos, equipo1);	
					archivo=archivo + "," + posicion;
					k=quitarTodos(cadenaClas,'\n',k);
					k=k+1;
					
					while (k<cadenaClas.length()-5 && num<17){
						k=quitarTodos(cadenaClas,' ',k);

						if(cadenaClas.charAt(k)=='<'){
							k=quitarTodos(cadenaClas,'\n',k);
							k=k+1;
						}
						else{
							while(cadenaClas.charAt(k)!='\n'){
								if(cadenaClas.charAt(k)!=' ' && cadenaClas.charAt(k)!='\t'){
									if (dato==null){
										dato = String.valueOf(cadenaClas.charAt(k));							
									}
									else{
										dato=dato + String.valueOf(cadenaClas.charAt(k));
									}
								}
								k=k+1;
							}
							k=k+1;
						}
						
						if(!esRara(dato)){	
							num=num+1;
							if(num==1 || num==6 || num==7 || num==8 || num==15){
								archivo=archivo + "," + dato;
							}
							dato=null;
						}
					}
					
					num=0;
					k=0;
					while (equipo2.charAt(0)!=cadenaClas.charAt(k) || equipo2.charAt(1)!=cadenaClas.charAt(k+1) ||
							equipo2.charAt(2)!=cadenaClas.charAt(k+2) || equipo2.charAt(3)!=cadenaClas.charAt(k+3)){

						k=k+1;
					}
					
					posicion = buscarPosicion(equipos, equipo2);		
					archivo=archivo + "," + posicion;
					
					k=quitarTodos(cadenaClas,'\n',k);
					k=k+1;
					
					while (k<cadenaClas.length()-5 && num<17){
						k=quitarTodos(cadenaClas,' ',k);
	
						if(cadenaClas.charAt(k)=='<'){
							k=quitarTodos(cadenaClas,'\n',k);
							k=k+1;
						}
						else{
							while(cadenaClas.charAt(k)!='\n'){
								if(cadenaClas.charAt(k)!=' ' && cadenaClas.charAt(k)!='\t'){
									if (dato==null){
										dato = String.valueOf(cadenaClas.charAt(k));							
									}
									else{
										dato=dato + String.valueOf(cadenaClas.charAt(k));
									}
								}
								k=k+1;
							}
							k=k+1;
						}
				
						if(!esRara(dato)){
							num=num+1;
							if(num==1 || num==6 || num==7 || num==8 || num==15){
								archivo=archivo + "," + dato;
							}
							dato=null;
						}
					}
					archivo=archivo + ",0,0,1," + resultado + '\n';
					System.out.println(archivo);
				}
			}
		}
		
		nuevo.write(archivo);
		System.out.println("Se acabo =)");
		nuevo.close();
    	System.exit(0);
	}
	
	public String[][] asignarPosiciones(String s){
		
		String[][] asignaciones=new String[100][2];
		int p=0;
		String aux=null;
		String pos=null;
		boolean encontrado=false;
		int numEquipos=0;
		
		while (p<s.length()-5){
			while(s.charAt(p)==' ' || s.charAt(p)=='\t'){
				p=p+1;
			}
			
			if(s.charAt(p)=='<'){
				while(s.charAt(p)!='\n'){
					p=p+1;
				}
				p=p+1;
			}
			else{
				while(s.charAt(p)!='\n'){
					if(s.charAt(p)!=' ' && s.charAt(p)!='\t'){
						if (aux==null){
							aux = String.valueOf(s.charAt(p));							
						}
						else{
							aux=aux + String.valueOf(s.charAt(p));
						}
					}
					p=p+1;
				}
				p=p+1;
			}
			
			if(aux!=null && !aux.equals("Impresion") && !aux.equals("ModifiedbyCetele") && 
					!aux.equals("-->") && !(aux.charAt(0)=='i' && aux.charAt(1)=='m' && aux.charAt(2)=='g') &&
					aux.charAt(0)!='/' && !(aux.charAt(0)=='v' && aux.charAt(1)=='a' && aux.charAt(2)=='r')){
				
				if(encontrado){
					asignaciones[numEquipos][0]=aux;
					asignaciones[numEquipos][1]=pos;
					encontrado=false;
					numEquipos=numEquipos+1;
				}
				
				int longitud=aux.length()-1;
				//posicion&ordm;
				if(aux.charAt(longitud)==';' && aux.charAt(longitud-1)=='m' && aux.charAt(longitud-2)=='d' &&
						aux.charAt(longitud-3)=='r' && aux.charAt(longitud-4)=='o'){
					
					pos=String.valueOf(aux.charAt(0));
					if (aux.charAt(1)!='&'){
						pos=pos+String.valueOf(aux.charAt(1));
					}
					encontrado=true;
				}
			}
			aux=null;
		}
		return asignaciones;
	}
	
	public String buscarPosicion(String[][] posiciones, String equipo){
		String p=null;
		boolean b=true;
		int r=0;
		String e=equipo;
		//Los nombres son distintos en cada pagina de la lfp
		//Es necesaio que identifique unos con otros.
		if(e.equals("Xerez")) e="XerezC.D.";
		if(e.equals("Getafe")) e="GetafeC.F.";
		if(e.equals("Barcelona")) e="F.C.Barcelona";
		if(e.equals("Espanyol")) e="R.C.D.Espanyol";
		if(e.equals("M&aacute;laga")) e="M&aacute;lagaC.F.";
		if(e.equals("Mallorca")) e="R.C.D.Mallorca";
		if(e.equals("Valencia")) e="ValenciaC.F.";
		if(e.equals("Madrid")) e="RealMadridC.F.";
		if(e.equals("Zaragoza")) e="RealZaragozaCD";
		if(e.equals("Athletic")) e="AthleticClub";
		if(e.equals("Osasuna")) e="C.At.Osasuna";
		if(e.equals("Villarreal")) e="VillarrealC.F.";
		if(e.equals("Almería")) e="U.D.Almer&iacute;a";
		if(e.equals("Valladolid")) e="RealValladolid";
		if(e.equals("Deportivo")) e="R.C.Deportivo";
		if(e.equals("Tenerife")) e="C.D.Tenerife";
		if(e.equals("Sevilla")) e="SevillaF.C.";
		if(e.equals("Racing")) e="RealRacingClub";
		if(e.equals("Gij&oacute;n")) e="RealS.deGij&oacute;n";
		if(e.equals("At. de Madrid")) e="At.deMadrid";	
		if(e.equals("Huelva")) e="R.C.R.deHuelva";	
		if(e.equals("Numancia")) e="C.D.Numancia";	
		if(e.equals("Betis")) e="RealBetisB.S.";	
		if(e.equals("Levante")) e="LevanteU.D.";
		if(e.equals("Celta")) e="RCCeltadeVigo";
		if(e.equals("C&aacute;diz")) e="C&aacute;dizC.F.";
		if(e.equals("Salamanca")) e="U.D.Salamanca";
		if(e.equals("VillarrealB")) e="VillarrealCFB";
		if(e.equals("C&oacute;rdoba")) e="C&oacute;rdobaC.F.";
		if(e.equals("Castellón")) e="C.D.Castell&oacute;n";
		if(e.equals("H&eacute;rcules")) e="H&eacute;rculesC.F.";
		if(e.equals("Uni&oacute;n")) e="RealUni&oacute;nClub";
		if(e.equals("Rayo")) e="RayoVallecano";
		if(e.equals("Albacete")) e="AlbaceteBalomp.";
		if(e.equals("Girona")) e="GironaF.C.";
		if(e.equals("Cartagena")) e="F.C.Cartagena";
		if(e.equals("Murcia")) e="RealMurciaC.F.";
		if(e.equals("Gimnástic")) e="ClubGimnÃ stic";
		if(e.equals("Palmas")) e="U.D.LasPalmas";
		if(e.equals("Sociedad")) e="RealSociedad";
		if(e.equals("Elche")) e="ElcheC.F.";
		if(e.equals("Huesca")) e="S.D.Huesca";
		if(e.equals("Alavés")) e="C.D.Alav&eacute;s";
		if(e.equals("Alicante")) e="AlicanteC.F.";
		if(e.equals("Eibar")) e="S.D.Eibar";
		if(e.equals("SevillaAtlético")) e="SevillaAtl&eacute;tico";
		if(e.equals("Club")) e="ClubGranada74";
		if(e.equals("Ferrol")) e="R.C.deFerrol";
		if(e.equals("Ejido")) e="Polidepor.Ejido";
		
		while(b){
			if(posiciones[r][0].equals(e)){
				b=false;
				p=posiciones[r][1];
			}
			r=r+1;
		}
		return p;
	}
	
	public String escribirBien(String pal){
		//No identifica bien las tildes.
		if(pal.equals("M&aacute;laga")) 	pal="Málaga";
		if(pal.equals("Almer&iacute;a"))	pal="Almería";
		if(pal.equals("C&aacute;diz"))	pal="Cádiz";
		if(pal.charAt(0)=='V' && pal.charAt(1)=='i' && pal.charAt(2)=='l' && 
				pal.charAt(3)=='l' && pal.charAt(4)=='a' && pal.length()>10){
			pal="VillarrealB";	//No confundir con Villareal
		}
		if(pal.equals("C&oacute;rdoba"))	pal="Córdoba";
		if(pal.equals("Castell&oacute;n"))	pal="Castellón";
		if(pal.equals("H&eacute;rcules"))	pal="Hércules";
		if(pal.equals("RealUni&oacute;n"))	pal="R.Unión";
		if(pal.equals("Gimn&aacute;stic"))	pal="Gimnástic";
		if(pal.equals("SevillaAtl&eacute;tico"))	pal="SevillaAtlético";
		if(pal.equals("Alav&eacute;s"))		pal="Alavés";

		return pal;
	}
	
	public int quitarTodos(String cad, char c, int puntero){
		if (c==' '){
			while(cad.charAt(puntero)==c || cad.charAt(puntero)=='\t'){
				puntero=puntero+1;
			}
		}
		else{
			while(cad.charAt(puntero)!=c){
				puntero=puntero+1;
			}
		}
		return puntero;
	}
	
	public boolean esRara(String p){
		boolean b=true;
		if (p!=null && !p.equals("Impresion") && !p.equals("ModifiedbyCetele") && 
				!p.equals("-->") && !(p.charAt(0)=='i' && p.charAt(1)=='m' && p.charAt(2)=='g') &&
				p.charAt(0)!='/' && !(p.charAt(0)=='v' && p.charAt(1)=='a' && p.charAt(2)=='r')){
			b=false;
		}
		return b;
	}
	
	public String identificarEquipo(String pal){
		if(pal.equals("Málaga"))	return ("M&aacute;laga");
		if(pal.equals("R.Madrid"))	return ("Madrid");
		if(pal.equals("Sporting"))	return ("Gij&oacute;n");
		if(pal.equals("At.Madrid"))	return ("At. de Madrid");
		if(pal.equals("Recreativo"))	return ("Huelva");
		if(pal.equals("Cádiz"))	return ("C&aacute;diz");
		if(pal.equals("Córdoba"))	return ("C&oacute;rdoba");
		if(pal.equals("Hércules"))	return ("H&eacute;rcules");
		if(pal.equals("R.Unión"))	return ("Uni&oacute;n");
		if(pal.equals("LasPalmas"))	return ("Palmas");
		if(pal.equals("R.Sociedad"))	return ("Sociedad");
		if(pal.equals("Granada74"))	return ("Club");
		return pal;
	}
}
