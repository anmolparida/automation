package Practice_Jan_2018;

public class Constructor_Test {

		public static void main (String args[]){
			ConstructorOverload_Box mybox1 = new ConstructorOverload_Box(10,20,30);
			ConstructorOverload_Box mybox2 = new ConstructorOverload_Box();
			ConstructorOverload_Box mybox3 = new ConstructorOverload_Box(7);
			
			ConstructorOverload_Box myclone = new ConstructorOverload_Box(mybox1);
			
			double vol;
			
			vol = mybox1.volume();
			System.out.println("Volume of mybox1  = " + vol);
			
			vol = mybox2.volume();
			System.out.println("Volume of mybox2  = " + vol);
			
			vol = mybox3.volume();
			System.out.println("Volume of mybox3  = " + vol);
			
			vol = myclone.volume();
			System.out.println("Volume of mybox3  = " + vol);
		}
	}

