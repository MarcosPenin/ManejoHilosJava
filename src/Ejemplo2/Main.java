package Ejemplo2;

public class Main {


		public static void main(String[] args) {
			Contador cont = new Contador(0);
			
			Hilo h1 = new Hilo(cont);
			Hilo h2 = new Hilo(cont);
			Hilo h3 = new Hilo(cont);
			Hilo h4 = new Hilo(cont);
			Hilo h5 = new Hilo(cont);

			h1.start();
			h2.start();
			h3.start();
			h4.start();
			h5.start();
			
			try {
		       h1.join(); h2.join(); h3.join();
		       h4.join(); h5.join(); 
		   } catch (InterruptedException e) { }		
		   
		  System.out.println("Valor del contador: "+cont.getContador());	
			
		}

	}

	

