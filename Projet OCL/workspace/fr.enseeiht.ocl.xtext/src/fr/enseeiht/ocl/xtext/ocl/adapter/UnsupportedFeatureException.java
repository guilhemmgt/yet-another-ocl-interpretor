package fr.enseeiht.ocl.xtext.ocl.adapter;

@SuppressWarnings("serial")
public class UnsupportedFeatureException extends RuntimeException {
	private String message;
	
	/**
	 * Create a new UnsupportedFeatureException
	 * @param feature Feature or Litterral not supported by the interpretor
	 */
	public UnsupportedFeatureException(String feature) {
		this.message = "The feature " + feature + " is not supported for this version of yaoi";
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
