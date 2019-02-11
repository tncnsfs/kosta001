package kosta.project01_test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {

		ManagerPr mn = new ManagerPr();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 로그인 \t 2.예약조회 \t 3.예약취소");
		int se1 = sc.nextInt();

		while (true) {
			switch (se1) {
			case 1:
				mn.selectFirst();
				break;

			case 2:

				break;

			case 3:

				break;
				
			}

		}

	}

}
