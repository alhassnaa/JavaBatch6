package com.syntax.class11;

public class StringVAlidation {

	public static void main(String[] args) {

String str1="Welcome Syntax students";
		
		String str2="Welcome Syntax Students";
		
		//to compare 2 Strings 
		System.out.println("----- equals() equalsIgnoreCase() FUNCTION -----");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";
		String actual="   Home - Syntax Technologies ";
		
		//
		if(actual.equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		System.out.println("--- FIRST TRIM AND THEN COMPARE ---");
		
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		String browser="CHROME";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		//OR
		
		if(browser.toLowerCase().equals("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		String message="Welcome Admin";
		
		//verify that message contains username which is Admin
		System.out.println("----- contains FUNCTION -----");
		System.out.println(message.contains("Admin"));
		
		boolean flag=message.contains("welcome");
		System.out.println(flag);
		
		//we want to see if welcome starts with Welcome
		System.out.println("----- startsWith() FUNCTION -----");
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		//we want to verify that welcome message ends with username
		System.out.println("----- endsWith() FUNCTION -----");
		String username="Admin";
		
		boolean ends=message.endsWith(username);
		System.out.println(ends);
	}
}

		
	



		
		
		