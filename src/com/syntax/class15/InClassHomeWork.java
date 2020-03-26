package com.syntax.class15;

public class InClassHomeWork {
	
	
	void num(int a, int b) {
		
		if(a<b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("b is larger than a");
		}
	}

	public static void main(String[] args) {
		
		InClassHomeWork obj= new InClassHomeWork();
		
		obj.num(2,15);

	}

}
