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

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCheckIn() {
		setTitle("Check In");
		
		setBounds(300, 120, 641, 510);

		JLabel lblNome = new JLabel("Nome:");

		tfNome = new JTextField();
		tfNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");

		JLabel lblDataDeNascimento = new JLabel("Nascimento:");

		tfCPF = new JTextField();
		tfCPF.setColumns(10);

		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setColumns(10);

		JButton btnFinalizar = new JButton("Finalizar");

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblEndereco = new JLabel("Endereco:");
		
		JLabel lblN = new JLabel("Cartao de Credito:");
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		
		tfCartaoDeCredito = new JTextField();
		tfCartaoDeCredito.setColumns(10);
		
		
		
		JComboBox<String> ComBoxQuarto = new JComboBox();
		ComBoxQuarto.addItem("Ré");
		ComBoxQuarto.addItem("ré");
		ComBoxQuarto.addItem("ré");
		ComBoxQuarto.addItem("ré");
		
		String variavel = (String) ComBoxQuarto.getSelectedItem();
		
		JLabel lblQuarto = new JLabel("Quarto:");
		
		JRadioButton RadioButtonCamaExtra = new JRadioButton("Cama extra");

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblQuarto)
							.addContainerGap(577, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDataDeNascimento)
								.addComponent(lblCpf)
								.addComponent(lblNome))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnFinalizar)
									.addGap(18)
									.addComponent(btnCancelar))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(tfNome, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
										.addComponent(tfCPF, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
										.addComponent(tfDataDeNascimento, 144, 159, Short.MAX_VALUE)
										.addComponent(ComBoxQuarto, 0, 159, Short.MAX_VALUE)
										.addComponent(RadioButtonCamaExtra))
									.addGap(57)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblEndereco)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblN)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(tfCartaoDeCredito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(142))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(lblEndereco)
						.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(lblN)
						.addComponent(tfCartaoDeCredito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(tfDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuarto)
						.addComponent(ComBoxQuarto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(RadioButtonCamaExtra)
					.addGap(227)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFinalizar)
						.addComponent(btnCancelar))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
