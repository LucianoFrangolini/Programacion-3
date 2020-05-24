package ejemplo2;

public class Prueba2
{

	public static void main(String[] args)
	{
		Politico pl1=new Politico("Carlos","Rojo");
		Politico pl2=new Politico("Ruben","Verde");
		Politico pl3=new Politico("Maria","Violeta");
		Politico pl4=new Politico("Carla","Azul");
		
		Thread h1=new Thread(pl1); 
		Thread h2=new Thread(pl2);
		Thread h3=new Thread(pl3);
		Thread h4=new Thread(pl4);
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		

	}

}
