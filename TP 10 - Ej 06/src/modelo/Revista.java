package modelo;

public class Revista {
	
	private String nombre;
	private int idRevista;
	
	public Revista(String nombre, int idRevista) {
		super();
		this.nombre = nombre;
		this.idRevista = idRevista;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIdRevista() {
		return idRevista;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	

}
