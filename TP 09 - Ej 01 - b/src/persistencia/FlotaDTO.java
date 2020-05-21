package persistencia;

import java.io.Serializable;
import java.util.ArrayList;

import modelo.Automovil;

public class FlotaDTO implements Serializable{

	private String nombre;
	private ArrayList<AutomovilDTO> automovilesDTO = new ArrayList<AutomovilDTO>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<AutomovilDTO> getAutomoviles() {
		return automovilesDTO;
	}

	public void setAutomoviles(ArrayList<AutomovilDTO> automoviles) {
		this.automovilesDTO = automoviles;
	}

}
