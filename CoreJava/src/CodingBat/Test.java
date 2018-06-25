package CodingBat;

public class Test {

	public static void main (String[] args) {
		
		CodingBat_String1 obj= new CodingBat_String1();
		
		System.out.println("methodComboString : " + obj.methodComboString("Hello","World"));
		System.out.println("methodComboString : " + obj.methodExtraEnd("Hello", 3)); // Incorrect Answer
		System.out.println("methodTheEnd <true> : " + obj.methodTheEnd("Hello", true));
		System.out.println("methodTheEnd <false> : " + obj.methodTheEnd("Hello", false));
		System.out.println("methodMiddleTwo <ABCDEFGH> : " + obj.methodMiddleTwo("ABCDEFGH", 4));
		System.out.println("methodEndsly <Closely> : " + obj.methodEndsly("Closely"));
		System.out.println("methodEndsly <closeLY> : " + obj.methodEndsly("closeLY")); // Case Sensitive
		System.out.println("methodEndsly <ABC> : " + obj.methodEndsly("ABC"));
		System.out.println("methodNtwice <AMERICA> : " + obj.methodNtwice("AMERICA",2));
		
			
	}	
}
