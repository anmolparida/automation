package InheritanceConcepts;

public class Test {

	public static void main (String [] args){

		Vehicle v = new Vehicle();
		System.out.println("--------< Vehicle >--------");
		v.tyres(0, 0);
		v.engine();
		v.sidemirror();

		Bike b = new Bike("Welcome");
		System.out.println("--------< Bike >--------");
		b.tyres(3,4);
		b.engine();
		b.sidemirror();
		b.sidestand();
		
		SuperBike s = new SuperBike(1.2f);
		System.out.println("--------< SuperBike >--------");
		s.tyres(3,4);
		s.engine();
		s.sidemirror();
		s.sidestand();
		s.cosole();

		Vehicle obj = new Bike("Hello"); // call side mirror, tyres and engines
		//Downcasting - Calls all the explicit functions of parents and the common and overriden objects.
		
		//Bike obj2 =  new Vehicle();
		//upcating is not allowed in Java
		
		Bike obj2 = (Bike) new Vehicle();
		obj2.engine();
		obj2.tyres(1, 2);
		obj2.sidemirror();

		// Concurrent Method - Both Definition and Declaration
		// Abstract Method - Only Name 

	}
}
