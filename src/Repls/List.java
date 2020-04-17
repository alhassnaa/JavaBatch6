package Repls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List {
	
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0 ; i < 5 ; i++){
		    array.add(scan.nextInt());
		}
		System.out.println(array);
		scan.close();
	}
}