package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaContrato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaContrato() {

		setBounds(400, 200, 729, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 77, 780, 446);
		contentPane.add(textPane);

		JLabel lblHospede = new JLabel("Hospede");
		lblHospede.setBounds(12, 22, 70, 15);
		contentPane.add(lblHospede);

		textField = new JTextField();
		textField.setBounds(100, 20, 384, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(496, 17, 117, 25);
		contentPane.add(btnPesquisar);
	}
}
