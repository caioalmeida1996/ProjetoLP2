package telas;

import hospede.Hospede;
import hotel.Hotel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import contrato.Contrato;

public class TelaFichaHospedes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField tfProcurarHospede;
	public JList<Hospede> list = null;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaFichaHospedes() {
		setTitle("Ficha de Hospedes");
		
		setBounds(400, 200, 729, 551);
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
		
		JScrollPane TelaMostraHospede = new JScrollPane();
		TelaMostraHospede.setBounds(20, 62, 685, 387);
		contentPane.add(TelaMostraHospede);
		
		list = new JList<Hospede>();
		TelaMostraHospede.setViewportView(list);
		final DefaultListModel<Hospede> listModel = new DefaultListModel<Hospede>();
		
		for (int i = 0; i < TelaPrincipal.hotel.getContratos().size(); i++) {
			listModel.addElement(TelaPrincipal.hotel.getContratos().get(i).getHospede());
		}
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				String busca = tfProcurarHospede.getText();
				
				if (busca.length() < 2) {
					JOptionPane.showMessageDialog(null,"Seja mais especifico em sua busca");
					JOptionPane.showMessageDialog(null,TelaPrincipal.hotel.getContratos().get(0).getHospede().getNome());
					
				} else {
					
						
						for (int i = 0; i < TelaPrincipal.hotel.getContratos().size(); i++) {
							System.out.println(TelaPrincipal.hotel.getContratos().get(i).getHospede().getNome());
							System.out.println(TelaPrincipal.hotel.getContratos().get(i).getHospede().getNome().contains(busca));
							if (TelaPrincipal.hotel.getContratos().get(i).getHospede().getNome().contains(busca))
								listModel.addElement(TelaPrincipal.hotel.getContratos().get(i).getHospede());
						}
					
				}
				
			}
		});
		
		
		list.setModel(listModel);
		btnProcurar.setBounds(307, 128, 147, 41);
		getContentPane().add(btnProcurar);
		
		JLabel lblResultadosDaSua = new JLabel("Resultados da sua Busca:");
		lblResultadosDaSua.setBounds(42, 169, 160, 30);
		getContentPane().add(lblResultadosDaSua);
		
		btnProcurar.setBounds(487, 31, 117, 23);
		contentPane.add(btnProcurar);
		
		JButton btnDetalhes = new JButton("Detalhes");
		btnDetalhes.setBounds(20, 474, 117, 25);
		contentPane.add(btnDetalhes);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditaHospede TEO = new EditaHospede(list.getSelectedValue());
				TEO.show();
			}
		});
		btnEditar.setBounds(149, 474, 117, 25);
		contentPane.add(btnEditar);
	}
}
