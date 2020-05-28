package main;

import controlador.Controlador;
import modelo.CalculadoraBasica;
import vista.Ventana;

public class Main {

	public static void main(String[] args) {

		Controlador.getInstance().setVista(new Ventana());
		Controlador.getInstance().setCalculadora(new CalculadoraBasica());
	}

}
