package taxreturns;

import taxpayer.Taxpayer;

/**
 * Declaração de imposto de renda simplificada
 */
public class SimplifiedTaxReturn extends TaxReturn {
	private Taxpayer taxpayer;

	public SimplifiedTaxReturn(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
	}

	@Override
	public Taxpayer getTaxpayer() {
		return this.taxpayer;
	}

	@Override
	public void setTaxpayer(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
		
	}

	@Override
	public double getCalculationBasis() {
		double calculation_basis = 0;
		calculation_basis = this.taxpayer.getTotalIncome() - this.taxpayer.getSocialSecurityContribution();

		// Desconto de 5%
		calculation_basis = 0.95 * calculation_basis;

		return calculation_basis;
	}

	public double getIncomeTax() {
		double calculation_basis = this.getCalculationBasis();

		return this.getIncomeTax(calculation_basis);
	}
}