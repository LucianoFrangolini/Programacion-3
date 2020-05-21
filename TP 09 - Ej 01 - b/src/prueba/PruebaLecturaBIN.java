package prueba;

import java.io.IOException;

import modelo.Flota;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;

public class PruebaLecturaBIN {

	public static void main(String[] args) {

		IPersistencia persistencia = new PersistenciaBIN();
		
		Flota flota = null;
		
		try {
			persistencia.abrirInput("Flota.bin");
			System.out.println("Se abrio el archivo binario.");
			flota= (Flota) persistencia.leer();
			System.out.println("Flota cargada exitosamente.");
			persistencia.cerrarInput();
			System.out.println("Archivo cerrado satisfactoriamente.");
		}
		catch(IOException o) {
			System.out.println(o.getMessage());
		}
		catch(ClassNotFoundException o) {
			System.out.println(o.getMessage());
		}
		
		flota.muestraAutomoviles();
		
	}

}
