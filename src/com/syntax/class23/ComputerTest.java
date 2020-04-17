package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {

		Computer apple = new Apple("Apple");
		Computer lenovo = new Lenovo("Lenovo");
		Computer hp = new HP("HP");
		Computer dell = new Dell("Dell");
		Computer[] comp = { apple, lenovo, hp, dell };
		for (Computer c : comp) {
			c.display();
			c.memory();
}
	}
}