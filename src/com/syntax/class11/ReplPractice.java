package com.syntax.class11;

import java.util.Scanner;

public class ReplPractice {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String text="The first 3 letters of ";
		System.out.println("Please enter a word:");
		String word=scan.nextLine();
		
	    
		System.out.println(text+word+" is "+word.substring(0,3));
		
		
}

	
	}
	

