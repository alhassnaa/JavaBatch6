package con.syntax.class03;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your gender");
		String gender=scan.nextLine();
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		
		if(age>25) {
		
			if (gender.equals("M")) {
				System.out.println("Man");
		
			}else if (gender.equals("F")) {
				System.out.println("Woman");
			
	
			
			}else {
			
		  if(gender.equals("F")) {
			System.out.println("Girl");
			
			}else if(gender.equals("M"))
			System.out.println("Boy");
			}
		 	}
		 
		}

	}
		

	


