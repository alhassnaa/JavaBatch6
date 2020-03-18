package com.syntax.class10;

public class ArrayOfCoutries {

	public static void main(String[] args) {

		
		String[]countries= {"Morocco","Frence","Turkey","Spain"};
		for(String capital:countries) {
			
		if(capital.equals("Morocco")) {
			System.out.println(capital+" Rabat");
		
	}else if(capital.equals("France")) {
		System.out.println(capital+" Paris");
	}else if(capital.equals("Turkey")) {
		System.out.println(capital+" Ankara");
	}else if(capital.equals("Spain")) {
		System.out.println(capital+" Madrid");
	}
		}
System.out.println("*****************Switch*********8");
String[] countries1 = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
for (int y = 0; y < countries1.length; y++) {
            switch(countries1[y]) {
            
            case "USA":
                System.out.println("The capital is Washington DC");
                break;
            case "Poland":
                System.out.println("The capital is Warsaw");
                break;
            case "Ukraine":
                System.out.println("The capital is Kiev");
                break;
            case "Turkey":
                System.out.println("The capital is Ankara");
                break;
            case "Spain":
                System.out.println("The capital is Madrid");
                break;
            }
            
        }
		}}
















