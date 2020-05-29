package util;

import java.util.Random;

public class Util {

	private static Random r = new Random();
	
	public static void espera(int t) {
		try {
			Thread.sleep(r.nextInt(t));
		} catch (InterruptedException e) {
			System.out.println("Error de espera");
			e.printStackTrace();
		}
	}
	
	public static int rNum(int num) {
		return r.nextInt(num);
	}
}
