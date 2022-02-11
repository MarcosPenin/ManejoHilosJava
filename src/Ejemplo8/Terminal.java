package Ejemplo8;

import Ejemplo7.Contador;

public class Terminal extends Thread {

	private Cajero cajero;
	private String nombre;
	private int localidadesTerminal;
	
	public Terminal(String nombre,Cajero cajero) {
		this.nombre=nombre;
		this.cajero=cajero;
	}
		
	public void run() {					
		for(int i=0;i<20000;i++) {			
			cajero.sumarLocalidades();
			localidadesTerminal++;			
		}
		System.out.println(nombre+" vendió: "+localidadesTerminal);
		
	}	
}
