package prueba;

import modelo.Automovil;
import modelo.Flota;
import modelo.Motor;

public class Prueba {

	public static void main(String[] args) {

		Flota flota = new Flota("La Flota");
		
		Automovil a1 = new Automovil("1111", 1990, "Marca1", "Modelo1", "Patente1", new Motor("1234", "Diesel"));
		Automovil a2 = new Automovil("2222", 1990, "Marca2", "Modelo2", "Patente2", new Motor("1234", "Gasoil"));

		flota.agregarAutomovil(a1);
		flota.agregarAutomovil(a2);

		flota.muestraAutomoviles();

		// Para hacer una persistencia binaria se requiere que todas las clases
		// involucradas en la persistencia
		// implementen serializable

		// Para hacer una persistencia xml se requiere que cada clase tenga un
		// constructor vacío y que
		// estén implementados públicamente todos los getters y setters de los
		// atributos.

		// Para hacer una persistencia xml sin getters/setters ni constructores vacíos
		// se usa el patrón DTO.
	}

}
