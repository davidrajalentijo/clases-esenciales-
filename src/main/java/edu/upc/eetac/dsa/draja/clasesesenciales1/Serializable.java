package edu.upc.eetac.dsa.draja.clasesesenciales1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Serializable {
	
	public static void main( String[] args ) throws IOException, ClassNotFoundException
    {
    	 FileOutputStream fos = new FileOutputStream("C:\\Users\\david\\Desktop\\DSA\\fichero.bin");
    	 FileInputStream fis = new FileInputStream("C:\\Users\\david\\Desktop\\DSA\\fichero.bin");
    	 ObjectOutputStream out = new ObjectOutputStream(fos);
    	 ObjectInputStream in = new ObjectInputStream(fis);
    	 try{
    	 Dato D1 = new Dato();
    	 Dato D2 = new Dato();
    	 Dato D3 = new Dato();
    	 
    	 out.writeObject(D1);
    	 out.writeObject(D2);
    	 out.writeObject(D3);
    	 
    	 D1 = (Dato) in.readObject();
    	 D2 = (Dato) in.readObject();
    	 D2 = (Dato) in.readObject();
    	 
    	 } catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			// En el finally cerramos el fichero, para asegurarnos
 			// que se cierra tanto si todo va bien como si salta
 			// una excepcion.
 			try {
 				if (null != out) {
 					out.close();
 				}
 				if (null != in) {
 					in.close();
 				}

 			} catch (Exception e2) {
 				e2.printStackTrace();
 			}
 		}
    }

}
