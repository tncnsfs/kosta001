package kosta.video;


public class SpecialMember extends GeneralMember{
	private int bonusPoint; 
	
	GeneralMember gnm;
	
	public SpecialMember() {
		// TODO Auto-generated constructor stub
	}

	
	public SpecialMember(String id, String name, String address, Video rentalVideo, int bonusPoint) {
		super(id, name, address, rentalVideo);
		this.bonusPoint = bonusPoint;
	}
	
	

	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public GeneralMember getGnm() {
		return gnm;
	}


	public void setGnm(GeneralMember gnm) {
		this.gnm = gnm;
	}


	public void printBonus() {
		// TODO Auto-generated method stub
		System.out.println("회원의 보너스 포인트: " + bonusPoint);
	}


	@Override
	void printMember() {
		// TODO Auto-generated method stub
		super.printMember();
		System.out.print("회원의 보너스 포인트: " + bonusPoint);
	}
	
//	void printMember(){
//		System.out.println();
//		super.printMember();
//		System.out.print("회원의 보너스 포인트: " + bonusPoint);
//		
//	}
	
	
	
}

