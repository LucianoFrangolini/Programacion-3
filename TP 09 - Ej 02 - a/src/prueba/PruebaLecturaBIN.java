package prueba;

import java.io.IOException;
import java.io.Serializable;

import modelo.LineaDePedido;
import modelo.Pedido;
import modelo.Producto;
import modelo.Proveedor;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;

public class PruebaLecturaBIN {

	public static void main(String[] args) {

		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		Proveedor prov1 = null;
		Proveedor prov2 = null;
		
		Producto manzana = null;
		Producto naranja = null;
		Producto mandarina = null;
		Producto banana = null;
		
		LineaDePedido lineaManzanas = null;
		LineaDePedido lineaNaranjas = null;
		LineaDePedido lineaMandarinas = null;
		LineaDePedido lineaBananas = null;
		
		Pedido pedido1 = null;		
		Pedido pedido2 = null;
		
		try {
			persistencia.abrirInput("Pedidos.bin");
			System.out.println("Se abrio el archivo binario");
			
			prov1 = (Proveedor) persistencia.leer();
			prov2 = (Proveedor) persistencia.leer();
			manzana = (Producto) persistencia.leer();
			naranja = (Producto) persistencia.leer();
			banana = (Producto) persistencia.leer();
			mandarina = (Producto) persistencia.leer();
			lineaManzanas = (LineaDePedido) persistencia.leer();
			lineaNaranjas = (LineaDePedido) persistencia.leer();
			lineaMandarinas = (LineaDePedido) persistencia.leer();
			lineaBananas = (LineaDePedido) persistencia.leer();
			pedido1 = (Pedido) persistencia.leer();
			pedido2 = (Pedido) persistencia.leer();
			System.out.println("Se leyeron los datos correctamente");
			
			persistencia.cerrarInput();
			System.out.println("Se cerró el archivo binario con éxito");
			
		}
		catch(IOException o) {
			System.out.println(o.getMessage());
		}
		catch(ClassNotFoundException o) {
			System.out.println(o.getMessage());
		}
		
		System.out.println("\nProveedores registrados:");
		System.out.println(prov1);
		System.out.println(prov2);
		
		System.out.println("\nProductos registrados:");
		System.out.println(manzana);
		System.out.println(naranja);
		System.out.println(mandarina);
		System.out.println(banana);
		
		System.out.println("\nPedido 1: ");
		pedido1.detalle();
		System.out.println("Precio del pedido $"+pedido1.total());
		
		System.out.println("\nPedido 2: ");
		pedido2.detalle();
		System.out.println("Precio del pedido $"+pedido2.total());
		
		System.out.println("\nProveedores que adeudan pedidos:");
		if (!pedido1.isEntregado())
			System.out.println(pedido1.getProveedor());
		if (!pedido2.isEntregado())
			System.out.println(pedido2.getProveedor());
	}

}
