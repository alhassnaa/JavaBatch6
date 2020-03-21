package repl.homework;

import java.util.Scanner;

public class Repl93 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
		
		   String input1= "ChRoME";
		   String input2="FireFOX";
		   String input3="IE";
		   
		   if(browser.equalsIgnoreCase(input1)) {
			   System.out.println("Proceed with Chrome browser");
			   
		   }else if(browser.equalsIgnoreCase(input2)) {
				   System.out.println("Proceed with Firefox browser");
				   
		   }else if(browser.equalsIgnoreCase(input3)) {
					   System.out.println("Proceed with IE browsere");
					   
				   }else {
					   System.out.println("Invalid browser");
				   }
			   }
	}


