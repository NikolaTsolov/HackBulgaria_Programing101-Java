package friday;

public class NotExistingBankAccountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotExistingBankAccountException() {
	}

	public NotExistingBankAccountException(String message) {
		super(message);
	}

}
