package modelo;

import util.Util;

public class SocioRevista extends Socio{
	
	private Revista revista=null;

	public SocioRevista(String nombre, Biblioteca biblio) {
		super(nombre, biblio);
	}

	public Revista getRevista() {
		return revista;
	}

	@Override
	public void run() {
		for (int i=0; i<5 ; i++) {
			int aux = Util.rNum(5);
			System.out.println("El socio "+this.getName()+" intentara sacar la revista "+aux+110);
			this.revista = biblio.retirarRevista(110+aux,this.getName());
			System.out.println("El socio "+this.getName()+" comenzó a leer la revista "+this.revista+" contento");
			Util.espera(Util.rNum(5000));
			System.out.println("El socio "+this.getName()+" va a devolver la revista "+this.revista);
			biblio.devolverRevista(this.revista);
		}
		System.out.println("El socio "+this.getName()+" terminó de leer sus revistas");
	}
	
}



