package kosta.project01;

public class NoLogin extends Movie{
	
	private String name, phoneNo;

	public NoLogin() {}

	public NoLogin(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	
	

	@Override
	public String toString() {
		return "NoLogin [name=" + name + 
				", phoneNo=" + phoneNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	
	



}
