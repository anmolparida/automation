package Practice_Jan_2018;

public class CallByValue_Test {
	public static void main (String args[]){
		CallByValue cbv = new CallByValue();
		
		int a = 15;
		int b = 20;
		
		//In Java, when you pass a primitive type to a method, it is passed by value.
		//Thus, what occurs to the parameter that receives the argument has no effect outside the method.
		
		System.out.println("a and b before call: "+ a + ","+ b);
		cbv.meth(a, b);
		System.out.println("a and b after call: "+ a + ","+ b);
		
		
	}
}
