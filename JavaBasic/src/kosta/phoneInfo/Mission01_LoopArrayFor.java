package kosta.phoneInfo;

import java.util.Scanner;

public class Mission01_LoopArrayFor {

	// �ʿ��� ���� or �迭 1���� 2���� ����

	static int count;
	static int[][] arr = new int[5][5];
	static String[] names = new String[5];
	static String subject[] = { "�̸�", "����", "����", "����", "����", "���" };

	// 2. 2-1 �޼ҵ弳�� => 1�� �߰�, 2�� ��ü���, 3�� �˻�, 4�� ���� 5. ����

	static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		names[count] = sc.nextLine();

		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i + 1] + "�Է�: ");
			System.out.println("i=>" + i);
			
			arr[count][i] = sc.nextInt();

			arr[count][3] += arr[count][i];
		}
		arr[count][4] = arr[count][3] / 3;
		System.out.println("�������: " + arr[count][4]);
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
	// static String subject[] = { "�̸�", "����", "����", "����", "����", "���" };

	static void search() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("�˻� �Է�: ");
		String name = sc.nextLine();
		int index = -1;
		
		for(int i =0; i<count; i++){
			if(name.equals(names[i])){
				index = i;
			}
		}
		
		
		if (index == -1){
			System.out.println("����� ã���� �����ϴ�.");
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
		// 2. 1�� �߰�, 2�� ��ü���, 3�� �˻�, 4�� ����
		// -------------------------------------------------
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. �߰�	2. ��ü���	3. �˻�	4. ����	5. ����");
			System.out.println();
			System.out.print("�Է�: ");
			// System.out.println();

			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.println("�߰� ���� ����� Ȱ��ȭ �Ǿ����ϴ�");
				add();
				break;

			case "2":
				System.out.println("��� ���� ����� Ȱ��ȭ �Ǿ����ϴ�");
				print();
				break;

			case "3":
				// System.out.println();
				System.out.print("�˻� ���� ����� Ȱ��ȭ �Ǿ����ϴ�");
				search();
				break;

			case "4":
				System.out.println("���� ����� Ȱ��ȭ �Ǿ����ϴ�");
				delete();
				break;

			case "5":
				System.out.println("���α׷� ���� ����� Ȱ��ȭ �Ǿ����ϴ�");
				end();
				return;
			}
		}
		// -------------------------------------------------

	}
}
