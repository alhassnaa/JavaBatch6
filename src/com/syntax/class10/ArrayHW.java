package com.syntax.class10;

public class ArrayHW {

	public static void main(String[] args) {
		//HM2-1st way:
		String[] names=new String[8];
		
		names[0]="Abdullah";
		names[1]="Aaron";
		names[2]="Gulen";
		names[3]="Ismail";
		names[4]="Hassna";
		names[5]="Mehmet";
		names[6]="Shaista";
		names[7]="Alibay";
		
		System.out.println(names[4]);
		
		System.out.println("*******2nd way**********");
		
		String[]names1= {"Abdullah","Aaron","Gulen","Ismail","Hassna","Mehmet","Shaista","Alibay"};
		
		System.out.println(names1[4]);
		
	}

}
