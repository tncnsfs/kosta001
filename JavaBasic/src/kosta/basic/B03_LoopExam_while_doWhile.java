package kosta.basic;

import java.util.Scanner;

public class B03_LoopExam_while_doWhile {

	public static void main(String[] args) {
// while: (����) �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : �������� ǥ��  
		
		
		int cnt = 0; 
		while (cnt < 11) {
			System.out.println("cntStar"+ cnt);
			cnt++;
		}
		System.out.println("cntDone");
		
//		-------------------------------------
		// 1���� 10������ �� ���ϱ� 
		int i = 0; 
		int sum = 0;
		while (i<=10){
//			sum = i + sum;
			sum += i;
			i++;
		}
		System.out.println("1���� 10������ ��:" + sum);
		
//		while��-------------------------------------

		//������ 7�� ���
		// 7*1 = 7
		// 7*9 = 63
		
//		int gugu = 7;
//		int num = 0;
//		while (num <9) {
//			num++;
//			int gugudan = gugu * num;
//			System.out.println("7�� ������ ����"+ gugudan);
//		}
		
		int i01 =1;
		while(i01 <=9){
			System.out.println("7 *" + i01 + "= " + 7*i01);
			i01++;
		}
//		-------------------------------------
			// do while : ��ɹ��� ���� ������ ������ �� => ��� 1���� ���� 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �� ���ϱ�");
		
		int n; 
		
		do{
			System.out.print("�Է�: ");
			n = sc.nextInt();
		}while(n<=0);
		
		int i02 = 1;
		int sum02 = 0;
		while(i02<=n){
			sum02 += i02;
			i02++;
		}
		
		System.out.println(n + "���� ��: " + sum02);
		
		// ����: Ű����κ��� ���� �Է��� �޾� ���� ������. 
		// ������ �Է��ϸ� ���Ӱ� �ٽ� �Է��� �޴´�. (���� ������ ����.)
		// -7 => �ٽ� �Է� �ޱ� 
		// 10 => 55 ��� 
		
//		----------------------------------------------------
// do~ while ������ 10���ڸ� ���ڸ������� �϶� 
		
		/*		Scanner sc = new Scanner(System.in);
				
				int n; 
				
				do{
					System.out.println("�Է�: ");
					n = sc.nextInt();
					
				}while(n<10||n>99);
				System.out.println(n);*/
		

		
	}
}
