package phoneArray_ksh;

import java.io.Serializable;

public class PhoneInfo implements Serializable {
	// string���� ����(name, phoneno,birth)
	// ��� : show - ���

	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNum=" + phoneNum + ", birth=" + birth + ", index=" + index + "]";
	}


	private String name;
	private String phoneNum;
	private String birth;

	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public PhoneInfo() {

	}

	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}


	public void show() {
		System.out.println("-----------------------------------");
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phoneNum);
		System.out.println("���� : " + birth);
	}

}
