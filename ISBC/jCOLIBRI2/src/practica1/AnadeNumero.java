/**
 * 
 */
package practica1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author grupo 1
 * Clase que añadira un numero despues de case en nuestro txt
 */

public class AnadeNumero {

	/**
	 * 
	 */
	private String cadena;
	private Integer numero;
	private BufferedReader fichero;
	private int buf;
	private BufferedWriter nuevo;
	private int estado;
	
    public int sigCar() throws IOException{
        int c;
        c = fichero.read();
        return c;
    }
	public AnadeNumero(String ruta,String ruta2) throws IOException {
		// TODO Auto-generated constructor stub
		cadena = "";
		numero = 1;
        try {
            fichero = new BufferedReader(new FileReader(ruta));
            buf = sigCar();
            nuevo = new BufferedWriter (new FileWriter(ruta2));

        } catch (FileNotFoundException ex) {
        Logger.getLogger(AnadeNumero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void transita(int s ){
        try {
            estado = s;
            cadena = cadena + (char)buf;
            buf = sigCar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnadeNumero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnadeNumero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void rellena() throws FileNotFoundException, IOException{
        estado = 0;
        while (true){
            switch(estado){
                case 0:{
                	cadena = "";
                    if ((buf == '\n')|| (buf == ' ')) {
                    	transita(0);
                    }
                    else if(buf == -1){
                    	//nuevo.write(-1);
                    	fichero.close();
                    	nuevo.close();
                    	System.exit(0);
                    }
                    else transita(1);
                }
                case 1: {
                	if ((buf == '\n')||(buf == ' ')){
                      	if (cadena.equals("Case")){
                    		cadena = cadena+' ' + numero.toString()+",";
                    		numero++;
                    		nuevo.write(cadena);
                    		cadena = "";
                    		transita(0);
                    		
                    	}
                      	else {
                      		cadena = cadena+'\n';
                      		nuevo.write(cadena);
                      		transita(0);
                      	}
                	}
                	else transita(1);
                }
            }
        }
    }


	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		AnadeNumero prueba = new AnadeNumero("src/practica1/Todo3.txt","src/practica1/BaseCasos3.txt");

		prueba.rellena();

	}

}
