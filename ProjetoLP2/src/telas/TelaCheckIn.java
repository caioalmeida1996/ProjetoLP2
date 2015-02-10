package telas;

import hospede.Hospede;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JComboBox;

public class TelaCheckIn extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfDataDeNascimento;
	private JTextField tfEndereco;
	private JTextField tfCartaoDeCredito;
	private JTextField tfDataDeEntradaDia;
	private JTextField tfDataDeEntradaMes;
	private JTextField tfDataDeEntradaAno;
	private JTextField tfDataDeSaidaDia;
	private JTextField tfDataDeSaidaMes;
	private JTextField tfDataDeSaidaAno;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCheckIn() {
		setTitle("Check In");

		setBounds(300, 120, 572, 430);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 53, 59, 14);

		tfNome = new JTextField();
		tfNome.setBounds(79, 53, 169, 20);
		tfNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 79, 42, 14);

		JLabel lblDataDeNascimento = new JLabel("Nascimento:");
		lblDataDeNascimento.setBounds(10, 105, 80, 14);

		tfCPF = new JTextField();
		tfCPF.setBounds(79, 79, 169, 20);
		tfCPF.setColumns(10);

		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setBounds(79, 105, 169, 20);
		tfDataDeNascimento.setColumns(10);

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(147, 534, 71, 23);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(236, 534, 75, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(295, 56, 71, 14);

		JLabel lblN = new JLabel("Cartao de Credito:");
		lblN.setBounds(295, 82, 113, 14);

		tfEndereco = new JTextField();
		tfEndereco.setBounds(407, 50, 86, 20);
		tfEndereco.setColumns(10);

		tfCartaoDeCredito = new JTextField();
		tfCartaoDeCredito.setBounds(407, 79, 86, 20);
		tfCartaoDeCredito.setColumns(10);

		JLabel lblQuarto = new JLabel("Quarto:");
		lblQuarto.setBounds(20, 195, 55, 14);

		JRadioButton RadioButtonCamaExtra = new JRadioButton("Cama extra");
		RadioButtonCamaExtra.setBounds(20, 247, 111, 23);

		JLabel label = new JLabel("N\u00BA de pessoas");
		label.setBounds(20, 223, 88, 14);

		JComboBox<String> comboBoxTipoDeQuarto = new JComboBox<String>();
		comboBoxTipoDeQuarto.setBounds(68, 192, 105, 20);
		comboBoxTipoDeQuarto.addItem("Presidencial");
		comboBoxTipoDeQuarto.addItem("Luxo Simples");
		comboBoxTipoDeQuarto.addItem("Luxo Duplo");
		comboBoxTipoDeQuarto.addItem("Luxo Triplo");
		comboBoxTipoDeQuarto.addItem("Executivo Simples");
		comboBoxTipoDeQuarto.addItem("Executivo Duplo");
		comboBoxTipoDeQuarto.addItem("Executivo Triplo");

		JLabel label_1 = new JLabel("Data de Entrada");
		label_1.setBounds(247, 192, 94, 14);

		JLabel label_2 = new JLabel("Dia");
		label_2.setBounds(247, 220, 22, 14);

		tfDataDeEntradaDia = new JTextField();
		tfDataDeEntradaDia.setBounds(279, 217, 86, 20);
		tfDataDeEntradaDia.setColumns(10);

		JLabel label_3 = new JLabel("Mes");
		label_3.setBounds(247, 248, 29, 14);

		tfDataDeEntradaMes = new JTextField();
		tfDataDeEntradaMes.setBounds(279, 245, 86, 20);
		tfDataDeEntradaMes.setColumns(10);

		JLabel label_4 = new JLabel("Ano");
		label_4.setBounds(247, 273, 29, 14);

		tfDataDeEntradaAno = new JTextField();
		tfDataDeEntradaAno.setBounds(279, 273, 86, 20);
		tfDataDeEntradaAno.setColumns(10);

		JLabel label_5 = new JLabel("Data de Saida");
		label_5.setBounds(393, 192, 86, 14);

		JLabel label_6 = new JLabel("Dia");
		label_6.setBounds(393, 217, 29, 14);

		tfDataDeSaidaDia = new JTextField();
		tfDataDeSaidaDia.setBounds(419, 217, 86, 20);
		tfDataDeSaidaDia.setColumns(10);

		JLabel label_7 = new JLabel("Mes");
		label_7.setBounds(393, 242, 29, 14);

		tfDataDeSaidaMes = new JTextField();
		tfDataDeSaidaMes.setBounds(419, 245, 86, 20);
		tfDataDeSaidaMes.setColumns(10);

		JLabel label_8 = new JLabel("Ano");
		label_8.setBounds(393, 267, 29, 14);

		tfDataDeSaidaAno = new JTextField();
		tfDataDeSaidaAno.setBounds(419, 270, 86, 20);
		tfDataDeSaidaAno.setColumns(10);
		getContentPane().setLayout(null);
		getContentPane().add(label);
		getContentPane().add(comboBoxTipoDeQuarto);
		getContentPane().add(label_1);
		getContentPane().add(label_2);
		getContentPane().add(tfDataDeEntradaDia);
		getContentPane().add(label_3);
		getContentPane().add(tfDataDeEntradaMes);
		getContentPane().add(label_4);
		getContentPane().add(tfDataDeEntradaAno);
		getContentPane().add(label_5);
		getContentPane().add(label_6);
		getContentPane().add(tfDataDeSaidaDia);
		getContentPane().add(label_7);
		getContentPane().add(tfDataDeSaidaMes);
		getContentPane().add(label_8);
		getContentPane().add(tfDataDeSaidaAno);
		getContentPane().add(lblQuarto);
		getContentPane().add(lblDataDeNascimento);
		getContentPane().add(lblCpf);
		getContentPane().add(lblNome);
		getContentPane().add(btnFinalizar);
		getContentPane().add(btnCancelar);
		getContentPane().add(tfNome);
		getContentPane().add(tfCPF);
		getContentPane().add(tfDataDeNascimento);
		getContentPane().add(RadioButtonCamaExtra);
		getContentPane().add(lblEndereco);
		getContentPane().add(tfEndereco);
		getContentPane().add(lblN);
		getContentPane().add(tfCartaoDeCredito);

		JComboBox<String> comboBoxNdePessoas = new JComboBox<String>();
		comboBoxNdePessoas.setBounds(118, 220, 53, 20);
		getContentPane().add(comboBoxNdePessoas);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean verificador = true;

				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				try {
					cal.setTime(formato.parse(tfDataDeNascimento.getText()));
				} catch (ParseException e) {
					JOptionPane.showMessageDialog(null,
							"Formato da data tem que ser dd/MM/yyyy");
					e.printStackTrace();
					verificador = false;
				}
				if (verificador == true) {
					Hospede hospede = new Hospede(tfNome.getText(), tfCPF
							.getText(), cal, tfEndereco.getText(),
							tfCartaoDeCredito.getText());
					JOptionPane.showMessageDialog(null,
							"Cadastro feito com sucesso!");
				}
				
				
			}
		});
		btnSalvar.setBounds(10, 332, 161, 50);
		getContentPane().add(btnSalvar);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				hide();
			}
		});
		btnFechar.setBounds(377, 332, 169, 50);
		getContentPane().add(btnFechar);
		comboBoxNdePessoas.addItem("1");
		comboBoxNdePessoas.addItem("2");
		comboBoxNdePessoas.addItem("3");
		comboBoxNdePessoas.addItem("4");

	}
}
