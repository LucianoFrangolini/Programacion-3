package prueba;

import java.io.IOException;

import modelo.Automovil;
import modelo.Flota;
import modelo.Motor;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;

public class PruebaEscrituraBIN {

	public static void main(String[] args) {
		IPersistencia persistencia = new PersistenciaBIN();
		
		Flota flota = new Flota("La Flota");
		
		Automovil a1 = new Automovil("1111", 1990, "Marca1", "Modelo1", "Patente1", new Motor("1234", "Diesel"));
		Automovil a2 = new Automovil("2222", 1990, "Marca2", "Modelo2", "Patente2", new Motor("1234", "Gasoil"));

		flota.agregarAutomovil(a1);
		flota.agregarAutomovil(a2);
		
		try {
			persistencia.abrirOutput("Flota.bin");
			System.out.println("Se creo el archivo binario.");
			persistencia.escribir(flota);
			System.out.println("Flota guardada exitosamente.");
			persistencia.cerrarOutput();
			System.out.println("Archivo cerrado satisfactoriamente.");
		}
		catch(IOException o) {
			System.out.println(o.getLocalizedMessage());
		}
	}

}
