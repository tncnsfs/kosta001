package equals_toString;

public class AccountExam extends Account{

	public static void main(String[] args) {
		
													//a      b 
		Account c1 = new Account("java", "java1");
		Account d1 = new Account("java", "java2");

			if(c1.equals(d1)){
				// c1.메소드()
				
				System.out.println(" 값이 같습니다. ");
			}else{
				System.out.println(" 값이 같지 않습니다.");
			}
		
		
		System.out.println("toString 내용 출력 : " + c1);
		
		
		
	}

	
}
