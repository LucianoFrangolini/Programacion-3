package modelo;

import java.util.PriorityQueue;

public class ListaConPrioridades<T> {
	
	private PriorityQueue<T> elementos;

	public ListaConPrioridades() {
	}
	
	public void agrega(T elemento) {
		elementos.add(elemento);
	}
	
	public T consultaElemento() {
		return elementos.peek();
	}
	
	public int getCantidad() {
		return elementos.size();
	}
	
	public T getElemento() {
		return elementos.poll();
	}

}
