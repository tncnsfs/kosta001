/*
 * 1. acount ���¿� ��� �м� 
 * 2. ���¿� ������ �����ϴ� ��ü�� 2�� ���� 
 * 
 * 3. �� ��ü���� ������ �ִ� ����� ������ ������ ��� ���� & Ŭ���� ����� 
 * 4. Ŭ������ ���Ͽ� ��ü�� ���� 
 * 5. ������ ��ü�� �ּҰ����� .�� ���Ͽ� �� ������ �޼ҵ带 ���
 * --------------------- 
 * acount ���� : 
 * 1. ���¸�(��������): 
 * 2. ���¹�ȣ: 
 * 3. ������: 
 * 4. �ܾ� 
 * --------------------- 
 * ���: 1. �Ա��Ѵ� 2. ����Ѵ�
 * ---------------------
 */
package kosta.oop;

import java.util.Scanner;

public class Acount {
	
	// ���¸� ���� ���� ���� 
	String name;
	String actNo;
	int value;


	public Acount(){}
	
	public Acount(String name, String actNo, int value) {
			this.name = name;
			this.actNo = actNo;
			this.value = value;
		}

	//	1. �Ա��Ѵ�
	public void sangtae(int amt) {
		
		value += amt;
		System.out.println("value=>" + value);

	}
	
	

	
//	 2. ����Ѵ�
	 int jineng() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("���: ");
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
