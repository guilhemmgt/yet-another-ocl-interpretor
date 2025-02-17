package fr.enseeiht.ocl.xtext.ocl.adapter;


@SuppressWarnings("serial")
public class UnimplementedException extends RuntimeException {
	
	private String message;
	
	public UnimplementedException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
