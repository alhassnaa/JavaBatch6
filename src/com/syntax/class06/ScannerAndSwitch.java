package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {

		Scanner scan;
		int num;
		String day;
		
		scan=new Scanner(System.in);
		
		System.out.println("Input a number between 1-7");
		num=scan.nextInt();
		
		switch (num) {
		
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thursday";
			break;
		case 5:
			day="Friday";
		case 6:
			day="Saturday";
			break;
		case 7:
			day="Sunday";
			break;	
			
		default:
			day="Unknown";
		}
			System.out.println(day);
	}
		}

