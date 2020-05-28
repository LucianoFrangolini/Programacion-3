package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class Ventana extends JFrame implements IVista {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoSuma1;
	private JTextField campoSuma2;
	private JTextField campoResta1;
	private JTextField campoResta2;
	private JTextField campoMultiplicar1;
	private JTextField campoMultiplicar2;
	private JTextField campoDividir1;
	private JTextField campoDividir2;
	private JLabel lblResultadoSuma;
	private JLabel lblResultadoResta;
	private JLabel lblResultadoMultiplicacion;
	private JLabel lblResultadoDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(4, 6, 0, 0));
		
		JLabel lblSuma = new JLabel("Suma");
		lblSuma.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblSuma);
		
		campoSuma1 = new JTextField();
		campoSuma1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoSuma1);
		campoSuma1.setColumns(10);
		
		JLabel lblSignoSuma = new JLabel("+");
		lblSignoSuma.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSignoSuma.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblSignoSuma);
		
		campoSuma2 = new JTextField();
		campoSuma2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoSuma2);
		campoSuma2.setColumns(10);
		
		JButton btnSuma = new JButton("Sumar");
		btnSuma.addActionListener(Controlador.getInstance());
		panelCentral.add(btnSuma);
		
		lblResultadoSuma = new JLabel("");
		lblResultadoSuma.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblResultadoSuma);
		
		JLabel lblResta = new JLabel("Resta");
		lblResta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResta.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblResta);
		
		campoResta1 = new JTextField();
		campoResta1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoResta1);
		campoResta1.setColumns(10);
		
		JLabel lblSignoResta = new JLabel("-");
		lblSignoResta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSignoResta.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblSignoResta);
		
		campoResta2 = new JTextField();
		campoResta2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoResta2);
		campoResta2.setColumns(10);
		
		JButton btnResta = new JButton("Restar");
		btnResta.addActionListener(Controlador.getInstance());
		panelCentral.add(btnResta);
		
		lblResultadoResta = new JLabel("");
		lblResultadoResta.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblResultadoResta);
		
		JLabel lblMultiplicar = new JLabel("Multiplicaci\u00F3n");
		lblMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMultiplicar.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblMultiplicar);
		
		campoMultiplicar1 = new JTextField();
		campoMultiplicar1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoMultiplicar1);
		campoMultiplicar1.setColumns(10);
		
		JLabel lvlSignoMultiplicacion = new JLabel("*");
		lvlSignoMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lvlSignoMultiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lvlSignoMultiplicacion);
		
		campoMultiplicar2 = new JTextField();
		campoMultiplicar2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoMultiplicar2);
		campoMultiplicar2.setColumns(10);
		
		JButton btnMultiplica = new JButton("Multiplicar");
		btnMultiplica.addActionListener(Controlador.getInstance());
		panelCentral.add(btnMultiplica);
		
		lblResultadoMultiplicacion = new JLabel("");
		lblResultadoMultiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblResultadoMultiplicacion);
		
		JLabel lblDividir = new JLabel("Divisi\u00F3n");
		lblDividir.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDividir.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblDividir);
		
		campoDividir1 = new JTextField();
		campoDividir1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoDividir1);
		campoDividir1.setColumns(10);
		
		JLabel lblSignoDivision = new JLabel("/");
		lblSignoDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSignoDivision.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblSignoDivision);
		
		campoDividir2 = new JTextField();
		campoDividir2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(campoDividir2);
		campoDividir2.setColumns(10);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(Controlador.getInstance());
		panelCentral.add(btnDividir);
		
		lblResultadoDivision = new JLabel("");
		lblResultadoDivision.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblResultadoDivision);
		this.setVisible(true);
	}

	@Override
	public double getSumaUno() {
		return Double.parseDouble(this.campoSuma1.getText());
	}

	@Override
	public double getSumaDos() {
		return Double.parseDouble(this.campoSuma2.getText());
	}

	@Override
	public double getRestaUno() {
		return Double.parseDouble(this.campoResta1.getText());
	}

	@Override
	public double getRestaDos() {
		return Double.parseDouble(this.campoResta2.getText());
	}

	@Override
	public double getMultUno() {
		return Double.parseDouble(this.campoMultiplicar1.getText());
	}

	@Override
	public double getMultDos() {
		return Double.parseDouble(this.campoMultiplicar2.getText());
	}

	@Override
	public double getDivUno() {
		return Double.parseDouble(this.campoDividir1.getText());
	}

	@Override
	public double getDivDos() {
		return Double.parseDouble(this.campoDividir2.getText());
	}

	@Override
	public void actualizarCampos() {
		this.campoSuma1.repaint();
		this.campoSuma2.repaint();
		this.campoResta1.repaint();
		this.campoResta2.repaint();
		this.campoMultiplicar1.repaint();
		this.campoMultiplicar2.repaint();
		this.campoDividir1.repaint();
		this.campoDividir2.repaint();
	}

	@Override
	public void setResultadoSuma(double res) {
		lblResultadoSuma.setText(String.valueOf(res));
	}

	@Override
	public void setResultadoResta(double res) {
		lblResultadoResta.setText(String.valueOf(res));
	}

	@Override
	public void setResultadoMultiplicacion(double res) {
		lblResultadoMultiplicacion.setText(String.valueOf(res));
	}

	@Override
	public void setResultadoDivision(double res) {
		lblResultadoDivision.setText(String.valueOf(res));
	}

}
