package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastraServico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastraServico frame = new TelaCadastraServico();
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
	public TelaCadastraServico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCarro = new JPanel();
		panelCarro.setBounds(0, 0, 319, 233);
		contentPane.add(panelCarro);
		panelCarro.setLayout(null);
		
		JLabel lblCarro = new JLabel("Carro");
		lblCarro.setBounds(10, 11, 46, 14);
		panelCarro.add(lblCarro);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Luxo");
		rdbtnNewRadioButton.setBounds(10, 33, 58, 23);
		panelCarro.add(rdbtnNewRadioButton);
		
		JLabel label = new JLabel("/");
		label.setBounds(73, 37, 46, 14);
		panelCarro.add(label);
		
		JRadioButton rdbtnExecutivo = new JRadioButton("Executivo");
		rdbtnExecutivo.setBounds(83, 33, 109, 23);
		panelCarro.add(rdbtnExecutivo);
		
		JRadioButton rdbtnTanqueCheio = new JRadioButton("Tanque cheio");
		rdbtnTanqueCheio.setBounds(10, 59, 109, 23);
		panelCarro.add(rdbtnTanqueCheio);
		
		JRadioButton rdbtnSeguro = new JRadioButton("Seguro");
		rdbtnSeguro.setBounds(10, 85, 109, 23);
		panelCarro.add(rdbtnSeguro);
		
		JLabel lblDataDeEntrega = new JLabel("Data De Entrega");
		lblDataDeEntrega.setBounds(10, 146, 80, 14);
		panelCarro.add(lblDataDeEntrega);
		
		textField = new JTextField();
		textField.setBounds(4, 171, 86, 20);
		panelCarro.add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeDevoluo = new JLabel("Data De Devolu\u00E7\u00E3o");
		lblDataDeDevoluo.setBounds(138, 146, 109, 14);
		panelCarro.add(lblDataDeDevoluo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 171, 86, 20);
		panelCarro.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panelBabySitter = new JPanel();
		panelBabySitter.setBounds(319, 0, 389, 233);
		contentPane.add(panelBabySitter);
		panelBabySitter.setLayout(null);
		
		JLabel lblBabysitter = new JLabel("BabySitter");
		lblBabysitter.setBounds(20, 11, 68, 14);
		panelBabySitter.add(lblBabysitter);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setBounds(91, 51, 46, 14);
		panelBabySitter.add(lblInicio);
		
		JLabel lblNewLabel = new JLabel("Final");
		lblNewLabel.setBounds(279, 51, 46, 14);
		panelBabySitter.add(lblNewLabel);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(20, 76, 46, 14);
		panelBabySitter.add(lblData);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(20, 144, 46, 14);
		panelBabySitter.add(lblHora);
		
		JLabel lblData_1 = new JLabel("Data");
		lblData_1.setBounds(211, 76, 46, 14);
		panelBabySitter.add(lblData_1);
		
		JLabel lblHora_1 = new JLabel("Hora");
		lblHora_1.setBounds(211, 144, 46, 14);
		panelBabySitter.add(lblHora_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(51, 73, 86, 20);
		panelBabySitter.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(51, 141, 86, 20);
		panelBabySitter.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(247, 73, 86, 20);
		panelBabySitter.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(247, 141, 86, 20);
		panelBabySitter.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panelRestaurante = new JPanel();
		panelRestaurante.setBounds(0, 233, 319, 220);
		contentPane.add(panelRestaurante);
		panelRestaurante.setLayout(null);
		
		JLabel lblRestaurante = new JLabel("Restaurante");
		lblRestaurante.setBounds(10, 11, 72, 14);
		panelRestaurante.add(lblRestaurante);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Primeiro Andar");
		rdbtnNewRadioButton_1.setBounds(6, 46, 109, 23);
		panelRestaurante.add(rdbtnNewRadioButton_1);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(118, 50, 46, 14);
		panelRestaurante.add(label_1);
		
		JRadioButton rdbtnCobertura = new JRadioButton("Cobertura");
		rdbtnCobertura.setBounds(131, 46, 109, 23);
		panelRestaurante.add(rdbtnCobertura);
		
		JLabel lblValorGasto = new JLabel("Valor Gasto");
		lblValorGasto.setBounds(10, 98, 72, 14);
		panelRestaurante.add(lblValorGasto);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 119, 86, 20);
		panelRestaurante.add(textField_6);
		textField_6.setColumns(10);
	}
}
