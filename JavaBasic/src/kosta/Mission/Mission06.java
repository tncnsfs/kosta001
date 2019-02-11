package kosta.Mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// for/Switch/Scanner 를 사용한 문제
		// keyboard 를 1~4까지 입력 받는다.
		// 1. 추가 2. 전체출력 3. 검색 4. 종료 => 콘솔출력
		// 입력: 1
		// 추가기능이 선택
		// 입력: 3
		// 검색기능이 선택
		// 입력: 4
		// 프로그램이 종료
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true){
//			System.out.println("1. 추가  2. 전체출력  3. 검색  4. 종료");
//			System.out.print("입력: ");
//			
//			String menu = sc.nextLine();
//			switch (menu) {
//			case "1":
//				System.out.println("추가 선택");
//				break;
//			case "2":
//				System.out.println("출력 선택");
//				break;
//			case "3":
//				System.out.println("검색 선택");
//				break;
//			case "4":
//				System.out.println("프로그램 종료");
//				return;
//
//			}
//		}
		
//		--------------------------------------

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("1. 추가  2. 전체출력  3. 검색  4. 종료");
		 System.out.print("입력: ");
		 num = sc.nextInt();

		for (;num!=4;) {
			System.out.println("1. 추가  2. 전체출력  3. 검색  4. 종료");
			System.out.print("입력: ");
			
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("추가기능이 선택 되었습니다.");
				break;
			case 2:
				System.out.println("전체 출력 되었습니다");
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
