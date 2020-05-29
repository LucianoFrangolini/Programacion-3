package modelo;

import java.util.HashMap;

import util.Util;

public class Biblioteca {

	private static Biblioteca instance = null;
	HashMap<Integer, Libro> hMap = new HashMap<Integer, Libro>();

	public static Biblioteca getInstance() {
		if (Biblioteca.instance == null)
			Biblioteca.instance = new Biblioteca();
		return instance;
	}

	public Biblioteca() {
	}

	public HashMap<Integer, Libro> gethMap() {
		return hMap;
	}

	public void sethMap(HashMap<Integer, Libro> hMap) {
		this.hMap = hMap;
	}

	public void agregarLibro(Libro libro) {
		if (this.hMap.size() < 10)
			this.hMap.put(libro.getIdLibro(), libro);
	}

	public synchronized void donar(Libro libro) {
		while (this.hMap.size() >= 10) {
			try {
				System.out.println("Se intentó donar un libro pero la biblioteca está llena.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.agregarLibro(libro);
		System.out.println();
		System.out.println("Se donó el libro " + libro.getNombre());
		System.out.println();
		notifyAll();
	}

	public synchronized Libro retirarLibro(int idLibro, String nombreSocio) {
		Libro aux;
		while (!hMap.containsKey(idLibro)) {
			try {
				System.out.println(nombreSocio + " intentó retirar el libro "+idLibro+" y no se encuentra disponible.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		aux = hMap.get(idLibro);
		hMap.remove(idLibro);
		return aux;
	}

	public synchronized void devolverLibro(Libro libro) {
		while (this.hMap.size()>9){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.hMap.put(libro.getIdLibro(), libro);
		notifyAll();
	}
}
