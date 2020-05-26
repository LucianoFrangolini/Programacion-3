package modelo;

import util.Util;

public class Tren extends Thread {

	private TramoDeVia via;
	private String lado;

	public Tren() {
		super();
	}

	public Tren(String nombre, TramoDeVia via, String lado) {
		super(nombre);
		this.via = via;
		this.lado = lado;
	}

	public String getLado() {
		return lado;
	}

	public TramoDeVia getVia() {
		return via;
	}

	public void setVia(TramoDeVia via) {
		this.via = via;
	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			Util.espera(5000); // Simula tiempo que toma preparar un tren para salir
			if (this.lado.equalsIgnoreCase("izquierda")) {
				this.via.pasaTrenIzquierdo(this);
				this.lado = "derecha";
			} else {
				this.via.pasaTrenDerecho(this);
				this.lado = "izquierda";
			}
		}
	}

}
