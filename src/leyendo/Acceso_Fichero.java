package leyendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_Fichero accediendo = new Leer_Fichero();
		
		accediendo.lee();
		
		
	}

}

class Leer_Fichero {
	
	public void lee() {
		
		try {
			
			entrada = new FileReader("/home/user/Desktop/ejemplo.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			//int c = 0;
			
			String linea = "";
			
			while (linea != null) {
				
				linea =  miBuffer.readLine();
				
				//c = entrada.read();
				
				//char letra = (char) c;
				
				System.out.println(linea);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	private static FileReader entrada;
	
}
