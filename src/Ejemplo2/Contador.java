package Ejemplo2;

public class Contador {

	int c;

	Contador(int c) {
		this.c = c;
	}
 
	public void incrementa() {
		c = c + 1;
	}

	public int getContador() {
		return c;
	}
}