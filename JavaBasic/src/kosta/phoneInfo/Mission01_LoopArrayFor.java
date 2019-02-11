package kosta.phoneInfo;

import java.util.Scanner;

public class Mission01_LoopArrayFor {

	// 필요한 변수 or 배열 1차원 2차원 선언

	static int count;
	static int[][] arr = new int[5][5];
	static String[] names = new String[5];
	static String subject[] = { "이름", "국어", "영어", "수학", "총점", "평균" };

	// 2. 2-1 메소드설정 => 1번 추가, 2번 전체출력, 3번 검색, 4번 삭제 5. 종료

	static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		names[count] = sc.nextLine();

		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i + 1] + "입력: ");
			System.out.println("i=>" + i);
			
			arr[count][i] = sc.nextInt();

			arr[count][3] += arr[count][i];
		}
		arr[count][4] = arr[count][3] / 3;
		System.out.println("평균점수: " + arr[count][4]);
		System.out.println("count=>"+count);
		count++;
		System.out.println();
	}

	// -------------------------------------------------

	static void print() {

		for (String s : subject) {
			System.out.print(s + "\t");
		}
		System.out.println();
		System.out.println();
		// -------------------------------------------------

		for (int i = 0; i < count; i++) {
			System.out.print(names[i] + "\t" );
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
			System.out.println();
		}

	}

	// -------------------------------------------------
	// static int count;
	// static int[][] arr = new int[5][5];
	// static String[] names = new String[5];
	// static String subject[] = { "이름", "국어", "영어", "수학", "총점", "평균" };

	static void search() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("검색 입력: ");
		String name = sc.nextLine();
		int index = -1;
		
		for(int i =0; i<count; i++){
			if(name.equals(names[i])){
				index = i;
			}
		}
		
		
		if (index == -1){
			System.out.println("대상을 찾을수 없습니다.");
		}else {
			for(String s : subject){
				System.out.print(s + "\t");
			}
			System.out.println();
			System.out.print(name + "\t");
			for(int i =0; i<5; i++){
				System.out.print(arr[index][i] + "\t");
			}
			System.out.println();
		}
	}
	// -------------------------------------------------
	static void delete() {

	}

	// -------------------------------------------------
	static void end() {

	}

	// -------------------------------------------------
	public static void main(String[] args) {

		// 1. Scanner
		// - switch,for, ifElse,while,doWhile
		// 2. 1번 추가, 2번 전체출력, 3번 검색, 4번 종료
		// -------------------------------------------------
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. 추가	2. 전체출력	3. 검색	4. 삭제	5. 종료");
			System.out.println();
			System.out.print("입력: ");
			// System.out.println();

			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.println("추가 선택 기능이 활성화 되었습니다");
				add();
				break;

			case "2":
				System.out.println("출력 선택 기능이 활성화 되었습니다");
				print();
				break;

			case "3":
				// System.out.println();
				System.out.print("검색 선택 기능이 활성화 되었습니다");
				search();
				break;

			case "4":
				System.out.println("삭제 기능이 활성화 되었습니다");
				delete();
				break;

			case "5":
				System.out.println("프로그램 종료 기능이 활성화 되었습니다");
				end();
				return;
			}
		}
		// -------------------------------------------------

	}
}
