package kosta.Mission;

import java.util.Scanner;

public class Mission02_Scanner_ifElse {

	public static void main(String[] args) {
		

		// 국어, 영어, 수학 점수를 키보드로 부터 입력 받아
		// 총점과 평균을 출력하세요.
		
		String kor, eng, mat;
		int total; 
		int aver;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어점수: ");
		kor = sc.nextLine();
		System.out.print("영어점수: ");
		eng = sc.nextLine();
		System.out.print("수학점수: ");
		mat = sc.nextLine();
		
		int kor2 = Integer.parseInt(kor);
		int eng2 = Integer.parseInt(eng);
		int mat2 = Integer.parseInt(mat);
		

		total = kor2 + eng2 + mat2;
//		aver = total / 3;
		aver = (int)(total/ 3);

		System.out.println("총점: " + total);
//		System.out.println("평슌점수: " + aver);
//		System.out.printf("평슌점수: %.2f" , aver);
		
// aver 가 90이상 => A, 80 이상 => B, 70이상 => C, 70이하 => F 
		
		if(aver < 70){
			System.out.println("aver는 " + aver+" 로 70점 미만입니다.");
		}else if(aver < 80){
			System.out.println("aver는 " + aver +" 로 80점 미만입니다.");
		}else{
			System.out.println("aver는" + aver + "로 90점 이상입니다.");
		}
		
		
		
	}
}
