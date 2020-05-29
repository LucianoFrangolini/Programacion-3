package modelo;

import java.util.HashMap;

public class Biblioteca {
	
	private static Biblioteca instance = null;
	HashMap<Integer,Libro> hMap = new HashMap<Integer,Libro>();
	
	public static Biblioteca getInstance() {
		if (Biblioteca.instance==null)
			Biblioteca.instance=new Biblioteca();
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
		this.hMap.put(libro.getIdLibro(), libro);
	}
	
	public synchronized Libro retirarLibro(int idLibro,String nombreSocio) {
		Libro aux;
		while (!hMap.containsKey(idLibro)) {
			try {
				System.out.println(nombreSocio+" intentó retirar un libro que no se encuentra disponible.");
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
		this.hMap.put(libro.getIdLibro(), libro);
		notifyAll();
	}
}
