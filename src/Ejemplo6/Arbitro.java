package Ejemplo6;

public class Arbitro {

	
	private int numJugadores;
	private boolean juegoAcabado;
	private int num;
	private int turno;
	
	
	public Arbitro(int numJugadores) {
		this.numJugadores=numJugadores;
		this.juegoAcabado=false;
		this.turno=(int) (1+(numJugadores*Math.random()));
		this.num=(int) (1+(10*Math.random()));		
	}
	
	
	public int getTurno() {
		return turno;
	}
	
	public boolean getJuegoAcabado() {
		return juegoAcabado;
	}
	
	public synchronized void jugada(int jugador,int jugada) {
		if(jugada==num) {
		juegoAcabado=true;
		System.out.println("El juego ha terminado, el número era el "+jugada+ "¡Felicidades, jugador "+jugador+"!");
		}else {
			turno++;
			if(turno>numJugadores) {
				turno=1;
			}
			System.out.println("Incorrecto, el juego continúa. Le toca el jugador "+turno);	
		}

	}
	
			
	
	
	
	
}
