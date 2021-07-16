package leyendo_escribiendo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escrtura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		int datos_entrada[] = new int[39181];
		
		try {
			
			FileInputStream archivo_l = new FileInputStream("/home/user/Desktop/wallpaper-001.jpeg");
			
			boolean finalar = false;		
			
			while(!finalar) {
				
				int byte_entrada = archivo_l.read();
				
				if (byte_entrada != -1) {
					
					datos_entrada[cont] = byte_entrada;
					
				} else if (byte_entrada == -1) {
					
					finalar = true;
					
				}
				
				System.out.println(datos_entrada[cont]);
				
				cont++; 			
				
			}
			
			System.out.println(cont);
			
			archivo_l.close();
			
			
		} catch (IOException ex) {
			
			ex.printStackTrace();
			
		}
		
		crea_fichero(datos_entrada);
		
	}
	
	public static void crea_fichero( int[] datos_fichero) {
		
		try {
			
			FileOutputStream fichero_nuevo = new FileOutputStream("/home/user/Desktop/wallpaper-002.jpeg");
			
			for (int i = 0; i < datos_fichero.length; i++) {
				
				try {
					fichero_nuevo.write(datos_fichero[i]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			try {
				fichero_nuevo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}
	

}



