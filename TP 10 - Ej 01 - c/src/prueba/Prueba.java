package prueba;

import modelo.TramoDeVia;
import modelo.Tren;

public class Prueba {

	public static void main(String[] args) {
		
		TramoDeVia via = new TramoDeVia();
		Tren t1 = new Tren("tren 1",via,"izquierdo");
		Tren t2 = new Tren("tren 2",via,"izquierdo");
		Tren t3 = new Tren("tren 3",via,"izquierdo");
		Tren t4 = new Tren("tren 4",via,"izquierdo");
		Tren t5 = new Tren("tren 5",via,"izquierdo");
		Tren t6 = new Tren("tren 6",via,"izquierdo");
		Tren t7 = new Tren("tren 7",via,"derecho");
		Tren t8 = new Tren("tren 8",via,"derecho");
		Tren t9 = new Tren("tren 9",via,"derecho");
		Tren t10 = new Tren("tren 10",via,"derecho");
		Tren t11 = new Tren("tren 11",via,"derecho");
		Tren t12 = new Tren("tren 12",via,"derecho");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
	}

}
