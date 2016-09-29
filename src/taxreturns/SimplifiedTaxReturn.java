package taxreturns;

import taxpayer.SimplifiedTaxpayer;

public class SimplifiedTaxReturn implements TaxReturnInterface {
	private SimplifiedTaxpayer simplifiedTaxpayer;

	public SimplifiedTaxReturn(SimplifiedTaxpayer simplified_taxpayer) {
		this.simplifiedTaxpayer = simplified_taxpayer;
	}

	public SimplifiedTaxpayer getSimplifiedTaxpayer() {
		return this.simplifiedTaxpayer;
	}
	
	public void setSimplifiedTaxpayer(SimplifiedTaxpayer simplified_taxpayer) {
		this.simplifiedTaxpayer = simplified_taxpayer;
	}

	public double getCalculationBasis() {
		double calculation_basis = 0;
		calculation_basis = this.simplifiedTaxpayer.getTotalIncome() - this.simplifiedTaxpayer.getSocialSecurityContribution();
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