package Ejemplo5;

public class Cuenta {

	private int saldo;
	private int saldoMax;
	
	public Cuenta(int saldo, int saldoMax) {
		this.saldo=saldo;
		this.saldoMax=saldoMax;		
	}
	
	public synchronized  void  ingresar(int ingreso, String nombre) {
		int previsto=ingreso+this.saldo;
		if(previsto<=saldoMax) {
			this.saldo=previsto;
			System.out.println(nombre+" ha ingresado " +ingreso+" euros. Nuevo saldo: "+this.saldo+" euros");
		}else {
			System.out.println("No se ha podido realizar el ingreso. El saldo previsto ("+previsto+" euros) superaba el límite de "+this.saldoMax+ " euros");
		}			
	}
	
	public synchronized  void retirar (int retirada, String nombre) {
		int previsto=this.saldo-retirada;
		if(previsto>=0) {
			this.saldo=previsto;
			System.out.println(nombre+ " ha retirado "+ retirada+" euros. Saldo restante: "+ this.saldo+" euros");					
		}else {
			System.out.println("No se ha podido realizar la retirada. Saldo insuficiente");
		}
			
	}
	
	
	
	
}
