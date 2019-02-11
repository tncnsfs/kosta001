/*
 * 1. acount 상태와 기능 분석 
 * 2. 상태와 내용을 구현하는 객체를 2개 생성 
 * 
 * 3. 그 객체들이 가지고 있는 공통된 데이터 구조와 기능 추출 & 클래스 만들기 
 * 4. 클래스를 통하여 객체를 생성 
 * 5. 생성된 객체의 주소값으로 .을 통하여 그 변수와 메소드를 사용
 * --------------------- 
 * acount 상태 : 
 * 1. 계좌명(개설은행): 
 * 2. 계좌번호: 
 * 3. 예금주: 
 * 4. 잔액 
 * --------------------- 
 * 기능: 1. 입금한다 2. 출금한다
 * ---------------------
 */
package kosta.oop;

import java.util.Scanner;

public class Acount {
	
	// 상태를 위한 변수 생성 
	String name;
	String actNo;
	int value;


	public Acount(){}
	
	public Acount(String name, String actNo, int value) {
			this.name = name;
			this.actNo = actNo;
			this.value = value;
		}

	//	1. 입금한다
	public void sangtae(int amt) {
		
		value += amt;
		System.out.println("value=>" + value);

	}
	
	

	
//	 2. 출금한다
	 int jineng() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("출금: ");
		int amt = sc.nextInt();
		
		 if(value < amt)
		 return 0;
		 
		value -= amt; 
		System.out.println(value);
		return value;
		
	}
	 
	 

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Acount [value=" + value + "]";
	}
	 
}
