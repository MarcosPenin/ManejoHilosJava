package Ejemplo9;

public class Alumno extends Thread{

	private Bienvenida bienvenida;
	private String nombre;
		
	public Alumno(String nombre,Bienvenida bienvenida) {
		this.nombre=nombre;
		this.bienvenida=bienvenida;		
	}
	
	public void run() {
//	
//		while(!bienvenida.llegadaAlumno()) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			}
//		}
		saludo();
		
	}
	
	public void saludo() {
		System.out.println(nombre+" dice HOLA");
	}
	
	

}
