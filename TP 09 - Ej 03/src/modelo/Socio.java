package modelo;

import java.io.Serializable;

public class Socio implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int dni;
	private String domicilio;
	
	
	public Socio() {
	}


	public Socio(String nombre, int dni, String domicilio) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	@Override
	public String toString() {
		return "Socio: Nombre= " + nombre + " / Dni= " + dni + " / Domicilio= " + domicilio;
	}
	
	
	
}
