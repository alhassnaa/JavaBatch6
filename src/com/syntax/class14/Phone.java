package com.syntax.class14;

public class Phone {

	String size;
	int price;
	String brand;
	
	void dial() {
		
		System.out.println(brand+" can dial");
	}
	void text(){
		System.out.println(brand+" can text");
	}
	void pics(){
		System.out.println(brand+"can take pics");
	}


	public static void main(String[] args) {
		
		Phone iPhone= new Phone();
		iPhone.brand="iPhone";
		iPhone.size="Different sizes";
		iPhone.price=1000;
		
		iPhone.dial();
		iPhone.text();
		iPhone.pics();
		
		Phone Android= new Phone();
		Android.brand="Android";
		Android.size="Few sizes";
		Android.price=800;
		
		Android.dial();
		Android.text();
		Android.pics();
		
		Phone Nokia= new Phone();
		Nokia.brand="Nokia";
		Nokia.size="Obsolete";
		Nokia.price=50;
	
		Nokia.dial();
		Nokia.text();
		Nokia.pics();
	}
	
}
