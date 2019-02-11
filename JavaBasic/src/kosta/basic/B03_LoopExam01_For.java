package kosta.basic;

import java.util.Scanner;

public class B03_LoopExam01_For {
	public static void main(String[] args) {
		
		
		
//		-------------------------------------
//		 for문 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평방향 표현  
		
//		for(int i =1; i<=10; i++){
//			System.out.println(i);
//		}
//		
//		int sum = 0;
//		for(int i =1; i<=10; i++){
//			sum += i;
//			System.out.println(sum);
//		}
		
//		--------------------------------------
//		for문 에서 홀수만 출력 -> 1에서 10사이 
		
		for (int i= 1; i<=10; i++){
//			System.out.println(i);
			if(i%2 == 0)
				continue; 
			System.out.println(i);
		}
		
	}
}
