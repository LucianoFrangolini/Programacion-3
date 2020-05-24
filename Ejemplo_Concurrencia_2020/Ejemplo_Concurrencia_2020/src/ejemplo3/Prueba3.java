package ejemplo3;

public class Prueba3
{

	public static void main(String[] args)
	{
		Pulsador pulsador = new Pulsador();
		Proceso pr1=new Proceso("Proceso 1",pulsador);
		Proceso pr2=new Proceso("Proceso 2",pulsador);
		Proceso pr3=new Proceso("Proceso 3",pulsador);
		Proceso pr4=new Proceso("Proceso 4",pulsador);
		pr1.start();
		pr2.start();
		pr3.start();
		pr4.start();
		
	}

}
