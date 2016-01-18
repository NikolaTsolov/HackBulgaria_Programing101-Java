package friday;

public class NoMoneyException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public NoMoneyException(){};
	public NoMoneyException(String message){
		super(message);
	}
	
}
