package con.syntax.class03;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {

		
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please eneter your quiz score");
		int quiz=scan.nextInt();
		
		System.out.println("What is your midterm score");
		int midterm=scan.nextInt();
		
		System.out.println("What is your Final score");
		int Final=scan.nextInt();
		
		
		int score =(quiz+midterm+Final)/3;
		
		
		if(score>=90) {
			
			System.out.println("Your grade is A");
			
		}else if(score>=70 && score<90) {
			
			System.out.println("Your grade is B");

		}else if(score>=50 && score<70) {
			System.out.println("Your grade is C");

			
		}else {
			System.out.println("Your grade is D");
			
		}
		
	}

}
