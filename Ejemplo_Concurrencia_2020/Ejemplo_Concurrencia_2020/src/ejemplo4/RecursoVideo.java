package ejemplo4;

import java.util.Arrays;
import java.util.Random;

import util.Util;

public class RecursoVideo
{
	private String[] datos = new String[30];
	private Random r = new Random();

	public RecursoVideo()
	{
		for (int i = 0; i < 30; i++)
			this.datos[i] = "BSP";
	}

	public synchronized int elegirBloque(ProcesadorVideo pr)
	{
		int i;
		do
		{
			i = r.nextInt(30);
		} while (!this.datos[i].equals("BSP"));
	
		this.datos[i] = "."+pr.getName()+".";
		return i;
	}

	public synchronized void terminarProceso(int i)
	{
		this.datos[i] = "OK!";
	}

	@Override
	public String toString()
	{
		return "Video [datos=" + Arrays.toString(datos) + "]";
	}

}
