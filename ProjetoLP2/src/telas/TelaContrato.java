package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContrato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfProcurarHospede;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaContrato() {
		setTitle("Contrato");

		setBounds(400, 200, 729, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane tpMostrarContrato = new JTextPane();
		tpMostrarContrato.setBounds(12, 77, 705, 372);
		contentPane.add(tpMostrarContrato);

		JLabel lblHospede = new JLabel("Hospede");
		lblHospede.setBounds(12, 22, 70, 15);
		contentPane.add(lblHospede);

		tfProcurarHospede = new JTextField();
		tfProcurarHospede.setBounds(100, 20, 384, 19);
		contentPane.add(tfProcurarHospede);
		tfProcurarHospede.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnPesquisar.setBounds(496, 17, 117, 25);
		contentPane.add(btnPesquisar);
	}
}
