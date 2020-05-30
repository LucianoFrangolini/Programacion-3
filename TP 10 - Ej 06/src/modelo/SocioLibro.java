package modelo;

import util.Util;

public class SocioLibro extends Socio {
	
	private Libro libro=null;

	public SocioLibro(String nombre, Biblioteca biblio) {
		super(nombre, biblio);
	}

	public Libro getLibro() {
		return libro;
	}

	@Override
	public void run() {
		for (int i=0; i<5 ; i++) {
			int aux = Util.rNum(5);
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
