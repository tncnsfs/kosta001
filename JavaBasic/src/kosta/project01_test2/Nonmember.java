package kosta.project01_test2;

public class Nonmember extends Movie implements User{

	private String name;
	private String phoneNo;

	public Nonmember() {
	}

	public Nonmember(int titleNum, int date, int time, String name, String phoneNo) {
		super(titleNum, date, time);
		this.name = name;
		this.phoneNo = phoneNo;
	}

	

	public Nonmember(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Nonmember [name=" + name + ", phoneNo=" + phoneNo + ", movie=" + movie + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getphoneNo() {
		return phoneNo;
	}

	public void setphoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public void show() {

		int a = super.getTitleNum();
		if (super.getDate() == 0) {
			System.out.println("��ȸ�� [�̸� :" + name+"] ���� ���೻���� �����ϴ�." );
			
		} 
		else {
			System.out.println("��ȸ�� [�̸� :" + name +"]�� ���೻�� �Դϴ�. ");
			System.out.println(	"�� �� :" + super.movie[a] + "\t\t �� ¥ :" + super.getDate() + "\t\t �� ���� �ð� : " + super.getTime() +" : 00");
			System.out.println("---------------------------------------------------------------------------------");
		}
	
	}

}
