package kosta.Mission;

public class Mission03_3�׿��� {

	public static void main(String[] args) {
		//���׿����� 
//		int score = 75;
//		char grade = (score > 90)? 'A': ((score>80) ? 'B':'C');
//		System.out.println(grade);

		
		// �������� ���ؼ� ��ü �ڸ��� �� ¦��, Ȧ�� ������ ������ .
		// (5�ڸ�) => ���׿�����. 
		
		int num = 12345; 
		int even = 0; // ¦�� 
		int odd = 0;  // Ȧ�� 

		even += (num/10000%2 == 0)?1:0;
		even += (num/1000%10%2 == 0)?1:0;
		even += (num/100%10%2 == 0)?1:0;
		even += (num/10%10%2 == 0)?1:0;
		even += (num%2 == 0)?1:0;
		
		odd = 5 - even;
		
		System.out.println("¦���� ���� :" + even);
		System.out.println("Ȧ���� ���� :" + odd);
		
		double n1;
		n1 = num/10000; 
		System.out.println(n1);
		
	}
}
