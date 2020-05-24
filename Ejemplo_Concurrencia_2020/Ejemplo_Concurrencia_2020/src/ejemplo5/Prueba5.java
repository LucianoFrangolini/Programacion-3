package ejemplo5;

public class Prueba5
{



	public static void main(String[] args)
	{
		Mostrador m=new Mostrador();
		Empleado e1=new Cocinero("Cholo",m,"Pollo C/Fritas");
		Empleado e2=new Cocinero("Alicia",m,"Empanadas");
		Empleado e3=new Cocinero("Alfredo",m,"Pizza");
		Empleado e4= new Repartidor("Fede",m);
		Empleado e5= new Repartidor("Brian",m);
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
		
		

	}
	

}
