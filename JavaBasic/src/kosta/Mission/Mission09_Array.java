package kosta.Mission;

import java.util.Scanner;

public class Mission09_Array {

	public static void main(String[] args) {
		// ����, ����, ���� => int �迭
		// ����, ��� => int �迭
		// ����, ����, ���� => String �迭 
		// Ű���� ���� ���� �Է�:  
		//Ű���� ���� ���� �Է�:  
		//Ű���� ���� ���� �Է�:  
		
		// ����: 
		// ���: 

		Scanner sc = new Scanner(System.in);
		
		String subject[] = {"����","����","����"};
		int arr[] = new int[5];
		
		for(int i=0; i<3; i++){
			System.out.print(subject[i] + " �����Է�: ");
//			-----------------------------------

			arr[i] = sc.nextInt();
			
			// �������ϱ� 
			arr[3] = arr[i] + arr[3];
//			arr[3] += arr[i];
		}

		// ��� ���ϱ� 
		arr[4]= arr[3]/3;
//		-----------------------------------
		
		for(String s : subject){
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + "\t");
		}		
		
	}
}
