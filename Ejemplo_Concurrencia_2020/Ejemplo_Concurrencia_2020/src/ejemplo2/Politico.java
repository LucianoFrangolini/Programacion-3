package ejemplo2;

import util.Util;

public class Politico extends Persona implements Runnable
{

	private String partido;

	public Politico(String nombre, String partido)
	{
		super(nombre);
		this.partido = partido;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Vote por " + this.nombre+ " Partido "+ this.partido );
			Util.espera(3000);
		}

	}

	@Override
	public String toString()
	{
		return super.toString()+" partido=" + partido;
	}



}
