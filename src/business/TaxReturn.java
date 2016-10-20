package business;

/**
 * Declaração de imposto de renda
 */
public abstract class TaxReturn {
	protected double calculationBasis;
	protected Taxpayer taxpayer;

	public TaxReturn(Taxpayer taxpayer) {
		this.taxpayer = taxpayer;
	}

	public Taxpayer getTaxpayer() {
		return this.taxpayer;
	}

	protected abstract void setCalculationBasis();

	public double getIncomeTax() {
		double income_tax = 0;

		if (this.calculationBasis <= 12000) {
			income_tax = 0;
		} else if (this.calculationBasis > 12000 && this.calculationBasis < 24000) {
			income_tax = (this.calculationBasis - 12000) * 0.15;
		} else if (this.calculationBasis >= 24000) {
			income_tax = (this.calculationBasis - 12000) * 0.15 + (this.calculationBasis - 24000) * 0.275;
		}

		return income_tax;
	}
}