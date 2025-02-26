package fr.enseeiht.ocl.xtext.ocl.adapter;

@SuppressWarnings("serial")
public abstract class YaoiRuntimeException extends RuntimeException {
	protected String message;
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
