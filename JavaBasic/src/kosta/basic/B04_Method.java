package kosta.basic;

public class B04_Method {

	public static void main(String[] args) {
		
		int result; 
		result = adb(1, 2);
		System.out.println(result);
	}
//	-------------------------------------
//		printCharacter('*', 50);
//		System.out.println("Hello, Java");
//		printCharacter('-', 36);
//	}
	
//	static void printCharacter(char ch, int num){
//		
//		for(int i = 0; i<=num; i++){
//			System.out.print(ch);
//		}
//		System.out.println();
		
		
//		---------------------------------
//		결과를 리턴하는 메소드  
		static int adb(int a, int b){
			int sum;
			sum = a + b ;
			
			return sum;
		
		

	}
}
