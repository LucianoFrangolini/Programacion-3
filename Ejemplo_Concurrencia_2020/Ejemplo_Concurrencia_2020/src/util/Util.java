package util;

import java.util.Random;

public class Util
{
	private static Random r=new Random();
	
	public static void espera(int maximo)
	{
		try
		{
			Thread.sleep(r.nextInt(maximo));
		} catch (InterruptedException e)
		{
			System.out.println("Error de espera");
		}
	}
}
