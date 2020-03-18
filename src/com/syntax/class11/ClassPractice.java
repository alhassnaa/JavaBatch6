package com.syntax.class11;

public class ClassPractice {

	public static void main(String[] args) {
/**Create an array of cars : american, german, korean, italian.
 *  Then retrieve all values from that array using 2 different loops
 */
		String [][] cars= {
				{"lincoln","ford","chevrolet"},
				{"MBW","mercedes"},
				{"kia","hyundai"},
				{"ferrari","alfa romeo"}
				
		};
		for(String[]brand:cars) {
			for(String model:brand) {
	
		System.out.print(model+" ");
			}
			System.out.println();
	}
System.out.println("*********************************************");

	String [][] countries= {
		{"Canada","USA"},
		{"Mexico","Brazil"},
		{"France","Italy"},
		{"Korea","India"},
		{"Morocco","South Africa"}
		
	};
		for(String[]name:countries) {
			for(String x:name) {

			System.out.print(x+" ");
	}
			System.out.println();
}	
		int sum = 0;
		
		for(int i = 0; i < countries.length; i++) {
			for(int j = 0; j < countries[i].length; j++) {
				sum++;
			}
		}
		System.out.println(sum);








}
}