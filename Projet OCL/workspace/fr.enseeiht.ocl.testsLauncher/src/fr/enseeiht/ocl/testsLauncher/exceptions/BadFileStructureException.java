package fr.enseeiht.ocl.testsLauncher.exceptions;

public class BadFileStructureException extends BadFileTypeException {

	private static final long serialVersionUID = 1L;

	public BadFileStructureException(String fileName, String expectedExtension) {
		super(expectedExtension == null ? "Erreur syntaxique : \"" + fileName + "\" n'a pas la bonne structure" :
				"Erreur syntaxique : \"" + fileName + "\" n'a pas la bonne structure. La structure attendu est celle d'un : ." + expectedExtension);
		}

	public BadFileStructureException(String fileName, String expectedExtension, Throwable cause) {
		super(expectedExtension == null ? "Erreur syntaxique : \"" + fileName + "\" n'a pas la bonne structure" :
			"Erreur syntaxique : \"" + fileName + "\" n'a pas la bonne structure. La structure attendu est celle d'un : ." + expectedExtension, cause);
	}

}
