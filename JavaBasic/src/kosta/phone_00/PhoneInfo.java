package kosta.phone_00;

//상태(name, phoneNo, birth) : String 
//기능(show) - 출력


public class PhoneInfo {

	private String name;
	private String phoneNo;
	private String birth;
	
	public PhoneInfo(String name){}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	public void show(){
		System.out.println("이름 :" + name);
		System.out.println("전화번호 :" + phoneNo);
		System.out.println("생일 :" + birth);
	}
	
	
	

}




