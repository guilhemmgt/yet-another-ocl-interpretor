package fr.enseeiht.ocl.testsLauncher.exceptions;

import java.util.List;

public class CheckTypeException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public CheckTypeException(String message) {
		super(message);
		this.message = message;
	}

	public CheckTypeException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}

	public CheckTypeException(List<String> errorMessages) {
		super(String.join("\n", errorMessages));
		this.message = errorMessages.get(0);
	}

	public String getTypeCheckingErrorMessage() {
		return message;
	}

}
