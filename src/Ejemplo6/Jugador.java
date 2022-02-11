package Ejemplo6;

public class Jugador extends Thread {

	
	private int numJugador;
	private Arbitro arbitro;
	
	
	public Jugador(int numJugador, Arbitro arbitro) {
		this.numJugador=numJugador;
		this.arbitro=arbitro;
	}

	public void run() {		
		while(!arbitro.getJuegoAcabado()) {
			if(arbitro.getTurno()==numJugador) {
			
			int jugada=(int) (1+(10*Math.random()));
			System.out.println("El jugador "+numJugador+" apuesta por el "+jugada);
			arbitro.jugada(numJugador,jugada);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}}}}
	
						
	
	

