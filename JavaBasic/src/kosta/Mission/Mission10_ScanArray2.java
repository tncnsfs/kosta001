package kosta.Mission;

import java.util.Scanner;

public class Mission10_ScanArray2 {

	public static void main(String[] args) {
		mission10_01query();
	}

	
	static void mission10_01query() {

//		--------------------------------------		

		Scanner sc = new Scanner(System.in);

		String subject[] = {"국어", "영어", "수학", "총점", "평균"};
		int arr[][] = new int[3][5];
		
		
		
		//배열 초기화 
		for(int i=0; i<arr.length; i++){
			for(int j = 0; j<3; j++){
				System.out.print("학생" + (i+1) + subject[j] + "입력: ");
				arr[i][j] = sc.nextInt();
//				--------------------------------------
				arr[i][3] += arr[i][j];
			}
//			--------------------------------------
			arr[i][4] = arr[i][3]/3;
		}
		
		
		
//		--------------------------------------
		// 평균이 높은 사람을 기준으로 출력하기 
//		for(int i=0; i<arr.length; i++){
//			for(int j=i+1; j<arr.length; j++){
//				if(arr[i][4]<arr[j][4]){
//					int temp[];
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
		
		// 과목명 출력하기 
		//		--------------------------------------		
		for(String s : subject){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		// 점수 출력하기 
//		--------------------------------------		

		for(int i =0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
//		--------------------------------------		
	}
	
	
}
