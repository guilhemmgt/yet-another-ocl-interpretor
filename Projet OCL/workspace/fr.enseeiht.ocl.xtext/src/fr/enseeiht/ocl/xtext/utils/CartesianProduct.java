package fr.enseeiht.ocl.xtext.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CartesianProduct {
	
	/**
	 * Construit l'ensemble des n-combinaisons de l'ensemble donné
	 * @param <T> Type des éléments à combiner
	 * @param  Ensemble
	 * @param n Taille des combinaisons
	 * @return Ensemble des n-combinaisons de {@code list}
	 */
	public static <T> List<List<T>> generateCombinations(Collection<T> coll, int n) {
		List<List<T>> result = new ArrayList<>();
		aux(coll, n, new ArrayList<T>(), result);
		return result;
	}
	
	private static <T> void aux(Collection<T> coll, int n, List<T> current, List<List<T>> acc) {
		if (current.size() == n) {
			acc.add(new ArrayList<>(current));
			return;
		}

		for (T e : coll) {
			current.add(e);
			aux(coll, n, current, acc);
			current.remove(current.size() - 1);
		}
	}
}
