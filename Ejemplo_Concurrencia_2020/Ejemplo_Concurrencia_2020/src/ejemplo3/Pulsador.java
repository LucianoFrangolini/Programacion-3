package ejemplo3;

import util.Util;

public class Pulsador
{
	private int contador = 0;

	public synchronized void click(Proceso proceso)
	{
		System.out.println(proceso.getNombre()+" pulsara, actualmente contador vale "+this.contador);
		int aux = this.contador;
		Util.espera(3);
		aux++;
		this.contador = aux;
		System.out.println(proceso.getNombre()+" YA PULSO, ahora contador vale "+this.contador);
	}

	public int getContador()
	{
		return contador;
	}

}
