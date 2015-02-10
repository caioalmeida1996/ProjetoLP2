package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;

public class TelaFichaHospedes extends JFrame {

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
	public TelaFichaHospedes() {
		setTitle("Ficha de Hospedes");
		
		setBounds(400, 200, 729, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospede = new JLabel("Hospede");
		lblHospede.setBounds(10, 35, 86, 14);
		contentPane.add(lblHospede);
		
		tfProcurarHospede = new JTextField();
		tfProcurarHospede.setText("Digite o nome do Hospede");
		tfProcurarHospede.setBounds(114, 33, 361, 20);
		contentPane.add(tfProcurarHospede);
		tfProcurarHospede.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(487, 31, 117, 23);
		contentPane.add(btnProcurar);
		
		JTextPane tpMostrarHospedes = new JTextPane();
		tpMostrarHospedes.setBounds(20, 61, 697, 388);
		contentPane.add(tpMostrarHospedes);
	}
}
