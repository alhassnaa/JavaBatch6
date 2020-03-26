package com.syntax.class15;

public class CreatingMethods {
	
	
		
		char getGrade (int a) {
			char grade;
		
		if(a>90) {
          grade='A';	
          
		}else if(a<90 && a>80) {
			grade='B';
			
		}else if(a<80 && a>70) {
			grade='C';	
		
		}else if(a<70 && a >60) {
			grade='D';
			
		}else {
			grade='F';
		}
		return grade;
}
		public static void main (String[]args) {
			
			
			CreatingMethods obj=new CreatingMethods();
			
			char grade = obj.getGrade(90);
			System.out.println(grade);
			
			System.out.println(obj.getGrade(99));
		}
}