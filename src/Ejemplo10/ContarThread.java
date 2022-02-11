package Ejemplo10;

public class ContarThread extends Thread {

	private int maxContar;
	public int repeticion;
	public String nombre;
	
	public ContarThread(String nombre,int n){
		this.nombre=nombre;
		this.maxContar=n;
	}
	
	
	public void run() {
		for(int i=0;i<=maxContar;i++) {
			repeticion++;
			System.out.println("Repetición "+repeticion);
			System.out.println("Nombre del hilo: "+nombre);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}
