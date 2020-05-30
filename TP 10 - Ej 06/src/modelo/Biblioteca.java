package modelo;

import java.util.HashMap;

public class Biblioteca {

	private static Biblioteca instance = null;
	HashMap<Integer, Libro> hMapLibros = new HashMap<Integer, Libro>();
	HashMap<Integer, Revista> hMapRevistas = new HashMap<Integer, Revista>();

	public static Biblioteca getInstance() {
		if (Biblioteca.instance == null)
			Biblioteca.instance = new Biblioteca();
		return instance;
	}

	public Biblioteca() {
	}

	public void agregarLibro(Libro libro) {
		this.hMapLibros.put(libro.getIdLibro(), libro);
	}

	public void agregarRevista(Revista revista) {
		this.hMapRevistas.put(revista.getIdRevista(), revista);
	}

	public Libro retirarLibro(int idLibro, String nombreSocio) {
		synchronized (this) {
			Libro aux;
			while (!hMapLibros.containsKey(idLibro)) {
				try {
					System.out.println(nombreSocio + " intentó retirar un libro que no se encuentra disponible.");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			aux = hMapLibros.get(idLibro);
			hMapLibros.remove(idLibro);
			return aux;
		}
	}

	public Revista retirarRevista(int idRevista, String nombreSocio) {
		synchronized (this) {
			Revista aux;
			while (!hMapRevistas.containsKey(idRevista)) {
				try {
					System.out.println(nombreSocio + " intentó retirar una revista que no se encuentra disponible.");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			aux = hMapRevistas.get(idRevista);
			hMapRevistas.remove(idRevista);
			return aux;
		}
	}

	public void devolverRevista(Revista revista) {
		synchronized (this) {
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			System.out.println("REVISTAAAAA");
			this.hMapRevistas.put(revista.getIdRevista(), revista);
			notifyAll();
		}
	}

	public void devolverLibro(Libro libro) {
		synchronized (this) {
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			System.out.println("LIBROOOOOO");
			this.hMapLibros.put(libro.getIdLibro(), libro);
			notifyAll();
		}
	}
}
