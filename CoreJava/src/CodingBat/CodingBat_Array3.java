package CodingBat;



public class CodingBat_Array3 {

	
	 
    // Appending the new element at the end of the list


	/* canBalance << Solved >>
	 * Given a non-empty array, return true if there is a place to split the array 
	 * so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
		canBalance([1, 1, 1, 2, 1]) → true
		canBalance([2, 1, 1, 2, 1]) → false
		canBalance([10, 10]) → true
	 */ 

	public boolean canBalance (int [] arr2){
		int iSum = 0;
		int vTrue = 0;
		for (int i = 0 ; i < arr2.length; i++){
			int jSum = 0;
			for (int j = i + 1; j <arr2.length; j++){
				jSum += arr2[j];
			}
			iSum += arr2[i];
			if (iSum == jSum){
				vTrue++; 
			}
		}
		if (vTrue > 0){
			return true;
		}
		else{
			return false;
		}
	}

	/*linearIn <Solved>
	 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. 
	 * The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

	linearIn([1, 2, 4, 6], [2, 4]) → true
	linearIn([1, 2, 4, 6], [2, 3, 4]) → false
	linearIn([1, 2, 4, 4, 6], [2, 4]) → true
	 */

	public boolean linearIn (int arrOuter[], int arrInner[]){

		for (int i = 0; i < arrInner.length; i++ ){
			for(int j = 0; j < arrOuter.length; j++){
				if(arrInner[i] == arrOuter[j] ){

				}

			}
		}
		return false;
	}
}
