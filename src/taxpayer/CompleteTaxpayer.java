package taxpayer;

public class CompleteTaxpayer extends SimplifiedTaxpayer {

	private int age;
	private int totalDependents;

	public CompleteTaxpayer(String name, String cpf, double total_income, double social_security_contribution, int age, int total_dependents) {
		super(name, cpf, total_income, social_security_contribution);
		this.age = age;
		this.totalDependents = total_dependents;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTotalDependents() {
		return totalDependents;
	}

	public void setTotalDependents(int totalDependents) {
		this.totalDependents = totalDependents;
	}
}