package kosta.algorithm;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0; // �˻� ���� ù �ε��� 
		int pr = n -1; 	// �˻� ���� ���ڸ� �ε��� 
		
		do{
			int pc = (pl + pr)/2;	// �߾� ����� �ε��� 
			if(a[pc] == key)
				return pc; 
			else if(a[pc] < key){
				pl = pc +1;	// �˻� ������ ���� �������� ���� 
			}else{
				pr = pc -1;  // �˻� ������ ���� �������� ���� 
			}
			
		}while(pl <= pr);
		
		return -1;
	}


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��ڼ��� num�� �迭
		
		System.out.println("������������ �Է��ϼ���.");
		
		
		System.out.println("x[0]: ");
		x[0] = stdIn.nextInt();
		

		for (int i = 1; i < num; i++) {
			
			do{
				System.out.println("x[0]: ");
				x[0] = stdIn.nextInt();
			}while(x[i] < x[i-1]); // �ٷ� �տ� ��Һ��� ������ �ٽ� �Է� 
			
		}

		System.out.print("�˻��� ����"); // Ű ���� �Է�
		int ky = stdIn.nextInt();
		System.out.println("ky =>" + ky);

		int idx = binSearch(x, num, ky); // �迭x���� Ű ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}

}
