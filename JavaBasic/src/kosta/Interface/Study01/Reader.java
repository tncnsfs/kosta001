package kosta.Interface.Study01;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + "�ڹ�ȭ����");
	}

}
