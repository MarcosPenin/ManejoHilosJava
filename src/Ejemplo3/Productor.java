package Ejemplo3;

public class Productor extends Thread {
	   private ColaPing cola;
	   
	    public Productor(ColaPing c) {
		  cola = c;        
	    }
	    public void run() {
		   
		    String cad="";
	        for (int i = 0; i < 40; i++) {	
	        	
	        	if(i%2==0) cad=" PING ";
				else cad=" PONG ";
	        	
	            cola.put(cad);            
	        }
	    }
}
