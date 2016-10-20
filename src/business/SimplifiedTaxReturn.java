package business;

/**
 * Declaração de imposto de renda simplificada
 */
public class SimplifiedTaxReturn extends TaxReturn {
	public SimplifiedTaxReturn(Taxpayer taxpayer) {
		super(taxpayer);
		this.setCalculationBasis();
	}

	protected void setCalculationBasis() {
		double calculation_basis = 0;
		calculation_basis = this.taxpayer.getTotalIncome() - this.taxpayer.getSocialSecurityContribution();

		// Desconto de 5%
		calculation_basis = 0.95 * calculation_basis;

		this.calculationBasis = calculation_basis;
	}
}