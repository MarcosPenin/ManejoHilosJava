package Ejemplo9;

public class Main {

	public static void main(String[] args) {
		
		Bienvenida b=new Bienvenida();
		
		Profesor p=new Profesor(b);
		Alumno a1=new Alumno("Alumno 1", b);
		Alumno a2=new Alumno("Alumno 2", b);
		Alumno a3=new Alumno("Alumno 3", b);
		
		a1.start();	
		a2.start();
		a3.start();
		
		p.start();
		
	}
}
