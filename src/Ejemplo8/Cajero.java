package Ejemplo8;

public class Cajero {

	private int localidades;
	private String nombre;
	
	public Cajero(String nombre) {
		this.nombre=nombre;
	}
	
	public synchronized void sumarLocalidades() {
		localidades++;
	}
	
	public int mostrarLocalidades() {
		return localidades;
	}
	
	public String mostrarNombre() {
		return nombre;
	}
	
}
