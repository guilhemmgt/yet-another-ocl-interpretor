package fr.enseeiht.ocl.xtext.ocl.adapter;

public class WrongAttributeAccesInvalid extends Invalid {

	public WrongAttributeAccesInvalid(String feature) {
		this.message = "The feature " + feature + " is not an attribute";
	}

}
