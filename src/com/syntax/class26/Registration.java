package com.syntax.class26;

public class Registration {
	private String email;
	private String userName;
	private String passWord;
	
	public String getEmail(String email) {
		if(!email.isEmpty()&& email.endsWith("yahoo.com")) {
		this.email=email;
		}
		return email;
	}
	
	public String getUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {	
		this.userName=userName;
		} 
		return userName;
	}
	
	public String getPassWord(String passWord) {
		if(!passWord.isEmpty() && passWord.length()>6 && (!passWord.contentEquals(userName))){
		
		this.passWord=passWord;
		}
		return passWord;
	}
}
		
	