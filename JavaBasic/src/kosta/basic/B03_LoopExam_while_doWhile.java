package kosta.basic;

import java.util.Scanner;

public class B03_LoopExam_while_doWhile {

	public static void main(String[] args) {
// while: (세로) 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향 표현  
		
		
		int cnt = 0; 
		while (cnt < 11) {
			System.out.println("cntStar"+ cnt);
			cnt++;
		}
		System.out.println("cntDone");
		
//		-------------------------------------
		// 1에서 10까지의 합 구하기 
		int i = 0; 
		int sum = 0;
		while (i<=10){
//			sum = i + sum;
			sum += i;
			i++;
		}
		System.out.println("1에서 10까지의 합:" + sum);
		
//		while문-------------------------------------

		//구구단 7단 출력
		// 7*1 = 7
		// 7*9 = 63
		
//		int gugu = 7;
//		int num = 0;
//		while (num <9) {
//			num++;
//			int gugudan = gugu * num;
//			System.out.println("7단 구구단 값은"+ gugudan);
//		}
		
		int i01 =1;
		while(i01 <=9){
			System.out.println("7 *" + i01 + "= " + 7*i01);
			i01++;
		}
//		-------------------------------------
			// do while : 명령문을 먼저 실행후 조건을 비교 => 적어도 1번은 실행 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수 합 구하기");
		
		int n; 
		
		do{
			System.out.print("입력: ");
			n = sc.nextInt();
		}while(n<=0);
		
		int i02 = 1;
		int sum02 = 0;
		while(i02<=n){
			sum02 += i02;
			i02++;
		}
		
		System.out.println(n + "까지 합: " + sum02);
		
		// 문제: 키보드로부터 숫자 입력을 받아 합을 구하자. 
		// 음수를 입력하면 새롭게 다시 입력을 받는다. (양의 정수만 가능.)
		// -7 => 다신 입력 받기 
		// 10 => 55 출력 
		
//		----------------------------------------------------
// do~ while 문에서 10의자리 숫자만나오게 하라 
		
		/*		Scanner sc = new Scanner(System.in);
				
				int n; 
				
				do{
					System.out.println("입력: ");
					n = sc.nextInt();
					
				}while(n<10||n>99);
				System.out.println(n);*/
		

		
	}
}
