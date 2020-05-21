package persistencia;

import java.util.ArrayList;

import modelo.Automovil;
import modelo.Flota;

public class UtilFlota {

	public static Automovil automovilFromAutomovilDTO(AutomovilDTO aDTO) {

		Automovil respuesta = new Automovil(aDTO.getN_chasis(), aDTO.getAnio_fabricacion(), aDTO.getMarca(),
				aDTO.getModelo(), aDTO.getPatente(), aDTO.getMotor());

		return respuesta;
	}

	public static AutomovilDTO automovilDTOFromAutomovil(Automovil a) {

		AutomovilDTO respuesta = new AutomovilDTO();

		respuesta.setAnio_fabricacion(a.getAnio_fabricacion());
		respuesta.setMarca(a.getMarca());
		respuesta.setModelo(a.getModelo());
		respuesta.setMotor(a.getMotor());
		respuesta.setN_chasis(a.getN_chasis());
		respuesta.setPatente(a.getPatente());

		return respuesta;
	}

	public static Flota flotaFromFlotaDTO(FlotaDTO fDTO) {

		Flota flota = new Flota(fDTO.getNombre());

		 for (int i=0 ; i<fDTO.getAutomoviles().size();i++)
			 flota.agregarAutomovil(UtilFlota.automovilFromAutomovilDTO(fDTO.getAutomoviles().get(i)));

		return flota;
	}

	public static FlotaDTO flotaDTOFromFlota(Flota f) {

		FlotaDTO flotaDTO = new FlotaDTO();
		ArrayList<AutomovilDTO> autosDTO = new ArrayList<AutomovilDTO>();
		
		flotaDTO.setNombre(f.getNombre());
		
		for (int i=0; i<f.getAutomoviles().size();i++)
			autosDTO.add(UtilFlota.automovilDTOFromAutomovil(f.getAutomoviles().get(i)));
		
		flotaDTO.setAutomoviles(autosDTO);
		
		return flotaDTO;
	}
}
