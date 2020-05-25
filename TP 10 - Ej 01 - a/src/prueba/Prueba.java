package prueba;

import modelo.TramoDeVia;
import modelo.Tren;

public class Prueba {

	public static void main(String[] args) {
		
		TramoDeVia via = new TramoDeVia();
		Tren t1 = new Tren("Arturo",via);
		Tren t2 = new Tren("Matias",via);
		Tren t3 = new Tren("Luciano",via);
		Tren t4 = new Tren("Juan",via);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
