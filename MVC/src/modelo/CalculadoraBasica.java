package modelo;

public class CalculadoraBasica {

	public CalculadoraBasica() {
	}
	
	public double sumar(double numeroUno,double numeroDos) {
		return (numeroUno+numeroDos);
	}

	public double restar(double numeroUno,double numeroDos) {
		return (numeroUno-numeroDos);
	}
	
	public double multiplicar(double numeroUno,double numeroDos) {
		return (numeroUno*numeroDos);
	}
	
	public double dividir(double numeroUno,double numeroDos) {
		if (numeroDos!=0)
			return (numeroUno/numeroDos);
		else
			return 0;
	}
}
