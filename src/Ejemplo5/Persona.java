package Ejemplo5;

public class Persona extends Thread {

	private String nombre;
	private Cuenta cuenta;

	public Persona(String nombre, Cuenta cuenta) {
		this.nombre = nombre;
		this.cuenta = cuenta;
	}

	public void run() {		
		this.cuenta.ingresar((int) (Math.random() * 500 + 1),nombre);		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.cuenta.retirar((int) (Math.random() * 500 + 1),nombre);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		this.cuenta.ingresar((int) (Math.random() * 500 + 1),nombre);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	

		this.cuenta.retirar((int) (Math.random() * 500 + 1),nombre);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
