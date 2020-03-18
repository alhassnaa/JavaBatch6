package com.syntax.class7;

public class JavaReview2 {

	public static void main(String[] args) {
	
			
			int evenSum=0;
			
			int oddSum=0;
			
			for (int num=1;num<=50;num++) {
				
			if  (num%2==0) {
				evenSum=evenSum+num;
				
			}else {
				oddSum=oddSum+num;
			}
		}
			System.out.println("Sum of even "+ evenSum);
			
			System.out.println("Sum of odd "+ oddSum);
		
	}
}


