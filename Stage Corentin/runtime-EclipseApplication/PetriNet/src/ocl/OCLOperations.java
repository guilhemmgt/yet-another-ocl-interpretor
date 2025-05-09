
package ocl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import oclCollections.OCLBag;
import oclCollections.OCLCollection;
import oclCollections.OCLOrderedCollection;
import oclCollections.OCLOrderedSet;
import oclCollections.OCLSequence;
import oclCollections.OCLSet;
import oclCollections.OCLUniqueCollection;

public class OCLOperations {

	private ArrayList<EObject> allObjects;

	public ArrayList<EObject> getAllObjects() {
		return allObjects;
	}

	public void setAllObjects(ArrayList<EObject> allObjects) {
		this.allObjects = allObjects;
	}

	public <T extends EObject> OCLSet<T> allInstances(Class<T> eClass) {
		OCLSet<T> list = new OCLSet<>();
		for (EObject eObject : allObjects) {
			if (eClass.isInstance(eObject)) {
				list.add(eClass.cast(eObject));
			}
		}
		return list;
	}

	public <T> OCLSequence<T> asSequence(Collection<T> collection) {
		return new OCLSequence<>(collection);
	}

	public <T> OCLOrderedSet<T> asOrderedSet(Collection<T> collection) {
		return new OCLOrderedSet<>(collection);
	}

	public <T> OCLSet<T> asSet(Collection<T> collection) {
		return new OCLSet<>(collection);
	}

	public <T> OCLBag<T> asBag(Collection<T> collection) {
		return new OCLBag<>(collection);
	}

	public <T> boolean includes(Collection<T> list, T element) {
		return list.contains(element);
	}

	public <T> int size(Collection<T> list) {
		return list.size();
	}

	public <E, T> T oclAsType(E element, Class<T> type) {
		return type.cast(element);
	}

	public <E> OCLSet<E> oclAsSet(E o) {
		OCLSet<E> set = new OCLSet<>();
		if (o != null) {
			set.add(o);
		}
		return set;
	}

	public <E> boolean oclIsTypeOf(E element, Class<?> type) {
		return element.getClass().equals(type);
	}

	public <E> boolean oclIsKindOf(E element, Class<?> type) {
		return type.isInstance(element);
	}

	public boolean oclIsInvalid(Object o) {
		return o == null;
	}

	public boolean oclIsUndifined(Object o) {
		return o == null;
	}

	public Class<? extends Object> oclType(Object o) {
		return o.getClass();
	}

	public boolean matches(String exp, String reg) {
		return exp.matches(reg);
	}

	public String toString(Object o) {
		return o.toString();
	}

	public String toString(int n) {
		return String.valueOf(n);
	}

	public int abs(int n1) {
		return (n1 > 0) ? n1 : (-n1);
	}

	public int compareTo(int n1, int n2) {
		if (n1 == n2) {
			return 0;
		} else if (n1 < n2) {
			return -1;
		} else {
			return 1;
		}
	}

	public <E> E at(Collection<E> list, int n) {
		if (n < 0) {
			return null;
		} else {
			int i = 0;
			Iterator<E> it = list.iterator();
			E element = null;
			while (it.hasNext() && i < n + 1) {
				element = it.next();
			}
			return element;
		}
	}

	public <E> Integer indexOf(Collection<E> list, E n) {
		if (list.size() <= 0) {
			return null;
		} else {
			Iterator<E> it = list.iterator();
			E element = null;
			int i = 0;
			while (it.hasNext() && !element.equals(n)) {
				element = it.next();
				i++;
			}
			return (element.equals(n)) ? i : null;
		}
	}

	public <E> E first(Collection<E> list) {
		if (list.size() > 0) {
			Iterator<E> it = list.iterator();
			return (it.hasNext()) ? it.next() : null;
		} else {
			return null;
		}
	}

