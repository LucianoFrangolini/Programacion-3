package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.CalculadoraBasica;
import vista.IVista;

public class Controlador implements ActionListener{
	
	private static Controlador instance = null;
	private CalculadoraBasica calculadora = null;
	private IVista vista;
	
	public static Controlador getInstance() {
		if (Controlador.instance==null)
			Controlador.instance= new Controlador();
		return instance;
	}
	
	private Controlador() {
	}

	public IVista getVista() {
		return vista;
	}

	public void setVista(IVista vista) {
		this.vista = vista;
	}

	public CalculadoraBasica getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(CalculadoraBasica calculadora) {
		this.calculadora = calculadora;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("Sumar")) 
			this.sumar();
		else
			if (e.getActionCommand().equalsIgnoreCase("Restar"))
				this.restar();
			else
				if (e.getActionCommand().equalsIgnoreCase("Multiplicar"))
					this.multiplicar();
				else
					if (e.getActionCommand().equalsIgnoreCase("Dividir"))
						this.dividir();
		this.actualizar();
	}

	private void dividir() {
		double x = this.vista.getDivUno();
		double y = this.vista.getDivDos();
		double res = this.calculadora.dividir(x, y);
		this.vista.setResultadoDivision(res);
	}

	private void multiplicar() {
		double x = this.vista.getMultUno();
		double y = this.vista.getMultDos();
		double res = this.calculadora.multiplicar(x, y);
		this.vista.setResultadoMultiplicacion(res);
	}

	private void restar() {
		double x = this.vista.getRestaUno();
		double y = this.vista.getRestaDos();
		double res = this.calculadora.restar(x, y);
		this.vista.setResultadoResta(res);
	}

	private void sumar() {
		double x = this.vista.getSumaUno();
		double y = this.vista.getSumaDos();
		double res = this.calculadora.sumar(x, y);
		this.vista.setResultadoSuma(res);
	}
	
	private void actualizar() {
		vista.actualizarCampos();
	}
	

}
