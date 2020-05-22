package modelo;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

public class ConjuntoGenericoOrdenado <E extends Comparable & Serializable> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TreeSet<E> elementos; //E será lineas de pedido
	
	public ConjuntoGenericoOrdenado() {
		elementos = new TreeSet<E>();
	}
	
	public void agrega(E elemento) {
		elementos.add(elemento);
	}
	
	public int cantidad() {
		return elementos.size();
	}
	
	public void eliminar(E elemento) {
		elementos.remove(elemento);
	}
	
	public Iterator<E> getIterator(){
		return elementos.iterator();
	}
	
	public E getMayor() {
		return elementos.last();
	}
	
	public E getMenor() {
		return elementos.first();
	}
	
	
}
