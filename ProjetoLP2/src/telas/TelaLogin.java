package telas;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField pfSenha;
	@SuppressWarnings("unused")
	private boolean acessoPermitido = false;
	protected KeyEvent evt;
	JButton btAcessar = new JButton("Acessar");

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
		tfLogin.setText("admin");
		tfLogin.setBounds(193, 53, 114, 19);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);

		pfSenha = new JPasswordField();
		pfSenha.addKeyListener(new KeyAdapter() {
			
		    public void keyPressed(java.awt.event.KeyEvent evt) {  
		        int tecla=evt.getKeyCode();          
		        if (tecla==KeyEvent.VK_ENTER) {  
		        	if (tfLogin.getText().equals("admin")
							&& pfSenha.getText().equals("admin")) {
						// JOptionPane.showMessageDialog(null, "Acesso Permitido");
						acessoPermitido = true;
						TelaPrincipal TP = new TelaPrincipal();
						TP.show();
						hide();

					} else
						JOptionPane.showMessageDialog(null, "Acesso Negado");
					{
						tfLogin.setText("");
						pfSenha.setText("");
					}
		        }                  
		    }  });
		
		pfSenha.setBounds(193, 93, 114, 19);
		contentPane.add(pfSenha);

		
		btAcessar.setBounds(154, 180, 117, 25);
		contentPane.add(btAcessar);
		btAcessar.addKeyListener(new KeyAdapter() {
		}
		);
		
		btAcessar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (tfLogin.getText().equals("admin")
						&& pfSenha.getText().equals("admin")) {
					// JOptionPane.showMessageDialog(null, "Acesso Permitido");
					acessoPermitido = true;
					TelaPrincipal TP = new TelaPrincipal();
					TP.show();
					hide();

				} else
					JOptionPane.showMessageDialog(null, "Acesso Negado");
				{
					tfLogin.setText("");
					pfSenha.setText("");
				}
			}
		});
	}
	
	public void keyPressed(KeyEvent e) {
		if(evt.getKeyCode() == KeyEvent.VK_ENTER){
			JOptionPane.showMessageDialog(null, "ENTER");
		}
	}
}
