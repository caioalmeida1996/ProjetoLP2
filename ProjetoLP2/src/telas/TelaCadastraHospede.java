package telas;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastraHospede extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfProfissao;
	private JTextField tfEstado;
	private JTextField tfCidade;
	private JTextField tfBairro;
	private JTextField tfNumero;
	private JTextField tfComplemento;
	private JTextField tfTelefone;
	private JTextField tfCelular;
	private JTextField tfIdentidade;
	private JTextField tfCPF;
	private JTextField tfNaturalidade;
	private JTextField tfDataDeNascimento;
	private JTextField tfEmail;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastraHospede() {
		
		setBounds(300, 120, 641, 510);

		JLabel lblNome = new JLabel("Nome:");

		tfNome = new JTextField();
		tfNome.setColumns(10);

		JLabel lblEndereo = new JLabel("Endere\u00E7o:");

		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);

		JLabel lblProfisso = new JLabel("Profiss\u00E3o:");

		tfProfissao = new JTextField();
		tfProfissao.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");

		tfEstado = new JTextField();
		tfEstado.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade:");

		tfCidade = new JTextField();
		tfCidade.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro:");

		tfBairro = new JTextField();
		tfBairro.setColumns(10);

		JLabel lblNumero = new JLabel("Numero:");

		JLabel lblComplemento = new JLabel("Complemento:");

		tfNumero = new JTextField();
		tfNumero.setColumns(10);

		tfComplemento = new JTextField();
		tfComplemento.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");

		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);

		JLabel lblCelular = new JLabel("Celular:");

		tfCelular = new JTextField();
		tfCelular.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");

		JLabel lblIdentidade = new JLabel("Identidade");

		JLabel lblCpf = new JLabel("CPF:");

		JLabel lblNaturalidade = new JLabel("Naturalidade:");

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");

		JLabel lblEmail = new JLabel("E-mail:");

		tfIdentidade = new JTextField();
		tfIdentidade.setColumns(10);

		tfCPF = new JTextField();
		tfCPF.setColumns(10);

		tfNaturalidade = new JTextField();
		tfNaturalidade.setColumns(10);

		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);

		JButton btnNovo = new JButton("Novo");

		JButton btnGravar = new JButton("Gravar");

		JButton btnExcluir = new JButton("Excluir");

		JButton btnFichaDeHospedes_1 = new JButton("Ficha de hospedes");
		btnFichaDeHospedes_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				TelaFichaHospedes TFH = new TelaFichaHospedes();
				TFH.show();
			}
		});

		JButton btnFechar = new JButton("Fechar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNumero)
									.addGap(38)
									.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblProfisso)
										.addGap(31)
										.addComponent(tfProfissao))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblComplemento)
										.addGap(10)
										.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblBairro)
										.addGap(47)
										.addComponent(tfBairro))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblCidade)
										.addGap(42)
										.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblEstado)
												.addGap(42)
												.addComponent(tfEstado))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblEndereo)
												.addGap(30)
												.addComponent(tfEndereco))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNome)
												.addGap(48)
												.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblIdentidade)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfIdentidade))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblCpf)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfCPF))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNaturalidade)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfNaturalidade))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblEmail)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfEmail))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblDataDeNascimento)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfDataDeNascimento))))
									.addGap(43)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdbtnMasculino)
											.addGap(18)
											.addComponent(rdbtnFeminino))
										.addComponent(lblSexo)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblTelefone)
												.addGap(4)
												.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblCelular)
												.addGap(10)
												.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNovo)
							.addGap(18)
							.addComponent(btnGravar)
							.addGap(18)
							.addComponent(btnExcluir)
							.addGap(18)
							.addComponent(btnFichaDeHospedes_1)
							.addGap(10)
							.addComponent(btnFechar)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNome))
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTelefone))
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblEndereo))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblCelular))
								.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(9)
									.addComponent(lblEstado))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(9)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblCidade))
								.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(9)
									.addComponent(lblBairro))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNumero))
								.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblComplemento))
								.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProfisso)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(tfProfissao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblIdentidade))
								.addComponent(tfIdentidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblSexo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(lblCpf))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnMasculino)
									.addComponent(rdbtnFeminino))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(tfCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNaturalidade))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(tfNaturalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(lblDataDeNascimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(tfDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(lblEmail))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNovo)
						.addComponent(btnGravar)
						.addComponent(btnExcluir)
						.addComponent(btnFichaDeHospedes_1)
						.addComponent(btnFechar))
					.addGap(120))
		);
		getContentPane().setLayout(groupLayout);

	}
}
