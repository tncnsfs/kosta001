
// CallByReference 를 구현하기 

	// 1. 중어, 영어, 국어 점수 배열 값 num에 입력받기 
		// 2. num 값을 CallByReference 방식으로 리턴값이 없게 출력하기 
			// 3. 중어, 영어, 국어 의 총점을 구하는 메스드 작성=> 리턴값 있음 
				// 4. 중영국어 의 편균 점수를 구하는 메서드 작성 => 리턴값 있음

package kosta.basic;

import java.util.Scanner;

public class B05_CallByReference {
	
	static int getAverage(int to1){
		
		int aver = to1/3;
		return aver;
		
	}
	//-------------------------------

	static int getTotal(int[] num){
		int to1 = 0; 
		
		for(int i =0; i<num.length; i++){
			to1 += num[i];
		}
		return to1; 
	}
	
	//-------------------------------
	
	static void getInput(int[] num1){
		
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num1.length; i++){
			num1[i] = sc.nextInt();
			
		}
	}
	//-------------------------------

	public static void main(String[] args) {
		
		int total,ave = 0;
		
		int num[] = new int[3];
		
		getInput(num);
		
		
		total = getTotal(num);
		ave = getAverage(total);
		
		System.out.println(total);
		System.out.println(ave);
		
		
	}

}
