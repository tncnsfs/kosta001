package kosta.Mission;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Mission05_Loop_break {

	public static void main(String[] args) {
		// ���� b���� ���� a�� �� ���� ���մϴ� (b>a�� �ǵ��� �Է� ����) 
		//1. do~while, for/while �̿��Ͽ� Ǯ�� 
		//2. while(true), break �� �̿��Ͽ� Ǯ�� 
		

		Scanner sc = new Scanner(System.in);
		int a, b,c;
//		---------------------------------
		
		System.out.print("�Է�a: ");
		a = sc.nextInt();
		
		while(true){
			System.out.print("�Է�b: ");
			b = sc.nextInt();
			if(b>a)
				break;
		}
		System.out.println("b-a=" + (b-a));

		
		
		
//		---------------------------------
		
//		for(;a>b;){
//			System.out.println("�Է�b: ");
//			b = sc.nextInt();
//			
//			System.out.println("�Է�a: ");
//			a = sc.nextInt();
//
//			if(b>a)
//				break;
//		}
//		System.out.println("�������:" + (b-a));
		
		
//		---------------------------------

//		while (true) {
//			System.out.println("�Է�b: ");
//			b = sc.nextInt();
//			
//			System.out.println("�Է�a: ");
//			a = sc.nextInt();
//			if(b>a)
//				break; 
//		}
//		
//		System.out.println("�������" + (b-a));
		
		
//		---------------------------------

//		do{
//			
//			
//			System.out.println("�Է�: ");
//			b = sc.nextInt();
//			System.out.println(b);
//			
//			System.out.println("�Է�: ");
//			a = sc.nextInt();
//			System.out.println(a);
//			
//		}while(b<a);
//		
//		c = b-a;
//		System.out.println("do~while���: b-a=>"+ c);
		
//		---------------------------------
		

			
			
	}

}
