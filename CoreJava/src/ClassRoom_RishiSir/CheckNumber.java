package ClassRoom_RishiSir;

/* 
 
 We'll say that a number is "teen" if it is in the range 10..20 inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true


*/
public class CheckNumber {

	String xBoolean;

	public String hasTeen(int num1, int num2, int num3) {

		int count = 0;
		xBoolean = "Fail";

		if (num1 >= 10 && num1 <= 20) {
			count++;
		}
		if (num2 >= 10 && num2 <= 20) {
			count++;
		}
		if (num3 >= 10 && num3 <= 20) {
			count++;
		}

		if (count > 0) {
			xBoolean = "Pass";
		}
		return xBoolean;

	}
}
