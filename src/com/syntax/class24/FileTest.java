package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File obj=new JavaFile();
		obj.close();
		obj.edit();
 		obj.open();
		
		File obj1=new WordFile();
		obj.close();
		obj.edit();
		obj.open();
		
		File obj2=new PDFFile();
		obj2.close();
		obj.edit();
		obj.open();
	}

}
