package InheritanceConcepts;

public class Bike extends Vehicle {
	
	public Bike(String s){
		super(34);
		System.out.println("Bike Constructor");
	}
	
	// Green uparrows  - method overriding
	public void tyres(int x, int y){ // Green uparrows  - method overriding
		x = y + super.temp; 
		// super is used to calll the parent class.
		//super is used to initialize parent contructor
		System.out.println("x = "+ x);
		System.out.println("Parent : Min 2 tyres"); 
	}
	
	public void engine(){
		System.out.println("Parent : Min 100 hp");
	}
	
	public void sidestand(){
		System.out.println("Child : Side Stand");
	}
}
