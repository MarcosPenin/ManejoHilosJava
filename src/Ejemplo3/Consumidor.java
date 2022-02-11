package Ejemplo3;

public class Consumidor extends Thread {
    private ColaPing cola;
    
    public Consumidor(ColaPing c) {
        cola = c;       
    }
    public void run() {
        String valor = "";
       for (int i = 0; i < 40; i++) {        
            valor = cola.get();           
			System.out.print(valor);			
        }
    }
}

