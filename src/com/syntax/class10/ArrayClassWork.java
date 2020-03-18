package com.syntax.class10;

public class ArrayClassWork {

	public static void main(String[] args) {

		/*Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		String[] animals= {"Dog","Cat","Horse","Cow","Lion","Camel"};
		for(int i=0; i<animals.length; i++) {
		System.out.println(animals[i]+"");
		}
		System.out.println("*********second way********");
		
		String[] animals1=new String[6];
		animals1[0]="Dog";
		animals1[1]="Cat";
		animals1[2]="Horse";
		animals1[3]="Cow";
		animals1[4]="Lion";
		animals1[5]="Camel";
		
		System.out.println(animals1[0]+" "+animals1[1]+" "+animals1[2]+" "+animals1[3]+" "+animals1[4]+" "+animals1[5]);
		}
		
	}


