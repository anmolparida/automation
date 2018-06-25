package ClassRoom_RishiSir;

import java.util.Scanner;

public class Constructors_Polymorphism {
	public  boolean vExit = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* << Constructors >>
		> used for initialization of variable(Global Variable)
		Types of Constructors
		1. Default -- Java creates automatically and assigns Null/Zero value
		2. Parameterized
		3. Non-Parameterized // Opening Browser and Files

		//constructor is always public
		//constructor method name is same as the class name
		//constructor will not have any return type

		 */

		//Calci obj1 = new Calci(2, 3);
		//Calci obj2 = new Calci(); >> First Prints the value as non-parameterized constructor

		//obj1.toAdd();
		//obj1.toSub();

		//Calci obj2 = new Calci();
		//obj2.toAdd(); // Prints Zero as not declared in the  constructor
		//obj2.toSub(); // Prints Zero as not declared in the  constructor


		/* << polymorphism >>
		 * 
		> Many forms of methods
		Types of Polymorphism
		1. Overloading - method with same name but either diff size or diff type of parameters
		2. Return type does not matter in polymorphism
		 */

		Scanner obj3 = new Scanner(System.in); // constructors get initialized, polymorphism

		System.out.println("Enter Your Name : ");
		String name = obj3.nextLine();
		System.out.println(name);

		System.out.println("Enter Your Mobile Number : ");
		double mobileNo = obj3.nextDouble(); // 10 Digit
		String mobileNoWithCountryCode = obj3.nextLine();

		System.out.println(mobileNo);
		System.out.println(mobileNoWithCountryCode);


		//<<Problem #1>>

		Scanner obj = new Scanner(System.in);
		System.out.println("What is your Last Name");
		String vInput = obj.nextLine();
		switch(vInput) {
		case "Carswell" :
			System.out.println("You Don't have to wiat Long " + vInput);
			break;

		case "Jones" :
			System.out.println("That's not bad "+ vInput);
			break;

		case "Smith" :
			System.out.println("Looks like a bit of wait "+ vInput);
			break;

		case "Young" :
			System.out.println("not going anywhere for a while? " + vInput);
			break;
		}
	}
}
