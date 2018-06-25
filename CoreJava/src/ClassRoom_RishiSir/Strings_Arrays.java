package ClassRoom_RishiSir;

public class Strings_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "India"; // Both definition and declaration 
		System.out.println(x);
		String y = new String(); // Creating & defining with object
		y = "India";	
		System.out.println(y);// declaring

		// String Pool  : Used for memory management - memory is allocated to the vaue of the variable
		// First checks if any variable with same value, if not found then allocates new memory else points to the existing memory

		String  z  = "selenium";
		//	index     01234567

		System.out.println(z.length());

		System.out.println(z.charAt(4)); // Starts counting from Zero

		System.out.println(z.indexOf('n'));
		System.out.println("Position of e : " + z.indexOf('e'));
		System.out.println("Position of Second  e  from 0 : " + z.indexOf('e', 0));
		System.out.println("Position of Second  e  from 1 : " + z.indexOf('e', 1));
		System.out.println("Position of Second  e  from 2 : " + z.indexOf('e', 2));
		System.out.println("Position of Second  e  from 3 : " + z.indexOf('e', 3));
		System.out.println("Position of Second  e  from 4 : " + z.indexOf('e', 4)); // returns -1 id char not found

		System.out.println(z.substring(4));

		System.out.println(z.substring(4,7));
		System.out.println(z.substring(4,8)); // Finds the string from start to (end-1)

		System.out.println(z.contains("sel"));
		System.out.println(z.contains("Sel")); // Case Sensitive

		System.out.println(z.equals("selenium"));
		System.out.println(z.equals("Selenium"));

		System.out.println(z.equalsIgnoreCase("selenium"));

		// DOUBT  - Value  remains unchanged, memory concept.
		System.out.println(z.replace('e', 'x'));
		System.out.println(z);

		// Strings are immutable - memory location can not be changed, new memory is allocated

		String p = x.concat(" is Great");
		System.out.println(x);
		System.out.println(p);

		// String Array 
		String[] vArr = new String[4]; // Array Definition
		// memory space is calculated with size 4. Index starts from Zero.
		vArr[0] = x ;
		vArr[1] = "is";
		vArr[2] = "my";
		vArr[3] = "Country";

		for (int i = 0 ; i < vArr.length;  i++) {
			System.out.print("vArr :" +(vArr[i]) +  " ");
		}

		String[] vArr2 = {"India","is", "my", "Country"} ; // Array Declaration

		for (int i = 0 ; i < vArr2.length; i++){
			System.out.print("vArr2 : " + (vArr2[i]) +  " ");
		}

		// Char Array 
		char[] vArr_Char = new char[2];

		vArr_Char[0] = 'a';
		vArr_Char[1] = 'b';
		//vArr_Char[2] = 'c'; //  Throws Error: ArrayIndexOutOfBoundsException: 2
		for (int i = 0 ; i < vArr_Char.length;  i++) {
			System.out.println((vArr_Char[i]) +  " ");
		}

		//Array Definition with Values
		Integer[] intarr = {1,2,3};
		for (int i = 0 ; i < intarr.length;  i++) {
			System.out.print((intarr[i]) +  " ");
			System.out.println();
		}

		// Integer Array

		int vArr_Int[] = new int[2];
		vArr_Int[0] = 1;
		vArr_Int[1] = 2;
		System.out.println("vArr_Int.length : " + vArr_Int.length);
		for (int i = 0 ; i < vArr_Char.length;  i++) {
			System.out.println(vArr_Int[i]) ;
		}

		Integer[] intarr1 = new Integer[4];
		Integer [] intarr3 = {1,345,54,36};// class , 4 byte memory allocate
		Integer d = 4;
		System.out.println(d.intValue()); // methods will be displayed for the object

		int [] intarr4 = {3,4,6};// primitive data type , 4 byte memory allocated 
		int[] intarr5 = new int[3];

		// << Primitive Data Types >>

		int vInt  = 4;
		Integer s = new Integer(4);

		// int >> float, double, long, short

		char vChar = 'r';
		Character vChar2 = 'S';

		float tw = 45.6f;

		boolean flag = true;

		double er1 = 123456789; // Data Type
		double er2 = 1234567.89; // Data Type
		Double er3 = 123456.789; // decimal can written for integer value use cast or object method
		Double er4 = new Double (123456);
		Double er5 = (double) 123456;

		String s1 = "Hello";


		// <<split>>
		String s2 = "Selenium";
		String [] arr = s2.split("n");
		System.out.print("Split : ");
		for (int i = 0 ; i < arr.length;  i++) {
			System.out.print(arr[i]+ "\t");
		}
		
		// << ValueOf>>
		int var4 = 1234;
		String var5 = String.valueOf(var4);
		System.out.println();
		System.out.println(var5);
		
		String var6 = "1234";
		int var7 = Integer.valueOf(var6);
		System.out.println(var7);
		


	}
}


