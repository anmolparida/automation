package ClassRoom_RishiSir;

import java.util.Scanner;

public class Keychain_Shop_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vExit = true;
		
		while(vExit){
			Scanner obj = new Scanner(System.in);
			System.out.println("***********************");
			System.out.println("Ye Olde Keychain Shop");
			System.out.println("***********************");
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println();
			System.out.println("Please enter your choice: ");
			String vInput = obj.nextLine();
			String vIndex = vInput.substring(0, 1);

			Keychain_Shop k = new Keychain_Shop();	
			switch (vIndex){
			case "1":
				k.ADD_KEYCHAINS();
				System.out.println("You have 0 keychais, how many to add : ");
				String vNoOfKeychain = obj.nextLine();
				System.out.println(vNoOfKeychain + " keychains added");
				break;

			case "2":
				k.REMOVE_KEYCHAINS();
				break;

			case "3":
				k.VIEW_ORDER();
				break;

			case "4":
				k.CHECKOUT();
				vExit = true;
				break;
				
			default:
				System.out.println("Please provide a Valid Input from the List");
			}
			obj.close();
		}
	}

}
