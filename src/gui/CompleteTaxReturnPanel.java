package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import business.*;

public class CompleteTaxReturnPanel extends JPanel {
	private JLabel lblName;
	private JLabel lblCpf;
	private JLabel lblTotalIncome;
	private JLabel lblSocialSecurityContribution;
	private JLabel lblAge;
	private JLabel lblTotalDependents;
	private JLabel lblIncomeTax;

	private JTextField textFieldName;
	private JTextField textFieldCpf;
	private JTextField texFieldTotalIncome;
	private JTextField textFieldSocialSecurityContribution;
	private JTextField textFieldAge;
	private JTextField textFieldTotalDependents;

	private JButton btnClear;
	private JButton btnCalculate;

	public CompleteTaxReturnPanel() {}

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
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClear_actionPerformed(e);
			}
		});
		this.add(btnClear);

		btnCalculate = new JButton("Calcular");
		btnCalculate.setBounds(385, 378, 89, 23);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCalculate_actionPerformed(e);
			}
		});
		this.add(btnCalculate);
	}

	protected void do_btnCalculate_actionPerformed(ActionEvent e) {
		String name = textFieldName.getText();
		String cpf = textFieldCpf.getText();
		String total_income = texFieldTotalIncome.getText();
		String social_security_contribution = textFieldSocialSecurityContribution.getText();
		String age = textFieldAge.getText();
		String total_dependents = textFieldTotalDependents.getText();

		String income_tax;

		TaxReturnValidator validator = new TaxReturnValidator();
		if (validator.isValidCompleteTaxReturn(name, cpf, total_income, social_security_contribution, age, total_dependents)) {
			Taxpayer taxpayer = new Taxpayer(validator.getName(), validator.getCpf(), validator.getTotalIncome(), validator.getSocialSecurityContribution(), validator.getAge(), validator.getTotalDependents());
			CompleteTaxReturn completeTaxReturn = new CompleteTaxReturn(taxpayer);
			income_tax = "R$ " + String.format("%.2f", completeTaxReturn.getIncomeTax());
		} else {
			income_tax = "Erro!";
		}
		lblIncomeTax.setText("Imposto de renda: " + income_tax);
	}

	protected void do_btnClear_actionPerformed(ActionEvent e) {
		textFieldName.setText("");
		textFieldCpf.setText("");
		texFieldTotalIncome.setText("");
		textFieldSocialSecurityContribution.setText("");
		textFieldAge.setText("");
		textFieldTotalDependents.setText("");
		lblIncomeTax.setText("Imposto de renda:");
	}
}