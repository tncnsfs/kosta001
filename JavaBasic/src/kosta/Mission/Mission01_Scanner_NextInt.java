package kosta.Mission;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Mission01_Scanner_NextInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		
		// �̸�, ����, �ּ�, ��ȭ��ȣ
		// ������ ���Ӱ� ��� 
//		
//		String name = "kevin";
//		int age = 29;
//		String add = "Seoul";
//		String phone = "010-2414-2026";
		
		
//		System.out.println("MyNameIs =>" + name);
//		System.out.println("MyAgeIs =>" + age);
//		System.out.println("MyaddressIs =>" + add);
//		System.out.println("MyphoneNumberIs =>" + phone);

		
		
	}
}
