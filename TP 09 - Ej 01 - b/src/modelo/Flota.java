package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Flota {

	private String nombre;
	private ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

	public Flota(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Flota() {
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public void agregarAutomovil(Automovil automovil) {
		this.automoviles.add(automovil);
	}

	public void quitarAutomovil(Automovil automovil) {
		this.automoviles.remove(automovil);
	}

	public void muestraAutomoviles() {
		for (Automovil auto : automoviles) {
			System.out.println(this.toString() + auto.toString());
		}
	}

	@Override
	public String toString() {
		return "Flota:" + nombre + " / ";
	}

}
