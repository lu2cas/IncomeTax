package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompleteTaxReturnPanel extends JPanel {
	public JLabel lblName;
	public JLabel lblCpf;
	public JLabel lblTotalIncome;
	public JLabel lblSocialSecurityContribution;
	public JLabel lblAge;
	public JLabel lblTotalDependents;
	public JLabel lblIncomeTax;

	public JTextField textFieldName;
	public JTextField textFieldCpf;
	public JTextField texFieldTotalIncome;
	public JTextField textFieldSocialSecurityContribution;
	public JTextField textFieldAge;
	public JTextField textFieldTotalDependents;

	public JButton btnClear;
	public JButton btnCalculate;

	public CompleteTaxReturnPanel() {}

	public void makeForm() {
		setBounds(0, 0, 494, 422);
		setLayout(null);

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

		lblAge = new JLabel("Idade");
		lblAge.setBounds(30, 216, 350, 14);
		this.add(lblAge);

		textFieldAge = new JTextField();
		textFieldAge.setBounds(30, 235, 195, 20);
		textFieldAge.setColumns(10);
		this.add(textFieldAge);

		lblTotalDependents = new JLabel("Total de dependentes");
		lblTotalDependents.setBounds(30, 260, 350, 14);
		this.add(lblTotalDependents);

		textFieldTotalDependents = new JTextField();
		textFieldTotalDependents.setBounds(30, 279, 195, 20);
		textFieldTotalDependents.setColumns(10);
		this.add(textFieldTotalDependents);

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