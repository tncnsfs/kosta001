package equals_toString;

public class AccountExam extends Account{

	public static void main(String[] args) {
		
													//a      b 
		Account c1 = new Account("java", "java1");
		Account d1 = new Account("java", "java2");

			if(c1.equals(d1)){
				// c1.�޼ҵ�()
				
				System.out.println(" ���� �����ϴ�. ");
			}else{
				System.out.println(" ���� ���� �ʽ��ϴ�.");
			}
		
		
		System.out.println("toString ���� ��� : " + c1);
		
		
		
	}

	
}
