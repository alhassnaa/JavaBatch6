package com.syntax.class01;

public class SubstructionDivisionAddition {
	
	public static void main (String [] args) {
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
		
		double value1, value2, dev, sub, add, mult;
		
		 value1=7.99;
		 value2=3.10;
		
		mult=value1*value2;
		dev=value1/value2;
		add=value1+value2;
		sub=value1-value2;
		
		System.out.println("The addition of 2 numbers " +value1+ " and " +value2+ " is equal to " +add);
		System.out.println("The substraction of 2 numbers " +value1+ " and "+value2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+value1+ " and "+value2+ " is equal to "+mult);
		System.out.println("The division of 2 numbers "+value1+ " and "+value2+ " is equal to "+dev);
	}

}
 