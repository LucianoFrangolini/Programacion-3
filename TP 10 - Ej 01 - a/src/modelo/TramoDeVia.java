package modelo;

public class TramoDeVia {

	public TramoDeVia() {
	}
	
	public synchronized void pasaTren(Tren tren) {
		System.out.println(tren.getName()+" comienza a cruzar la v�a");
		System.out.println(tren.getName()+" sale de la v�a");
		System.out.println();
	}

}
