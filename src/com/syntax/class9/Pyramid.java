package com.syntax.class9;

public class Pyramid {
	
		public static void main(String[] args) {
			for(int r=1;r<=5 ;r++) {
		
			for(int e=1;e<=r;e++) {	
				System.out.print("*");
		}
					System.out.println();
			}
			for(int r=1;r<=4 ;r++) {
				
				for(int e=4;e>=r;e--) {	
					System.out.print("*");
			}
						System.out.println();
		}
}}