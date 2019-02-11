package kosta.basic;

public class B02_VariableExam {

	public static void main(String[] args) {
		
		//삼항연산자 
//		int score = 75;
//		char grade = (score > 90)? 'A': ((score>80) ? 'B':'C');
//		System.out.println(grade);
		
		String name = "admin ";
		if(name.trim().equals("admin")){
			System.out.println("관리자 입니다.");
		}else{
			System.out.println("일반인 입니다.");
		}
		
//		 --------------------------------------------		
		// 이 세개 변수중 최대값을 구하라 
		int a = 20;
		int b = 15;
		int c = 30;
		
		int max = a < b ? a:((b < c)?b:c);
		System.out.println(max);
		
		
//		 --------------------------------------------
		
		if(a >b){
			if(a>c){
				System.out.println(a);
			}
			else{
				System.out.println(c);
			}
		}else{
			if(b>c){
				System.out.println(b);
			}else{
				System.out.println(c);
			}
		}
//		 --------------------------------------------

		if(a>b && a>c){
			System.out.println(a);
		}else if(b>a && b>c){
			System.out.println(b);
		}else{
			System.out.println(c);
		}

		
//		 --------------------------------------------
		int m1 = 10;
		int m2 =20; 
		
		if(m1 != m2){
			System.out.println("다르다");
		}
//		 --------------------------------------------

		boolean bol = true; 
		
		if (!bol){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
//		 --------------------------------------------
		
//		int x = 10;
//		int y = 0; 
//		
//		y = ++x;
//		
////		 10,  11
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
		
		
		
		/*int i = 10;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(i ++);
//		 --------------------------------------------
	
		
		// 복합대입 연산자 
		int num = 10; 
//		num = num + 1;
		num += 1;
		System.out.println(num);
		*/
		
		// 나머지 연산자 
//		for(int i=1; i<=100; i++){
//			if(i%2 == 0 || i%3 == 0){
//				System.out.print(i + ", ");
//			}
//		}
		
//		 --------------------------------------------
		
		//casting(형변환) String <=> 정수형, 실수형
		// 주석 값은 15라고 예상이지만 문자열 150이 나옴
		String n3 = 10 + 5 + "0";
		System.out.println(n3);
		
		String n4 = 7 +"4" +9;
		System.out.println(n4); // 749
		
		
//		String str = "123안녕";
		String str = "123";
		
		int n5 = Integer.parseInt(str);
//		int n5 = Integer.parseInt(n4);
		int re3 = n5 + 1;
		System.out.println(re3);
		
		
		//casting(형변환) int -><- double 
		// byte < short < int < long < float < double< String
/*		int n1 =10;
		double n2 = 3.14;
		double re = n1 + n2;
		
		int re2 = (int)(n1 + n2);
		
		
		
		
		int num;
		int a =0;
		
		num = 10;
		if(num == 10){
			a = 100;
		}
		
		System.out.println(a);
		System.out.println(num);*/
	}
}
