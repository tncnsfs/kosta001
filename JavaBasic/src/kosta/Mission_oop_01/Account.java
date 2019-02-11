package kosta.Mission_oop_01;

public class Account {
	
	private String id;
	private String name;
	private long balance;
	
	public Account() {}
	
	public Account(String id, String name, long balance) {
		super();
		this.id = id;
		this.name= name;
		this.balance = balance;
	}

	
	boolean deposit(long amount){
		balance += amount;
		return false;
		
	}
	
	boolean withdraw(long amount){
		if(balance < amount){
			return false; 
		}
		balance -= amount;
		return true; 
	}
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	

}
