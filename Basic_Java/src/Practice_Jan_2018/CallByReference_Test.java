package Practice_Jan_2018;

public class CallByReference_Test {
	
	public static void main(String args[]){
		
	CallByReference cbr = new CallByReference(15,20);
	
	System.out.println("a and b before call: "+ cbr.a + ","+ cbr.b);
	cbr.meth(cbr);
	System.out.println("a and b after call: "+ cbr.a + ","+ cbr.b);
	
	}
}
