package kosta.oop;

public class Book1 {

	String bookName;
	int price;
	int dc_price;

	public Book1() {}

	public Book1(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.dc_price = dc_price;
	}

	public void disCount(){
		if(price >= 30000){
			dc_price = (int)(price * 0.75); 
			
		}else if(price >= 20000){
			dc_price = (int)(price * 0.8); 
		}else if (price >= 15000){
			dc_price =(int)(price * 0.85);
		}
	}
	
	public void printBook1(){
		
		System.out.println(bookName + 
									"교재 정가는" + price + "원 할인 된 가격은" 
									+ dc_price + "원 입니다.");
	}

}
