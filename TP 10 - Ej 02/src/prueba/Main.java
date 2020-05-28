package prueba;

import modelo.Mostrador;
import modelo.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		Mostrador m1 = new Mostrador();
		Persona p1 = new Persona("Robert",m1);
		Persona p2 = new Persona("Juan",m1);
		Persona p3 = new Persona("Moe",m1);
		Persona p4 = new Persona("Pika",m1);
		Persona p5 = new Persona("Chu",m1);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}

}
