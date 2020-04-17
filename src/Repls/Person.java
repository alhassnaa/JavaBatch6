package Repls;

public class Person {
	
		private String firstname;
		private String lastname;
		private int birthmonth;
		private int birthday;
		private int birthyear;
		private String ssn;
		
	
		public Person(String firstname, String lastname,int birthday, int birthmonth, int birthyear,String ssn) {
			this.firstname=firstname;
			this.lastname=lastname;
			this.birthmonth=birthmonth;
			this.birthday=birthday;
			this.birthyear=birthyear;
			this.ssn=ssn;	
			
		}
		public String getfirstname() {
			return firstname;
		}
		public String getlastname() {
			return lastname;
		}
		public int getbirthmonth() {
			return birthmonth;
		}
		public int getbirthday() {
			return birthday;
		}
		public int getbirthyear() {
			return birthyear;
		}
		public String getssn() {
			return ssn;
		}
		public void setFirstname(String firstname) {
			System.out.println(firstname);
		}
		public void setlastname(String lastname) {
			System.out.println(lastname);
		}
		public void setSsn(String ssn) {
			System.out.println(ssn);
		}

		public void formatBirthday() {
			System.out.println(birthmonth+"/"+ birthday+"/"+birthyear);
		}
}
		
	