package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaServicoCarro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHospede;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaServicoCarro() {
		setTitle("Carro");
		
		setBounds(420, 250, 572, 402);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarro = new JLabel("Carro");
		lblCarro.setBounds(23, 25, 46, 14);
		contentPane.add(lblCarro);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 50, 178, 29);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnLuxo = new JRadioButton("Luxo /");
		rdbtnLuxo.setBounds(0, 0, 60, 23);
		panel.add(rdbtnLuxo);
		
		JRadioButton rdbtnExecutivo = new JRadioButton("Executivo");
		rdbtnExecutivo.setBounds(62, 0, 109, 23);
		panel.add(rdbtnExecutivo);
		
		JRadioButton rdbtnTanqueCheio = new JRadioButton("Tanque Cheio");
		rdbtnTanqueCheio.setBounds(23, 86, 134, 23);
		contentPane.add(rdbtnTanqueCheio);
		
		JRadioButton rdbtnSeguro = new JRadioButton("Seguro");
		rdbtnSeguro.setBounds(23, 112, 109, 23);
		contentPane.add(rdbtnSeguro);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(269, 50, 277, 207);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDataInicial = new JLabel("Data Inicial");
		lblDataInicial.setBounds(10, 11, 97, 14);
		panel_1.add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final");
		lblDataFinal.setBounds(10, 102, 79, 14);
		panel_1.add(lblDataFinal);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(0, 37, 42, 15);
		panel_1.add(lblDia);
		
		textField = new JTextField();
		textField.setBounds(35, 35, 42, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(95, 37, 70, 15);
		panel_1.add(lblMes);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 35, 42, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(229, 35, 36, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(195, 37, 70, 15);
		panel_1.add(lblAno);
		
		JLabel lblHospede = new JLabel("Hospede");
		lblHospede.setBounds(23, 170, 86, 14);
		contentPane.add(lblHospede);
		
		txtHospede = new JTextField();
		txtHospede.setBounds(23, 195, 86, 20);
		contentPane.add(txtHospede);
		txtHospede.setColumns(10);
		
		JButton btnAdiconar = new JButton("Adiconar");
		btnAdiconar.setBounds(119, 194, 89, 23);
		contentPane.add(btnAdiconar);
	}
}
