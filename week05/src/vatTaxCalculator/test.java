package vatTaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		CountryVatTax def = new CountryVatTax(0, 0.1, true);
		CountryVatTax first = new CountryVatTax(1, 0.15, false);
		CountryVatTax second = new CountryVatTax(2, 0.20, false);
		CountryVatTax third = new CountryVatTax(3, 0.25, false);
		CountryVatTax fourth = new CountryVatTax(4, 0.30, false);
		
		List<CountryVatTax> input = new ArrayList<>();
		input.add(def);
		input.add(first);
		input.add(second);
		input.add(third);
		input.add(fourth);
		
		VatTaxCalculator cal = new VatTaxCalculator(input);
		System.out.println(cal.calculateTax(200));

	}

}
