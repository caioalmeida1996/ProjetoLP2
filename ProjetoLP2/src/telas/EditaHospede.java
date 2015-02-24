package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EditaHospede extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JLabel lblNascimento;
	private JTextField textField;
	private JLabel lblEndereco;
	private JTextField textField_1;
	private JTextField tfCartaoDeCredito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditaHospede frame = new EditaHospede();
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
	public EditaHospede() {
		setTitle("Edita Hospede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 25, 70, 15);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(166, 23, 169, 19);
		contentPane.add(tfNome);
		
		
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(12, 52, 70, 15);
		contentPane.add(lblCpf);
		
		MaskFormatter format_1 = null;
		
		try {
			format_1 = new MaskFormatter("###.###.###-##");
			format_1.setPlaceholderCharacter('_');
		} catch (ParseException e2) {
			e2.printStackTrace();
		}
		
		tfCPF = new JFormattedTextField(format_1);
		tfCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCPF.setText("( ) - ");
		tfCPF.setBounds(166, 50, 169, 19);
		getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		lblNascimento = new JLabel("Nascimento:");
		lblNascimento.setBounds(12, 79, 104, 15);
		contentPane.add(lblNascimento);
		
		textField = new JTextField();
		textField.setBounds(166, 77, 169, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(12, 106, 87, 15);
		contentPane.add(lblEndereco);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 106, 169, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCartaoDeCredito = new JLabel("Cartao de Credito:");
		lblCartaoDeCredito.setBounds(12, 133, 163, 15);
		contentPane.add(lblCartaoDeCredito);
		
		MaskFormatter format_2 = null;
		try {
			format_2 = new MaskFormatter("###.###.####");
			format_2.setPlaceholderCharacter('_');
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		tfCartaoDeCredito = new JFormattedTextField(format_2);
		tfCartaoDeCredito.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCartaoDeCredito.setText("( ) - ");
		tfCartaoDeCredito.setBounds(166, 127, 169, 19);
		getContentPane().add(tfCartaoDeCredito);
		tfCartaoDeCredito.setColumns(10);
	}
}
