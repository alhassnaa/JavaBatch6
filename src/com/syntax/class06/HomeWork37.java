package com.syntax.class06;

import java.util.Scanner;

public class HomeWork37 {

	public static void main(String[] args) {

		Scanner scan;
		boolean answer1=true;
		boolean answer2=true;
		String reply;
		
		scan=new Scanner(System.in);
		
		System.out.println("Are you thirsty?");
		answer1=scan.nextBoolean();
		
		System.out.println("Are you sleepy?");
		answer2=scan.nextBoolean();
		
		if(answer1 && !answer2) {
				System.out.println("Looks like you need water");
		
				}else if(answer1 && answer2) {
					System.out.println("Looks like you need coffee");
		
				}else if(!answer1 && answer2) {
					System.out.println("Looks like you need tea");
		
		}else{
			System.out.println("Looks like you need nothing");

		}
}
}
			
			
			
			
			
			
