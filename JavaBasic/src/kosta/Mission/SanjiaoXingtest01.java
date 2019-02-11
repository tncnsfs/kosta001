package kosta.Mission;

import java.util.Scanner;

public class SanjiaoXingtest01 {
	public static void main(String[] args) {
		// 삼각형 찍기 예제:
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();
		// 역삼각형 찍기 예제:

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

		// 피라미드 삼각형 찍기 예제:
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

		System.out.println("홀수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2) // 위쪽영역
				{
					if (i + j <= num / 2 - 1)// 왼쪽 위 공백찍기
						System.out.print(" ");
					else if (j - i >= num / 2 + 1)// 오른쪽 위 공백찍기
						System.out.print(" ");
					else
						System.out.print("*"); // *찍기
				} else if (i > num / 2) // 아래쪽 영역
				{
					if (i - j >= num / 2 + 1) // 왼쪽 밑 공백
						System.out.print(" ");

					else if (i + j >= num / 2 * 3 + 1) // 오른쪽 밑 공백
						System.out.print(" ");
					else
						System.out.print("*"); // * 찍기
				}
			}

			System.out.println(); // 줄바꿈

		}
	}
}
