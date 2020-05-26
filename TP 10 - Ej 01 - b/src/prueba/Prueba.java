package prueba;

import modelo.TramoDeVia;
import modelo.Tren;

public class Prueba {

	public static void main(String[] args) {
		
		TramoDeVia via = new TramoDeVia();
		Tren t1 = new Tren("Arturo",via,"izquierda");
		Tren t2 = new Tren("Matias",via,"izquierda");
		Tren t3 = new Tren("Luciano",via,"derecha");
		Tren t4 = new Tren("Juan",via,"derecha");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
