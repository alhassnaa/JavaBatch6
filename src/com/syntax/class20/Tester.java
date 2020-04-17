package com.syntax.class20;

public class Tester extends ScrumTeam {
	
	void prioritizeBacklog() {
		System.out.println("productOwner");
	}
	void naviagteTeam() {
		System.out.println("ScrumMaster");
	}
	void coding() {
		System.out.println("Developer");
	}
	void tester() {
		System.out.println("Tester");
	}
	void businessAnalyst() {
		System.out.println("BusinessAnalyst");
	}

	public static void main(String[] args) {
	
		System.out.println("==Employee object=======");
		Employee emp=new Employee();
		emp.empNumber=12345;
		emp.salary=120000;
		emp.company="Syntax";
		emp.getPaid();
		emp.work();
		//Sub class properties are note available to Employee Base class
		System.out.println("===ScrumTeam Object==========");
		ScrumTeam st=new ScrumTeam();
		st.empNumber=12345;
		st.salary=120000;
		st.company="Syntax";
		st.ceremonies="Sprint Grooming";
		st.getPaid();
		st.work();
		st.attendMeetings();
		//This Sub class inherits properties from Employee Base class only
		System.out.println("===Tester Object==========");
		Tester tester=new Tester();
		tester.empNumber=12345;
		tester.salary=120000;
		tester.company="Syntax";
		tester.ceremonies="Sprint Grooming";
		tester.getPaid();
		tester.work();
		tester.attendMeetings();
		tester.tester();
		//This Sub class inherits properties from Employee Base class & ScrumTeam class only
	}
}
