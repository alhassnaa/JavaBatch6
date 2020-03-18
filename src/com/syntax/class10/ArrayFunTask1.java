package com.syntax.class10;

public class ArrayFunTask1 {

	public static void main(String[] args) {
    //1=Create an array of sport teams. While retrieving 
	//all values from an array print one player for each
	//team. (use 2 different loops)
	
	String[] sports= {"Soccer","Tennis","Basketball","Boxing"};
	for(int i=0;i<sports.length;i++) {
	switch (sports[i]) {
	case "Soccer":
		System.out.println("Best Soccer player is "+"Ronaldo");
		break;
	case "Tennis":
		System.out.println("Best Tennis player is "+"Federar");
		break;
	case "Basketball":
		System.out.println("Best Basketball player is "+"Jordan");
		break;
	case "Boxing":
		System.out.println("Best Boxing player is "+"Mohammed Ali");
		break;
	}
	}
	System.out.println("****************2nd way**************************");
	
	for(String game:sports) {
		if(game.contentEquals("Soccer")) {
			System.out.println("Best Soccer player is "+"Ronaldo");
		}else if(game.contentEquals("Tennis")) {
			System.out.println("Best Tennis player is "+"Federar");
		}else if(game.contentEquals("Basketball")) {
			System.out.println("Best Basketball player is "+"Federar");
		}else if(game.contentEquals("Boxing")) {
		System.out.println("Best Boxing player is "+"Mohammed Ali");
	
	}	
		}
	
	}
}

