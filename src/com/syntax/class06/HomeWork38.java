package com.syntax.class06;

import java.util.Scanner;

public class HomeWork38 {
	public static void main(String[]args) {
	Scanner scan;
	Boolean weekend;
	
	scan=new Scanner(System.in);
	
	
	 System.out.println("Is it weekend?");
	 weekend=scan.nextBoolean();
	 

	if(!weekend) {
		System.out.println("Today you will be learning Manual testing");
				
				
	}else {
		System.out.println("Today you will be learning Java");
	
	}
	
	
	}
	
}
