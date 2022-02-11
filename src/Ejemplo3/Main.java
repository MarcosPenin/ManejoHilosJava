package Ejemplo3;

public class Main {

	public static void main(String[] args) {

		ColaPing cola = new ColaPing();
		Productor p = new Productor(cola);
		Consumidor c = new Consumidor(cola);
		p.start();
		c.start();

	}

}
