package ejemplo1;

import util.Util;

public class Robot extends Thread
{

	private String nombre;
	private int repeticiones;

	public Robot(String nombre, int repeticiones)
	{
		super();
		this.nombre = nombre;
		this.repeticiones = repeticiones;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getRepeticiones()
	{
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones)
	{
		this.repeticiones = repeticiones;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < this.repeticiones; i++)
		{
			System.out.println("Nombre: " + this.nombre);
			Util.espera(3000);
		}
		System.out.println("El Robot "+this.nombre+" Finalizo su tarea");
	}

}
