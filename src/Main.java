import taxpayer.*;
import taxreturns.*;

public class Main {

	public static void main(String[] args) {
		Taxpayer tp1 = new Taxpayer("Luccas Silveira", "000.111.222-33", 36400, 4160, 23, 1);
		Taxpayer tp2 = new Taxpayer("Victoria Piccoli", "000.000.222-33", 200000, 20000);

		CompleteTaxReturn complete_tax_return = new CompleteTaxReturn(tp1);
		SimplifiedTaxReturn simplified_tax_return = new SimplifiedTaxReturn(tp2);

		System.out.println(complete_tax_return.getIncomeTax());
	}

}