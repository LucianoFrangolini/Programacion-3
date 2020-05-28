package util;

import java.util.Random;

public class Util {
	
	private static Random r = new Random();
	
	public static void espera (int t) {
		try {
			Thread.sleep(r.nextInt(t));
		}
		catch (InterruptedException o){
			System.out.println("Error de espera");
		}
	}

}
