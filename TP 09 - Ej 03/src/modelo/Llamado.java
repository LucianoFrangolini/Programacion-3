package modelo;

import java.util.GregorianCalendar;

public class Llamado {
	
	private GregorianCalendar fechaHoraAtendido;
	private Socio socio;

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
	
	

}
