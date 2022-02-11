package Ejemplo11;

public class Hilo extends Thread {

	private String nombre;
	private Compartido compartido;

	public Hilo(String nombre, Compartido compartido) {
		this.nombre = nombre;
		this.compartido = compartido;
	}

	public void run() {
		synchronized (compartido) {
			for (int i = 0; i < 10; i++) {
				System.out.print(nombre+ " ");
				compartido.notify();
				try {
					compartido.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		//compartido.notify();
		}		

	}

}
