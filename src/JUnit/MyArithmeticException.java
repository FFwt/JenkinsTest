package JUnit;

public class MyArithmeticException extends Exception {

	public MyArithmeticException() {
	}

	public MyArithmeticException(String message) {
		super(message);
	}

	public MyArithmeticException(Throwable cause) {
		super(cause);
	}

	public MyArithmeticException(String message, Throwable cause) {
		super(message, cause);
	}
}

