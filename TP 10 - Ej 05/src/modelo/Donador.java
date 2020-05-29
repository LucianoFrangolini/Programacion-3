package modelo;

import java.util.ArrayList;

import util.Util;

public class Donador extends Thread{

	private Biblioteca biblio=null;
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Donador(String nombre, Biblioteca biblio) {
		super(nombre);
		this.biblio = biblio;
	}

	public void agregarLibroADonar(Libro libro) {
		this.libros.add(libro);
	}
	
	public void donarLibro() {
		Libro libro = this.libros.get( Util.rNum( this.libros.size() ) );
		this.biblio.donar(libro);
		this.libros.remove(libro);
	}

	@Override
	public void run() {
		while (this.libros.size()!=0) {
			this.donarLibro();
			Util.espera(2000);
		}
		System.out.println("El donador se quedó sin libros para donar");
	}

	
}
