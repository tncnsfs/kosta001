package kosta.basic;

public class B02_VariableExam {

	public static void main(String[] args) {
		
		//���׿����� 
//		int score = 75;
//		char grade = (score > 90)? 'A': ((score>80) ? 'B':'C');
//		System.out.println(grade);
		
		String name = "admin ";
		if(name.trim().equals("admin")){
			System.out.println("������ �Դϴ�.");
		}else{
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		
//		 --------------------------------------------		
		// �� ���� ������ �ִ밪�� ���϶� 
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
			System.out.println("�ٸ���");
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
	
		
		// ���մ��� ������ 
		int num = 10; 
//		num = num + 1;
		num += 1;
		System.out.println(num);
		*/
		
		// ������ ������ 
//		for(int i=1; i<=100; i++){
//			if(i%2 == 0 || i%3 == 0){
//				System.out.print(i + ", ");
//			}
//		}
		
//		 --------------------------------------------
		
		//casting(����ȯ) String <=> ������, �Ǽ���
		// �ּ� ���� 15��� ���������� ���ڿ� 150�� ����
		String n3 = 10 + 5 + "0";
		System.out.println(n3);
		
		String n4 = 7 +"4" +9;
		System.out.println(n4); // 749
		
		
//		String str = "123�ȳ�";
		String str = "123";
		
		int n5 = Integer.parseInt(str);
//		int n5 = Integer.parseInt(n4);
		int re3 = n5 + 1;
		System.out.println(re3);
		
		
		//casting(����ȯ) int -><- double 
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
