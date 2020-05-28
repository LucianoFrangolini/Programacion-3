package modelo;

import util.Util;

public class Tren extends Thread {

	private TramoDeVia via;
	private String lado;
	private int contador;

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
			contador=0;
			Util.espera(5000); // Simula tiempo que toma preparar un tren para salir
			while (!this.lado.equalsIgnoreCase(this.via.getSiguiente())) {
			//while (this.lado != this.via.getSiguiente()) {
				try {
					contador+=1;
					System.out.println(this.getName()+" se pone a esperar del lado "+this.lado);
					System.out.println();
					Thread.sleep(2000);
					if (this.contador>=10) {
						this.via.cambiaSiguiente();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.via.cruzarTren(this);
			if (this.lado.equalsIgnoreCase("derecho"))
				this.lado="izquierdo";
			else
				this.lado="derecho";
		}
	}
}
