package kosta.MinesAccount;

public class MinusAccount {
	
	// �ʵ� ���� �Է��ϱ� 
	
	String id, accountNo;
	double balance;

	
	// ������ ����� 
	
	public MinusAccount(){}

	
	public MinusAccount(String id, String accountNo, double balance) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	
	
	// getterSetter ����� 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	
//	void printMinus(){
//		for(int i =0; i<5; i++){
//			
//		}
//	}
	
	
	
	
	

}
