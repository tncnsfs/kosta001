
// CallByReference �� �����ϱ� 

	// 1. �߾�, ����, ���� ���� �迭 �� num�� �Է¹ޱ� 
		// 2. num ���� CallByReference ������� ���ϰ��� ���� ����ϱ� 
			// 3. �߾�, ����, ���� �� ������ ���ϴ� �޽��� �ۼ�=> ���ϰ� ���� 
				// 4. �߿����� �� ��� ������ ���ϴ� �޼��� �ۼ� => ���ϰ� ����

package kosta.basic;

import java.util.Scanner;

public class B05_CallByReference {
	
	static int getAverage(int to1){
		
		int aver = to1/3;
		return aver;
		
	}
	//-------------------------------

	static int getTotal(int[] num){
		int to1 = 0; 
		
		for(int i =0; i<num.length; i++){
			to1 += num[i];
		}
		return to1; 
	}
	
	//-------------------------------
	
	static void getInput(int[] num1){
		
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num1.length; i++){
			num1[i] = sc.nextInt();
			
		}
	}
	//-------------------------------

	public static void main(String[] args) {
		
		int total,ave = 0;
		
		int num[] = new int[3];
		
		getInput(num);
		
		
		total = getTotal(num);
		ave = getAverage(total);
		
		System.out.println(total);
		System.out.println(ave);
		
		
	}

}
