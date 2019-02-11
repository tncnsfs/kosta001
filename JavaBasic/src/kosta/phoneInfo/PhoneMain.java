package kosta.phoneInfo;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneManager m = new PhoneManager(); 
		
		
		
		while (true) {
			
			System.out.println("\n ---------------------------\n"
										+ "1.추가,		2.전체출력,		3.조회,	" + "\n"
										+ "4. 수정,		5.삭제,			6.종료"
										+ "\n ---------------------------\n");
			System.out.print(" 메뉴 선택-->  ");
			Scanner sc = new Scanner(System.in);
			String menu = sc.nextLine();
			
			switch (menu) {

			case "1":
				m.addValue();
				
				break;

			case "2":
				m.listValue();
				
				break;
				
			case "3":
				m.searchValue();
				
				break;
				
			case "4":
				m.updateValue();
				
				break;

			case "5":
				m.deleteValue();
				
				break;
			
			case "6":
				System.out.println("프로그램 종료");
				return;
			}
		}
		
		
		
	}

}
