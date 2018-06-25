package CodingBat;

public class CodingBat_String2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CodingBat_String2 obj = new CodingBat_String2();
		System.out.println("AAxyzBB \n" + obj.xyzMiddle("AAxyzBB", "xyz"));
		System.out.println("AxyzBB \n" + obj.xyzMiddle("AxyzBB", "xyz"));
		System.out.println("AAxyzB \n" + obj.xyzMiddle("AAxyzB", "xyz"));
		System.out.println("AxyzBBB \n" + obj.xyzMiddle("AxyzBBB", "xyz"));  //Incorect
		System.out.println("<<>> ABC : " + obj.makeOutWord("<<>>", "ABC"));

	}
}
