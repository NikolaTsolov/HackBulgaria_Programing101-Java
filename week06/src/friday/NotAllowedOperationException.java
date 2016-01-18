package friday;

public class NotAllowedOperationException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NotAllowedOperationException (){};
	
	public NotAllowedOperationException(String message){
		super(message);
	}

}
