package com.syntax.class06;

import java.util.Scanner;

public class HomeWork41 {

	public static void main(String[] args) {

		
		Scanner scan;
		String carMake;
		String origin;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your favorite car make");
		carMake=scan.nextLine();
		
		switch(carMake) {
		
		case "BMW":
			origin="german car";
			break;
			
		case "Toyota":
			origin="japanese car";
			break;
			
		case "Maserati":
			origin="italian car";
			break;
		
		default:
			origin="Unknown";
		}
		System.out.println("Your favorite car is "+origin);
	}

}
