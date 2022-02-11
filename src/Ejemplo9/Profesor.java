package Ejemplo9;

public class Profesor extends Thread {

	private Bienvenida bienvenida;
	
	public Profesor(Bienvenida bienvenida) {
		this.bienvenida=bienvenida;
		
	}
	
	public void run() {	
		bienvenida.llegadaProfesor();
				
	}
	

}
