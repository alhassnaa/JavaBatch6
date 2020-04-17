package com.syntax.class03;

import java.util.Scanner;

public class LastHw {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String gender;
		int age;
		
		
		System.out.println("Please enter your gender");
		gender=scan.nextLine();
		System.out.println("Please enter your age");
		age=scan.nextInt();

		if (age>25) {
			if(gender.equals("M")) {
			System.out.println("Man");
			}else 
			System.out.println("Woman");
		
		
	} else if(gender.equals("M")) {
		
			System.out.println("Boy");
			}else {
			System.out.println("Girl");
		
		
			}
		
		
	}

}
