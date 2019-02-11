// 사람을 이름을 오른차순으로 compareTo 를 사용하여 정렬기준을 재 정의 하기 

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
		// 나이를 기준으로 정렬 
		// 파라미터 값이 2번째 값임 
		
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
