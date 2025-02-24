package fr.enseeiht.ocl.testsLauncher.exceptions;

public class CheckTypeException extends Exception {

	private static final long serialVersionUID = 1L;

	public CheckTypeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CheckTypeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public String getTypeCheckingErrorMessage() {
		// TODO Auto-generated method stub
		return "";
	}

}
