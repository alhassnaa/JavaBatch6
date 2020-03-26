package com.syntax.class15;

import java.util.Scanner;

public class HomeWork2 {
	
	Scanner scan=new Scanner(System.in);
	
		void createEmail() {
			String username;
			String lastname;
			String emaildomain;
		 
		 System.out.println("Please enter your user name");
		 username=scan.nextLine();
		 System.out.println("Please enter your last name");
		 lastname=scan.nextLine();
		 System.out.println("What is your email domain name");
		 emaildomain=scan.nextLine();
		  
		 System.out.println(username.concat(lastname)+"@"+emaildomain.concat(".com"));
	 		}
		
	

	public static void main(String[] args) {

		HomeWork2 obj= new HomeWork2();
		
		obj.createEmail();
		

		
	}

}
