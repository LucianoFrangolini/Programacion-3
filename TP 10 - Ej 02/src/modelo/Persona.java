package modelo;

import util.Util;

public class Persona extends Thread{
	
	private static int numeroEnEspera=0; //Deberia haber una clase que represente la cosa de los numeros
	private Mostrador mostrador;
	private int numeroActual;
	

	public Persona(String nombre,Mostrador mostrador) {
		super(nombre);
		this.mostrador = mostrador;
		this.numeroActual = Persona.numeroEnEspera++;
	}

	public Mostrador getMostrador() {
		return mostrador;
	}

	public int getNumero() {
		return numeroActual;
	}

	@Override
	public void run() {
		for (int i = 0; i<10 ; i++) {
			System.out.println(this.getName()+" ahora tiene el numero "+this.numeroActual);
			Util.espera(2000); //Tiempo en sacar nuevo numero
			mostrador.atender(this);
			this.numeroActual=Persona.numeroEnEspera++;
		}
	}

	
}
