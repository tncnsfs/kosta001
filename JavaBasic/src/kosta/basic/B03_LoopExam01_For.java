package kosta.basic;

import java.util.Scanner;

public class B03_LoopExam01_For {
	public static void main(String[] args) {
		
		
		
//		-------------------------------------
//		 for�� �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ������� ǥ��  
		
//		for(int i =1; i<=10; i++){
//			System.out.println(i);
//		}
//		
//		int sum = 0;
//		for(int i =1; i<=10; i++){
//			sum += i;
//			System.out.println(sum);
//		}
		
//		--------------------------------------
//		for�� ���� Ȧ���� ��� -> 1���� 10���� 
		
		for (int i= 1; i<=10; i++){
//			System.out.println(i);
			if(i%2 == 0)
				continue; 
			System.out.println(i);
		}
		
	}
}
