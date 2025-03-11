package fr.enseeiht.ocl.xtext.ocl.adapter;

import java.util.Collection;

public class IndexOutOfBondInvalid extends Invalid {
	public IndexOutOfBondInvalid(Collection<?> collection, int index, int maxIndex) {
		this.message = "Cannot acces to object at index "+ index +" because " + collection + " has only " + maxIndex + "items";
	}
}
