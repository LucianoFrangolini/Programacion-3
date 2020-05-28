package modelo;

public class TramoDeVia {

	private String siguiente = "izquierdo";

	public TramoDeVia() {
	}

	public synchronized void pasaTrenIzquierdo(Tren tren) {
		while (siguiente.equalsIgnoreCase("derecha")) {
			try {
				System.out.println("El tren " + tren.getName()
						+ " del lado izquierdo intento cruzar pero la vía debe utilizarse por un tren derecho.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tren.getName() + " comienza a cruzar la vía desde la izquierda y sale por la derecha");
		this.siguiente="derecha";
		notifyAll();
	}
	
	public synchronized void pasaTrenDerecho(Tren tren) {
		while (siguiente.equalsIgnoreCase("izquierda")) {
			try {
				System.out.println("El tren " + tren.getName()
						+ " del lado derecho intento cruzar pero la vía debe utilizarse por un tren izquierdo.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tren.getName() + " comienza a cruzar la vía desde la derecha y sale por la izquierda");
		this.siguiente="izquierda";
		notifyAll();
	}

}
