package com.syntax.class9;

public class NestedLoop1 {

	public static void main(String[] args) {
		
		for(int y=0;y<=23;y++){
		
			for(int i=0;i<=59; i++) {
				if(i<10) {
					System.out.println(y+":"+"0"+i);
				}else {
				System.out.println(y+":"+i);
			}
		}	
		
	}

}
}