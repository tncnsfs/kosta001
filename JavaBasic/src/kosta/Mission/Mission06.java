package kosta.Mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// for/Switch/Scanner �� ����� ����
		// keyboard �� 1~4���� �Է� �޴´�.
		// 1. �߰� 2. ��ü��� 3. �˻� 4. ���� => �ܼ����
		// �Է�: 1
		// �߰������ ����
		// �Է�: 3
		// �˻������ ����
		// �Է�: 4
		// ���α׷��� ����
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true){
//			System.out.println("1. �߰�  2. ��ü���  3. �˻�  4. ����");
//			System.out.print("�Է�: ");
//			
//			String menu = sc.nextLine();
//			switch (menu) {
//			case "1":
//				System.out.println("�߰� ����");
//				break;
//			case "2":
//				System.out.println("��� ����");
//				break;
//			case "3":
//				System.out.println("�˻� ����");
//				break;
//			case "4":
//				System.out.println("���α׷� ����");
//				return;
//
//			}
//		}
		
//		--------------------------------------

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("1. �߰�  2. ��ü���  3. �˻�  4. ����");
		 System.out.print("�Է�: ");
		 num = sc.nextInt();

		for (;num!=4;) {
			System.out.println("1. �߰�  2. ��ü���  3. �˻�  4. ����");
			System.out.print("�Է�: ");
			
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("�߰������ ���� �Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println("��ü ��� �Ǿ����ϴ�");
				break;
			case 3:
				System.out.println("�˻� �Ǿ����ϴ�");
				break;
			case 4:
				System.out.println("���� �Ǿ����ϴ�");
				break;
			}
		}
		
//		--------------------------------------
		
		
	}

}
