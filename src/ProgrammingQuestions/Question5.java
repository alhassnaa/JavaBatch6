package ProgrammingQuestions;

public class Question5 {

	public static void main(String[] args) {
		
		String text="cloudy day";
		
		char[] chars= text.toCharArray();
		
		int length= chars.length;
		
		for(int i=length-1;i>=0;i--) {
		
		System.out.print(chars[i]);
	
		}
		
		System.out.println("*************Ahmet version*********");
		
		//Ahmet
		String name=" We are studying java";
		String newName[]=name.split(" ");
		for (int i=newName.length-1;i>=0;i--) {
			System.out.print(newName[i]+" ");
		}
		System.out.println("**********Mehmet version***********");

		//		5.Write a java program to reverse String? Reverse a string word by word?
		System.out.println("---------------To reverse a string-----------------");
		
		String item = "Hello World of Java teach a lot to us";
		for (int i = item.length() - 1; i >= 0; i--) {
			System.out.print(item.charAt(i));
		}
		System.out.println(" ");
		
		System.out.println("---------------Reverse a string word by word-----------------");
		
		String[] array = item.split(" ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	
	System.out.println("******************Asel version****************");
	
	String given="I love java";
		String reversed="";

		for(int i=given.length()-1; i>=0; i--) {
			reversed=reversed+given.charAt(i);
		}

		System.out.println("Reversed String = "+reversed);

		String[] array1=given.split(" ");
		String reverseWords="";

		for(int i=array1.length-1; i>=0; i--) {
			reverseWords=reverseWords+array1[i]+" ";
		}

		System.out.println("Reversed String word by word= "+reverseWords);
	}
	
	
	}
	

	

	
	
	
	
	
	
	
	
	
