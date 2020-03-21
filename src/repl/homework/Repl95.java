package repl.homework;

import java.util.Scanner;

public class Repl95 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	
	    
	    String[] array1=givenString.split(" ");
		String reverseWords="";

		for(int i=array1.length-1; i>=0; i--) {
			reverseWords=reverseWords+array1[i]+" ";
		}
		
		if(reverseWords.equalsIgnoreCase(givenString)) {
		System.out.println("True");
	
		}else {
		
		System.out.println("False");
	}
	    }
	
	    
		}
		


