package kosta.phone_00;

//1. �߰� 2. ��ü��� 3. ����
//1���߰� -> �迭 �Է� -> ���
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Manager m = new Manager();
//		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.println("1. �߰� , 2. ��ü���, 3. �˻�, 4. ����,  5.����,  6.����");
		System.out.print(" �޴����� : ");
		String menu = DataInput.sc.nextLine();
		
		switch (menu) {
		case "1":
			m.addPhoneInfo();
			break;
			
		case "2":
			m.listPhoneInfo();
			break;
			
		case "3":
			m.searchPhoneInfo();
			break;
		case "4":
			m.updatePhoneInfo();
			break;
		case "5":
			m.deletePhoneInfo();
			break;
		case "6":
			System.out.println("����");
			return;
		}
		
		
		
		
		}		

	}
}

