package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Flota implements Serializable {

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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(ArrayList<Automovil> automoviles) {
		this.automoviles = automoviles;
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
