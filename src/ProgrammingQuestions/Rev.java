package ProgrammingQuestions;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		   
		    for (int i=0;i<word.length();i++) {
		   		   if (i%2==0) {
				  char a= word.charAt(i);
					   System.out.print(a);
			   	}
			   }
	}
}
