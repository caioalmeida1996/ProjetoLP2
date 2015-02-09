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
	private JComboBox<String> tfTipoDeQuarto;
	private JTextField tfNomeDoHospede;
	private JComboBox<String> tfNumDePessoas;
	private JTextField tfDiaDeEntrada;
	private JTextField tfDiaDeSaida;
	private JTextField tfMesDeEntrada;
	private JTextField tfAnoDeEntrada;
	private JTextField tfMesDeSaida;
	private JTextField tfAnoDeSaida;

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

		JLabel lblTipoDeQuarto = new JLabel("Tipo de Quarto");
		lblTipoDeQuarto.setBounds(30, 69, 94, 29);
		contentPane.add(lblTipoDeQuarto);

		tfTipoDeQuarto = new JComboBox<String>();
		tfTipoDeQuarto.setBounds(129, 73, 151, 20);
		contentPane.add(tfTipoDeQuarto);
		tfTipoDeQuarto.addItem("Presidencial");
		tfTipoDeQuarto.addItem("Luxo Simples");
		tfTipoDeQuarto.addItem("Luxo Duplo");
		tfTipoDeQuarto.addItem("Luxo Triplo");
		tfTipoDeQuarto.addItem("Executivo Simples");
		tfTipoDeQuarto.addItem("Executivo Duplo");
		tfTipoDeQuarto.addItem("Executivo Triplo");

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

		tfNumDePessoas = new JComboBox<String>();
		tfNumDePessoas.setBounds(129, 134, 86, 20);
		contentPane.add(tfNumDePessoas);
		tfNumDePessoas.addItem("1");
		tfNumDePessoas.addItem("2");
		tfNumDePessoas.addItem("3");
		tfNumDePessoas.addItem("4");

		JLabel lblDataDeEntrada = new JLabel("Data de Entrada");
		lblDataDeEntrada.setBounds(365, 23, 94, 14);
		contentPane.add(lblDataDeEntrada);

		JLabel lblDataDeSaida = new JLabel("Data de Saida");
		lblDataDeSaida.setBounds(369, 183, 86, 14);
		contentPane.add(lblDataDeSaida);

		tfDiaDeEntrada = new JTextField();
		tfDiaDeEntrada.setBounds(397, 48, 86, 20);
		contentPane.add(tfDiaDeEntrada);
		tfDiaDeEntrada.setColumns(10);

		tfDiaDeSaida = new JTextField();
		tfDiaDeSaida.setBounds(397, 205, 86, 20);
		contentPane.add(tfDiaDeSaida);
		tfDiaDeSaida.setColumns(10);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(365, 51, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(365, 76, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(365, 101, 46, 14);
		contentPane.add(lblAno);
		
		tfMesDeEntrada = new JTextField();
		tfMesDeEntrada.setBounds(397, 73, 86, 20);
		contentPane.add(tfMesDeEntrada);
		tfMesDeEntrada.setColumns(10);
		
		tfAnoDeEntrada = new JTextField();
		tfAnoDeEntrada.setBounds(397, 101, 86, 20);
		contentPane.add(tfAnoDeEntrada);
		tfAnoDeEntrada.setColumns(10);
		
		JLabel label = new JLabel("Dia");
		label.setBounds(369, 208, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Mes");
		label_1.setBounds(369, 233, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Ano");
		label_2.setBounds(369, 258, 46, 14);
		contentPane.add(label_2);
		
		tfMesDeSaida = new JTextField();
		tfMesDeSaida.setBounds(397, 230, 86, 20);
		contentPane.add(tfMesDeSaida);
		tfMesDeSaida.setColumns(10);
		
		tfAnoDeSaida = new JTextField();
		tfAnoDeSaida.setBounds(397, 255, 86, 20);
		contentPane.add(tfAnoDeSaida);
		tfAnoDeSaida.setColumns(10);
	}
}
