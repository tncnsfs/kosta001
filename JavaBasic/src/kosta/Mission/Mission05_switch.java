package kosta.Mission;

import java.util.Scanner;

public class Mission05_switch {

	public static void main(String[] args) {
		// ����, ����, ���� ������ Ű����� ���� �Է� �޾�
		// ������ ����� ����ϼ���.
		
		String kor, eng, mat;
		int total; 
		int aver;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������: ");
		kor = sc.nextLine();
		System.out.print("��������: ");
		eng = sc.nextLine();
		System.out.print("��������: ");
		mat = sc.nextLine();
		
		int kor2 = Integer.parseInt(kor);
		int eng2 = Integer.parseInt(eng);
		int mat2 = Integer.parseInt(mat);
		total = kor2 + eng2 + mat2;
		aver = (int)(total/ 3);
		
		if(aver < 70){
//			System.out.println("aver�� " + aver+" �� 70�� �̸��Դϴ�.");
		}else if(aver < 80){
//			System.out.println("aver�� " + aver +" �� 80�� �̸��Դϴ�.");
		}else{
//			System.out.println("aver��" + aver + "�� 90�� �̻��Դϴ�.");
		}
// aver �� 90�̻� => A, 80 �̻� => B, 70�̻� => C, 70���� => F 
		switch (aver/10) {
			case 9:
				System.out.println("A���� �Դϴ�.");
				break;
				
			case 8:
				System.out.println("B���� �Դϴ�.");
				break;
				
			case 7:
				System.out.println("C���� �Դϴ�.");
				break;
	
			default:
				System.out.println("F���� �Դϴ�.");
				break;
			}
		
	}
}
