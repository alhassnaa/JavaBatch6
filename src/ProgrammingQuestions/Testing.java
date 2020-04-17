package ProgrammingQuestions;

public class Testing {

	public static void main(String[] args) {
		
		//Create a String that will hold a sentence.
		//Write a program to get a new String without any spaces.

		String text="Taday is a beautiful day";
		String space=text.replaceAll("\\s", "");
		
		System.out.println(space);
  	
		System.out.println("***********Task 2*******************");
		
		// Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		
		String sentence="2784^%&*life";
		
		//sentence=sentence.replace("[^A-Za-z]");
		
 		int num=sentence.length();
 		
 		System.out.println("# of alpha characters = "+num);

 	
 		System.out.println("*************Task 3*******************");
 		
 		//You have a String a=“Is it saturday? Is it raining? Do we have 
 		//a Java Class today?” How would you find out how many sentences are in that String?
 		
 		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
 		
 		
 		
}
	
}