package kosta.Mission;

import java.util.Scanner;

public class Mission07_Method {
	
//	------------------------------------------	
	static int getTotal(int[] arr){
		
		int total =0;
		for(int i=0; i<arr.length; i++){
			total += arr[i];
		}
		
		return total; 
	}
	
//	------------------------------------------	

	static int getAverage(int total){
		
		int aver = total/3;
		return aver ;
	}
//	------------------------------------------	

	static void getInput(int[] arr2){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		for(int i =0; i< arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
	}
	
//	------------------------------------------	


	public static void main(String[] args) {
		// 문제:
		// 1. 키보드로 부터 입력을 받는 메소드 만들기 => 이름 주의 
		// 2. 총점을 리턴하는 메소드 
		// 3. 평균값을 리턴하는 메소드 
		
		int kor , eng, mat = 0;
		int total, aver = 0;
		
		int arr[] = new int[3];
		
		getInput(arr);
		
		total = getTotal(arr);
		aver = getAverage(total);
		
		System.out.println("총점" + total);
		System.out.println("평균" + aver);
		
	}
}
