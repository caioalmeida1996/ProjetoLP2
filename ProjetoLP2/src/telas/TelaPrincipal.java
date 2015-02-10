
package telas;



import hotel.Hotel;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import contrato.Contrato;


public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static Hotel hotel;
	private static ArrayList<Contrato> contratos = new ArrayList<Contrato>(); 



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		hotel = new Hotel(null); /// criando o hotel;
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
	
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public TelaPrincipal() {
		setTitle("Hotel Riviera Campina");
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(-492, 111, 1365, 613);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(574, 51, 610, 468);
		desktopPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/home/alexandreg/Downloads/fachada-heritage-design-hotel.JPG"));
		
		JButton btnCheckIn = new JButton("Check In");
		btnCheckIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				TelaCheckIn TH = new TelaCheckIn();
				TH.show();
				
				
			}
		});
		btnCheckIn.setBounds(10, 51, 132, 35);
		contentPane.add(btnCheckIn);
		
		JButton btnHospedes = new JButton("Hospedes");
		btnHospedes.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				TelaFichaHospedes TFH = new TelaFichaHospedes();
				TFH.show();
			}
		});
		btnHospedes.setBounds(436, 51, 132, 35);
		contentPane.add(btnHospedes);
		
		JButton btnServio = new JButton("Servi\u00E7os");
		btnServio.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastraServico TCS = new TelaCadastraServico();
				TCS.show();
			}
		});
		btnServio.setBounds(152, 51, 132, 35);
		contentPane.add(btnServio);
		
		JButton btnContrato = new JButton("Contratos");
		btnContrato.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				TelaContrato TC = new TelaContrato();
				TC.show();
			}
		});
		btnContrato.setBounds(294, 51, 132, 35);
		contentPane.add(btnContrato);
		
		JButton btnRelatorio = new JButton("Relat\u00F3rio");
		btnRelatorio.setBounds(578, 51, 132, 35);
		contentPane.add(btnRelatorio);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				hide();
				System.exit(0);
			}
		});
		btnSair.setBounds(723, 51, 132, 35);
		contentPane.add(btnSair);
	}


}
