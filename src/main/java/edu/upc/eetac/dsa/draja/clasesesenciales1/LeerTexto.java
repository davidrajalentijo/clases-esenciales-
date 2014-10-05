package edu.upc.eetac.dsa.draja.clasesesenciales1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
public class LeerTexto {
	public static void main (String [] arg){
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    int caracter;
	    int cont = 0;
	    java.util.Date fecha = new Date();
	    
	    try{
	   //abrimos el fichero 
	    archivo = new File ("C:\\Users\\david\\Desktop\\DSA\\texto.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        //contamos el numero de caracteres
        caracter = br.read();
        while (caracter != -1){
        	cont++;
        	caracter = br.read();
        }
        System.out.println("El archivo contiene " + cont + " caracteres");
	    }
	    catch(FileNotFoundException e){
	    	  System.err.println ("Caught FileNotFoundException:" + e.getMessage ());
	    }
	    catch(IOException e){
	    	  System.err.println("Caught IOException:" + e.getMessage());
	    }
        
        //creación del archivo con fecha y hora
        String contenido;
        
        contenido = "Fecha del archivo: " + fecha.getDate() + "/" + fecha.getMonth() +"/" + fecha.getYear() + " " + fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds() + " El archivo contiene " + cont + " caracteres";
        File file = null;

		try {

			
			

			FileWriter fw = new FileWriter(new File("C:\\Users\\david\\Desktop\\DSA\\registro1.txt"), true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(contenido);
			bw.newLine();
			bw.close();
		}
		catch(IOException e){
	    	  System.err.println("Caught IOException:" + e.getMessage());
	    }
	    
	    
	    finally{
	    	try {

				if (fr != null)
					fr.close();
			}

			catch (Exception e2) {
				throw new RuntimeException(e2);
			}
	    	
	    }
       
	}

}
