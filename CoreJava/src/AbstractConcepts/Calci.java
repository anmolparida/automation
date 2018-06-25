package AbstractConcepts;

public abstract class Calci {

	//abstract class contains both astract method and concurrent method
	public abstract void toAdd(); 
	//method does not have a body
	//mostly used in inheritance

	public void toSub(){
		System.out.println("Defining method in Abstract Class - toSub()");
	}
	
	// constructor is always used for initialization
	public Calci(String s){ 
		System.out.println(s);
		
	}
}

