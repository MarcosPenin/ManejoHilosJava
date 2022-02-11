package Ejemplo8;

public class MainCajero {

	public static void main(String[] args) {

		Cajero cajero = new Cajero("Cajero Vía Norte");
		Terminal t1 = new Terminal("Terminal 1", cajero);
		Terminal t2 = new Terminal("Terminal 2", cajero);
		Terminal t3 = new Terminal("Terminal 3", cajero);

		System.out.println("Cajero: " + cajero.mostrarNombre());

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		System.out.println("Total de localidades vendidas: " + cajero.mostrarLocalidades());
		System.out.println("Fin del programa");
	}

}
