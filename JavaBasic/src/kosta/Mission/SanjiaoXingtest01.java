package kosta.Mission;

import java.util.Scanner;

public class SanjiaoXingtest01 {
	public static void main(String[] args) {
		// �ﰢ�� ��� ����:
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();
		// ���ﰢ�� ��� ����:

		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

		System.out.println("");

		// �Ƕ�̵� �ﰢ�� ��� ����:
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		System.out.println("Ȧ���� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2) // ���ʿ���
				{
					if (i + j <= num / 2 - 1)// ���� �� �������
						System.out.print(" ");
					else if (j - i >= num / 2 + 1)// ������ �� �������
						System.out.print(" ");
					else
						System.out.print("*"); // *���
				} else if (i > num / 2) // �Ʒ��� ����
				{
					if (i - j >= num / 2 + 1) // ���� �� ����
						System.out.print(" ");

					else if (i + j >= num / 2 * 3 + 1) // ������ �� ����
						System.out.print(" ");
					else
						System.out.print("*"); // * ���
				}
			}

			System.out.println(); // �ٹٲ�

		}
	}
}
