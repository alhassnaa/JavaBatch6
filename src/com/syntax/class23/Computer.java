package com.syntax.class23;

public class Computer {

	String brand;
	Computer(String brand) {
		this.brand = brand;
	}
	public void display() {
		System.out.println("My computer brand is: " + brand);
	}
	public void memory() {
		System.out.println(brand + " has 2GB memory.");
	}
}
class Apple extends Computer {
	Apple(String brand) {
		super(brand);
	}
	@Override
	public void memory() {
		System.out.println(brand + " has 4GB memory.");
	}
	public void work() {
		System.out.println(brand + " works very good.");
	}
}
class Lenovo extends Computer {
	Lenovo(String brand) {
		super(brand);
	}
	@Override
	public void memory() {
		System.out.println(brand + " has 6GB memory.");
	}
	public void performance() {
		System.out.println(brand + " has an average performance.");
	}
}
class HP extends Computer {
	HP(String brand){
		super(brand);
	}
	@Override
	public void memory() {
		System.out.println(brand + " has 8GB memory.");
	}
	public void model() {
		System.out.println(brand + " has many different models");
	}
}
class Dell extends Computer {
	Dell(String brand){
		super(brand);
	}
	@Override
	public void memory() {
		System.out.println(brand + " has 16GB memory.");
	}
	public void customization() {
		System.out.println(brand + " can build computer as per user specifications");
	}
}