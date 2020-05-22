package prueba;

import java.io.IOException;
import java.io.Serializable;

import modelo.LineaDePedido;
import modelo.Pedido;
import modelo.Producto;
import modelo.Proveedor;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;

public class PruebaEscrituraBIN {

	public static void main(String[] args) {
		
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		Proveedor prov1 = new Proveedor("Lucho's Company","lucho@gmail.com","479-8936");
		Proveedor prov2 = new Proveedor("Mati's Company","mati@gmail.com","471-8936");
		
		Producto manzana = new Producto(1111,"Manzana",12);
		Producto naranja = new Producto(2222,"Naranja",9);
		Producto mandarina = new Producto(3333,"Mandarina",5);
		Producto banana = new Producto(4444,"Banana",10);
		
		LineaDePedido lineaManzanas = new LineaDePedido(15,manzana);
		LineaDePedido lineaNaranjas = new LineaDePedido(12,naranja);
		LineaDePedido lineaMandarinas = new LineaDePedido(10,mandarina);
		LineaDePedido lineaBananas = new LineaDePedido(20,banana);
		
		Pedido pedido1 = new Pedido("15/12/2015",prov1);
		pedido1.agrega(lineaManzanas);
		pedido1.agrega(lineaBananas);
		pedido1.setEntregado(true);
		
		Pedido pedido2 = new Pedido("10/11/2016",prov2);
		pedido2.agrega(lineaNaranjas);
		pedido2.agrega(lineaMandarinas);
		
		try {
			persistencia.abrirOutput("Pedidos.bin");
			System.out.println("Se abrió el archivo binario con éxito");
			
			persistencia.escribir(prov1);
			persistencia.escribir(prov2);
			persistencia.escribir(manzana);
			persistencia.escribir(naranja);
			persistencia.escribir(banana);
			persistencia.escribir(mandarina);
			persistencia.escribir(lineaManzanas);
			persistencia.escribir(lineaNaranjas);
			persistencia.escribir(lineaMandarinas);
			persistencia.escribir(lineaBananas);
			persistencia.escribir(pedido1);
			persistencia.escribir(pedido2);
			System.out.println("Se escribió en el archivo satisfactoriamente");
			
			persistencia.cerrarOutput();
			System.out.println("Se cerró el archivo binario.");
	
		}
		catch(IOException o){
			System.out.println(o.getMessage());
		}

	}

}
