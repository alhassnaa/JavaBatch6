package con.syntax.class03;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

	
		Scanner scan;
		String eval;
		char grade;
		
		scan=new Scanner(System.in);
	
		System.out.println("Please enter you grade:");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		
		case('A'):
			eval= "Excellent";
			break;
		
		case('B'):
			eval="Good";
			break;
		
		case('C'):
			eval="Average";
		break;
		
		case('D'):
			eval="Bad";
			break;
			
			default:
				eval="Invalid";
			
		}
			System.out.println("Your grade is "+ eval);
		
	}

}




