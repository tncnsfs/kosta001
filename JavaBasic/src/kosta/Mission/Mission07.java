package kosta.Mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// 난수를 이용하여 중복되지 않는 3개의 숫자를 출력하라.
		// 중복수는 안됨 113x , 123 o
		// 1-9 까지의 값을 가져오기

//		int num1 = 0;
//		int num2 = 0; 
//		int num3 = 0;
//		
//		num1 = (int)(Math.random()*9)+1;
//		
//		do{
//			num2= (int)(Math.random()*9)+1;
//		}while(num1 == num2);
//		
//		do{
//			num3= (int)(Math.random()*9)+1;
//		}while(num1==num3 || num2==num3);
//		
//		System.out.println(num1 + ":" + num2 + ":" + num3);
		
//		-------------------------------------
		// 피라미드 삼각형 찍기 -> 단수 입력후 출력 방식 
		
//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력: ");
//		num = sc.nextInt();
//		System.out.println(num);

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num -i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//		-------------------------------------
		
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드 모양으로 나타냅니다.");
		
		do{
			System.out.print("단수는 : ");
			num = sc.nextInt();
		}while(num <= 0);
		
		for(int i =1; i<= num; i++){
			for(int j = 1; j<=num-i; j++)
				System.out.print(' ');
			for(int j =1; j<=(i-1)*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
