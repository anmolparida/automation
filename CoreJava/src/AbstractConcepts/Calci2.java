package AbstractConcepts;

public class Calci2 extends Calci implements CalciRequirement{

	public Calci2(String s) {
		super(s); // only if the contructor is prametersed we need to add constructor to the class which extends
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toAdd() {
		// TODO Auto-generated method stub
		System.out.println("Defining Abstract method from Calci in Calci2 - toAdd()");
	}

	@Override
	public void toMultiply() {
		// TODO Auto-generated method stub
		System.out.println("Calci3 : toMultiply");
		
	}

	@Override
	public void toDivide() {
		// TODO Auto-generated method stub
		System.out.println("Calci2 : toDivide");
		
	}
}
