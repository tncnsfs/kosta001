package kosta.oop;

public class BookExam {

	public static void main(String[] args) {
		
//		book.java = book.addBook((1-0.25), book.java);
		Book book = new Book(30000, 25000, 15000);
		
		
		double addbook = book.addBook((1-0.25), book.java);
		double addbook1 = book.addBook((1-0.2), book.jsp);
		double addbook2 = book.addBook((1-0.15), book.oracle);
		
		System.out.println("JAVA����� ������" +book.java + "�� " + "\n"
				+ "���ε� ������"  + addbook);

		System.out.println("JSP����� ������" +book.jsp + "�� " + "\n"
				+ "���ε� ������"  + addbook1);
		
		System.out.println("JAVA����� ������" +book.oracle + "�� " + "\n"
				+ "���ε� ������"  + addbook2);
		
		
	}

}
