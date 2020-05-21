package persistencia;

import java.io.Serializable;

public class VehiculoDTO implements Serializable{

	private String N_chasis;
	private int anio_fabricacion;

	public String getN_chasis() {
		return N_chasis;
	}

	public void setN_chasis(String n_chasis) {
		N_chasis = n_chasis;
	}

	public int getAnio_fabricacion() {
		return anio_fabricacion;
	}

	public void setAnio_fabricacion(int anio_fabricacion) {
		this.anio_fabricacion = anio_fabricacion;
	}

}
