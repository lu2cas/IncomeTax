package taxreturns;

import taxpayer.CompleteTaxpayer;

public class CompleteTaxReturn implements TaxReturnInterface {
	private CompleteTaxpayer completeTaxpayer;

	public CompleteTaxReturn(CompleteTaxpayer complete_taxpayer) {
		this.completeTaxpayer = complete_taxpayer;
	}

	public CompleteTaxpayer getCompleteTaxpayer() {
		return this.completeTaxpayer;
	}
	
	public void setCompleteTaxpayer(CompleteTaxpayer complete_taxpayer) {
		this.completeTaxpayer = complete_taxpayer;
	}

	public double getCalculationBasis() {
		return 0;
	}

	public double getIncomeTax() {
		return 0;
	}
}