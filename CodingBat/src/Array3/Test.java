package Array3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
		//fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
		//fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
		int [] arr1 = {1, 3, 1, 4} ;
		int [] arr2 = {1, 3, 1, 4, 4, 3, 1};
		int [] arr3 = {3, 2, 2, 4} ;
		Fix34 obj = new Fix34();
		System.out.println("arr1 : "+ obj.fix34(arr1));
		System.out.println("arr1 : "+ obj.fix34(arr2));
		System.out.println("arr1 : "+ obj.fix34(arr3));
	}

}
