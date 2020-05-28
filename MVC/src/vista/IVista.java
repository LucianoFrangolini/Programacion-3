package vista;

public interface IVista {

	double getSumaUno();
	double getSumaDos();
	double getRestaUno();
	double getRestaDos();
	double getMultUno();
	double getMultDos();
	double getDivUno();
	double getDivDos();
	void setResultadoSuma(double res);
	void setResultadoResta(double res);
	void setResultadoMultiplicacion(double res);
	void setResultadoDivision(double res);
	void actualizarCampos();
}
