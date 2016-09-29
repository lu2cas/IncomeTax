package taxreturns;

import taxpayer.Taxpayer;

public class SimplifiedTaxReturn implements TaxReturnInterface {
	private Taxpayer taxpayer;

	public SimplifiedTaxReturn(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
	}

	public Taxpayer getTaxpayer() {
		return this.taxpayer;
	}
	
	public void setSimplifiedTaxpayer(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
	}

	public double getCalculationBasis() {
		double calculation_basis = 0;
		calculation_basis = this.taxpayer.getTotalIncome() - this.taxpayer.getSocialSecurityContribution();

		// Desconto de 5%
		calculation_basis = 0.95 * calculation_basis;

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