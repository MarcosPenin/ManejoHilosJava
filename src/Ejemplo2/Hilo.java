package Ejemplo2;

public class Hilo extends Thread{

		Contador contador;

		public Hilo(Contador contador) {
			this.contador = contador;
		}
		public void run() {
			synchronized (contador) {
				for (int i = 0; i < 5000; i++)
					contador.incrementa();
			}
		}

}
