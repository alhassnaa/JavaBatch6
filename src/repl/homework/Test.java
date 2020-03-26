package repl.homework;

public class Test {
	
	void text(String a) {
		
		char[] b = a.toCharArray();
		
 		String reverse = "";
 		
 		for (int i = b.length - 1; i >= 0; i--) {
 			reverse += b[i];
 		}

 		if (reverse.equalsIgnoreCase(a)) {
 			System.out.println("Word is palindrome");
 		
 		} else {
 			System.out.println("Word is not palindrome");
		
 		}
	}
	
		 public static void main(String[] args) {
			 Test obj=new Test();
			 
			 obj.text("hassna");
		
	}

}