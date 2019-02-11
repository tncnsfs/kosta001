package phoneArray_ksh;

import java.io.Serializable;
import java.util.Scanner;

public class University extends PhoneInfo implements Serializable {
	 @Override
	public String toString() {
		 
		return "University [name =" + super.getName() + ", phoneNo =" + super.getPhoneNum()+", birth ="+super.getBirth()+", major=" + major + ", studentNo=" + studentNo + "]" ;
	}
	private String major;
	 private String studentNo;
 
	
	
	public University() {
	}

	public University(String name, String phoneNum, String birth, String major, String studentNo) {
		super(name, phoneNum, birth);
		this.major = major;
		this.studentNo = studentNo;

	}
	
	public void show(){
		super.show();
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + studentNo);
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
}
