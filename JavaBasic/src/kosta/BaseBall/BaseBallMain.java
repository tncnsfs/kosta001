package kosta.BaseBall;

import java.util.Scanner;

public class BaseBallMain {

	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;
		int count = 0;
		
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		
		do{
			System.out.println("�ߺ����� �ʴ� 3�ڸ� ����");
			System.out.print("�Է�: ");
			String str = sc.nextLine();//123
			
			arr[0] = Integer.parseInt(str.substring(0, 1));
			arr[1] = Integer.parseInt(str.substring(1, 2));
			arr[2] = Integer.parseInt(str.substring(2, 3));
			
			strike = m.countStrike(arr);
			ball = m.countBall(arr);
			
			System.out.println(strike + "S " + ball + "B");
			count++;			
			
		}while(strike < 3);
		
		System.out.println(count + "��° ���� �Ͽ����ϴ�.");
		
		
	}

}










