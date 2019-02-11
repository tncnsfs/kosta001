package phoneArray_ksh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		// 1.추가 2. 전체출력 3. 종료
		// 1추가 하면 객체 생성->배열에 추가
		Scanner sc = new Scanner(System.in);
		Manager man = new Manager();
		while (true) {
		System.out.println("1.추가 2.전체출력 3.검색 4.수정 5. 삭제 6.정렬 (by이름) 7. 파일 저장 8. 파일 불러오기  9.종료 ");
		System.out.print("원하시는 기능의 번호를 입력하세요 : ");

		input = sc.nextInt();
			switch (input) {
			case 1:
				//man.addPhoneInfo();
				man.addInformation();
				break;
			case 2:
	
				man.listPhoneInfo();
				break;
			case 3:
				man.searchPhoneInfo();
				break;
			case 4:
				man.updatePhoneInfo();
				break;
			case 5:
				man.deletePhoneInfo();
				break;
			case 6:
				man.sortPhoneInfo();
				break;
			case 7:
				man.write();

				break;
			case 8:
				man.read();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
			
		}
	}

}
