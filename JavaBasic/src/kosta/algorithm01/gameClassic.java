// ����: A , 
// ����  B 
//	A >= B 

//���� �����̿� �������� ������ ���� A���� B���̰�, 
//�������� ������ A�� �������� ���� B���� ���ų� ����. 
//
//����: A , ���� , B 
//A >= B 
//
//�����̴� ���� ������ 2�辿 ���������,
//A*2
//
//������� �����̴� �����̸� �̱�� ���� ���� �ʰ� ������ ��� ���� ������ 3�辿
//����ϴ� �ɷ��� ���߾���.
//�̶� ��ĥ�� ������ �����̰� �������� �������� ������ �� ������?
//
//[�Է�]
//ù ��° �ٿ� �׽�Ʈ���̽��� �� T(1<= T<=50)�� �־�����.
//�� �׽�Ʈ���̽����� ���� �������� ���� A�� �������� ���� B�� ���� ������ �ΰ�
//�־�����. �� ���� �������� ���� A�� �������� ���� B���� ũ�ų� ������ 1��
//�̻� 5õ�� ������ �����̴�. (A>=B, 1<=B<=5000)
//
//[���]
//�� �ٸ��� "#T"(T�� �׽�Ʈ���̽� ��ȣ)�� ����� ��, �������� ������ �������� ������
//�߿��ϰ� �Ǵµ� �ʿ��� �ϼ��� ����Ѵ�.
//
//[sample input]
//4
//7 1
//8 3
//4 4
//4500 2
//
//[sample output]
//#1 5
//#2 3
//#3 1
//#4 20

package kosta.algorithm01;

import java.util.Scanner;

public class gameClassic {
	
	static int T;
	static long A,B;
	
	public static void main(String[] args) throws Exception{
		System.out.println("test");
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(int test_case =1; test_case <=T; test_case++){
			A = sc.nextLong();
			B = sc.nextLong();
			for(int i=1; i<=22; i++){
				A = A *2;
				B = B *3;
				if(A < B) {
					System.out.println("#"+ test_case+ " " + i);
					break;

				}
			}
		}
		
		
//		-----------------------------------------

//		System.out.println("********************");
//		int a, b;
//		int t = 50;
//		int[] a1 = new int [t];
//		int[] b1 =new int [t] ;
//		int cnt =0;
//
//		try {
//			while (true) {
//				
//				Scanner sc = new Scanner(System.in);
//				System.out.print("������ ���� �Է� :");
//				a = sc.nextInt();
//				System.out.print("������ ���� �Է�:");
//				b = sc.nextInt();
//				System.out.println("********************");
//				
//				
//				a1[cnt] = a * 2;
//				b1[cnt] = b *3;
//				t = a1[cnt] / b1[cnt];
//				cnt ++;
//				
//				if (a > b) {
//					System.out.println("#" + cnt + " :" + t);
//				} else {
//					System.out.println("#" + "other :" + t);
//				}
//				
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
