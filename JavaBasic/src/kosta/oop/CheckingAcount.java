package kosta.oop;

import kosta.Mission_oop_01.Account;

public class CheckingAcount extends Account {
	
	String cardNo;

	
	public CheckingAcount(){}


	public CheckingAcount(String id, String name, long balance, String cardNo) {
		super(id, name, balance);
		this.cardNo = cardNo;
	}
	
	
	
	

}
