package phoneArray_ksh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		// 1.�߰� 2. ��ü��� 3. ����
		// 1�߰� �ϸ� ��ü ����->�迭�� �߰�
		Scanner sc = new Scanner(System.in);
		Manager man = new Manager();
		while (true) {
		System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.���� 5. ���� 6.���� (by�̸�) 7. ���� ���� 8. ���� �ҷ�����  9.���� ");
		System.out.print("���Ͻô� ����� ��ȣ�� �Է��ϼ��� : ");

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
				System.out.println("���α׷��� �����մϴ�.");
				return;
				
			}
			
		}
	}

}
