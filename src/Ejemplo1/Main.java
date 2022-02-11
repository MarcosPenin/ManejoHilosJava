package Ejemplo1;

public class Main {

	public static void main(String[] args) {
		
		new Thread(new Hilo("uno")).start();
		new Thread(new Hilo("dos")).start();
		new Thread(new Hilo("tres")).start();
		new Thread(new Hilo("cuatro")).start();
		new Thread(new Hilo("cinco")).start();
		
	}
	
	}


