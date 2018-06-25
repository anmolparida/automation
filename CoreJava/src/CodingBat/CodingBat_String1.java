package CodingBat;

public class CodingBat_String1 {

	/*
	 * Given 2 strings, a and b, return a string of the form short+long+short, 
	 * with the shorter string on the outside and the longer string on the inside. 
	 * The strings will not be the same length, but they may be empty (length 0).

		comboString("Hello", "hi") → "hiHellohi"
		comboString("hi", "Hello") → "hiHellohi"
		comboString("aaa", "b") → "baaab"

	 */

	public String methodComboString (String vStr1, String vStr2){

		return vStr2+"_"+vStr1+"_"+vStr2;
	}

	/*
	 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
	 * The string length will be at least 2.

		extraEnd("Hello") → "lololo"
		extraEnd("ab") → "ababab"
		extraEnd("Hi") → "HiHiHi"

	 */
	public String methodExtraEnd (String vInputString, int vRepeat){


		vRepeat = 3;
		String vOutPutString = "";
		vInputString = "Hello";
		String vLastChar1 = vInputString.substring((vInputString.length()-2), (vInputString.length()-1));
		String vLastChar2 = vInputString.substring((vInputString.length()-1), vInputString.length());


		for (int i = 0 ; i < vRepeat; i++){
			vOutPutString = vLastChar1 + vLastChar2;
		}

		//Incorrect Answer
		return  vOutPutString;
	}

	/*
	 * Given a string, return a string length 1 from its front, unless front is false, 
	 * in which case return a string length 1 from its back. The string will be non-empty.

		theEnd("Hello", true) → "H"
		theEnd("Hello", false) → "o"
		theEnd("oh", true) → "o"
	 * */

	public String methodTheEnd(String vInputString, Boolean front){

		if (front == true){
			return vInputString.substring(0, 1);
		}
		else{
			return vInputString.substring((vInputString.length()-1), (vInputString.length()));
		}
	}

	/*
	 * Given a string of even length, return a string made of the middle N chars, so the string "string" yields "ri". 
	 * The string length will be at least 2.

		middleTwo("string",2) → "ri"
		middleTwo("code",2) → "od"
		middleTwo("Practice,4") → "acti"

	 */
	public String methodMiddleTwo(String vInputString, int middleN){

		String vOutputString = vInputString.substring((vInputString.length()/2)-(middleN/2), (vInputString.length()/2)+(middleN/2));	
		return vOutputString ;
	}


	/*Given a string, return true if it ends in "ly".
	 * 
		endsLy("oddly") → true
		endsLy("y") → false
		endsLy("oddy") → false
	 */

	public boolean methodEndsly (String vInputString){
		
		if (vInputString.contains("ly")){
			return true;
		}
		else{
			return false;
		}
	}
	
	/*Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

		nTwice("Hello", 2) → "Helo"
		nTwice("Chocolate", 3) → "Choate"
		nTwice("Chocolate", 1) → "Ce" 
	*/
	
	public String methodNtwice(String vInputString, int nChars){
		
		String vFirstPart = vInputString.substring(0, nChars);
		String vLastPart = vInputString.substring((vInputString.length()-nChars), vInputString.length());
		
		return vFirstPart + vLastPart ;
		
		
	}
}
