package com.syntax.class10;

public class ArrayFunTask2 {

	public static void main(String[] args) {
		
		String[] movies= {"Frozen","Maleficent","Dolittle"};
		for(int i=0;i<movies.length;i++) {
		switch (movies[i]) {
		case "Frozen":
			System.out.println("Movie Frozen was directed by "+"Chris Buck");
			break;
		case "Maleficent":
			System.out.println("Movie Maleficent was directed by  "+"Robert Stromberg");
			break;
		case "Dolittle":
			System.out.println("Movie Dolittle was directed by "+"Stephen Gaghan");
			break;
		}
		}
		System.out.println("****************2nd way**************************");
		
		for(String title:movies) {
			if(title.contentEquals("Frozen")) {
				System.out.println("movie Frozen is directed by "+"Chris Buck");
			}else if(title.contentEquals("Maleficent")) {
				System.out.println("movie Maleficent is directed by "+"Robert Stromberg");
			}else if(title.contentEquals("Dolittle")) {
				System.out.println("movie Dolittle is directed by "+"Stephen Gaghan");
			
		}	
		}
		
		}
	}