package com.syntax.class14;

public class Dog {
	
	//define the feature of the dog
	String breed;
	String color;
	String name;
	int age;
	
	//define behavior
	//void bark() {
	//	System.out.println(breed+" can bark");
	//}
	//void run() {
	//	System.out.println(breed+" can run fast");
	//}
	//void play() {
	//	System.out.println(breed+" love to play");
	//}
	
	
	public static void main(String[] args) {
	 Dog dog1=new Dog();
	 dog1.breed="German Shepperd";
	 dog1.color="Brown";
	 dog1.name="Max";
	 dog1.age=2;
		
	 Dog dog2=new Dog();
	 dog2.breed="Shih tzu";
	 dog2.color="white";
	 dog2.name="snow";
	 dog2.age=1;
	
	 dog1.bark();
	 dog1.run();
	 dog1.play();
	 
	 dog2.bark();
	 dog2.run();
	 dog2.play();
	 
	}
	//define behavior
		void bark() {
			System.out.println(breed+" can bark");
		}
		void run() {
			System.out.println(breed+" can run fast");
		}
		void play() {
			System.out.println(breed+" love to play");
		}
		
}
