package ejemplo5;

import util.Util;

public class Cocinero extends Empleado
{
	private String especialidad;

	public Cocinero(String nombre, Mostrador mostrador, String especialidad)
	{
		super(nombre, mostrador);
		this.especialidad = especialidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{

		for (int i = 0; i < 10; i++)
		{   Util.espera(3000); //Simula el tiempo que le lleva cocinar
			this.mostrador.dejarComida(this);
			
		}
	}

	public String getEspecialidad()
	{
		return especialidad;
	}
	

}
