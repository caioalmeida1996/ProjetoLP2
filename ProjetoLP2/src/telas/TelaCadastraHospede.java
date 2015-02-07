package telas;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Component;

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
		setBounds(100, 100, 677, 516);

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
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastraHospede TCH = new TelaCadastraHospede();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProfisso)
								.addComponent(lblNumero)
								.addComponent(lblBairro)
								.addComponent(lblCidade)
								.addComponent(lblEstado)
								.addComponent(lblEndereo)
								.addComponent(lblNome))
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
													.addComponent(tfEndereco, 199, 199, 199)
													.addComponent(tfNome, 217, 217, 217)
													.addComponent(tfEstado, 211, 211, 211))
												.addGap(43)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblCelular)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(tfCelular, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblTelefone)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(tfTelefone))
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(rdbtnMasculino)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(rdbtnFeminino))
													.addComponent(lblSexo))
												.addGap(5))
											.addComponent(tfProfissao, 200, 200, 200))
										.addGap(16))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(tfBairro, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
										.addGap(399)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblComplemento)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(346, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEmail)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfEmail))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNaturalidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfNaturalidade))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCpf)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfCPF))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblIdentidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfIdentidade))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDataDeNascimento)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(461, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNovo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnGravar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnExcluir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFichaDeHospedes_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFechar)
							.addContainerGap(252, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNome)
									.addGap(3))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblTelefone)
									.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCelular)
										.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(9)
									.addComponent(lblEndereo)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(9)
											.addComponent(lblEstado)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(9)
											.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12)
											.addComponent(lblCidade)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(9)
											.addComponent(lblBairro)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNumero)
										.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(20)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(15)
											.addComponent(tfProfissao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(20)
											.addComponent(lblProfisso))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(lblSexo)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnMasculino)
										.addComponent(rdbtnFeminino))))
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(169)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblComplemento)
								.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(47)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdentidade)
						.addComponent(tfIdentidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(tfCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNaturalidade)
						.addComponent(tfNaturalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(tfDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNovo)
						.addComponent(btnGravar)
						.addComponent(btnExcluir)
						.addComponent(btnFichaDeHospedes_1)
						.addComponent(btnFechar))
					.addGap(110))
		);
		groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] {tfTelefone, tfCelular});
		getContentPane().setLayout(groupLayout);

	}
}
