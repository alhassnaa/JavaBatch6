package com.syntax.class06;

import java.util.Scanner;

public class InClassHW1 {

	public static void main(String[] args) {
		//Ask user to enter their country and 
		//capture it. Once values are captured print
		//which language user speaks.
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please eneter yoyr country");
		country=scan.nextLine();
		
		switch(country) {
	
		case "Morocco":
			language="Arabic";
			break;
		case "Turky":
			language="Turkish";
			break;
		case "france":
			language="French";
			break;
			
			default:
				language="Unkown";
		}
        System.out.println("your language is "+language);
	}

}
