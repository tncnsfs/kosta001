package kosta.Mission;

import java.util.Scanner;

public class Mission07_Method {
	
//	------------------------------------------	
	static int getTotal(int[] arr){
		
		int total =0;
		for(int i=0; i<arr.length; i++){
			total += arr[i];
		}
		
		return total; 
	}
	
//	------------------------------------------	

	static int getAverage(int total){
		
		int aver = total/3;
		return aver ;
	}
//	------------------------------------------	

	static void getInput(int[] arr2){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		for(int i =0; i< arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
	}
	
//	------------------------------------------	


	public static void main(String[] args) {
		// ����:
		// 1. Ű����� ���� �Է��� �޴� �޼ҵ� ����� => �̸� ���� 
		// 2. ������ �����ϴ� �޼ҵ� 
		// 3. ��հ��� �����ϴ� �޼ҵ� 
		
		int kor , eng, mat = 0;
		int total, aver = 0;
		
		int arr[] = new int[3];
		
		getInput(arr);
		
		total = getTotal(arr);
		aver = getAverage(total);
		
		System.out.println("����" + total);
		System.out.println("���" + aver);
		
	}
}
