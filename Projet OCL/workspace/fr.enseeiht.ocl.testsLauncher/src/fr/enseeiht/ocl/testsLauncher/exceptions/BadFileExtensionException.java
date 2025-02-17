package fr.enseeiht.ocl.testsLauncher.exceptions;

public class BadFileExtensionException extends BadFileTypeException {

	private static final long serialVersionUID = 1L;

	public BadFileExtensionException(String fileName, String expectedExtension) {
		super("Le fichier \"" + fileName + "\" n'a pas la bonne extension. L'extension attendu est : ." + expectedExtension);
	}

	public BadFileExtensionException(String fileName, String expectedExtension, Throwable cause) {
		super("Le fichier \"" + fileName + "\" n'a pas la bonne extension. L'extension attendu est : ." + expectedExtension, cause);
	}

}
