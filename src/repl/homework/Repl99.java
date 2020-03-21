package repl.homework;

import java.util.Scanner;

public class Repl99 {

	public static void main(String[] args) {

		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   	//write your code below
		   	String b="";
		    int a=givenString.length();

				for(int i=a-1; i>=0; i--) {
				
				 b=b+givenString.charAt(i);
				}
				if(givenString.equalsIgnoreCase(b)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			    }
			    
				}

