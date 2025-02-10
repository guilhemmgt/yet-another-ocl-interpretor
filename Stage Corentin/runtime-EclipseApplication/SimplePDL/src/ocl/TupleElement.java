
package ocl;

public class TupleElement <T> {
	
	private String name;
	private T exp;
	private Object type;
	
	public TupleElement (String name, T exp) {
		this.name = name;
		this.type = name.getClass();
		this.exp = exp;
	}

}

