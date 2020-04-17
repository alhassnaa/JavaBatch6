package com.syntax.class18;

public class Task3 {
	Task3(){
		System.out.println("default is: Hello");
	}
	 protected Task3(int a) {
		System.out.println("Protected is: "+a);
	}
	 private Task3(String str) {
		System.out.println("Private is: "+str);
	}
	 public Task3(char c) {
		 System.out.println("Public is: "+c);
	 }
	public static void main(String[] args) {
		Task3 obj=new Task3();
		Task3 obj1= new Task3(12);
		Task3 obj2= new Task3("World");
		Task3 obj3= new Task3('A');
	}

}
