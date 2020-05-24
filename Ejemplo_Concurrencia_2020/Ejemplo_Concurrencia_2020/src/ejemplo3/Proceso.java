package ejemplo3;
public class Proceso extends Thread
{
private String nombre;
private Pulsador pulsador;

public Proceso(String nombre, Pulsador pulsador)
{
	super();
	this.nombre = nombre;
	this.pulsador = pulsador;
}

public String getNombre()
{
	return nombre;
}

@Override
public void run()
{
	for(int i=0;i<1000;i++)
		this.pulsador.click(this);
}


}
