package ficheros_directorios;

import java.io.File;

public class Acceso_Rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("/home/user");
		
		System.out.println(ruta.getAbsolutePath());
		String[] nombre_archivos = ruta.list();
		
		for (String archivos : nombre_archivos) {
			System.out.println(archivos);
			File f = new File(ruta.getAbsolutePath(), archivos);
			if (f.isDirectory()) {
				String [] archivos_subcarpeta = f.list();
				for (String subcarpetas : archivos_subcarpeta) {
					System.out.println(subcarpetas);
				}
			}
		}
	}

}
