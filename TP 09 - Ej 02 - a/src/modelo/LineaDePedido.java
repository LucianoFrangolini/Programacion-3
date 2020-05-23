package modelo;

import java.io.Serializable;

public class LineaDePedido implements Serializable,Comparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidad;
	private Producto producto;
	
	public LineaDePedido() {
	}

	public LineaDePedido(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public int compareTo(Object object) {
		LineaDePedido linea = (LineaDePedido) object;
		int aux;
		
		if (this.producto.getCodigo() == linea.producto.getCodigo())
			aux=0;
		else
			if (this.producto.getCodigo()<linea.producto.getCodigo())
				aux=-1;
			else
				aux=1;
		
		return aux;
	}

	@Override
	public boolean equals(Object obj) {
		LineaDePedido linea = (LineaDePedido) obj;
		boolean aux=false;
		
		if (this.producto.getCodigo()==linea.producto.getCodigo())
			aux=true;
		
		return aux;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + (int) (serialVersionUID ^ (serialVersionUID >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "LineaDePedido: "+producto+" - Cantidad: " + cantidad;
	}
	
	
	
	
	
	
	
}
