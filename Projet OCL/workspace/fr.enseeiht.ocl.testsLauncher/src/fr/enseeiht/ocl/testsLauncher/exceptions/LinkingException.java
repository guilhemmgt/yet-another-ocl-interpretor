package fr.enseeiht.ocl.testsLauncher.exceptions;

public class LinkingException extends Exception {

	private static final long serialVersionUID = 1L;
	private String linkingErrorMessage;

	public LinkingException(String linkingErrorMessage) {
		super("Erreur de lien avec l'ecore : " + linkingErrorMessage);
		this.linkingErrorMessage = linkingErrorMessage;
	}

	public LinkingException(String linkingErrorMessage, Throwable cause) {
		super("Erreur de lien avec l'ecore : " + linkingErrorMessage, cause);
		this.linkingErrorMessage = linkingErrorMessage;
	}

	public String getLinkingErrorMessage() {
		return linkingErrorMessage;
	}
}
