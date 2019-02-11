package kosta.Interface.Study01;

public class Student extends Man {
	
	public Student(String name) {
		super(name);
	}

	public void speak(){
		System.out.println(getName() + "공부나 열심히해");
	}
}
