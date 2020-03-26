package repl.homework;

public class ClassHw {
	
	void num(int a, int b) {
		
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
	}
	

	public static void main(String[] args) {
		
		ClassHw obj= new ClassHw();
		
		obj.num(10, 0);
		
	}

}
