package OperationsCallingMethod;

public class ExecutionClass {

	public static void main (String[] args) {
		
		MultiplesOf3and5 obj4 = new MultiplesOf3and5();
		
		SmallestMultiple obj5 = new SmallestMultiple();
		
		System.out.println(obj4.FindMultiplesOf3and5());
		
		System.out.println(obj4.FindMultiplesOf3or5());
		
		System.out.println("Using While : Smallest positive number that is evenly divisible by all of the numbers from 1 to 20 : " + obj5.FindSmallestMultiple_While());
		System.out.println("Using ForIf : Smallest positive number that is evenly divisible by all of the numbers from 1 to 20 : " + obj5.FindSmallestMultiple_ForIf());


/*		
		calci obj = new calci();
		obj.toAdd(12, 14);
		
		String tempbefore = obj.x;
		System.out.println(tempbefore);

		int tempResult = obj.toAdd(1, 9);
		System.out.println(tempResult);

		String tempAfter = obj.x;
		System.out.println(tempAfter);
		
*/

		//CheckNumber obj3 = new CheckNumber();
		//System.out.println(obj3.hasTeen(10, 25, 100));
		//System.out.println(obj3.hasTeen(1, 25, 100));
		//System.out.println(obj3.hasTeen(13, 19, 20));

	}
}


//81496-93036 name-selenium-timing

