package team.hw;

public interface Shape {
	void calculateArea();
	void calculatePerimeter();
}

class Circle implements Shape{
	
	public void calculateArea() {
		System.out.println("Circle area calculation ==> π (radius)2 ");
	}
	public void calculatePerimeter() {
		System.out.println("Circle prerimeter calculation ==> 2 * π * R ");
	}
	
}
class Square implements Shape{
	
	public void calculateArea() {
		System.out.println("Square area calculation ==> length2 ");
	}
	public void calculatePerimeter() {
		System.out.println("Square perimeter calculation ==> length of one side multiplied by 4 ");
	}
}

