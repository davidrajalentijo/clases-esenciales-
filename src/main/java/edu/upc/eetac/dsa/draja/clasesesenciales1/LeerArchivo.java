package edu.upc.eetac.dsa.draja.clasesesenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeerArchivo {
	
	public static void main(String [] arg) throws BigNumberException {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    try{
	    	
	    	archivo = new File ("C:\\Users\\david\\Desktop\\DSA\\numeros.txt");
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	        
	        String linea;
			int numero;
			linea = br.readLine();
			while (linea != null) {

				try {
					numero = Integer.parseInt(linea);
					System.out.println(linea);
					linea = br.readLine();
				}

				catch (NumberFormatException e) {
					throw new RuntimeException(e);
				}
				
				if (numero > 1000) throw new BigNumberException();
				
				
			}
	        
	    	
	    }
	    catch(FileNotFoundException e){
	    	  System.err.println ("Caught FileNotFoundException:" + e.getMessage ());
	      }
	    catch (IOException e){
	    	  System.err.println("Caught IOException:" + e.getMessage());
	      }

	    
	    
	    finally {

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
