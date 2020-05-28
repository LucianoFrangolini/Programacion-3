package modelo;

public class Mostrador {

	private int numeroALlamar = 0;

	public Mostrador() {
	}

	public synchronized void atender(Persona persona) {
		while (persona.getNumero() != this.numeroALlamar) {
			try {
				System.out.println(persona.getName() + " quiere que atiendan su numero " + persona.getNumero()
						+ " pero se debe atender al numero " + this.numeroALlamar);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Se atendió a "+persona.getName()+" con el numero "+this.numeroALlamar+" con exito");
		this.numeroALlamar++;
		System.out.println("Siguiente numero a llamar : "+ this.numeroALlamar);
		notifyAll();
	}
}
