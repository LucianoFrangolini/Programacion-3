package modelo;

import java.io.Serializable;
import java.util.Iterator;

public class Pedido extends ConjuntoGenericoOrdenado<LineaDePedido> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fecha;
	private Proveedor proveedor;
	private boolean entregado=false;

	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	public Pedido() {
	}
	
	
	public Pedido(String fecha, Proveedor proveedor) {
		this.fecha = fecha;
		this.proveedor = proveedor;
	}


	public void detalle() {
		Iterator<LineaDePedido> it = super.getIterator();
		LineaDePedido lineaAct;
		
		if (this.entregado)
			System.out.println("Fecha del pedido: "+this.fecha+" - Entregado - "+proveedor.toString());
		else
			System.out.println("Fecha del pedido: "+this.fecha+" - No Entregado - "+proveedor.toString());
		while (it.hasNext()) {
			lineaAct = it.next();
			System.out.println(" -"+lineaAct.toString());
		}
	}
	
	public double total() {
		Iterator<LineaDePedido> it = super.getIterator();
		double total=0;
		LineaDePedido lineaAct;
		
		while (it.hasNext()) {
			lineaAct = it.next();
			total+= lineaAct.getCantidad() * lineaAct.getProducto().getPrecioUnitario();
		}
		
		return total;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}
	
	
}
