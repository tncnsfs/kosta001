//  CRUD 개발하기 
// 1.추가하기,		2.읽기(전체출력),		3.조회하기,	4. 수정하기(업로드하기),		5.삭제하기,		6.종료하기


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
	
	// 추상클래스 모델링 
	// 1, name: 이름, phoneNo: 폰넘버, birth: 생년월일
	// 2, 모델링 출력하기 
	
	
	public void print(){
		
		System.out.print("|"+ "이름 :" + "|"+ name + "\t" );
		System.out.print("|"+ "폰넘버 :"+ "|" + phoneNo +"\t");
		System.out.print("|"+ "생년월일 :"+ "|" + birth + "\t");
		
		
	}
}
