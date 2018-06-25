package Practice_Jan_2018;

//import java.util.Scanner;

public class Demo {

	   public static void main(String args[]) {
	      
	      //String Str3 = "Welcome to Tutorialspoint.com";
	      //System.out.println("String3 Length :" + Str3.length());
	      
	      //String stringToReverse;
	      //Scanner reader = new Scanner(System.in);  // Reading from System.in
	      //System.out.println("Enter String to Reverse: ");
	      //stringToReverse = reader.next();
		 
		  String stringToReverse = "ANMOL PARIDA";
	      String reversedString = "";
	
	      
	      int vLen = stringToReverse.length() ;
	      for (int i = 0; i < vLen ; i++) {
	    	  reversedString = reversedString + stringToReverse.substring((vLen-i-1), (vLen-i));
	      }
	      System.out.println(reversedString);
	      //System.out.println(stringToReverse.);
	   
	      }
	}


