package kosta.Mission;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Mission01_Scanner_NextInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		
		// 이름, 나이, 주소, 전화번호
		// 변수에 대임과 출력 
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
