package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class OperadoraEmergencias extends ListaConPrioridades<Llamado> {
	
	private PriorityQueue<Llamado> atendidos = new PriorityQueue<Llamado>();
	
	//Cambiar implementacion

	public OperadoraEmergencias() {
	}
	
	public void cargaAtendidos() {
		
	}
	
	public int cantidadLlamados(Socio socio){
		int cantidad=0;
		Llamado auxLlamado;
		PriorityQueue<Llamado> colaAux = new PriorityQueue<Llamado>();
		
		for (int i=0; i<super.getCantidad() ; i++){
			auxLlamado = super.getElemento();
			if (auxLlamado.getFechaHoraAtendido()!=null && auxLlamado.getSocio()==socio)
				cantidad++;
			colaAux.add(auxLlamado);
		}
		
		for (int i=0; i<colaAux.size() ; i++)
			super.agrega(colaAux.poll());
		
		return cantidad;
	}
	
	public Iterator<Llamado> getLlamadosAtendidos(){
		ArrayList<Llamado> list = new ArrayList<Llamado>();
		PriorityQueue<Llamado> colaAux = new PriorityQueue<Llamado>();
		Llamado auxLlamado;
		
		for (int i=0; i<super.getCantidad() ; i++){
			auxLlamado = super.getElemento();
			if (auxLlamado.getFechaHoraAtendido()!=null)
				list.add(auxLlamado);
			colaAux.add(auxLlamado);
		}
		
		for (int i=0; i<colaAux.size() ; i++)
			super.agrega(colaAux.poll());
		
		Iterator<Llamado> it = list.iterator();
		return it;
	}
	
	
	
	

}
