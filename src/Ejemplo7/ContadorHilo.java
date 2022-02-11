package Ejemplo7;

public class ContadorHilo extends Thread {

	private Contador contador;
	private int identificador;
	
	public ContadorHilo(Contador contador, int identificador) {
		this.contador=contador;
		this.identificador=identificador;
	}
	
	public void run() {		
		for(int i=0;i<50;i++) {
			
			contador.aumentar(identificador);
			try {
				Thread.sleep((long) (1+(10*Math.random())));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
}
