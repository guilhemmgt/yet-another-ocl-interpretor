package fr.enseeiht.ocl.xtext.utils;

import java.util.ArrayList;
import java.util.HashSet;

import org.apache.commons.collections.list.SetUniqueList;

@SuppressWarnings("serial")
public class SetUniqueArrayList extends SetUniqueList {
	public SetUniqueArrayList() {
		super(new ArrayList<Object>(), new HashSet<Object>());
	}
	
	@Override
	public boolean equals(Object object) {
		// Nécessaire pour différencier les OrderedSet des Sequences.
		return !(object instanceof ArrayList) && super.equals(object);
	}
}
