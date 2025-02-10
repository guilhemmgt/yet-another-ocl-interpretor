
package ocl;

public class OCLClassicOperations implements XTextOperations{

	@Override
	public boolean operationUntil(Object todo) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public boolean operationAlways(Object todo) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void operationEventually(Object todo) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void operationNext(Object todo) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void operationAll(Object todo) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void operationExists(Object todo) {
		throw new RuntimeException("Unimplemented");
	}
	
	@Override
	public boolean operationRelease(Object todo) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public boolean operationEquivalent(boolean b1, boolean b2) {
		return (b1 && b2) || (!b1 && !b2);
	}

	@Override
	public boolean operationNot(boolean b) {
		return !b;
	}

	@Override
	public boolean operationEquals(byte n1, byte n2) {
		return n1 == n2;
	}

	@Override
	public boolean operationEquals(float n1, float n2) {
		return n1 == n2;
	}

	@Override
	public boolean operationEquals(double n1, double n2) {
		return n1 == n2;
	}

	@Override
	public boolean operationNotEquals(byte n1, byte n2) {
		return n1 != n2;
	}

	@Override
	public boolean operationNotEquals(int n1, int n2) {
		return n1 != n2;
	}

	@Override
	public boolean operationNotEquals(float n1, float n2) {
		return n1 != n2;
	}

	@Override
	public boolean operationNotEquals(double n1, double n2) {
		return n1 != n2;
	}

	@Override
	public byte operationAdd(byte n1, byte n2) {
		return (byte) (n1 + n2);
	}

	@Override
	public float operationAdd(float n1, float n2) {
		return (float) (n1 + n2);
	}

	@Override
	public double operationAdd(double n1, double n2) {
		return (double) (n1 + n2);
	}

	@Override
	public byte operationMinus(byte n1, byte n2) {
		return (byte) (n1 - n2);
	}

	@Override
	public float operationMinus(float n1, float n2) {
		return (float) (n1 - n2);
	}

	@Override
	public double operationMinus(double n1, double n2) {
		return (double) (n1 - n2);
	}

	@Override
	public byte operationDivisionInteger(byte n1, byte n2) {
		return (byte) (n1/n2);
	}

	@Override
	public int operationDivisionInteger(int n1, int n2) {
		return (int) (n1/n2);
	}

	@Override
	public byte operationModulo(byte n1, byte n2) {
		return (byte) (n1%n2);
	}

	@Override
	public int operationModulo(int n1, int n2) {
		return (int) (n1/n2);
	}

	@Override
	public byte operationTimes(byte n1, byte n2) {
		return (byte) (n1*n2);
	}

	@Override
	public int operationTimes(int n1, int n2) {
		return (int) (n1*n2);
	}

	@Override
	public float operationTimes(float n1, float n2) {
		return (float) (n1*n2);
	}

	@Override
	public double operationTimes(double n1, double n2) {
		return (double) (n1*n2);
	}

	@Override
	public byte operationDivision(byte n1, byte n2) {
		return (byte) (n1/n2);
	}

	@Override
	public int operationDivision(int n1, int n2) {
		return (int) (n1/n2);
	}

	@Override
	public float operationDivision(float n1, float n2) {
		return (float) (n1/n2);
	}

	@Override
	public double operationDivision(double n1, double n2) {
		return (double) (n1/n2);
	}

	@Override
	public boolean operationAnd(boolean b1, boolean b2) {
		return b1 && b2;
	}

	@Override
	public boolean operationOr(boolean b1, boolean b2) {
		return b1 || b2;
	}

	@Override
	public boolean operationXor(boolean b1, boolean b2) {
		return b1 ^ b2;
	}

	@Override
	public boolean operationImplies(boolean b1, boolean b2) {
		return !(b1 && !b2);
	}

	@Override
	public boolean operationEquals(Object o1, Object o2) {
		return o1.equals(o2);
	}

	@Override
	public boolean operationEquals(int n1, int n2) {
		return n1 == n2;
	}

	@Override
	public boolean operationNotEquals(Object o1, Object o2) {
		return !o1.equals(o2);
	}

	@Override
	public boolean operationGreater(int n1, int n2) {
		return n1>n2;
	}

	@Override
	public boolean operationLower(int n1, int n2) {
		return n1<n2;
	}

	@Override
	public boolean operationGreaterEquals(int n1, int n2) {
		return n1>=n2;
	}

	@Override
	public boolean operationLowerEquals(int n1, int n2) {
		return n1<=n2;
	}

	@Override
	public int operationAdd(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int operationMinus(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public boolean operationGreater(String s1, String s2) {
		return s1.compareTo(s2) == 1;
	}

	@Override
	public boolean operationLower(String s1, String s2) {
		return s1.compareTo(s2) == -1;
	}

	@Override
	public boolean operationGreaterEquals(String s1, String s2) {
		return s1.compareTo(s2) == 1 || s1.compareTo(s2) == 0;
	}

	@Override
	public boolean operationLowerEquals(String s1, String s2) {
		return s1.compareTo(s2) == -1 || s1.compareTo(s2) == 0;
	}

	@Override
	public String operationAdd(String n1, String n2) {
		return n1+n2;
	}
	
}