	public <E> E last(Collection<E> list) {
		if (list.size() > 0) {
			Iterator<E> it = list.iterator();
			E element = null;
			while (it.hasNext()) {
				element = it.next();
			}
			return element;
		} else {
			return null;
		}
	}

	public <E> OCLCollection<E> including(Collection<E> list, E element) {
		list.add(element);
		return (list instanceof OCLCollection<E>) ? (OCLCollection<E>) list : asSequence(list);
	}

	public <E> OCLCollection<E> includingAll(Collection<E> list, Collection<E> listInclude) {
		list.addAll(listInclude);
		return (list instanceof OCLCollection<E>) ? (OCLCollection<E>) list : asSequence(list);
	}

	public <E> OCLCollection<E> excluding(Collection<E> list, E element) {
		while (list.contains(element)) {
			list.remove(element);
		}
		return (list instanceof OCLCollection<E>) ? (OCLCollection<E>) list : asSequence(list);
	}

	public <E> OCLCollection<E> excludingAll(Collection<E> list, Collection<E> listExclude) {
		for (E exclude : listExclude) {
			if (list.contains(exclude)) {
				list.remove(exclude);
			}
		}
		return (list instanceof OCLCollection<E>) ? (OCLCollection<E>) list : asSequence(list);

	}

	public <E> boolean include(Collection<E> list, E element) {
		return list.contains(element);
	}

	public <E> boolean includeAll(Collection<E> list, Collection<E> listExclude) {
		boolean veracite = true;
		for (E exclude : listExclude) {
			veracite = veracite && list.contains(exclude);
		}
		return veracite;
	}

	public <E> boolean exclude(Collection<E> list, E element) {
		return !list.contains(element);
	}

	public <E> boolean excludeAll(Collection<E> list, Collection<E> listExclude) {
		boolean veracite = true;
		for (E exclude : listExclude) {
			veracite = veracite && !list.contains(exclude);
		}
		return veracite;
	}

	public <E> OCLBag<E> intersection(Collection<E> list1, Collection<E> list2) {
		OCLBag<E> result = new OCLBag<>();
		Iterator<E> it1 = list1.iterator();
		Iterator<E> it2 = list2.iterator();
		while (it1.hasNext()) {
			while (it2.hasNext()) {
				E e1 = it1.next();
				E e2 = it2.next();
				if (e1.equals(e2)) {
					it1.remove();
					it2.remove();
					result.add(e1);
				}
			}
		}
		return result;
	}

	public <E> OCLSet<E> intersection(Collection<E> list1, OCLUniqueCollection<E> list2) {
		OCLSet<E> result = new OCLSet<>();
		Iterator<E> it1 = list1.iterator();
		Iterator<E> it2 = list2.iterator();
		while (it1.hasNext()) {
			while (it2.hasNext()) {
				E e1 = it1.next();
				E e2 = it2.next();
				if (e1.equals(e2)) {
					it1.remove();
					it2.remove();
					result.add(e1);
				}
			}
		}
		return result;
	}
	
	public <E> OCLSet<E> intersection(OCLUniqueCollection<E> list2, Collection<E> list1) {
		return intersection(list1, list2);
	}

	public <E> OCLOrderedCollection<E> append(OCLOrderedCollection<E> list, E element) {
		list.add(element);
		return list;
	}

	public <E> OCLOrderedCollection<E> appendAll(OCLOrderedCollection<E> list, OCLOrderedCollection<E> listAppend) {
		list.addAll(listAppend);
		return list;
	}

	public <E> OCLOrderedCollection<E> prepend(OCLOrderedCollection<E> list, E element) {
		OCLOrderedCollection<E> result;
		if (list instanceof OCLOrderedSet<E>) {
			result = new OCLOrderedSet<E>();
		} else {
			result = new OCLSequence<E>();
		}
		result.add(element);
		result.addAll(list);
		return result;
	}

