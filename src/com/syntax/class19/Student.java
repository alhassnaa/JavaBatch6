package com.syntax.class19;

public class Student {
	
	String name;
	String address;
	
	 Student(String name, String address){
		 this.name=name;
		 this.address=address;
		 
	}
	 public void displayInfo() {
		 System.out.println("My name is "+name+" And I live in "+address);
	 }
	
	public static void main(String[] args) {

		Student obj=new Student("Hassna","Fairfax");
		obj.displayInfo();
		
	}
	
	}


