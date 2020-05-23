package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class OperadoraEmergencias extends ListaConPrioridades<Llamado> {
	
	private static final long serialVersionUID = 1L;
	private PriorityQueue<Llamado> atendidos = new PriorityQueue<Llamado>();

	public OperadoraEmergencias() {
	}
	
	public void cargaAtendidos() {
		Llamado auxLlamado;
		PriorityQueue<Llamado> colaAux = new PriorityQueue<Llamado>();
		
		for (int i=0; i<super.getCantidad() ; i++){
			auxLlamado = super.getElemento();
			if (auxLlamado.getFechaHoraAtendido()!=null)
				this.atendidos.add(auxLlamado);
			colaAux.add(auxLlamado);
		}
		
		for (int i=0; i<colaAux.size() ; i++)
			super.agrega(colaAux.poll());
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
		Iterator<Llamado> it = this.atendidos.iterator();
		return it;
	}
	
	public void CargaHashMap(HashMap<Socio,Integer> hMap) {
		Iterator<Llamado> it = this.getLlamadosAtendidos();
		Llamado auxLlamado;
		
		while (it.hasNext()) {
			auxLlamado = it.next();
			if (hMap.containsKey(auxLlamado.getSocio())) 
				hMap.put( auxLlamado.getSocio() , hMap.get(auxLlamado.getSocio())+1 );
			else
				hMap.put( auxLlamado.getSocio(), 1 );
		}
		
	}
	
	public Socio getSocioMasEmergencias() {
		Socio socio=null;
		int cantidad=0;
		Socio auxSocio;
		Set<Socio> set;
		Iterator<Socio> it;
		
		HashMap<Socio,Integer> hMap = new HashMap<Socio,Integer>();
		CargaHashMap(hMap);
		set = hMap.keySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			auxSocio = it.next();
			if (hMap.get(auxSocio)>cantidad) {
				socio=auxSocio;
				cantidad=hMap.get(auxSocio);
			}
		}
		
		return socio;
	}

	public PriorityQueue<Llamado> getAtendidos() {
		return atendidos;
	}

	public void setAtendidos(PriorityQueue<Llamado> atendidos) {
		this.atendidos = atendidos;
	} 	
	

}
