package ArrayCollection;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Array - Static
		Caiollection - Dynamic	
		ArrayList & HashMap

		List-  can have dupicate values in a set of value 	{2,4,6,8,4,2,6}
		Set -  removes duplicate from the set of values		{2,4,6,8}
		Queue - FIFO : First In First Out
		MAP - Key Value Pair

		 */

		// ArrayList - Dynamic, everytime index is assigned and array size increases
		ArrayList <String> listObj = new ArrayList<String>(); 
		listObj.add("IND");
		listObj.add("SL");
		listObj.add("NZ");
		listObj.add("SA");

		System.out.println(listObj);

		for (int i = 0; i < listObj.size(); ++i){
			System.out.print(listObj.get(i)+ ","); // listObj.get(i) method is used in ArrayList while in Array  we use directly a[i]
		}
		System.out.println();
		// <Advanced For Loop>- only icremental <For Each>
		System.out.print("<For Each> :");
		for (String temp : listObj){
			System.out.print(temp + " ");
		}

		//Methods of ArrayList
		System.out.println();
		listObj.add(2, "Test"); // inserts value at index 2
		System.out.println(listObj);
		listObj.remove(2);
		System.out.println(listObj);
		boolean var1 = listObj.contains("SL"); // returns if the value is present in the ArrayList
		System.out.println(var1);
		System.out.println(listObj.subList(1, 2));

		//List
		//List <String> subl = new List<String>();


		//#ClassRoomProblem - Find the Max Number in the Array
		ArrayList<Integer> alint= new ArrayList<Integer>(); // Integer class need to be declared instead of primitive data type

		alint.add(100);
		alint.add(11);
		alint.add(14);
		alint.add(10);
		alint.add(11);
		alint.add(11);
		alint.add(12);
		alint.add(14);
		System.out.println("alint : " + alint);
		int max = 0;
		for(int i = 0 ; i < alint.size()-1; ++i){
			if (alint.get(i) < alint.get(i+1)){
				max = alint.get(i+1);
				//alint.set(i+1, alint.get(i));
				//alint.set(i, alint.get(i+1));
			}
			else{
				max = alint.get(i);
			}

		}
		System.out.println("max : "+ max);

		// //#ClassRoomProblem - Given a list of non-negative integers, return an integer list of the rightmost digits.
		rightDigit obj = new rightDigit();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(15);
		arr.add(79);
		arr.add(18);
		arr.add(10);
		arr.add(0);
		System.out.println("Input: " +arr);
		System.out.println("Output: " + obj.rightDigitMethod(arr));
	}
}


