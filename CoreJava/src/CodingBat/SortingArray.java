package CodingBat;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {33,15,9,2,41,100};
		int temp = 0;
		
		for(int i = 0 ; i < a.length; ++i){
			for(int j = i+1; j < a.length; ++j){
				if(a[i] > a[j]){
					temp= a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
			}
		}
		System.out.print("Modified arr a[] : ");
		for(int i = 0 ; i < a.length; i++){
			System.out.print(a[i] + ", ");
		}
		// Direct Method Array.sort(array)
		int [] b = {33,15,9,2,41,100};
		Arrays.sort(b);
		System.out.println();
		System.out.println("Modified arr b[] :"+ Arrays.toString(b));
	}
}
