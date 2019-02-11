package kosta.basic;

public class B03_LoopExam02 {

	public static void main(String[] args) {
		// 중첨 for 문
		// for(int i=1; i<=3; i++){
		// for(int j=1; j<=2; j++){
		// System.out.println("i=" + i + "," + "j:" + j);
		// }
		// }

		// 99단에서 2단에서 9단까지 출력 하기

		// for(int i = 2; i<=9; i++){
		// for(int j = 1; j<=9; j++){
		// System.out.println(i+"*"+j + "="+(i*j));
		// }
		// System.out.println();
		// }

		// -----------------------------------------
		// 중첩for문 이용해서
		// 4x + 5y = 60
		// x 와 y 가 나올수 있는 경우의 수를 다 출력 하세요

		// int i, j;
		//
		// for(i =0; i<=15;i++){
		// for(j = 0; j<= 15;j++){
		// if((4*i) + (5*j) ==60){
		//
		// System.out.println(i + "," + j);
		// }
		// }
		// }

		// ---------------------------------------------
		// 별찍기 예제
//		*
//		**
//		***
//		****
//		*****

//		for (int i = 0; i <= 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// ----------------------------------------------------
//		*****
//		****
//		***
//		**
//		*
		
//		for (int i=0; i<=5; i++){
//			for(int j=5; j>i; j--){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		for(int i =5; i>0; i--){
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		// ---------------------------------------------
//		        *
//		      **
//		    ***
//		  ****
//      *****

        // 역삼각형 찍기 예제:
//        for (int i = 1; i <= 5; i++) {
//                  for (int j = 5; j > 0; j--) {
//                            if (i < j) {
//                                      System.out.print("  ");
//                            } else {
//                                      System.out.print("*");
//                            }
//                  }
//                  System.out.println("");
//        }
		
	}
}
