package com.syntax.class11;

public class ClassPractice1 {

	public static void main(String[] args) {
		
		String text="Hello Syntax Students";
		String newText=text.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(newText);
		
	
	}
}
