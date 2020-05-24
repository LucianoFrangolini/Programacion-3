package ejemplo4;

import util.Util;

public class ProcesadorVideo extends Thread
{

	private RecursoVideo recurso;

	public ProcesadorVideo(String arg0, RecursoVideo recurso)
	{
		super(arg0);
		this.recurso = recurso;
	}

	

	@Override
	public void run()
	{
		for (int j = 0; j < 3; j++)
		{
			int i = this.recurso.elegirBloque(this);
			System.out.println(this.recurso);
			// simular que estoy trabajando con el video
			Util.espera(3000);
			this.recurso.terminarProceso(i);
			System.out.println(this.recurso);
		}
	}

}
