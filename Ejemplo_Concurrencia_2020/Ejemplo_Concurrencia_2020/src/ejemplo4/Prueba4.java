package ejemplo4;

public class Prueba4
{

	public static void main(String[] args)
	{
		ProcesadorVideo[] procesadores = new ProcesadorVideo[10];
		RecursoVideo recurso = new RecursoVideo();
		for (int i = 0; i < 10; i++)
			procesadores[i] = new ProcesadorVideo(String.valueOf(i), recurso);
		for (int i = 0; i < 10; i++)
			procesadores[i].start();
	}

}
