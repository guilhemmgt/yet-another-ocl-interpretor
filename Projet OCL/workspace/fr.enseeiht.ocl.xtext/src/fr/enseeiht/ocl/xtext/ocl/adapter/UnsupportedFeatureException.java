package fr.enseeiht.ocl.xtext.ocl.adapter;

@SuppressWarnings("serial")
public class UnsupportedFeatureException extends YaoiRuntimeException {
	public UnsupportedFeatureException(String feature) {
		this.message = "The feature " + feature + " is not supported for this version of yaoi";
	}
}
