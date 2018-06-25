package ClassRoom_RishiSir;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question #3 : Remove first and last char of String

		String vInputString = "Hello";
		String vNewString;
		vNewString = vInputString.substring(1, vInputString.length()-1);
		System.out.println("vNewString Substrig Method : " + vNewString);


		vNewString = "";
		for(int i = 0; i < vInputString.length(); i++){
			if (i == 0 || i == vInputString.length()-1){
				vNewString = vNewString + "";
			}
			else
			{
				vNewString = vNewString + vInputString.charAt(i);
			}
		}
		System.out.println( "vNewString For If Method : " + vNewString);

		//Question #4 : Print True if 6 is a element of the array else print False

		int vArr_IntQ[] = new int[3];
		vArr_IntQ[0] = 1;
		vArr_IntQ[1] = 2;
		vArr_IntQ[2] = 9;

		int vSearchElemet = 6;

		if (vArr_IntQ[0] == vSearchElemet || vArr_IntQ[(vArr_IntQ.length-1)] == vSearchElemet ){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

		//Question #5 : ABC, XYZ >> ABCXYZXYZABC

		String vStr1 = "ABC";
		String vStr2 = "XYZ";
		String [] vInputStringArray = new String[2];

		vInputStringArray[0] = vStr1;
		vInputStringArray[1] = vStr2;

		String vOutPutString =  vInputStringArray[0] + vInputStringArray[vInputStringArray.length-1] + 
				vInputStringArray[vInputStringArray.length-1]+ vInputStringArray[0];

		System.out.println("ABBA vOutPutString : " + vOutPutString);


		//Question #6 : Swap last and second last characters of a String


		String vInput = "Coding";
		String vOutPut;

		vOutPut = vInput.substring(0, vInput.length()-2) +
				vInput.substring(vInput.length()-1, vInput.length())+
				vInput.substring(vInput.length()-2, vInput.length()-1);

		System.out.println("Substrig Method : Aftre Swapping : " + vOutPut);


		//Question #6 - Find count of occurrence and the maximum value in the array
		Double [] arrD1 = {9.41,20.42,7.91,3.42,9.41,7.91,100.0,999.99};
		//					0	 1     2    3     4    5    6     7

		int vCount941 = 0;
		String vPosition941 = "";
		int vCount791 = 0;
		String vPosition791 = "";
		int vCount100 = 0;
		String vPosition100 = "";
		double max = arrD1[0];

		for(int i = 0 ; i < arrD1.length; i ++){
			if (arrD1[i] == 9.41){
				vCount941 ++;
				vPosition941 = vPosition941 + i + ',';
			}
			if (arrD1[i] == 7.91){
				vCount791 ++;
				vPosition791 = vPosition791 + i + ',';
			}
			if (arrD1[i] == 100){
				vCount100 ++;
				vPosition100 = vPosition100 + i + ',';
			}

			if (i>0){
				if (arrD1[i] > max){
					max = arrD1[i];
				}
			}
		}
		System.out.println("vCount941 : " + vCount941 + " >> vPosition941 : " + vPosition941);
		System.out.println("vCount791 : " + vCount791 + " >> vPosition791 : " + vPosition791);
		System.out.println("vCount100 : " + vCount100 + " >> vPosition100 : " + vPosition100);
		System.out.println("Max number in the array : " + max);

		
		// Generic Code #6 - Nested For Loop
		int vOccurrenaceCount = 0;
		for(int j = 0 ; j < arrD1.length; j++){
			for (int k = 0 ; k < arrD1.length; k ++){
				if (arrD1[j].doubleValue() == arrD1[k].doubleValue()){
					vOccurrenaceCount ++;
				}	
			}
			System.out.println( "vOccurrenaceCount of " + arrD1[j] + " : " + vOccurrenaceCount);
			vOccurrenaceCount = 0;
		}
		
		// Sort an Array
		double temp2 ;
		for(int i = 1 ; i < arrD1.length; i ++){
			if (arrD1[i] > arrD1[i-1] ){
				temp2 = arrD1[i-1] ;
				arrD1[i-1]  = arrD1[i]; 
				arrD1[i] = temp2;		
			}
		}
		System.out.print("Sorted lowest to Highest: ");
		System.out.println();
		for (int i = 0; i < arrD1.length; i++){
			System.out.print(" " + arrD1[i] );
		}
		
		// Question #7 : Capitalize the First Char of each word
		
		String vLower = "i am java programmer";		 
		String [] arrLower = vLower.split(" ");
		
		for (int i = 0; i < arrLower.length; i++){
			//String x  = arrLower[i].substring(0, 1) ;
			//x = x.toUpperCase();
			arrLower[i] = arrLower[i].substring(0, 1).toUpperCase() + arrLower[i].substring(1,(arrLower[i].length()));	
		}
		
		System.out.println();
		System.out.print("Capitalize the First Char of each word: ");
		
		for (int i1 = 0; i1 < arrLower.length; i1++){
			System.out.print(" " + arrLower[i1] );
		}
	}

}
