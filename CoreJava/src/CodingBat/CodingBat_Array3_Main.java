package CodingBat;

public class CodingBat_Array3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodingBat_Array3 obj = new CodingBat_Array3();
		int arr2 [] = {-6,-2,-7,-1};
		int arr3 [] = {2,1,5,8};

		System.out.println("Possible to Balance : "+ obj.canBalance(arr2));
		System.out.println("Possible to Balance : "+ obj.canBalance(arr3));
	}
}

