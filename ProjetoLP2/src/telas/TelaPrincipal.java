package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 0, 695, 86);
		contentPane.add(toolBar);
		
		JButton btnHospedes = new JButton("Hospedes");
		toolBar.add(btnHospedes);
		
		JButton btnQuartos = new JButton("Quartos");
		toolBar.add(btnQuartos);
		
		JButton btnServios = new JButton("Servi\u00E7os");
		btnServios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnServios);
		
		JButton btnRelatorio = new JButton("Relatorio");
		toolBar.add(btnRelatorio);
		
		JButton btnOpnies = new JButton("Opni\u00F5es");
		toolBar.add(btnOpnies);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 86, 695, 353);
		contentPane.add(desktopPane);
	}

}
