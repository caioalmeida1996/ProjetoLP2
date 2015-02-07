package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastraServico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaCadastraServico() {

		setBounds(300, 120, 719, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 708, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCarro = new JButton("Carro");
		btnCarro.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				TelaServicoCarro TSC = new TelaServicoCarro();
				TSC.show();
			}
		});
		btnCarro.setBounds(52, 34, 111, 46);
		panel.add(btnCarro);
		
		JButton btnBabysitte = new JButton("BabySitter");
		btnBabysitte.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				TelaServicoBabysitter TSB = new TelaServicoBabysitter();
				TSB.show();
			}
		});
		btnBabysitte.setBounds(215, 34, 111, 46);
		panel.add(btnBabysitte);
		
		JButton btnRestaurante = new JButton("Restaurante");
		btnRestaurante.setBounds(378, 34, 111, 46);
		panel.add(btnRestaurante);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(541, 34, 111, 46);
		panel.add(btnSair);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 99, 708, 354);
		contentPane.add(desktopPane);
	}
}
