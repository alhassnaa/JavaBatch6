package com.syntax.class11;

public class More2Darrays {

	public static void main(String[] args) {

		String[][] professions= {
				{"QA Tester", "Developers", "Product Owner", "Scrum Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher"},
				{"Dentist", "Surgeon"}
		};
		
		//get elements using advanced for loop
		
		for(String[] occupation:professions) {
			for(String title:occupation) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
		
	}
}

		
		
		
	
