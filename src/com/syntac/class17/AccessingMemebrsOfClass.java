package com.syntac.class17;

public class AccessingMemebrsOfClass {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.lastName="Hassna";
		emp.lastName="Faniri";
		emp.salary=90000;
		//emp.ssn=29380984;CE:feild ssn is not visible from a different class
	
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4();CE: method4 is not visible
		
	}	
}
