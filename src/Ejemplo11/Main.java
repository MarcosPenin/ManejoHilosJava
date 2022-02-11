package Ejemplo11;

public class Main {

	public static void main(String[] args) {
		Compartido c = new Compartido();

		Hilo h1 = new Hilo("TIC", c);
		Hilo h2 = new Hilo("TAC", c);
		
		h1.start();
		h2.start();
		

	}

}
