package com.syntax.class16;

public class Students {
	//HM #2
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	

	public static void main(String[] args) {

		Students obj1=new Students();
		
		obj1.studentName="Hassna";
		obj1.studentID=10;
		obj1.numberOfStudents++;
		
       Students obj2=new Students();
		
		obj2.studentName="Lilyan";
		obj2.studentID=11;
		obj2.numberOfStudents++;
		
        Students obj3=new Students();
		
		obj3.studentName="Sofia";
		obj3.studentID=12;
		obj3.numberOfStudents++;
		
		System.out.println("the total number of students: "+numberOfStudents);

	}

}
