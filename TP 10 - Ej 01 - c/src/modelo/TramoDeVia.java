package modelo;

import java.util.ArrayList;

import util.Util;

public class TramoDeVia {

	private String siguiente = "izquierdo";
	private ArrayList<Tren> trenesEnVia = new ArrayList<Tren>();
	private int cantidadTrenes = 0;

	public TramoDeVia() {
	}

	public String getSiguiente() {
		return siguiente;
	}

	public void cruzarTren(Tren tren) {

		entraTren(tren);

		if (this.siguiente.equalsIgnoreCase("izquierdo"))
			pasaTrenIzquierdo(tren);
		else
			pasaTrenDerecho(tren);

		saleTren(tren);

		if (this.siguiente.equalsIgnoreCase("izquierdo") && this.cantidadTrenes == 0) {
			this.siguiente = "derecho";
			System.out.println("---------La v�a ahora va hacia el lado derecho");
			System.out.println();
		} else if (this.siguiente.equalsIgnoreCase("derecho") && this.cantidadTrenes == 0) {
			this.siguiente = "izquierdo";
			System.out.println("---------La v�a ahora va hacia el lado izquierdo");
			System.out.println();
		}
	}

	public void entraTren(Tren tren) {
		this.trenesEnVia.add(tren);
		this.cantidadTrenes += 1;
		System.out.println(
				"El tren " + tren.getName() + " ingres� satisfactoriamente a la v�a por el lado " + this.siguiente);
		System.out.println("Actualmente hay " + this.cantidadTrenes + " tren/es en la v�a");
		System.out.println();
	}

	public void saleTren(Tren tren) {
		this.trenesEnVia.remove(tren);
		this.cantidadTrenes -= 1;
		System.out.println(
				"El tren " + tren.getName() + " sali� satisfactoriamente de la v�a");
		System.out.println("Actualmente hay " + this.cantidadTrenes + " tren/es en la v�a");
		System.out.println();
	}

	public synchronized void pasaTrenIzquierdo(Tren tren) {
		System.out.println(tren.getName() + " comienza a cruzar la v�a desde la izquierda.");
		Util.espera(1000);
		System.out.println(tren.getName() + " sale de la v�a por la derecha.");
		notifyAll();
		System.out.println();
	}

	public synchronized void pasaTrenDerecho(Tren tren) {
		System.out.println(tren.getName() + " comienza a cruzar la v�a desde la derecha.");
		Util.espera(1000);
		System.out.println(tren.getName() + " sale de la v�a por la izquierda.");
		notifyAll();
		System.out.println();
	}
	
	public void cambiaSiguiente() {
		if (this.siguiente.equalsIgnoreCase("derecho"))
			this.siguiente="izquierdo";
		else
			this.siguiente="derecho";
	}

}
