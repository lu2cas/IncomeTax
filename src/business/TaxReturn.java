package business;

/**
 * Declaração de imposto de renda
 */
public abstract class TaxReturn {
	public abstract Taxpayer getTaxpayer();

	public abstract double getCalculationBasis();

	public double getIncomeTax(double calculation_basis) {
		double income_tax = 0;

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