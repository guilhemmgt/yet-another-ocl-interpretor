package fr.enseeiht.ocl.xtext.ocl.adapter;


@SuppressWarnings("serial")
public class UnimplementedException extends YaoiRuntimeException {
	public UnimplementedException(@SuppressWarnings("rawtypes") Class unimplementedClass, String methodName) {
		this.message = "The method " + methodName + " is not implemented for class " + unimplementedClass.getName();
	}
}
