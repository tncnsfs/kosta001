package kosta.basic;

public class B03_LoopExam02 {

	public static void main(String[] args) {
		// ��÷ for ��
		// for(int i=1; i<=3; i++){
		// for(int j=1; j<=2; j++){
		// System.out.println("i=" + i + "," + "j:" + j);
		// }
		// }

		// 99�ܿ��� 2�ܿ��� 9�ܱ��� ��� �ϱ�

		// for(int i = 2; i<=9; i++){
		// for(int j = 1; j<=9; j++){
		// System.out.println(i+"*"+j + "="+(i*j));
		// }
		// System.out.println();
		// }

		// -----------------------------------------
		// ��øfor�� �̿��ؼ�
		// 4x + 5y = 60
		// x �� y �� ���ü� �ִ� ����� ���� �� ��� �ϼ���

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
		// ����� ����
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

        // ���ﰢ�� ��� ����:
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
