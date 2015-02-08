package telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField passwordField;
	private JButton btnAcessar;
	private JButton btnCancelar;

	/**
	 * Launch the application.s
	 */


	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Hotel Riviera Campina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(188, 51, 46, 14);
		contentPane.add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(168, 76, 86, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(188, 119, 46, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 144, 86, 20);
		contentPane.add(passwordField);
		
		btnAcessar = new JButton("Acessar");
		btnAcessar.setBounds(79, 193, 89, 23);
		contentPane.add(btnAcessar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(251, 193, 89, 23);
		contentPane.add(btnCancelar);
	}
}
