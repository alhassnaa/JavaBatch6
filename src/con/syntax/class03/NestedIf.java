package con.syntax.class03;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean gotDiploma=false;
		int score=4;
		
	if(gotDiploma) {
			System.out.println("Congratulations");
			
		
		if (score>=3.5) {
			System.out.println("You are eligible for a shcolarship");
		
		}else {
				System.out.println("you should have studie harder");
			}
	}
		else {
		System.out.println("Get a degree");
	}
	}

}