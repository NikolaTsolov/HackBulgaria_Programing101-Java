package vatTaxCalculator;

public class CountryVatTax {

	private final int _countryID;
	private final double _vatTax;
	private final boolean _isDefault;

	public CountryVatTax(int countryID, double vatTax, boolean isDefault) {
		this._countryID = countryID;
		this._vatTax = vatTax;
		this._isDefault = isDefault;
	}

	public int getCountryID() {
		return _countryID;
	}

	public double getVatTax() {
		return _vatTax;
	}
	public boolean getIsDefault(){
		return _isDefault;
	}
}
