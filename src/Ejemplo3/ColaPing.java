package Ejemplo3;

public class ColaPing {
	  private String pinpon;
	    private boolean disponible = false;

	    public synchronized String  get() {
	        while (!disponible){
	            try {
	                wait();
	            } catch (InterruptedException e) { }
	        }
	        disponible = false;
	        notifyAll();
	        return pinpon;
	    }

	    public synchronized void put(String  valor) {
	        while (disponible){
	            try {
	                wait();
	            } catch (InterruptedException e) { }
	        }
	        pinpon = valor;
	        disponible = true;
	        notifyAll();
	    }
	}

