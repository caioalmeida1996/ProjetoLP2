package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastraQuarto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<?> tfTipoDeQuarto;
	private JTextField tfNomeDoHospede;
	private JComboBox<?> tfNumDePessoas;
	private JTextField tfDataDeEntrada;
	private JTextField tfDataDeSaida;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastraQuarto() {
		setTitle("Cadastra Quarto");
		
		setBounds(300, 120, 719, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 412, 89, 23);
		contentPane.add(btnNovo);

		JButton btnListaDeQuartos = new JButton("Lista de Quartos");
		btnListaDeQuartos.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				TelaQuartoLista TQL = new TelaQuartoLista();
				TQL.show();
			}
		});
		btnListaDeQuartos.setBounds(148, 412, 132, 23);
		contentPane.add(btnListaDeQuartos);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(322, 412, 89, 23);
		contentPane.add(btnGravar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(443, 412, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFechar.setBounds(564, 412, 89, 23);
		contentPane.add(btnFechar);

		JLabel lblTipoDeQuarto = new JLabel("Tipo de Quarto");
		lblTipoDeQuarto.setBounds(30, 69, 94, 29);
		contentPane.add(lblTipoDeQuarto);

		tfTipoDeQuarto = new JComboBox<Object>();
		tfTipoDeQuarto.setBounds(129, 73, 86, 20);
		contentPane.add(tfTipoDeQuarto);

		JLabel lblNomeDoHospede = new JLabel("Nome Do Hospede");
		lblNomeDoHospede.setBounds(30, 109, 94, 14);
		contentPane.add(lblNomeDoHospede);

		tfNomeDoHospede = new JTextField();
		tfNomeDoHospede.setBounds(129, 104, 86, 20);
		contentPane.add(tfNomeDoHospede);
		tfNomeDoHospede.setColumns(10);

		JLabel lblNDePessoas = new JLabel("N\u00BA de pessoas");
		lblNDePessoas.setBounds(30, 137, 86, 14);
		contentPane.add(lblNDePessoas);

		tfNumDePessoas = new JComboBox<Object>();
		tfNumDePessoas.setBounds(129, 134, 86, 20);
		contentPane.add(tfNumDePessoas);

		JLabel lblDataDeEntrada = new JLabel("Data de Entrada");
		lblDataDeEntrada.setBounds(369, 76, 94, 14);
		contentPane.add(lblDataDeEntrada);

		JLabel lblDataDeSaida = new JLabel("Data de Saida");
		lblDataDeSaida.setBounds(369, 183, 86, 14);
		contentPane.add(lblDataDeSaida);

		tfDataDeEntrada = new JTextField();
		tfDataDeEntrada.setBounds(369, 106, 86, 20);
		contentPane.add(tfDataDeEntrada);
		tfDataDeEntrada.setColumns(10);

		tfDataDeSaida = new JTextField();
		tfDataDeSaida.setBounds(369, 208, 86, 20);
		contentPane.add(tfDataDeSaida);
		tfDataDeSaida.setColumns(10);
	}
}
