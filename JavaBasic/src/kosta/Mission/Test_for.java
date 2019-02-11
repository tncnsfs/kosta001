package kosta.Mission;

import java.util.Scanner;

public class Test_for {

	public static void main(String[] args) {
		
		// 정수 값의 팩터리얼을 if/for문으로 구하기 
		// 택터리얼->Factorial 은 (팩토리얼이란 1부터 n까지의 정수를 모두 곱한 것을 말합니다.)
       // ex) 3!(3팩토리얼) = 1*2*3 = 6,  4! = 1*2*3*4 = 24입니다.
		// 입력 받은값의 팩터리얼 구하기 
		
		int num; 
		int Fnum =1;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		
		num = sc.nextInt();
		
		if( num != 0){
			for(int i =1; i<= num; i++){
//				Fnum = Fnum * num(i);
				Fnum *= i;
						
			}
			System.out.println("Factorial => "+  Fnum);
		}
		
		
		
		
		
		


		
	}

}
