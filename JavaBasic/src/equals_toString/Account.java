package equals_toString;

public class Account {
	
	String a ;
	String b ;
	
	
	public Account() {
		super();
	}
	
	
	public Account(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

//	-----------------------------
	
//	public void equalsa(){
//		if(a != b){
//			System.out.println(" ����ó�� ���");
//		}else{
//			System.out.println(" �̴�");
//		}
//	}
	
	
//	-----------------------------
	public boolean equals(Object obj){
		Account as = (Account)(obj);
		if(a.equals(as.a)){
			return true;
		}
		else 
			return false;
		
	}

//	-----------------------------

	@Override
	public String toString() {
		return "Account [a=" + a + ", b=" + b + "]";
	}


}
