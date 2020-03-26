package repl.homework;

public class ClassHome2 {
	//Write a method to return whether given number is prime or not?
	
	
	void num(int a) {
		
		for(int i=2;i<=a/2;i++) {
		
			if(a%2==1) {
				System.out.println("It's a prime number");
			}else {
				System.out.println("Not a prime number");
			}
		}
	
	}
	public static void main(String[] args) {

		ClassHome2 obj=new ClassHome2();
		
		obj.num(17);
		
	}

}
