package kosta.phoneInfo;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneManager m = new PhoneManager(); 
		
		
		
		while (true) {
			
			System.out.println("\n ---------------------------\n"
										+ "1.�߰�,		2.��ü���,		3.��ȸ,	" + "\n"
										+ "4. ����,		5.����,			6.����"
										+ "\n ---------------------------\n");
			System.out.print(" �޴� ����-->  ");
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
				System.out.println("���α׷� ����");
				return;
			}
		}
		
		
		
	}

}
