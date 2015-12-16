package shopInventory;

import vatTaxCalculator.CountryVatTax;
import vatTaxCalculator.VatTaxCalculator;

public class Product {
	private final double _priceBeforeTax;
	private final double _priceAfterTax;
	private final CountryVatTax _whereCanBeBought;
	private final String _name;
	private int _productQuantity;
	private final int _productID;
	
	public Product(double price, String name,CountryVatTax whereCanBeBought, int productQuantity, int productID){
		this._priceBeforeTax = price;
		this._whereCanBeBought = whereCanBeBought;
		this._priceAfterTax = makePrice(_priceBeforeTax, _whereCanBeBought);
		this._name = name;
		this._productID = productID;
		this._productQuantity = productQuantity;
		
	}
	
	public double makePrice(double price, CountryVatTax country){
		VatTaxCalculator temp = new VatTaxCalculator(country);
		return temp.calculateTax(price, country.getCountryID());
	}
	public double getPriceAfterTax() {
		return _priceAfterTax;
	}
	public String getName() {
		return _name;
	}
	public int getProductID() {
		return _productID;
	}
	public int getProductQuantity() {
		return _productQuantity;
	}
	public void setProductQuantity(int _productQuantity) {
		this._productQuantity = _productQuantity;
	}
}
