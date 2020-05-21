package modelo;

public class Automovil extends Vehiculo {

	private String marca;
	private String modelo;
	private String patente;
	private Motor motor;

	public Automovil() {
	}

	public Automovil(String n_chasis, int anio_fabricacion) {
		super(n_chasis, anio_fabricacion);
	}

	public Automovil(String n_chasis, int anio_fabricacion, String marca, String modelo, String patente, Motor motor) {
		super(n_chasis, anio_fabricacion);
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Automovil - Marca: " + marca + ", Modelo: " + modelo + ", Patente: " + patente + " / "
				+ motor.toString();
	}

}
