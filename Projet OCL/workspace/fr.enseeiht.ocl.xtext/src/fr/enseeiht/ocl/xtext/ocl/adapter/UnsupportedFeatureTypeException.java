package fr.enseeiht.ocl.xtext.ocl.adapter;

@SuppressWarnings("serial")
public class UnsupportedFeatureTypeException extends RuntimeException {
	private String message;
	
	/**
	 * Create a new UnsupportedFeatureException
	 * @param feature Feature or Litterral not supported by the interpretor
	 */
	public UnsupportedFeatureTypeException(String feature, Class<?>[] types) {
		String typesStr = "";
		for (Class<?> type : types) {
			typesStr += type.getName() + " ";
		}
		typesStr.substring(0, typesStr.length()-1);
		this.message = "The feature " + feature + " does not support the types (" + typesStr + ") for this version of yaoi";
	}
	public UnsupportedFeatureTypeException(String feature, Class<?> type) {
		this(feature, new Class<?>[] { type });
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
