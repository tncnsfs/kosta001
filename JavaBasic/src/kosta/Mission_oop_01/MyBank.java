package kosta.Mission_oop_01;

public class MyBank {
	Customer customers[];
	int customersNum;
	
	public MyBank(){
		customers = new Customer[10];
	}
	
	
	//-------------------------------------------------------

	public Customer[] getCustomers() {
		return customers;
	}


	public void setCustomers(Customer[] customers) {
		
	}


	public int getCustomnersNum() {
		return customersNum;
	}


	public void setCustomnersNum(int customnersNum) {
		this.customersNum = customnersNum;
	}


//-------------------------------------------------------
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}


	public Customer getCustomer(String id) {
		
		Customer cust = null; 
		for(int i =0; i<customersNum; i++){
			if(customers[i].getId().equals(id)){
				cust = customers[i];
				break;
			}
		}
		
		return cust; 
		
//		int index = 0; 
//		
//		for(int i = 0; i< customersNum; i++){
//			if(id.equals(customers[i].getName()))
//				index = i;
//		}
//		return customers[index];
	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[] = new Customer[customersNum];
		
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		System.out.println("printNum=>" + customersNum);

		return newCustomers;
	}
	
	

}
