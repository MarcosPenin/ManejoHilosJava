package Ejemplo9;

public class Bienvenida {

	private boolean llegadaProfesor = false;

	public Bienvenida() {
	}

	public synchronized void llegadaAlumno() {
		if(!llegadaProfesor) {
			try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}		
	}

	public synchronized void llegadaProfesor() {
		llegadaProfesor = true;	
		notifyAll();
	}	
	
}
