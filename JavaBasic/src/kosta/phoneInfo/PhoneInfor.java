//  CRUD �����ϱ� 
// 1.�߰��ϱ�,		2.�б�(��ü���),		3.��ȸ�ϱ�,	4. �����ϱ�(���ε��ϱ�),		5.�����ϱ�,		6.�����ϱ�


package kosta.phoneInfo;

public class PhoneInfor {
	
	String name, phoneNo, birth;

	public PhoneInfor(){}
	
	public PhoneInfor(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	} 
	
	// �߻�Ŭ���� �𵨸� 
	// 1, name: �̸�, phoneNo: ���ѹ�, birth: �������
	// 2, �𵨸� ����ϱ� 
	
	
	public void print(){
		
		System.out.print("|"+ "�̸� :" + "|"+ name + "\t" );
		System.out.print("|"+ "���ѹ� :"+ "|" + phoneNo +"\t");
		System.out.print("|"+ "������� :"+ "|" + birth + "\t");
		
		
	}
}
