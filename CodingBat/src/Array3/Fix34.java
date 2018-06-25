package Array3;

import java.util.ArrayList;

public class Fix34 {

	/* Return an array that contains exactly the same numbers as the given array, 
	 * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, 
	 * but every other number may move. The array contains the same number of 3's and 4's, 
	 * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

		fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
		fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
		fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
	 */


	/*	public int[] fix34(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 3) {
				int temp = arr[i+1];
				arr[i+1] = 4;
				for (int j = i + 2; j < arr.length; j++)
					if (arr[j] == 4) {
						arr[j] = temp;
					}
			}
		return arr;
	}
	 */


	public ArrayList<Integer> fix34(ArrayList <Integer> arr) {
		
		ArrayList <Integer> listObj = new ArrayList<Integer>();

		for (int i = 0; i < listObj.size(); i++){
			if(listObj.get(i) == 3){
				Integer temp = listObj.get(i+1);
				listObj.add(i+1,4);
				for (int j = 0; j< listObj.size(); j++){
					if(listObj.get(j) == 4){
						listObj.add(j, temp);
					}
				}
			}
		}
		return listObj.toArray();

	}
}
