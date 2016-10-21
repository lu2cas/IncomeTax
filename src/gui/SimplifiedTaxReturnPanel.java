package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimplifiedTaxReturnPanel extends JPanel {
	private JLabel lblName;
	private JLabel lblCpf;
	private JLabel lblTotalIncome;
	private JLabel lblSocialSecurityContribution;
	private JLabel lblIncomeTax;

	private JTextField textFieldName;
	private JTextField textFieldCpf;
	private JTextField texFieldTotalIncome;
	private JTextField textFieldSocialSecurityContribution;

	private JButton btnClear;
	private JButton btnCalculate;

	public SimplifiedTaxReturnPanel() {}

	public void makeForm() {
		this.setBounds(0, 0, 494, 422);
		this.setLayout(null);

		lblName = new JLabel("Nome");
		lblName.setBounds(30, 40, 350, 14);
		this.add(lblName);

		textFieldName = new JTextField();
		textFieldName.setBounds(30, 59, 350, 20);
		textFieldName.setColumns(10);
		this.add(textFieldName);

		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(30, 84, 350, 14);
		this.add(lblCpf);

		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(30, 103, 195, 20);
		textFieldCpf.setColumns(10);
		this.add(textFieldCpf);

		lblTotalIncome = new JLabel("Total de rendimentos");
		lblTotalIncome.setBounds(30, 128, 350, 14);
		this.add(lblTotalIncome);

		texFieldTotalIncome = new JTextField();
		texFieldTotalIncome.setBounds(30, 147, 195, 20);
		texFieldTotalIncome.setColumns(10);
		this.add(texFieldTotalIncome);

		lblSocialSecurityContribution = new JLabel("Contribui\u00E7\u00E3o previdenci\u00E1ria oficial");
		lblSocialSecurityContribution.setBounds(30, 172, 350, 14);
		this.add(lblSocialSecurityContribution);

		textFieldSocialSecurityContribution = new JTextField();
		textFieldSocialSecurityContribution.setBounds(30, 191, 195, 20);
		textFieldSocialSecurityContribution.setColumns(10);
		this.add(textFieldSocialSecurityContribution);

		lblIncomeTax = new JLabel("Imposto de renda:");
		lblIncomeTax.setBounds(30, 334, 195, 14);
		this.add(lblIncomeTax);

		btnClear = new JButton("Limpar");
		btnClear.setBounds(296, 378, 84, 23);
		this.add(btnClear);

		btnCalculate = new JButton("Calcular");
		btnCalculate.setBounds(385, 378, 89, 23);
		this.add(btnCalculate);
	}
}