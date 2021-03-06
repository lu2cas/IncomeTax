package business;

/**
 * Declaração de imposto de renda completa
 */
public class CompleteTaxReturn extends TaxReturn {
	public CompleteTaxReturn(Taxpayer taxpayer) {
		super(taxpayer);
		this.setCalculationBasis();
	}

	protected void setCalculationBasis() {
		double calculation_basis = 0;
		calculation_basis = this.taxpayer.getTotalIncome() - this.taxpayer.getSocialSecurityContribution();

		if (this.taxpayer.getAge() < 65) {
			if (this.taxpayer.getTotalDependents() <= 2) {
				// Desconto de 2%
				calculation_basis = 0.98 * calculation_basis;
			} else if (this.taxpayer.getTotalDependents() >= 3 && this.taxpayer.getTotalDependents() <= 5) {
				// Desconto de 3.5%
				calculation_basis = 0.965 * calculation_basis;
			} else if (this.taxpayer.getTotalDependents() > 5) {
				// Desconto de 5%
				calculation_basis = 0.95 * calculation_basis;
			}
		} else {
			if (this.taxpayer.getTotalDependents() <= 2) {
				// Desconto de 3%
				calculation_basis = 0.97 * calculation_basis;
			} else if (this.taxpayer.getTotalDependents() >= 3 && this.taxpayer.getTotalDependents() <= 5) {
				// Desconto de 4.5%
				calculation_basis = 0.955 * calculation_basis;
			} else if (this.taxpayer.getTotalDependents() > 5) {
				// Desconto de 6%
				calculation_basis = 0.94 * calculation_basis;
			}
		}

		this.calculationBasis = calculation_basis;
	}

}