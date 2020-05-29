package modelo;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

import util.Util;

public class Biblioteca {
	
	private static Biblioteca instance = null;
	HashMap<Integer,Libro> hMap = new HashMap<Integer,Libro>();
	private Semaphore semaforo;
	
	public static Biblioteca getInstance() {
		if (Biblioteca.instance==null)
			Biblioteca.instance=new Biblioteca();
		return instance;
	}

	public Biblioteca() {
		semaforo = new Semaphore(5,false);
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
	
	public Libro retirarLibro(int idLibro,String nombreSocio) {
		Libro aux;
		while ( ( !hMap.containsKey(idLibro) ) || semaforo.availablePermits()==0 ) {
			System.out.println(nombreSocio+" intentó retirar un libro no disponible.");
			Util.espera(5000);
		}
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		aux = hMap.get(idLibro);
		hMap.remove(idLibro);
		return aux;
	}
	
	public void devolverLibro(Libro libro) {
		this.hMap.put(libro.getIdLibro(), libro);
		semaforo.release();
	}
}
