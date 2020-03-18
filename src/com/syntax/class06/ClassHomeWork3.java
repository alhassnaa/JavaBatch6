package com.syntax.class06;

import java.util.Scanner;

public class ClassHomeWork3 {

	public static void main(String[] args) {

		// Using scanner class create calculator. Allow 
		//user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		Scanner scan;
		double num1, num2;
		char operators;
		double result=0;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		num1=scan.nextInt();
		
		System.out.println("Please enter second number:");
		num2=scan.nextInt();
		
		System.out.println("Please enter an operator (+,-,*,/):");
		operators=scan.next().charAt(0);
	

		switch(operators) {
		
		case '+':
			result=num1+num2;
			break;
		
		case'-':
			result=num1-num2;
			break;
		
		case'/':
			result=num1/num2;
			break;
		
		case'*':
			result=num1*num2;
			break;

		} 
			System.out.println("The result of "+num1+operators+num2+" is " + result);
		
		}	
	}


	


