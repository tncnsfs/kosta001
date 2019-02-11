package kosta.Mission;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Mission05_Loop_break {

	public static void main(String[] args) {
		// 정수 b에서 정수 a를 뺀 값을 구합니다 (b>a가 되도록 입력 받음) 
		//1. do~while, for/while 이용하여 풀기 
		//2. while(true), break 를 이용하여 풀기 
		

		Scanner sc = new Scanner(System.in);
		int a, b,c;
//		---------------------------------
		
		System.out.print("입력a: ");
		a = sc.nextInt();
		
		while(true){
			System.out.print("입력b: ");
			b = sc.nextInt();
			if(b>a)
				break;
		}
		System.out.println("b-a=" + (b-a));

		
		
		
//		---------------------------------
		
//		for(;a>b;){
//			System.out.println("입력b: ");
//			b = sc.nextInt();
//			
//			System.out.println("입력a: ");
//			a = sc.nextInt();
//
//			if(b>a)
//				break;
//		}
//		System.out.println("결과값은:" + (b-a));
		
		
//		---------------------------------

//		while (true) {
//			System.out.println("입력b: ");
//			b = sc.nextInt();
//			
//			System.out.println("입력a: ");
//			a = sc.nextInt();
//			if(b>a)
//				break; 
//		}
//		
//		System.out.println("결과값은" + (b-a));
		
		
//		---------------------------------

//		do{
//			
//			
//			System.out.println("입력: ");
//			b = sc.nextInt();
//			System.out.println(b);
//			
//			System.out.println("입력: ");
//			a = sc.nextInt();
//			System.out.println(a);
//			
//		}while(b<a);
//		
//		c = b-a;
//		System.out.println("do~while방식: b-a=>"+ c);
		
//		---------------------------------
		

			
			
	}

}
