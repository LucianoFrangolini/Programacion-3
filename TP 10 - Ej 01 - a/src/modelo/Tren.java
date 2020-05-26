package modelo;

import util.Util;

public class Tren extends Thread{

	private TramoDeVia via;

	public Tren() {
		super();
	}

	public Tren(String nombre,TramoDeVia via) {
		super(nombre);
		this.via = via;
	}

	public TramoDeVia getVia() {
		return via;
	}

	public void setVia(TramoDeVia via) {
		this.via = via;
	}

	@Override
	public void run() {
		
		for (int i=0 ; i<3 ; i++) {
			this.via.pasaTren(this);
			Util.espera(5000);
		}
	}
	
	
}
