package com.syntax.class06;

import java.util.Scanner;

public class ExP {

	public static void main(String[] args) {
		
	
		Scanner scan;
		String Instructor;
		String role;
	
		scan=new Scanner(System.in);
		
		System.out.println("Enter name of the instructor");
		
		Instructor=scan.nextLine();
		
		switch(Instructor) {
		
		case "Shiva":
			role="Will take care of Java Assignment";
			break;
		case "Sandish":
			role="Will take care of SDLC Assignment";
			break;
		case "Weqas":
			role="Will take care of Selenium Assignment";
			break;
		case "Asel":
			role="Will take care of every Assignment";
			break;
			
		default:
			role="Invalid instructor selected";
		}
			System.out.println(role);
		
					
		}	
			
		
	}
		

		
		
		
		
		
		
		
		
	
