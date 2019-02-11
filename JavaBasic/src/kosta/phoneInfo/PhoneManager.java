package kosta.phoneInfo;

import java.awt.print.Printable;
import java.util.Scanner;

public class PhoneManager {

	Scanner sc = new Scanner(System.in);

	PhoneInfor[] pm;
	int count;

	PhoneManager() {
		pm = new PhoneInfor[5];

	}

	public void addValue() {
		System.out.println("addCount 01 =>:" + count);
		System.out.println("�߰����: ");
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
		System.out.print("���ѹ� �Է�: ");
		String phoneNo = sc.nextLine();
		System.out.print("���� �Է�: ");
		String birth = sc.nextLine();

		pm[count++] = new PhoneInfor(name, phoneNo, birth);

		System.out.println();
		System.out.println("addCount 02 =>:" + count);
		System.out.println();
	}

	public void listValue() {
		System.out.println();
		System.out.println("��ü��ȸ���: ");
		System.out.println();

		for (int i = 0; i < count; i++) {
			pm[i].print();
			System.out.println();
		}
	}

	public void searchValue() {
		System.out.println("searchCount =>:" + count);
		System.out.print("\n" + "��ġ���: ");

		String names = sc.nextLine();
		int index = -1;

		for (int i = 0; i < count; i++) {

			 if(names.equals(pm[i].name)){
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("����� ã���� �����ϴ�.");
		} else {
			pm[index].print();
		}

	}

	public void updateValue() {
		System.out.println("������Ʈ���: ");

		System.out.println("searchCount =>:" + count);
		System.out.print("\n" + "��ġ���: ");
		String names = sc.nextLine();

		int index = -1;

		for (int i = 0; i < count; i++) {
			 if(names.equals(pm[i].name)){
				index = i;
				
				System.out.print("�̸�����: ");
				pm[index].name = sc.nextLine();
				System.out.print("��ȭ��ȣ ����: ");
				pm[index].phoneNo = sc.nextLine();
				System.out.print("���� ����: ");
				pm[index].birth = sc.nextLine();
				break;

			 }
		}
		if (index == -1) {
			System.out.println("����� ã���� �����ϴ�.");
		} else {
			System.out.println("������ �Ϸ� �Ͽ����ϴ�.");
		}

		
	}

	public void deleteValue() {
		System.out.println("�������: ");

		System.out.println("searchCount =>:" + count);
		System.out.print("\n" + "�̸� �Է�: ");

		String names = sc.nextLine();
		int index = -1;

		for (int i = 0; i < count; i++) {

			 if(names.equals(pm[i].name)){
				index = i;
				break;
			}
		}
		
		
		if (index != -1) {
			for (int i = 0; i<count; i++){
				
				if(i != pm.length){
					pm[i] = pm[i+ 1];
				}
			}
			
			System.out.println("deleteCount 01 =>" + count + "\n"
					+ "-------------------");
			pm[count -1] = null;
			count --;
			System.out.println("deleteCount 01 =>" + count + "\n"
					+ "-------------------");
		}

		System.out.println("���� ���� ��ȸ �Ҽ� �����ϴ�.");
		

	}

}
