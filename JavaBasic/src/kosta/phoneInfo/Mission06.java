package kosta.phoneInfo;

import java.util.Scanner;

public class Mission06 {
	static int count;
	static int[][] arr = new int[5][5];
	static String[] names = new String[5];
	static String subject[] = {"�̸�","����", "����", "����","����","���"};
	
	public static void add(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		names[count] = sc.nextLine();
		for(int i=0;i<3;i++){
			System.out.print(subject[i+1] + " �Է�: ");
			arr[count][i] = sc.nextInt();
			arr[count][3] += arr[count][i];
		}
		arr[count][4] = arr[count][3]/3;
		count++;
	}
	
	public static void print(){
		for(String s : subject){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		for(int i=0;i<count;i++){
			System.out.print(names[i] + "");
			for(int j=0;j<arr[i].length;j++){				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void search(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
		int index = -1;
		
		for(int i=0;i<count;i++){
			if(name.equals(names[i])){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("����� ã�� �� �����ϴ�.");
		}else{
			for(String s : subject){
				System.out.print(s + "\t");
			}
			System.out.println();
			System.out.print(name+"");
			for(int i=0;i<5;i++){
				System.out.print(arr[index][i] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]){
		//Ű����� ���� 1~4�� �Է� �޴´�.
		//1. �߰�, 2.��ü��� 3.�˻� 4.����=>�ܼ����
		//�Է�: 1
		//�߰������ ����
		//�Է�: 3
		//�˻������ ����
		//�Է�: 4
		//���α׷��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("1. �߰�, 2.��ü��� 3.�˻� 4.����");
			System.out.print("�Է�: ");
			
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				add();
				break;
			case "2":
				print();
				break;
			case "3":
				search();
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;
			}
		}		
	}
}

