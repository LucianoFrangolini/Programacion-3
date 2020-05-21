package modelo;

import java.io.Serializable;

public class Motor implements Serializable {

	private String n_Serie;
	private String combustible;

	public Motor() {
	}

	public Motor(String n_Serie, String combustible) {
		super();
		this.n_Serie = n_Serie;
		this.combustible = combustible;
	}

	public String getN_Serie() {
		return n_Serie;
	}

	public void setN_Serie(String n_Serie) {
		this.n_Serie = n_Serie;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor - Numero de serie: " + n_Serie + ", Combustible: " + combustible;
	}

}
