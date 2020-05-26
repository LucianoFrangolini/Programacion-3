package modelo;

public class TramoDeVia {

	private String lado = "izquierdo";

	public TramoDeVia() {
	}

	public synchronized void pasaTrenIzquierdo(Tren tren) {
		while (lado.equalsIgnoreCase("derecha")) {
			try {
				System.out.println("El tren " + tren.getName()
						+ " del lado izquierdo intento cruzar pero la vía se encuentra ocupada.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tren.getName() + " comienza a cruzar la vía desde la izquierda y sale por la derecha");
		this.lado="derecha";
		notifyAll();
	}
	
	public synchronized void pasaTrenDerecho(Tren tren) {
		while (lado.equalsIgnoreCase("izquierda")) {
			try {
				System.out.println("El tren " + tren.getName()
						+ " del lado derecho intento cruzar pero la vía se encuentra ocupada.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tren.getName() + " comienza a cruzar la vía desde la derecha y sale por la izquierda");
		this.lado="izquierda";
		notifyAll();
	}

}
