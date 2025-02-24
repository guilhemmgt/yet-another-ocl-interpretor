package fr.enseeiht.ocl.xtext.ocl.adapter;

@SuppressWarnings("serial")
public class UnsupportedFeatureTypeException extends YaoiRuntimeException {
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
}
