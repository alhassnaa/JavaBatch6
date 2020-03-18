package com.syntax.class10;

public class ArraysInClassPractice2 {

	public static void main(String[] args) {

	//HW1-1st way:
		char[]result= new char [6];
		
		result[0]='A';
		result[1]='B';
		result[2]='C';
		result[3]='D';
		result[4]='E';
		result[5]='F';
		
		System.out.println(result[2]);
		
		System.out.println("***********2nd way********");
		
		char[]results= {'A','B','C','D','E','F'};
		
		System.out.println(results[2]);
		
	}
}

