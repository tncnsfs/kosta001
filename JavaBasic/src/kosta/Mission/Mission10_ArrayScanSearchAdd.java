// ���� => 2���� �迭 ������,, 1���� �ּ��� ������ 

// for/Switch/Scanner �� ����� ����
// keyboard �� 1~4���� �Է� �޴´�.
// 1. �߰� 2. ��ü��� 3. �˻� 4. ���� => �ܼ����
// �Է�: 1
// �߰������ ����
// �Է�: 3
// �˻������ ����
// �Է�: 4
// ���α׷��� ����
package kosta.Mission;

import java.util.Scanner;

public class Mission10_ArrayScanSearchAdd {

	static int count; 
	static int[][] arr = new int[5][5];
	static String[] names = new String [5];
	static String subject[] = {"�̸�","����", "����", "����", "����", "���"};
	
	public static void add(){
		System.out.print("�̸� �Է�: ");
		Scanner sc = new Scanner(System.in);
		names[count] = sc.nextLine();
		for(int i=0; i<3; i++){
			System.out.print(subject[i+1] + " �Է�: ");
			arr[count][i] = sc.nextInt();
			arr[count][3] += arr[count][i];
		}
		arr[count][4] = arr[count][3]/3;
		count++;
		
	}
	
	public static void print(){
		for(String s: subject){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		for(int i=0; i<count; i++){
			System.out.print(names[i] + "");
			for(int j= 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void search(){
		
	}

	
	
	public static void main(String[] args) {
		

		int num = 0;
//		System.out.println("1. �߰�  2. ��ü���  3. �˻�  4. ����");
//		 System.out.print("�Է�: ");
//		 num = sc.nextInt();

		for (;num!=4;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1. �߰�  2. ��ü���  3. �˻�  4. ����"); // �߰� �������� ������ ���� ;
			System.out.println();
			
			System.out.print("�Է�: ");
			num = sc.nextInt();

			switch (num) {
			case 1:
//				System.out.println("�߰������ ���� �Ǿ����ϴ�.");
				add();
				//�޼ҵ� ȣ��
//				--------------------------------------		
				
				break;
			case 2:
				System.out.println("��ü ��� �Ǿ����ϴ�");
				print();
				System.out.println();
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
