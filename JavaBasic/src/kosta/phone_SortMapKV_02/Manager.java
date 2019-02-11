package kosta.phone_SortMapKV_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	int num;
	List<PhoneInfo> arrli01 = new ArrayList<>();

	// ------------------------------------------------
	// 01
	public void addPhoneInfo() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = sc.nextLine();
		System.out.print("���� : ");
		String birth = sc.nextLine();
		arrli01.add(new PhoneInfo(name, phoneNo, birth));
		System.out.println(arrli01.get(num));
		num++;
		System.out.println();
	}

	// 02
	public void listPhoneInfo() {
		System.out.println(arrli01 + "\t");
		System.out.println();
		
	}

	// 03 �˻� ���� 
	public void searchPhoneInfo() {
		System.out.print("�̸� �Է�: ");
		String names = sc.nextLine();
		int index = -1;
		for (int i = 0; i < num; i++) {
			if (names.equals(arrli01.get(i).name)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("����� ã���� �����ϴ�.");
		} else {
			String str = arrli01.get(index).getName();
			System.out.println(str);
			System.out.println(arrli01.get(index));
		}
	}

	// ����Ʈ ���� ����
	// 04
	public void updatePhoneInfo() {
		// �̸� �Է� => PhoneInfo ��ü ã��
		// ��ȭ��ȣ �Է� => �ش� PhoneInfo ��ü�� ��ȭ��ȣ ����
		// 2�� �Է� �޴°� => 1. �̸� �Է¹ް� 2. �Է¹��� �̸����� ��ȭ��ȣ �Է� �޾Ƽ� ����.
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
		int index = arrli01.indexOf(name);

		for (int i = 0; i < arrli01.size(); i++) {
			if (name.equals(arrli01.get(i).getName())) {
				index = i;
				System.out.print("�ٲܹ�ȣ: ");
				String name2 = sc.nextLine();
				
				arrli01.get(index).setPhoneNo(name2);
				
				System.out.println(arrli01.get(index).getPhoneNo());
			} else {
				System.out.println("����� ã���� �����ϴ�.");
			}
		}
	}

	// 05
	public void deletePhoneInfo() {
		System.out.print("�̸� �Է�: ");
		int index = -1;
		String name3 = sc.nextLine();
		
		for (int i = 0; i < arrli01.size(); i++) {
			if (name3.equals(arrli01.get(i).getName())) {
				index = i;
				System.out.print("������ȣ: ");
				String name4 = sc.nextLine();
				
//				arrli01.get(index).setPhoneNo(name4);
				arrli01.remove(index);
				
				
//				System.out.println(arrli01.get(index).getPhoneNo());
			} else {
				System.out.println("����� ã���� �����ϴ�.");
			}
		}

			System.out.println(arrli01);
		}
	// -------------------------------
	// 06

	public void sortFL() {


		System.out.println("�������� " + "\n" 
									+ "a�� : ��������" + "\n" 
									+ "b�� : ��������" + "\n"
									+ "���ڸ� �Է��ϼ���: ");
		String menu = sc.nextLine();
		
		switch (menu) {
				
		case "a":
			Collections.sort(arrli01, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					// �̸��� �������� ��������
					if (o1.getName().compareTo(o2.getName()) > 0) {
						return 1;
					} else if (o1.getName().compareTo(o2.getName()) < 0) {
						return -1;
					}
					return 0;
				}
			});
			System.out.println(arrli01);

			break;
			
			
		case "b":
			Collections.sort(arrli01, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					// �̸��� �������� ��������
					if (o1.getName().compareTo(o2.getName()) > 0) {
						return -1;
					} else if (o1.getName().compareTo(o2.getName()) < 0) {
						return 1;
					}
					return 0;
				}
			});
			System.out.println(arrli01);

			break;
		}
		
		
		
		
		
		
	}

	
	
	
}