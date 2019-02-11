package kosta.Mission_oop_01;

public class StudentsArray extends StudentScore{
	
	private String name; 
	static StudentScore[] sscore;
	
	
	public StudentsArray() {}
	
	

	public StudentsArray(String id, int engSc, int matSc, int korSc, double total, double aver, String name,
			StudentScore[] sscore) {
		super(id, engSc, matSc, korSc, total, aver);
		this.name = name;
		this.sscore = sscore;
	}

	//GetterSetter ¿µ¿ª
	// ----------------------------------

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public StudentScore[] getSscore() {
		return sscore;
	}


	public void setSscore(StudentScore[] sscore) {
		this.sscore = sscore;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
