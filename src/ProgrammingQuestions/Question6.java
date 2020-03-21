package ProgrammingQuestions;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[]args) {
		
		// Function that returns true if String is a palindrome
		//2 Strings
		
				  String original, reverse = ""; 
			      Scanner scan = new Scanner(System.in);
			      System.out.println("Enter a string:");
			      original = scan.nextLine();
			      
			      int length = original.length(); //length of the original
			     
			      for ( int i=length-1; i>= 0; i-- )
			         reverse = reverse + original.charAt(i);
			     
			      if (original.equals(reverse))
			         System.out.println(original+" is a palindrome");
			     
			      else
			         System.out.println(original+" is not a palindrome");
	}
}
			     
	
	









	
		
 