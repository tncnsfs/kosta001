package kosta.Mission;

import java.util.Scanner;

public class Mission10_ScanArray2 {

	public static void main(String[] args) {
		mission10_01query();
	}

	
	static void mission10_01query() {

//		--------------------------------------		

		Scanner sc = new Scanner(System.in);

		String subject[] = {"����", "����", "����", "����", "���"};
		int arr[][] = new int[3][5];
		
		
		
		//�迭 �ʱ�ȭ 
		for(int i=0; i<arr.length; i++){
			for(int j = 0; j<3; j++){
				System.out.print("�л�" + (i+1) + subject[j] + "�Է�: ");
				arr[i][j] = sc.nextInt();
//				--------------------------------------
				arr[i][3] += arr[i][j];
			}
//			--------------------------------------
			arr[i][4] = arr[i][3]/3;
		}
		
		
		
//		--------------------------------------
		// ����� ���� ����� �������� ����ϱ� 
//		for(int i=0; i<arr.length; i++){
//			for(int j=i+1; j<arr.length; j++){
//				if(arr[i][4]<arr[j][4]){
//					int temp[];
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
		
		// ����� ����ϱ� 
		//		--------------------------------------		
		for(String s : subject){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		// ���� ����ϱ� 
//		--------------------------------------		

		for(int i =0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
//		--------------------------------------		
	}
	
	
}
