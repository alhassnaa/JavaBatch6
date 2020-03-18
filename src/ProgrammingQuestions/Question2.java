package ProgrammingQuestions;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//2 Write a java program to check whether 
		//a given number is prime or not?
		
				Scanner scan= new Scanner(System.in);
				System.out.println("Please enter number ");
				int number= scan.nextInt();
				boolean control=true;
				if(number<2) {  // we do not check if number is less then 2 because  2 is a smallest prime number.
					System.out.println("number can not check whether a given number is prime or not");
				}else {
				       for( int i=2; i<number; i++) {
					 	if (number%i==0) {
						control=false;
						break;// we do not check next numbers
					 	}
				       }
				       String message="";
			          if (control) {
			        	  message="Number is prime number.";
			          }else {
			        	  message="Number is not prime number.";
			          }System.out.println(message);
			}
		}
		}

	
