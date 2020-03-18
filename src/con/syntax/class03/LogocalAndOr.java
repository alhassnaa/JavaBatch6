package con.syntax.class03;

public class LogocalAndOr {

	public static void main(String[] args) {
		
		/* if declared number is
		* between 1 -10 --> this number is small
		* between 11-100 --> this is big number
		* between 101 - 1000 --> this is large number
		*/

		int num=7;
		
		if (num>=1 && num<=10 ) {
		 System.out.println("This number is small");

		}else if (num>10 && num<=100) {
		System.out.println("This is a big number");
		
		}else if (num >100 && num<=1000) {
		System.out.println("This is a large number");
		
		}else {
		System.out.println("Number is super large");
		}
		System.out.println("----------------------------------------");
		
		String day1="Thursday";
		
		if (day1.equals("Tuesday")|| day1.contentEquals("Wednesday")) {
			System.out.println("Today is SDLC CLass");
		}else if (day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
			System.out.println("Today is Java Class");
		}else if (day1.contentEquals("Monay") || day1.equals("Friday")) {
			System.out.println("Tday isno class, it's a day off");
		}else if (day1.equals("Thursday")) {
			System.out.println("It's a review class");
			
		}else {
			System.out.println("Invalid day");
		}
				
}
}