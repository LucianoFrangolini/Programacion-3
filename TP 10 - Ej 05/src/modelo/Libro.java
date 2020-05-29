package modelo;

public class Libro {

	private String nombre;
	private int idLibro;
	
	public Libro(String nombre, int idLibro) {
		super();
		this.nombre = nombre;
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIdLibro() {
		return idLibro;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
	
}
