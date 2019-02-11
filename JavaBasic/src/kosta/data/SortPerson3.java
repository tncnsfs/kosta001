// ����� �̸��� ������������ compareTo �� ����Ͽ� ���ı����� �� ���� �ϱ� 

package kosta.data;


public class SortPerson3 implements Comparable<SortPerson3>{
	private String name;
	private int age; 
	
	public SortPerson3() {
		super();
	}



	public SortPerson3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
//--------------------------------------------
	@Override
	public int compareTo(SortPerson3 p) {
		// ���̸� �������� ���� 
		// �Ķ���� ���� 2��° ���� 
		
		if(age < p.age){
			return -1;
		}else if(age > p.age){
			return 1;
		}
		
		return 0;
		
	}
	
	

//--------------------------------------------
	



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


//--------------------------------------------
	
}
