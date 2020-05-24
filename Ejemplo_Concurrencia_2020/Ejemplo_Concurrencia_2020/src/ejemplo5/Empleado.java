package ejemplo5;

public abstract class Empleado extends Thread
{

protected Mostrador mostrador;

public Empleado(String nombre, Mostrador mostrador)
{
	super(nombre);
	
	this.mostrador = mostrador;
}



}
