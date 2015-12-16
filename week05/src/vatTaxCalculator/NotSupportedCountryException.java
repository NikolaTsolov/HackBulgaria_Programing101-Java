package vatTaxCalculator;

public class NotSupportedCountryException extends Exception {
	private static final long serialVersionUID = 1L;

	public NotSupportedCountryException(){};
	
	public NotSupportedCountryException(String message){
		super(message);
	}
}
