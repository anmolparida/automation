package InheritanceConcepts;

public class Vehicle {

	int temp;
	public Vehicle(int z){
		temp = z;
		System.out.println("Vehicle Constructor");
	}
	
	public Vehicle(){
		System.out.println("Vehicle Constructor");
	}
	
	public void tyres(int x, int y){
		x = y + temp;
		System.out.println("Parent : Min 2 tyres");
	}
	
	public void engine(){
		System.out.println("Parent : Min 100 hp");
	}
	
	public void sidemirror(){
		System.out.println("Parent : Side Mirrors");
	}
	
}
