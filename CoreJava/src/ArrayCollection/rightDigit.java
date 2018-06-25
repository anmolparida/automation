package ArrayCollection;

import java.util.ArrayList;

public class rightDigit {

	public ArrayList<Integer> rightDigitMethod (ArrayList<Integer> arr){
		
		ArrayList<Integer> obj = new ArrayList<>(); 
		int  vReminder = 0;
		
		for (int i = 0; i < arr.size(); i++){
			vReminder = arr.get(i)%10;
			obj.add(i, vReminder);
		}
		return obj;
	}
}
