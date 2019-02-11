// 숙제 => 2차원 배열 마스터,, 1차원 최소한 마스터 

// for/Switch/Scanner 를 사용한 문제
// keyboard 를 1~4까지 입력 받는다.
// 1. 추가 2. 전체출력 3. 검색 4. 종료 => 콘솔출력
// 입력: 1
// 추가기능이 선택
// 입력: 3
// 검색기능이 선택
// 입력: 4
// 프로그램이 종료
package kosta.Mission;

import java.util.Scanner;

public class Mission10_ArrayScanSearchAdd {

	static int count; 
	static int[][] arr = new int[5][5];
	static String[] names = new String [5];
	static String subject[] = {"이름","국어", "영어", "수학", "총점", "평균"};
	
	public static void add(){
		System.out.print("이름 입력: ");
		Scanner sc = new Scanner(System.in);
		names[count] = sc.nextLine();
		for(int i=0; i<3; i++){
			System.out.print(subject[i+1] + " 입력: ");
			arr[count][i] = sc.nextInt();
			arr[count][3] += arr[count][i];
		}
		arr[count][4] = arr[count][3]/3;
		count++;
		
	}
	
	public static void print(){
		for(String s: subject){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		for(int i=0; i<count; i++){
			System.out.print(names[i] + "");
			for(int j= 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void search(){
		
	}

	
	
	public static void main(String[] args) {
		

		int num = 0;
//		System.out.println("1. 추가  2. 전체출력  3. 검색  4. 종료");
//		 System.out.print("입력: ");
//		 num = sc.nextInt();

		for (;num!=4;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1. 추가  2. 전체출력  3. 검색  4. 종료"); // 추가 삭제까지 포함한 숙제 ;
			System.out.println();
			
			System.out.print("입력: ");
			num = sc.nextInt();

			switch (num) {
			case 1:
//				System.out.println("추가기능이 선택 되었습니다.");
				add();
				//메소드 호출
//				--------------------------------------		
				
				break;
			case 2:
				System.out.println("전체 출력 되었습니다");
				print();
				System.out.println();
				break;
			case 3:
				System.out.println("검색 되었습니다");
				break;
			case 4:
				System.out.println("종료 되었습니다");
				break;
			}
		}
		
//		--------------------------------------
		
		
	
		
		
	}

}
