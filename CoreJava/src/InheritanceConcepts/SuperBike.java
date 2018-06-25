package InheritanceConcepts;

public class SuperBike extends Bike{
	
	public SuperBike(float cc){
		super("Test");
		System.out.println("Superbike Constructor");
	}
	
	public void tyres(int x, int y){
		x = y + temp;
		System.out.println("Child SB : 2 Radial tyres");
	}
	
	public void engine(){
		System.out.println("Child SB : 250 hp");
	}
	
	public void cosole(){
		System.out.println("Child SB : Digital Console");
	}

}
