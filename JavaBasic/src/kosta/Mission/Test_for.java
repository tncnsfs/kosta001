package kosta.Mission;

import java.util.Scanner;

public class Test_for {

	public static void main(String[] args) {
		
		// ���� ���� ���͸����� if/for������ ���ϱ� 
		// ���͸���->Factorial �� (���丮���̶� 1���� n������ ������ ��� ���� ���� ���մϴ�.)
       // ex) 3!(3���丮��) = 1*2*3 = 6,  4! = 1*2*3*4 = 24�Դϴ�.
		// �Է� �������� ���͸��� ���ϱ� 
		
		int num; 
		int Fnum =1;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		
		num = sc.nextInt();
		
		if( num != 0){
			for(int i =1; i<= num; i++){
//				Fnum = Fnum * num(i);
				Fnum *= i;
						
			}
			System.out.println("Factorial => "+  Fnum);
		}
		
		
		
		
		
		


		
	}

}
