package com.syntax.class24;

public class Final {
	
	boolean c;
	
	public final void fnalMethod(boolean c){
		  System.out.println("Final method with boolean parameter");
		  }
		  public final void finalMethod(String a) {
		    System.out.println("Final method with String parameter");
		  }

	public static void main(String[] args) {
		
		Final obj = new Final();
		obj.fnalMethod(true);
		obj.finalMethod("hello");
	}
	

}
