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
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class TelaCadastraHospede extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfDataDeNascimento;
	private JTextField tfEndereco;
	private JTextField tfNDoCartao;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastraHospede() {
		setTitle("Check In");
		
		setBounds(300, 120, 641, 510);

		JLabel lblNome = new JLabel("Nome:");

		tfNome = new JTextField();
		tfNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");

		tfCPF = new JTextField();
		tfCPF.setColumns(10);

		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setColumns(10);

		JButton btnNovo = new JButton("Novo");

		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton btnExcluir = new JButton("Excluir");

		JButton btnFichaDeHospedes_1 = new JButton("Ficha de hospedes");
		btnFichaDeHospedes_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				TelaFichaHospedes TFH = new TelaFichaHospedes();
				TFH.show();
			}
		});
		
		JLabel lblEndereco = new JLabel("Endereco");
		
		JLabel lblN = new JLabel("N° Do Cartão");
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		
		tfNDoCartao = new JTextField();
		tfNDoCartao.setColumns(10);
		
		
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.addItem("Ré");
		comboBox.addItem("ré");
		comboBox.addItem("ré");
		comboBox.addItem("ré");
		
		String variavel = (String) comboBox.getSelectedItem();

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDataDeNascimento)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfDataDeNascimento))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCpf)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tfCPF))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNome)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
							.addGap(57)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEndereco)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblN)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfNDoCartao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(75, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNovo)
							.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
							.addComponent(btnGravar)
							.addGap(73)
							.addComponent(btnExcluir)
							.addGap(39)
							.addComponent(btnFichaDeHospedes_1)
							.addGap(45))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEndereco)
						.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(tfCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblN)
						.addComponent(tfNDoCartao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(tfDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(100)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(180)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNovo)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnFichaDeHospedes_1)
							.addComponent(btnExcluir)
							.addComponent(btnGravar)))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
