package kosta.Mission_oop_01;

public class StudentManager {
	StudentManager sArray[];
	int count;

	public StudentManager(){
		sArray = new StudentManager[10];
	}

//-------------------------------------------------------
	public StudentManager[] getsArray() {
		return sArray;
	}

	public void setsArray(StudentManager[] sArray) {
		this.sArray = sArray;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public StudentManager(StudentManager[] sArray, int count) {
		super();
		this.sArray = sArray;
		this.count = count;
	}
//-------------------------------------------------------

//	public void addStArray(int engSc, int matSc, int korSc){
//		sArray[count++]= new StudentsArray(sdf, 10, 100, 1000, 12.1, 12.2, dsf, sscore);
//	}

	
	

}
