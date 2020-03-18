package com.syntax.class11;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter Mother and father first name:");
		String momName=scan.nextLine();
		
		String fatherName=scan.nextLine();
		
		System.out.println("Boy or a girl");
		String gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("Boy")) {
			
			String boy=fatherName.substring(fatherName.length()/2);
			String girl=momName.substring(momName.length()/2);
			
			System.out.println("your baby's name is "+ boy+girl);
			
			
		}else if(gender.equalsIgnoreCase("Girl")) {
		
			
			String girl=fatherName.substring(fatherName.length()/2);
			String boy=momName.substring(momName.length()/2);
			
			System.out.println("your baby's name is "+ boy+girl);	
			
		}

	}
	
		
	}

