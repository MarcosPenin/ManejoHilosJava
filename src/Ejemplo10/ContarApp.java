package Ejemplo10;

public class ContarApp {
	public static void main(String[] args) {
		ContarThread c1=new ContarThread("Hilo 1", 100);
		c1.start();
		try {
			c1.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ContarThread c2=new ContarThread("Hilo 2", 100);
		c2.start();
		
		while(c1.isAlive()&&c2.isAlive()) {
			System.out.println("Sigo contando");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
