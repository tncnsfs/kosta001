package kosta.Interface.Study01;

public class Work extends Man implements Speakable {
	
	public Work(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + "������ ���ؾ� �Ѵ�.");
	}

}
