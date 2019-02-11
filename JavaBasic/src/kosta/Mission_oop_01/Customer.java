package kosta.Mission_oop_01;

public class Customer {
	
	private String id;
	private String name;
	private long balance; 
	private Account account;
	
	
	// StudentArray 积己磊 康开 
	// ----------------------------------
	public Customer() {}
	
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		account = new Account(id, name, balance);
	}

	
	//GetterSetter 康开
	// ----------------------------------
	public Account getAccount() {
		return account;
	}
	
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("Id :" + getId());
		System.out.println("getName() :" + getName());
		System.out.println("getAccount() :" + getAccount());
		
	}

	

}
