package kosta.oop;

public class Book {
	
	
	int java; 
	int jsp;
	int oracle; 
	
	
	public Book(){}

	public Book(int java, int jsp, int oracle) {
		this.java = java;
		this.jsp = jsp;
		this.oracle = oracle;
	}
	
	double addBook(double discount, double num){
		double result = num  * discount;
		
		return result;
		
	}
	
	
	
	
	
	
	
	
}
