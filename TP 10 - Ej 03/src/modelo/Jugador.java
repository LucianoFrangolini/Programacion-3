package modelo;

import java.util.ArrayList;

import util.Util;

public class Jugador extends Thread {

	private int puntaje;
	private ArrayList<Carta> cartasEnMano= new ArrayList<Carta>();

	public Jugador(String nombre) {
		super(nombre);
	}

	public int getPuntaje() {
		return puntaje;
	}

	@Override
	public void run() {
		Carta carta;
		int aux;
		boolean terminar=false;
		this.puntaje=0;
		
		while (!terminar) {
			try {
				System.out.println(this.getName()+" roba una carta.");
				carta = Mazo.getCarta();
				this.cartasEnMano.add(carta);
				if (this.cartasEnMano.size()<4) {
					if ( (aux=Util.getRandom(3)) == 1 )
						terminar=true;
				}
				else
					terminar=true;
				this.puntaje+=carta.getValor();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
