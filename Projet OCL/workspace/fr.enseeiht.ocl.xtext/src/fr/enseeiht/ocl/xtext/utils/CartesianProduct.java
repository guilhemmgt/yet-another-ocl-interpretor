package fr.enseeiht.ocl.xtext.utils;

import java.util.ArrayList;
import java.util.List;

public class CartesianProduct {
	
	/**
	 * Construit l'ensemble des n-combinaisons de l'ensemble donné
	 * @param <T> Type des éléments à combiner
	 * @param list Ensemble
	 * @param n Taille des combinaisons
	 * @return Ensemble des n-combinaisons de {@code list}
	 */
	public static <T> List<List<T>> generateCombinations(List<T> list, int n) {
		List<List<T>> result = new ArrayList<>();
		aux(list, n, new ArrayList<T>(), result);
		return result;
	}
	
	private static <T> void aux(List<T> list, int n, List<T> current, List<List<T>> acc) {
		if (current.size() == n) {
			acc.add(current);
			return;
		}

		for (T e : list) {
			current.add(e);
			aux(list, n, current, acc);
			current.remove(current.size() - 1);
		}
	}
}
