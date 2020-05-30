package modelo;


public abstract class Socio extends Thread{
	
	protected Biblioteca biblio = null;
	
	public Socio(String nombre,Biblioteca biblio) {
		super(nombre);
		this.biblio=biblio;
	}
	
	
	
}
