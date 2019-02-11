package kosta.Mission;

public class Mission03_3항연산 {

	public static void main(String[] args) {
		//삼항연산자 
//		int score = 75;
//		char grade = (score > 90)? 'A': ((score>80) ? 'B':'C');
//		System.out.println(grade);

		
		// 정수값에 대해서 전체 자리수 중 짝수, 홀수 개수를 구하자 .
		// (5자리) => 삼항연산자. 
		
		int num = 12345; 
		int even = 0; // 짝수 
		int odd = 0;  // 홀수 

		even += (num/10000%2 == 0)?1:0;
		even += (num/1000%10%2 == 0)?1:0;
		even += (num/100%10%2 == 0)?1:0;
		even += (num/10%10%2 == 0)?1:0;
		even += (num%2 == 0)?1:0;
		
		odd = 5 - even;
		
		System.out.println("짝수의 갯수 :" + even);
		System.out.println("홀수의 갯수 :" + odd);
		
		double n1;
		n1 = num/10000; 
		System.out.println(n1);
		
	}
}
