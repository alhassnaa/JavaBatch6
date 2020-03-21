package com.syntax.class14;

public class Car {
	
	//defining feature of the car
	String make;
	String model;
	int year;
	String color;
	
	//define behavior
	void drive() {
		System.out.println(make+ " can drive");
	}
	void accelerate() {
		System.out.println(make+" can accelerate");
	}
	void makeNoise() {
		System.out.println(make+" make noise");
	}
	
	public static void main(String[] args) {
		//building individual object

		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.year=2019;
		car2.color="Pink";
		
		//print BMW
		System.out.println(car1.make);
		//I drive a pink Lamborghini
		System.out.println("I drive "+car1.color+" "+car1.make);
		
		//accessing behavior/methods of car1
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		//accessing behavior/methods of car1
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
	}

}
