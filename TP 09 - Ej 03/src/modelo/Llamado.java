package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Llamado implements Serializable,Comparable<Llamado> {

	private static final long serialVersionUID = 1L;
	private GregorianCalendar fechaHoraPedido;
	private GregorianCalendar fechaHoraAtendido=null;
	private Socio socio;
	private int prioridad;

	public Llamado() {
	}

	public Llamado(Socio socio, int prioridad) {
		super();
		this.fechaHoraPedido = new GregorianCalendar();
		this.socio = socio;
		this.prioridad = prioridad;
	}
	
	

	public GregorianCalendar getFechaHoraPedido() {
		return fechaHoraPedido;
	}

	public void setFechaHoraPedido(GregorianCalendar fechaHoraPedido) {
		this.fechaHoraPedido = fechaHoraPedido;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public GregorianCalendar getFechaHoraAtendido() {
		return fechaHoraAtendido;
	}

	public void setFechaHoraAtendido(GregorianCalendar fechaHoraAtendido) {
		this.fechaHoraAtendido = fechaHoraAtendido;
	}

	@Override
	public String toString() {
		if (fechaHoraAtendido == null)
			return socio + ", Prioridad: " + prioridad + ", FechaHoraPedido: " + fechaHoraPedido.get(Calendar.YEAR)
					+ "/" + fechaHoraPedido.get(Calendar.MONTH) + "/" + fechaHoraPedido.get(Calendar.DATE) + " - "
					+ fechaHoraPedido.get(Calendar.HOUR_OF_DAY) + ":" + fechaHoraPedido.get(Calendar.MINUTE) + ":"
					+ fechaHoraPedido.get(Calendar.SECOND) + "hs";
		else
			return socio + ", Prioridad: " + prioridad + ", FechaHoraPedido: " + fechaHoraPedido.get(Calendar.YEAR)
					+ "/" + fechaHoraPedido.get(Calendar.MONTH) + "/" + fechaHoraPedido.get(Calendar.DATE) + " - "
					+ fechaHoraPedido.get(Calendar.HOUR_OF_DAY) + ":" + fechaHoraPedido.get(Calendar.MINUTE) + ":"
					+ fechaHoraPedido.get(Calendar.SECOND) + "hs , FechaHoraAtendido: "
					+ fechaHoraAtendido.get(Calendar.YEAR) + "/" + fechaHoraAtendido.get(Calendar.MONTH) + "/"
					+ fechaHoraAtendido.get(Calendar.DATE) + " - " + fechaHoraAtendido.get(Calendar.HOUR_OF_DAY) + ":"
					+ fechaHoraAtendido.get(Calendar.MINUTE) + ":" + fechaHoraAtendido.get(Calendar.SECOND) + "hs";
	}

	@Override
	public int compareTo(Llamado o) {
		int aux;
		if (this.prioridad>o.prioridad)
			aux=1;
		else
			if (this.prioridad<o.prioridad)
				aux=-1;
			else
				aux=0;
		return aux;
	}

}
