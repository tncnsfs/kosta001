package kosta.oop;

public class Book1Exam {

	public static void main(String[] args) {
//		Book1 book1 = new Book1("JAVA", 30000);
//		book1.disCount();
//		book1.printBook1();
		
		Book1[] arr = {new Book1("JAVA" , 30000),
								new Book1("JSP", 25000),
								new Book1("Oracle", 15000)};
		
		for(int i = 0; i<arr.length; i++){
			arr[i].disCount();
			arr[i].printBook1();
		}
		
		
	}

}