	public <E> OCLOrderedCollection<E> prependAll(OCLOrderedCollection<E> list, OCLOrderedCollection<E> listAppend) {
		OCLOrderedCollection<E> result;
		if (list instanceof OCLOrderedSet<E>) {
			result = new OCLOrderedSet<E>();
		} else {
			result = new OCLSequence<E>();
		}
		result.addAll(listAppend);
		result.addAll(list);
		return result;
	}

	public <E> OCLOrderedCollection<E> reverse(OCLOrderedCollection<E> list) {
		Collections.reverse((List<?>) list);
		return list;
	}

	public <E> OCLOrderedSet<E> subOrderedSet(OCLOrderedSet<E> list, int first, int last) {
		if (last < first) {
			return null;
		}
		OCLOrderedSet<E> result;
		List<E> copy = new ArrayList<E>(list);
		result = new OCLOrderedSet<E>(copy.subList(first, last + 1));
		return result;
	}

	public <E> OCLSequence<E> subSequence(OCLSequence<E> list, int first, int last) {
		return (OCLSequence<E>) list.subList(first, last + 1);
	}

	public <E> OCLOrderedSet<E> insertAt(OCLOrderedSet<E> list, int index, E object) {
		List<E> stepList = new ArrayList<E>(list);
		stepList.add(index, object);
		return new OCLOrderedSet<E>(stepList);
	}

	public <E> OCLSequence<E> insertAt(OCLSequence<E> list, int index, E object) {
		list.add(index, object);
		return list;
	}

	public <E> boolean isEmpty(Collection<E> list) {
		return list.isEmpty();
	}

	public <E> boolean notEmpty(Collection<E> list) {
		return !list.isEmpty();
	}

	public <E extends Number & Comparable<E>> E max(Collection<E> list) {
		Iterator<E> it = list.iterator();
		E maximum = null;
		while (it.hasNext()) {
			E e = it.next();
			if (maximum == null || max(maximum, e) == e) {
				maximum = e;
			}
		}
		return maximum;
	}

	public <E extends Number & Comparable<E>> E min(Collection<E> list) {
		Iterator<E> it = list.iterator();
		E minimum = null;
		while (it.hasNext()) {
			E e = it.next();
			if (minimum == null || min(minimum, e) == e) {
				minimum = e;
			}
		}
		return minimum;
	}

	private <E extends Number & Comparable<E>> E max(E a, E b) {
		return a.compareTo(b) > 0 ? a : b;
	}

	private <E extends Number & Comparable<E>> E min(E a, E b) {
		return a.compareTo(b) > 0 ? b : a;
	}

	@SuppressWarnings("unchecked")
	public <E extends Number> E sum(Collection<E> list) {
		boolean isByte = false;
		boolean isShort = false;
		boolean isInteger = false;
		boolean isLong = false;
		boolean isFloat = false;
		boolean isDouble = false;

		for (E e : list) {
			if (e instanceof Byte) {
				isByte = true;
			} else if (e instanceof Short) {
				isShort = true;
			} else if (e instanceof Integer) {
				isInteger = true;
			} else if (e instanceof Long) {
				isLong = true;
			} else if (e instanceof Float) {
				isFloat = true;
			} else {
				isDouble = true;
			}
		}

		if (isDouble) {
			double resultat = 0;
			for (E e : list) {
				resultat = resultat + e.doubleValue();
			}
			return (E) Double.valueOf(resultat);
		} else if (isFloat) {
			float resultat = 0;
			for (E e : list) {
				resultat = resultat + e.floatValue();
			}
			return (E) Float.valueOf(resultat);
		} else if (isLong) {
			long resultat = 0;
			for (E e : list) {
				resultat = resultat + e.longValue();
			}
			return (E) Long.valueOf(resultat);
		} else if (isInteger) {
			int resultat = 0;
			for (E e : list) {
				resultat = resultat + e.intValue();
			}
			return (E) Integer.valueOf(resultat);
		} else if (isShort) {
			short resultat = 0;
			for (E e : list) {
				resultat = (short) (resultat + e.shortValue());
			}
			return (E) Short.valueOf(resultat);
		} else if (isByte) {
			byte resultat = 0;
			for (E e : list) {
				resultat = (byte) (resultat + e.byteValue());
			}
			return (E) Byte.valueOf(resultat);
		} else {
			return null;
		}

	}

