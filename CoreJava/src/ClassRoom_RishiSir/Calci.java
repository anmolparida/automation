package ClassRoom_RishiSir;

public class Calci {

	
	int x; //defined but not declared
	int y; //defined but not declared
	
	//constructor Overloading
	public Calci(int a , int b){
		x = a;
		y = b;
	}
	
	//constructor Overloading
	public Calci(){
		System.out.println("This is Calci !");
	}
	
	public void toAdd(){
		System.out.println(x+y);
		
	}
	public void toSub(){
		System.out.println(x-y);
		
	}
	//polymorphism - Overloading (data type and size differs)
	public  void toAdd(float ab, float bc){
		
	}
	//polymorphism - Overloading (data type and size differs)
	public void toAdd(int a, float b){
		
	}
	

	
	
}
