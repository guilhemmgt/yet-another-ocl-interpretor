package fr.enseeiht.ocl.testsLauncher.exceptions;

public class BadFileTypeException extends Exception {

	private static final long serialVersionUID = 1L;

	public BadFileTypeException(String message) {
		super(message);
	}

	public BadFileTypeException(String message, Throwable cause) {
		super(message, cause);
	}

}