	public <E> OCLBag<E> union(Collection<E> list1, Collection<E> list2) {
		OCLBag<E> resultat = new OCLBag<E>();
		resultat.addAll(list1);
		resultat.addAll(list2);
		return resultat;
	}
	
	public <E> OCLSet<E> union(OCLUniqueCollection<E> list1, OCLUniqueCollection<E> list2) {
		OCLSet<E> resultat = new OCLSet<E>();
		resultat.addAll(list1);
		resultat.addAll(list2);
		return resultat;
	}
	
	public <E> OCLSet<E> symmetricDifference(OCLUniqueCollection<E> list1, OCLUniqueCollection<E> list2) {
		OCLSet<E> result = new OCLSet<E>();
		
		for(E e : list1) {
			if(!list2.contains(e)) {
				result.add(e);
			}
		}
		
		for(E e : list2) {
			if(!list1.contains(e)) {
				result.add(e);
			}
		}
		
		return result;
		
	}

	public <E> int count(Collection<E> list, E element) {
		int nb = 0;
		for (E e : list) {
			if (e.equals(element)) {
				nb++;
			}
		}
		return nb;
	}

	public <E> OCLCollection<E> flatten(Collection<E> list) {
		OCLSequence<E> copy = new OCLSequence<E>(list);
		list.clear();
		flattenRec(copy, list);
		return (list instanceof OCLCollection<E>) ? (OCLCollection<E>) list : asSequence(list);
	}

	@SuppressWarnings("unchecked")
	private <E> void flattenRec(Collection<?> copy, Collection<E> list) {
		copy.forEach(e -> {
			if (e instanceof Collection<?>) {
				flattenRec((OCLSequence<?>) e, list);
			} else {
				try {
					list.add((E) e);
				} catch (ClassCastException er) {
					System.out.println("element " + e + "doesn't have the right type");
				}
			}
		});
	}

	public String at(String str, int i) {
		return String.valueOf(str.charAt(i));
	}

	public OCLSequence<String> characters(String str) {
		char[] step = str.toCharArray();
		OCLSequence<String> result = new OCLSequence<String>();
		for(char c : step) {
			result.add(String.valueOf(c));
		}
		return result;
	}
	
