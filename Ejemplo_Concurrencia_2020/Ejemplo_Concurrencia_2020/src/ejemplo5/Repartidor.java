package ejemplo5;

import util.Util;

public class Repartidor extends Empleado
{

	public Repartidor(String nombre, Mostrador mostrador)
	{
		super(nombre, mostrador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 15; i++)
		{
			String pedido = this.mostrador.retiraPedido(this);
			System.out.println(this.getName() + " reparte " + pedido);
			Util.espera(3000);//Simula el tiempo que lleva entregar el pedido
		}
	}

}
