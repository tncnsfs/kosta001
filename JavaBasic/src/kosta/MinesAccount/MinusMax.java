package kosta.MinesAccount;

import java.util.Scanner;

public class MinusMax {
	
	// 필드값 입력 
	
	String id, name, test;
	MinusAccount arr[];
	double value;
	int count;
	
	
	public MinusMax() {}

		public MinusMax(String id, String name, MinusAccount[] arr, double value, int count) {
		super();
		this.id = id;
		this.name = name;
		this.arr = arr;
		this.value = value;
		this.count = count;
	} 
	
	
	// 메소드 만들기 
		
		public String getId() {
		
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public MinusAccount[] getArr() {
			return arr;
		}

		public void setArr(MinusAccount[] arr) {
			this.arr = arr;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		void printMinus(){

			for(int i = 0; i<arr.length; i++){
				arr[i].id = sc.nextLine();
				arr[i].accountNo = sc.nextLine();
				arr[i].balance = sc.nextDouble();
			}
			
			for(int i = 0; i<arr.length; i++){
			System.out.println("arr[i].id" + arr[i].id
						+ "arr[i].accountNo" + arr[i].accountNo
						+ "arr[i].balance" + arr[i].balance
						+ "");
			}
		}

		
		
		
		
}
