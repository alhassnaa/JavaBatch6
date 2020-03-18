package com.syntax.class7;

public class JavaReviewClass {

	public static void main(String[] args) {
		//add even number
		//add odd number
		
		int evenSum=0;
		int oddsSum=0;
		for (int i=1;i<=50;i++) {
			if  (i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddsSum=oddsSum+i;
			}
		}
		System.out.println("Sum of evens "+ evenSum);
		System.out.println("Sum of odds "+ oddsSum);
	}
}

