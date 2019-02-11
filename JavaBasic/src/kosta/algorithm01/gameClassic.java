// 종현: A , 
// 종원  B 
//	A >= B 

//현재 종현이와 종원이의 점수는 각각 A점과 B점이고, 
//종현이의 점수는 A는 종원이의 점수 B보다 높거나 같다. 
//
//종현: A , 종원 , B 
//A >= B 
//
//조현이는 매일 점수가 2배씩 상승하지만,
//A*2
//
//노력파인 종원이는 종현이를 이기기 위해 쉬지 않고 연습한 결과 매일 점수가 3배씩
//상승하는 능력을 갖추었다.
//이때 며칠이 지나야 종원이가 종현이의 점수보다 높아질 수 있을까?
//
//[입력]
//첫 번째 줄에 테스트케이스의 수 T(1<= T<=50)가 주어진다.
//각 테스트케이스마다 최초 종현이의 점수 A와 종원이의 점수 B가 각각 공백을 두고
//주어진다. 단 최초 종현이의 점수 A는 종원이의 점수 B보다 크거나 같으면 1점
//이상 5천점 이하의 점수이다. (A>=B, 1<=B<=5000)
//
//[출력]
//각 줄마다 "#T"(T는 테스트케이스 번호)를 출력한 뒤, 종원이의 점수가 종현이의 점수를
//추월하게 되는데 필요한 일수를 출력한다.
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
//				System.out.print("종현이 점수 입력 :");
//				a = sc.nextInt();
//				System.out.print("종원이 점수 입력:");
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
