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
		return 0;
	}

	public double getIncomeTax() {
		return 0;
	}
}