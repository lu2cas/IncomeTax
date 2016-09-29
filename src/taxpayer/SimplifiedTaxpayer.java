package taxpayer;

public class SimplifiedTaxpayer {
	private String name;
	private String cpf;
	private double totalIncome;
	private double socialSecurityContribution;

	public SimplifiedTaxpayer(String name, String cpf, double total_income, double social_security_contribution) {
		this.name = name;
		this.cpf = cpf;
		this.totalIncome = total_income;
		this.socialSecurityContribution = social_security_contribution;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getTotalIncome() {
		return this.totalIncome;
	}

	public void setTotalIncome(double total_income) {
		this.totalIncome = total_income;
	}

	public double getSocialSecurityContribution() {
		return this.socialSecurityContribution;
	}

	public void setSocialSecurityContribution(double social_security_contribution) {
		this.socialSecurityContribution = social_security_contribution;
	}
}