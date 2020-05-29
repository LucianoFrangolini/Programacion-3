package main;

import modelo.Carta;
import modelo.Jugador;
import modelo.Mazo;

public class Main {

	public static void main(String[] args) {
		
		int i,j;
		Mazo mazo = Mazo.getInstance();
		Jugador j1 = new Jugador("Lucho");
		Jugador j2 = new Jugador("Mati");
		Jugador j3 = new Jugador("Kari");
		Jugador j4 = new Jugador("Mauri");
		
		for (i=1; i<10 ; i++)
			for (j=0; j<4 ; j++)
				mazo.getCartas().add(new Carta(i));
		for (i=0;i<16;i++)
			mazo.getCartas().add(new Carta(10));
		
		j1.start();
		j2.start();
		j3.start();
		j4.start();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(j1.getName()+" terminó con un puntaje de "+j1.getPuntaje());
		System.out.println(j2.getName()+" terminó con un puntaje de "+j2.getPuntaje());
		System.out.println(j3.getName()+" terminó con un puntaje de "+j3.getPuntaje());
		System.out.println(j4.getName()+" terminó con un puntaje de "+j4.getPuntaje());
			
	}

}
