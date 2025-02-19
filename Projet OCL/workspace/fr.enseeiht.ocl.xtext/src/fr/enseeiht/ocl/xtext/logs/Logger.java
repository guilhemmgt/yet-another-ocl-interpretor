package fr.enseeiht.ocl.xtext.logs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class Logger {
	private static Map<EObject, List<String>> errors = new HashMap<EObject, List<String>>();
	private static Map<EObject, List<String>> warnings = new HashMap<EObject, List<String>>();
	private static Map<EObject, List<String>> messages = new HashMap<EObject, List<String>>();

	// Registering custom logs :
	public static void logNullError(EObject src) {
		logError(src, src.eClass().getName() + " is null.");
	}
	
	// Registering custom logs :
	public static void logError(EObject src, String text) {
		List<String> newList = errors.containsKey(src) ? errors.get(src) : new ArrayList<String>();
		newList.add(text);
		errors.put(src, newList);
	}
	public static void logWarning(EObject src, String text) {
		List<String> newList = warnings.containsKey(src) ? warnings.get(src) : new ArrayList<String>();
		newList.add(text);
		warnings.put(src, newList);
	}
	public static void logMessage(EObject src, String text) {
		List<String> newList = messages.containsKey(src) ? messages.get(src) : new ArrayList<String>();
		newList.add(text);
		messages.put(src, newList);
	}

	// Getting logs :
	public static Map<EObject, List<String>> getErrors() {
		return errors;
	}
	public static List<String> getObjectErrors(EObject src) {
		return errors.get(src);
	}

	public static Map<EObject, List<String>> getWarnings() {
		return warnings;
	}
	public static List<String> getObjectWarnings(EObject src) {
		return warnings.get(src);
	}

	public static Map<EObject, List<String>> getMessages() {
		return messages;
	}
	public static List<String> getObjectMessages(EObject src) {
		return messages.get(src);
	}
}
