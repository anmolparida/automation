package OperationsCallingMethod;

public class calci {

	int i = 10;
	// String x = "Fail";

	String x; // The value returns null if its not declared

	public void toAdd() {
		int i = 4;
		System.out.println(i);
	}

	public void toSub() {
		System.out.println(i);
	}

	public int toAdd (int lhs ,int rhs) {
		
		int result = lhs + rhs;
		
		if (result == 10) {
			x = "Pass";
		}
		return result;
	}
	


}
