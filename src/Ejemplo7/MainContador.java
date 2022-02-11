package Ejemplo7;

public class MainContador {

	public static void main(String[] args) {
	
	Contador c=new Contador();
	ContadorHilo h1=new ContadorHilo(c,1);
	ContadorHilo h2=new ContadorHilo(c,2);
	ContadorHilo h3=new ContadorHilo(c,3);
	ContadorHilo h4=new ContadorHilo(c,4);
	
	h1.start();
	h2.start();
	h3.start();
	h4.start();
	
	}
	
}
