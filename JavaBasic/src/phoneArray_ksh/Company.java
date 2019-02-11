package phoneArray_ksh;

import java.io.Serializable;

public class Company extends PhoneInfo implements Serializable{
	@Override
	public String toString() {
		return "Company [name =" + super.getName() + ", phoneNo =" + super.getPhoneNum()+", birth ="+super.getBirth()+", dept=" + dept + ", position=" + position + "]";
	}

	private String dept;
	private String position;

	public Company() {
	}

	public Company(String name, String phoneNum, String birth, String dept, String position) {
		super(name, phoneNum, birth);
		this.dept = dept;
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void show() {
		super.show();
		System.out.println("부서 : " + dept);
		System.out.println("직책 : " + position);
	}
}
