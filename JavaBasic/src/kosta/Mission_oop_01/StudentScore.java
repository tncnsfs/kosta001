package kosta.Mission_oop_01;

public class StudentScore {
	
//	Filed 康开
//	----------------------------------------------
	private String id; 
	private int engSc, matSc, korSc;
	private double total, aver;
	
	
//	积己磊 康开
//	----------------------------------------------

	public StudentScore() {
		super();
	}
	
	

	public StudentScore(String id, int engSc, int matSc, int korSc, double total, double aver) {
		super();
		this.id = id;
		this.engSc = engSc;
		this.matSc = matSc;
		this.korSc = korSc;
		this.total = total;
		this.aver = aver;
	}




//	GetterSetter 康开
//	----------------------------------------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getEngSc() {
		return engSc;
	}
	public void setEngSc(int engSc) {
		this.engSc = engSc;
	}
	public int getMatSc() {
		return matSc;
	}
	public void setMatSc(int matSc) {
		this.matSc = matSc;
	}
	public int getKorSc() {
		return korSc;
	}
	public void setKorSc(int korSc) {
		this.korSc = korSc;
	}



	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
	
	
	
	
	
}
