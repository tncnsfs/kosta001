package kosta.Mission;

import java.util.Scanner;

public class Mission09_Array {

	public static void main(String[] args) {
		// 국어, 영어, 수학 => int 배열
		// 총점, 평균 => int 배열
		// 국어, 영어, 수학 => String 배열 
		// 키보드 국어 점수 입력:  
		//키보드 영어 점수 입력:  
		//키보드 수학 점수 입력:  
		
		// 총점: 
		// 평균: 

		Scanner sc = new Scanner(System.in);
		
		String subject[] = {"국어","영어","수학"};
		int arr[] = new int[5];
		
		for(int i=0; i<3; i++){
			System.out.print(subject[i] + " 점수입력: ");
//			-----------------------------------

			arr[i] = sc.nextInt();
			
			// 총점구하기 
			arr[3] = arr[i] + arr[3];
//			arr[3] += arr[i];
		}

		// 평균 구하기 
		arr[4]= arr[3]/3;
//		-----------------------------------
		
		for(String s : subject){
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + "\t");
		}		
		
	}
}
