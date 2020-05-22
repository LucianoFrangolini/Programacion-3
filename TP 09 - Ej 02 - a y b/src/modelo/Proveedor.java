package modelo;

import java.io.Serializable;

public class Proveedor implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String email;
	private String telefono;
	
	public Proveedor() {
	}

	public Proveedor(String nombre, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Proveedor: Nombre=" + nombre + " - Email=" + email + " - Telefono=" + telefono;
	}
	
	
	
}
