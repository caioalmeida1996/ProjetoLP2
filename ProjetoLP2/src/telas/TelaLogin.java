package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField pfSenha;
	private boolean acessoPermitido = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Hotel Riviera Campina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(112, 55, 70, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(112, 95, 70, 15);
		contentPane.add(lblNewLabel_1);

		tfLogin = new JTextField();
		tfLogin.setBounds(193, 53, 114, 19);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);

		pfSenha = new JPasswordField();
		pfSenha.setBounds(193, 93, 114, 19);
		contentPane.add(pfSenha);

		JButton btAcessar = new JButton("Acessar");
		btAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfLogin.getText().equals("admin")
						&& pfSenha.getText().equals("admin")) {
					// JOptionPane.showMessageDialog(null, "Acesso Permitido");
					acessoPermitido = true;
					TelaPrincipal TP = new TelaPrincipal();
					TP.show();

				} else
					JOptionPane.showMessageDialog(null, "Acesso Negado");
				{
					tfLogin.setText("");
					pfSenha.setText("");
				}
			}
		});
		btAcessar.setBounds(154, 180, 117, 25);
		contentPane.add(btAcessar);
	}

}
