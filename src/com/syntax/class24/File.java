package com.syntax.class24;

public  abstract class  File {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("Implimented edit method");
	}
	public void close() {
		System.out.println("Impelimented close method");
	}
}
	
class JavaFile extends File{
		@Override 
     public void open() {
			System.out.println("To open .java file we need notepad++ or sublime text");
		}
		
	}
 class WordFile extends File{
	 	@Override
		public void open() {
			System.out.println("to open .doc file we need Microsoft word to be installed");
		}
	}
 class PDFFile extends File{
	 	@Override
		public void open() {
			System.out.println("You need a PDF Reader");
		
	}
}
