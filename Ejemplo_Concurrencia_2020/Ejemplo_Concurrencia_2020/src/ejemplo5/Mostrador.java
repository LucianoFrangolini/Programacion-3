package ejemplo5;

public class Mostrador
{
	private String producto = null;

	public synchronized void dejarComida(Cocinero cocinero)
	{
		while (this.producto != null)
		{
			try
			{
				System.out.println(
						"*******" + cocinero.getName() + " quiere dejar su producto y no puede, hay que esperar");
				wait();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.producto = cocinero.getEspecialidad();
		System.out.println(cocinero.getName() + " Preparo " + cocinero.getEspecialidad());
		notifyAll();
	}

	public synchronized String retiraPedido(Repartidor repartidor)
	{
		while (this.producto == null)
		{
			try
			{
				System.out.println("*******" + repartidor.getName() + " quiere repartir y no puede, hay que esperar");
				wait();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		String pedido = this.producto;
		this.producto = null;

		System.out.println(repartidor.getName() + " retiro " + pedido);
		notifyAll();
		return pedido;
	}

}
