package prueba;

import java.io.IOException;

import modelo.Automovil;
import modelo.Flota;
import modelo.Motor;
import persistencia.FlotaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaXML;
import persistencia.UtilFlota;

public class PruebaEscrituraXML {

	public static void main(String[] args) {

		IPersistencia persistencia = new PersistenciaXML();
		
		Flota flota = new Flota("La Flota");
		
		Automovil a1 = new Automovil("1111", 1990, "Marca1", "Modelo1", "Patente1", new Motor("1234", "Diesel"));
		Automovil a2 = new Automovil("2222", 1990, "Marca2", "Modelo2", "Patente2", new Motor("1234", "Gasoil"));

		flota.agregarAutomovil(a1);
		flota.agregarAutomovil(a2);
		
		try {
			persistencia.abrirOutput("Flota.xml");
			System.out.println("Se creo el archivo xml.");
			
			FlotaDTO fDTO = UtilFlota.flotaDTOFromFlota(flota);
			persistencia.escribir(fDTO);
			System.out.println("Flota guardada exitosamente.");
			
			
			persistencia.cerrarOutput();
			System.out.println("Archivo cerrado satisfactoriamente.");
		}
		catch(IOException o) {
			System.out.println(o.getLocalizedMessage());
		}
	}

}