	public int compareTo(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
	public String concat(String s1, String s2) {
		return s1.concat(s2);
	}
	
	public boolean endsWith(String s1, String s2) {
		return s1.endsWith(s2);
	}
	
	public boolean equalsIgnoreCase(String s1, String s2) {
		return s1.equalsIgnoreCase(s2);
	}
	
	public int indexOf(String s1, String s2) {
		return s1.indexOf(s2);
	}
	
	public int lastIndexOf(String s1, String s2) {
		return s1.lastIndexOf(s2);
	}
	
	public String replaceAll(String s, String regEx, String replacement) {
		return s.replaceAll(regEx, replacement);
	}
	
	public String replaceFirst(String s, String regEx, String replacement) {
		return s.replaceFirst(regEx, replacement);
	}
	
	public int size(String s) {
		return s.length();
	}
	
	public boolean startsWith(String s1, String s2) {
		return s1.startsWith(s2);
	}
	
	public String substituteAll(String s, String oldSubString, String newSubString) {
		String replacement = replaceAll(s, oldSubString, newSubString);
		return (replacement.equals(s)?null:replacement);
	}
	
	public String substituteFirst(String s, String oldSubString, String newSubString) {
		String replacement = replaceFirst(s, oldSubString, newSubString);
		return (replacement.equals(s)?null:replacement);
	}
	
	public String substring(String s, int start, int end) {
		if (end < start || start > s.length() || end > s.length() || start < 0) {
			return null;
		} else {
			return s.substring(start, end);
		}
	}
	
	public Boolean toBoolean(String s) {
		if (s.equals("true")) {
			return true;
		} else if (s.equals("false")) {
			return false;
		} else {
			return null;
		}
	}
	
	public Integer toInteger(String s) {
		Integer result = null;
		try {
			result = Integer.parseInt(s);
		} catch (NumberFormatException e) {}
		return result;
	}
	
	public String toLower(String s) {
		return toLowerCase(s);
	}
	
	public String toLowerCase(String s) {
		return s.toLowerCase();
	}
	
	public Float toReal(String s) {
		Float result = null;
		try {
			result = Float.parseFloat(s);
		} catch (NumberFormatException e) {}
		return result;
	}
	
	public String toString(String s) {
		return s;
	}
	
	public String toUpper(String s) {
		return toUpperCase(s);
	}
	
	public String toUpperCase(String s) {
		return s.toUpperCase();
	}
	
	public OCLSequence<String> tokenize(String s) {
		String regExSplit = "[\s\n\r\f\t]+";
		String[] array = s.split(regExSplit);
		
		OCLSequence<String> result = new OCLSequence<String>();
		
		for (String sub : array) {
			result.add(sub);
		}
		return tokenize(s, "[\s\n\r\f\t]+");		
	}
	
	public OCLSequence<String> tokenize(String s, String delimiters) {
		String[] array = s.split(delimiters);
		
		OCLSequence<String> result = new OCLSequence<String>();
		
		for (String sub : array) {
			result.add(sub);
		}
		return result;		
	}
	
	public OCLSequence<String> tokenize(String s, String delimiters, boolean returnDelimiters) {
		if(returnDelimiters) {
			String regEx1 = "(?=";
			for(int i = 0; i<delimiters.length(); i++) {
				char c = delimiters.charAt(i);
				if (i > 0) {
					regEx1 = regEx1 + "|" + c;
				} else {
					regEx1 = regEx1 + c;
				}
			}
			regEx1 = regEx1 + ")";
			String regEx21 = regEx1.substring(0, regEx1.indexOf('='));
			String regEx22 = "<" + regEx1.substring(regEx1.indexOf('='));
			
			String regEx = "(" + regEx1 + "|" + regEx21 + regEx22 + ")";
			
			String[] array = s.split(regEx);
			
			OCLSequence<String> sequence = new OCLSequence<String>();
			
			for(String sub : array) {
				sequence.add(sub);
			}
			
			return sequence;
		} else {
			return tokenize(s, delimiters);
		}
	}
	
	public String trim(String s) {
		return s.trim();
	}
	
	public <E> OCLUniqueCollection<E> operationMinus(OCLUniqueCollection<E> list, OCLUniqueCollection<E> listExclude) {
		for (E exclude : listExclude) {
			while (list.contains(exclude)) {
				list.remove(exclude);
			}
		}
		return list;

	}
	
	public void oclLog(Object o) {
		System.out.println(o);
	}
	
	public EObject oclContainer(EObject eo) {
		return eo.eContainer();
	}
	
	@SuppressWarnings("unchecked")
	public <E> OCLSet<E> oclContents(EObject eo) {
		EList<E> list = (EList<E>) eo.eContents();
		OCLSet<E> result = new OCLSet<E>(list);
		return result;
	}

	public <E extends Object> E print(E o) {
		System.out.println(o.getClass() + " : ");
		System.out.println("\t" + o + "\n");
		return o;
	}
	
//	oclIsInState
//	product
//	selectByKind
//	selectByType
// + Attributes
	
//	hasReturned
//	result
//	isOperationCall
//	isSignalSent

}


