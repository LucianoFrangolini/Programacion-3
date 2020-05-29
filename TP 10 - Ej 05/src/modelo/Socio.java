package modelo;

import util.Util;

public class Socio extends Thread{
	
	private Libro libro;
	private Biblioteca biblio = null;
	
	
	public Socio(String nombre,Biblioteca biblio) {
		super(nombre);
		this.biblio=biblio;
	}

	public Libro getLibro() {
		return libro;
	}

	@Override
	public void run() {
		for (int i=0; i<5 ; i++) {
			int aux = Util.rNum(14);
			System.out.println("El socio "+this.getName()+" intentara sacar el libro "+aux);
			this.libro = biblio.retirarLibro(aux,this.getName());
			System.out.println("El socio "+this.getName()+" comenzó a leer el libro "+this.libro+" contento");
			Util.espera(Util.rNum(5000));
			System.out.println("El socio "+this.getName()+" va a devolver el libro "+this.libro);
			biblio.devolverLibro(this.libro);
		}
		System.out.println("El socio "+this.getName()+" terminó de leer sus libros");
	}

	
}
