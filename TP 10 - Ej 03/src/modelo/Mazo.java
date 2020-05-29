package modelo;

import java.util.ArrayList;

import util.Util;

public class Mazo {
	
	private static Mazo instance=null;
	private static ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public static Mazo getInstance() {
		if (Mazo.instance==null)
			Mazo.instance=new Mazo();
		return instance;
	}

	public Mazo() {
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public static Carta getCarta() {
		Carta carta=null;
		int robar = Util.getRandom(cartas.size());
		carta = cartas.get(robar);
		cartas.remove(carta);
		return carta;
	}

}
