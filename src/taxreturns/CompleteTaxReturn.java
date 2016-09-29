package taxreturns;

import taxpayer.Taxpayer;

public class CompleteTaxReturn implements TaxReturnInterface {
	private Taxpayer taxpayer;

	public CompleteTaxReturn(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
	}

	public Taxpayer getTaxpayer() {
		return this.taxpayer;
	}
	
	public void setTaxpayer(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
	}

	public double getCalculationBasis() {
		double calculation_basis = 0;
		calculation_basis = this.taxpayer.getTotalIncome() - this.taxpayer.getSocialSecurityContribution();

		if (this.taxpayer.getAge() < 65) {
			if (this.taxpayer.getTotalDependents() <= 2) {
				// Desconto de 2%
				calculation_basis = 0.98 * calculation_basis;
			} else if (this.taxpayer.getTotalDependents() >= 3 && this.taxpayer.getTotalDependents() <= 5) {
				// Desconto de 3.5%
				calculation_basis = 0.965 * calculation_basis;
			} else if (this.taxpayer.getTotalDependents() <= 2) {
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
			} else if (this.taxpayer.getTotalDependents() <= 2) {
				// Desconto de 6%
				calculation_basis = 0.94 * calculation_basis;
			}
		}

		return calculation_basis;
	}

	public double getIncomeTax() {
		double income_tax = 0;
		double calculation_basis = this.getCalculationBasis();

		if (calculation_basis <= 12000) {
			income_tax = 0;
		} else if (calculation_basis > 12000 && calculation_basis < 24000) {
			income_tax = (calculation_basis - 12000) * 0.15;
		} else if (calculation_basis >= 24000) {
			income_tax = (calculation_basis - 12000) * 0.15 + (calculation_basis - 24000) * 0.275;
		}

		return income_tax;
	}
}