package kosta.phone_00;


import java.util.Scanner;

public class Manager {
	String names[] = {"�̸�", "����", "�������"};
	int count;

	
	PhoneInfo arr[];

	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	
	
	

	public void addPhoneInfo() {
		System.out.println("addCount1=>" + count);
		
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("�������: ");
		String birth = DataInput.sc.nextLine();
//		arr[count++] = new PhoneInfo(name, phoneNo, birth);

		
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println("addCount2=>" + count);

	}

	public void listPhoneInfo() {
		
		
		for (int i = 0; i < count; i++) {
			arr[i].show();
			System.out.println();
		}
		System.out.println("printCount=>" + count);
	}

	public void searchPhoneInfo() {
		
		
		
		System.out.println("searchCount=>" + count);
		// �̸� �Է� => PhoneInfo ��ü ã�� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		String names = sc.nextLine();
		
		int index = -1; 
		
		
		for(int i =0; i <count; i++){
			if(names.equals(arr[i].getName())){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("����� ã���� �����ϴ�.");
		}else{
			arr[index].show();
		}
	}

	public void updatePhoneInfo() {
		// �̸� �Է� => PhoneInfo ��ü ã�� 
		// ��ȭ��ȣ �Է� => �ش� PhoneInfo ��ü�� ��ȭ��ȣ ���� 
		// 2�� �Է� �޴°� => 1. �̸� �Է¹ް� 2. �Է¹��� �̸����� ��ȭ��ȣ �Է� �޾Ƽ� ����. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		String names = sc.nextLine();
		int index = -1; 
		
		for(int i =0; i <count; i++){
			if(names.equals(arr[i].getName())){
				index = i;
				
				System.out.print("�̸� ���� : ");
				arr[index].setName(sc.nextLine());
//				arr[index].setName(name) = sc.nextLine();	
				
				
				System.out.print("��ȭ��ȣ ���� : ");
//				arr[index].phoneNo = sc.nextLine();
				arr[index].setPhoneNo(sc.nextLine());
				
				
//				System.out.print("���� ���� : ");
//				arr[index].birth = sc.nextLine();
				break;
			}
		}
		
		if(index == -1){
			System.out.println("����� ã���� �����ϴ�.");
		}else{
			System.out.println("���� �Ϸ� �߽��ϴ�.");
		}
		
		
	}

	public void deletePhoneInfo() {
		// ���ã�� 
		// ã�� ��� ���ڸ��� ������ ���� �� ������ �ε��� ���� , count-- ��� 

		// �̸� �Է� => PhoneInfo ��ü ã�� ���

		// �̸� �Է� => PhoneInfo ��ü ã�� 
		// ��ȭ��ȣ �Է� => �ش� PhoneInfo ��ü�� ��ȭ��ȣ ���� 
		// 2�� �Է� �޴°� => 1. �̸� �Է¹ް� 2. �Է¹��� �̸����� ��ȭ��ȣ �Է� �޾Ƽ� ����. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		String names = sc.nextLine();
		int index = -1; 
		
//		-------------------------------
		for(int i =0; i <count; i++){
			if(names.equals(arr[i].getName())){
				index = i;
				
				break; 
			}
		}
		
//		-------------------------------
		
		if(index != -1){
			for(int i =0; i<count; i++){
				
				if(i != arr.length){
					arr[i] =arr[i+1];
				}
				
			}
			
			System.out.println("countDelete01=> " + count);
			arr[count-1] = null;
			count --; 
			System.out.println("countDelete02=> " + count);
			
		}
		
		
//		-------------------------------
		
	}
}
