package Ejemplo12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Faltan argumentos en main...");
			return;
		}

		for (int i = 0; i < args.length; i++) {
			File fichero = new File(args[i]); 
			FileReader fic;
			if (fichero.exists()) {

				try {
					fic = new FileReader(fichero);

					long t_comienzo = System.currentTimeMillis();
					int c;

					c = ContarCaracteres(fic);

					long t_fin = System.currentTimeMillis();
					long tiempoTotal = t_fin - t_comienzo;
					System.out.printf("Caracteres de %s => %d %n " + "   El proceso ha tardado: %d milisegundos %n",
							args[i], c, tiempoTotal);

					fic.close(); 
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else
				System.out.printf("El fichero [%s] no existe...%n", args[i]);
		}
	}

	private static int ContarCaracteres(FileReader fic) throws IOException {
		int i;
		int c = 0;
		while ((i = fic.read()) != -1) 
			c++;
		return c;

	}

}
