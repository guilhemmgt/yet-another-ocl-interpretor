
package ocl;

public interface XTextOperations {

	public boolean operationUntil(Object todo);

	public boolean operationRelease(Object todo);

	public boolean operationAlways(Object todo);

	public void operationEventually(Object todo);

	public void operationNext(Object todo);
	
	public void operationAll(Object todo);
	
	public void operationExists(Object todo);

	public boolean operationAnd(boolean b1, boolean b2);

	public boolean operationOr(boolean b1, boolean b2);

	public boolean operationXor(boolean b1, boolean b2);

	public boolean operationImplies(boolean b1, boolean b2);

	public boolean operationEquivalent(boolean b1, boolean b2);

	public boolean operationNot(boolean b);

	public boolean operationEquals(Object o1, Object o2);

	public boolean operationEquals(byte n1, byte n2);

	public boolean operationEquals(int n1, int n2);

	public boolean operationEquals(float n1, float n2);

	public boolean operationEquals(double n1, double n2);

	public boolean operationNotEquals(Object o1, Object o2);

	public boolean operationNotEquals(byte n1, byte n2);

	public boolean operationNotEquals(int n1, int n2);

	public boolean operationNotEquals(float n1, float n2);

	public boolean operationNotEquals(double n1, double n2);

	public boolean operationGreater(int n1, int n2);
	
	public boolean operationGreater(String s1, String s2);

	public boolean operationLower(int n1, int n2);
	
	public boolean operationLower(String s1, String s2);

	public boolean operationGreaterEquals(int n1, int n2);
	
	public boolean operationGreaterEquals(String s1, String s2);

	public boolean operationLowerEquals(int n1, int n2);
	
	public boolean operationLowerEquals(String s1, String s2);

	public byte operationAdd(byte n1, byte n2);

	public int operationAdd(int n1, int n2);

	public float operationAdd(float n1, float n2);

	public double operationAdd(double n1, double n2);
	
	public String operationAdd(String n1, String n2);

	public byte operationMinus(byte n1, byte n2);

	public int operationMinus(int n1, int n2);

	public float operationMinus(float n1, float n2);

	public double operationMinus(double n1, double n2);

	public byte operationDivisionInteger(byte n1, byte n2);

	public int operationDivisionInteger(int n1, int n2);

	public byte operationModulo(byte n1, byte n2);

	public int operationModulo(int n1, int n2);

	public byte operationTimes(byte n1, byte n2);

	public int operationTimes(int n1, int n2);

	public float operationTimes(float n1, float n2);

	public double operationTimes(double n1, double n2);

	public byte operationDivision(byte n1, byte n2);

	public int operationDivision(int n1, int n2);

	public float operationDivision(float n1, float n2);

	public double operationDivision(double n1, double n2);

}


