package Ejemplo5;

public class Main {

	public static void main(String[] args) {

		Cuenta cuenta=new Cuenta(100, 600);		
		Persona persona1=new Persona("Marcos",cuenta);
		Persona persona2=new Persona("Juan", cuenta);
		Persona persona3=new Persona("Ana",cuenta);			
		persona1.start();
		persona2.start();
		persona3.start();	
	}
}
