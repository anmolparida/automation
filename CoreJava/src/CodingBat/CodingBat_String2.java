package CodingBat;

public class CodingBat_String2 {

	/*
	 * Given a string, does "xyz" appear in the middle of the string? To define middle, 
	 * we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
	 * This problem is harder than it looks.


	xyzMiddle("AAxyzBB") → true
	xyzMiddle("AxyzBB") → true
	xyzMiddle("AAxyzB") → true
	xyzMiddle("AxyzBBB") → false
	 */

	public String xyzMiddle(String vStr, String vFind){

		//subString Method
		//AxyzBBBB  AxyzBBB
		

		String vMid = vStr.substring((vStr.length()/2)-1, (vStr.length()/2)+2);
		String vLeft = vStr.substring((vStr.length()/2)-2, (vStr.length()/2)+1);
		String vRight = vStr.substring((vStr.length()/2)-1, (vStr.length()/2)+2);

		String subStringMethod = "";

		if (vMid.equals(vFind) ||vLeft.equals(vFind) || vRight.equals(vFind)){
			subStringMethod = "true";
		}
		else{
			subStringMethod =  "false";
		}

		//split Method
		String [] vStrArr = vStr.split(vFind);	

		String splitMethod = "";
		int vleft1 = vStrArr[0].length();
		int vRight1 = vStrArr[1].length();
		if ((vleft1 == vRight1) || (vleft1 == vRight1 +1) ||(vleft1 +1 == vRight1)){
			splitMethod = "true";
		}
		else{
			splitMethod= "false";
		}
		return  "subStringMethod : "+ subStringMethod +"\nsplitMethod : " + splitMethod;

	}

	/*
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
	Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

	makeOutWord("<<>>", "Day") → "<<Day>>"
	makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	makeOutWord("[[]]", "word") → "[[word]]"

	 */

	public String makeOutWord(String inputString1, String inputString2) {

		String vOutputString ;
		
		vOutputString  = inputString1.substring(0, (inputString1.length()/2)) + inputString2 + 
				inputString1.substring((inputString1.length()/2),(inputString1.length()));

		return vOutputString;
	}
}

