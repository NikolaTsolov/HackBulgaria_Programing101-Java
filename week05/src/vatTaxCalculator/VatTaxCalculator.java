package vatTaxCalculator;

import java.util.List;
import java.util.ArrayList;

public class VatTaxCalculator {

	private ArrayList<CountryVatTax> _CountriesList = new ArrayList<>();

	public VatTaxCalculator(List<CountryVatTax> input) {
		this._CountriesList.addAll(input);
	}
	public VatTaxCalculator(CountryVatTax country) {
		this._CountriesList.add(country);
	}
	
	public double calculateTax(double productPrice, int countryID) {
		boolean helper = false;
		for (CountryVatTax item : _CountriesList) {
			if (countryID == item.getCountryID()) {
				helper = true;
			}
		}
		try {
			if (!helper) {
				throw new NotSupportedCountryException();
			}
		} catch (NotSupportedCountryException nsce) {
			System.out.println("This country is not supported by the calculator");
		}
		double vatTax = 0;
		for (CountryVatTax item : _CountriesList) {
			if (item.getCountryID() == countryID) {
				vatTax = productPrice * item.getVatTax();
				break;
			}
		}
		if (vatTax == 0) {
			vatTax = getDefault().getVatTax() * productPrice;
		}
		return productPrice + vatTax;

	}

	public double calculateTax(double productPrice) {
		double vatTax = getDefault().getVatTax() * productPrice;
		return productPrice + vatTax;
	}

	public CountryVatTax getDefault() {
		for (CountryVatTax item : _CountriesList) {
			if (item.getIsDefault()) {
				return item;
			}
		}
		return null;
	}
}
