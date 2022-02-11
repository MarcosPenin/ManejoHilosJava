package Ejemplo7;

public class Contador {

	private int contador=0;

	public int getContador() {
		return contador;
	}

	public synchronized void aumentar(int identificador) {
		contador++;
		System.out.println("Hilo "+identificador+" aumenta");
		System.out.println("Contador="+contador);
	}	
	
	
	
	
	
	
}



