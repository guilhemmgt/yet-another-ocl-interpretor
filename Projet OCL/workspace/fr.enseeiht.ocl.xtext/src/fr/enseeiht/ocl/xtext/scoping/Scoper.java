package fr.enseeiht.ocl.xtext.scoping;

import java.util.HashMap;
import java.util.Map;

import fr.enseeiht.ocl.xtext.ocl.Auxiliary;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.LocalVariable;
import fr.enseeiht.ocl.xtext.ocl.Parameter;

public class Scoper {
	private static Map<Auxiliary, Object> scope = new HashMap<>();
	
	/**
	 * Enregistre une variable dans le scope, uniquement si elle n'y est pas déjà enregistrée.
	 * @param key Variable à ajouter
	 * @param value Valeur
	 * @return la valeur passée en argument, ou {@code null} si cette variable est déjà enregistrée.
	 */
	private static Object add(Auxiliary key, Object value) {
		if (!scope.containsKey(key)) {
			scope.put(key, value);
			return value;
		}
		return null;
	}
	/** @see Scoper#add(Auxiliary, Object) */
	public static Object add(LocalVariable key, Object value) {
		return add((Auxiliary)key, value);
	}
	/** @see Scoper#add(Auxiliary, Object) */
	public static Object add(Parameter key, Object value) {
		return add((Auxiliary)key, value);
	}
	/** @see Scoper#add(Auxiliary, Object) */
	public static Object add(Iterator key, Object value) {
		return add((Auxiliary)key, value);
	}
	
	/**
	 * Met à jour une variable du scope, uniquement si elle y est déjà enregistrée.
	 * @param key Variable à mettre à jour
	 * @param value Nouvelle valeur
	 * @return la valeur passée en argument, ou {@code null} si cette variable n'est pas enregistrée.
	 */
	private static Object update(Auxiliary key, Object value) {
		if (scope.containsKey(key)) {
			scope.put(key, value);
			return value;
		}
		return null;
	}
	/** @see Scoper#update(Auxiliary, Object) */
	public static Object update(LocalVariable key, Object value) {
		return update((Auxiliary)key, value);
	}
	/** @see Scoper#update(Auxiliary, Object) */
	public static Object update(Parameter key, Object value) {
		return update((Auxiliary)key, value);
	}
	/** @see Scoper#update(Auxiliary, Object) */
	public static Object update(Iterator key, Object value) {
		return update((Auxiliary)key, value);
	}
	
	/**
	 * Retire une variable du scope, uniquement si elle y est déjà enregistrée.
	 * @param key Variable à retirer
	 * @return la valeur de la variable passée en argument, ou {@code null} si cette variable n'est pas enregistrée.
	 */
	public static Object remove(Auxiliary key) {
		return scope.remove(key);
	}
	
	/**
	 * Vérifie si une variable est enregistrée dans le scope.
	 * @param key Variable à tester
	 * @return {@code true} si la variable est enregistrée dans le scope.
	 */
	public static boolean contains(Auxiliary key) {
		return scope.containsKey(key);
	}
	
	/**
	 * Renvoie la valeur d'une variable enregistrée dans le scope.
	 * @param key Variable à obtenir
	 * @return la valeur de la variable, ou {@code null} si cette variable n'est pas enregistrée.
	 * La variable peut être enregistrée avec une valeur {@code null}, utiliser {@code contains} pour désambiguïser.
	 */
	public static Object get(Auxiliary key) {
		return scope.get(key);
	}
}
