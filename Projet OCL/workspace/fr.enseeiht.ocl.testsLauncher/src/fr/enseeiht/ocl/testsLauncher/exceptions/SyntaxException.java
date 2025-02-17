package fr.enseeiht.ocl.testsLauncher.exceptions;

public class SyntaxException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String syntaxErrorMessage;

	public SyntaxException(String syntaxErrorMessage) {
		super("Erreur de syntaxe : " + syntaxErrorMessage);
		this.syntaxErrorMessage = syntaxErrorMessage;
	}

	public SyntaxException(String syntaxErrorMessage, Throwable cause) {
		super("Erreur de syntaxe : " + syntaxErrorMessage, cause);
		this.syntaxErrorMessage = syntaxErrorMessage;
	}

	public String getSyntaxErrorMessage() {
		return syntaxErrorMessage;
	}

}
