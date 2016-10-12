package business;

/**
 * Contribuinte
 */
public class Taxpayer {
	private String name;
	private String cpf;
	private double totalIncome;
	private double socialSecurityContribution;
	private int age;
	private int totalDependents;

	public Taxpayer(String name, String cpf, double total_income, double social_security_contribution) {
		this.name = name;
		this.cpf = cpf;
		this.totalIncome = total_income;
		this.socialSecurityContribution = social_security_contribution;
	}

	public Taxpayer(String name, String cpf, double total_income, double social_security_contribution, int age, int total_dependents) {
		this(name, cpf, total_income, social_security_contribution);
		this.age = age;
		this.totalDependents = total_dependents;
	}

	public String getName() {
		return this.name;
	}

	public String getCpf() {
		return this.cpf;
	}

	public double getTotalIncome() {
		return this.totalIncome;
	}

	public double getSocialSecurityContribution() {
		return this.socialSecurityContribution;
	}

	public int getAge() {
		return age;
	}

	public int getTotalDependents() {
		return totalDependents;
	}
}