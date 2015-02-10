package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaServicoCarro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeHospede;
	private JTextField tfDataInicialDia;
	private JTextField tfDataInicialMes;
	private JTextField tfDataInicialAno;
	private JTextField tfDataFinalDia;
	private JTextField tfDataFinalMes;
	private JTextField tfDataFinalAno;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaServicoCarro() {
		setTitle("Carro");
		
		setBounds(420, 250, 572, 306);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarro = new JLabel("Carro");
		lblCarro.setBounds(23, 25, 46, 14);
		contentPane.add(lblCarro);
		
		
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
		lblDia.setBounds(14, 36, 42, 15);
		panel_1.add(lblDia);
		
		tfDataInicialDia = new JTextField();
		tfDataInicialDia.setBounds(35, 35, 42, 19);
		panel_1.add(tfDataInicialDia);
		tfDataInicialDia.setColumns(10);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(106, 36, 42, 15);
		panel_1.add(lblMes);
		
		tfDataInicialMes = new JTextField();
		tfDataInicialMes.setBounds(134, 35, 42, 19);
		panel_1.add(tfDataInicialMes);
		tfDataInicialMes.setColumns(10);
		
		tfDataInicialAno = new JTextField();
		tfDataInicialAno.setBounds(229, 35, 36, 19);
		panel_1.add(tfDataInicialAno);
		tfDataInicialAno.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(195, 36, 42, 15);
		panel_1.add(lblAno);
		
		JLabel label = new JLabel("Dia");
		label.setBounds(15, 128, 42, 15);
		panel_1.add(label);
		
		tfDataFinalDia = new JTextField();
		tfDataFinalDia.setColumns(10);
		tfDataFinalDia.setBounds(35, 127, 42, 19);
		panel_1.add(tfDataFinalDia);
		
		JLabel label_1 = new JLabel("Mes");
		label_1.setBounds(106, 128, 42, 15);
		panel_1.add(label_1);
		
		tfDataFinalMes = new JTextField();
		tfDataFinalMes.setColumns(10);
		tfDataFinalMes.setBounds(134, 127, 42, 19);
		panel_1.add(tfDataFinalMes);
		
		JLabel label_2 = new JLabel("Ano");
		label_2.setBounds(195, 128, 42, 15);
		panel_1.add(label_2);
		
		tfDataFinalAno = new JTextField();
		tfDataFinalAno.setColumns(10);
		tfDataFinalAno.setBounds(229, 127, 36, 19);
		panel_1.add(tfDataFinalAno);
		
		JLabel lblHospede = new JLabel("Hospede");
		lblHospede.setBounds(23, 199, 86, 14);
		contentPane.add(lblHospede);
		
		tfNomeHospede = new JTextField();
		tfNomeHospede.setBounds(23, 224, 86, 20);
		contentPane.add(tfNomeHospede);
		tfNomeHospede.setColumns(10);
		
		JButton btnAdiconar = new JButton("Adiconar");
		btnAdiconar.setBounds(123, 221, 89, 23);
		contentPane.add(btnAdiconar);
		
		JComboBox<String> comboBoxCarro = new JComboBox<String>();
		comboBoxCarro.setBounds(23, 59, 120, 20);
		contentPane.add(comboBoxCarro);
		comboBoxCarro.addItem("Luxo");
		comboBoxCarro.addItem("Executivo");
	}
}
