package com.syntax.class10;

public class ArrayPractice2 {

	public static void main(String[] args) {
		/**Create an array on integers and calculate 
		 * the sum of all integer elements in an array.
		 */
		
		
		int[]num= {200,30,-1,900,56,787};
		
			int greatest=num[0];
			
				for(int i=0; i<num.length; i++) {
					if(num[i]>greatest) {
						greatest=num[i];
					}
		}
			System.out.println(greatest);
System.out.println("*********************************************");

		int[][] a1 = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
		};

		int greatest1=a1[0][0];
		for(int i=0 ; i< a1.length;i++) {
			for(int j=0; j< a1.length; j++)
			if(a1[i][j]>greatest1) {
				greatest1=a1[i][j];
			
			System.out.println(greatest1);
		}
		}
		System.out.println("*****8***********");
		
		
		int[][] a2 = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		
		int sum1=0;
		 for(int i=0; i<a2.length;i++) {
			for(int j=0;j<a2.length;j++) {
				 sum1--;
			 }
		 }
			 System.out.println(sum1);
			 
			 System.out.println("**************u**************");
			 
	}
			 }
	
			 
	
			 
			 
			 
			 
			 
			 
	 


