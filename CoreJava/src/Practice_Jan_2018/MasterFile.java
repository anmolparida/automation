package Practice_Jan_2018;

public class MasterFile {
	
	public static void main (String[] args) {
		
		//Swapping two Variables
		
		int var1 = 12;
		int var2 = 15;
		int temp;
		
		temp = var1;
		var1 = var2;
		var2 = temp;
		
		System.out.println("After Swapping:\nvar1 = " + var1 + "\tvar2 = " + var2 );
		
		System.out.println("\n_____If Else Condition Blocks______\n");
		
		// For indentation Ctrl+A & Ctrl+I
		
		int input_Var = 15;
		
		if (input_Var%2 == 0)
		{
			System.out.println("input_Var: " + input_Var+ " is Even");
		}
		else
			
		{
			System.out.println("input_Var: " + input_Var+ " is Odd");
			
		}
		System.out.println("\nEnd of Code");
	}

}
