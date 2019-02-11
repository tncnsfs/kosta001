package kosta.Interface.Study01;

public class SpeakableMain {

	public static void main(String[] args) {
		System.out.println();

		Object[] obj = { new Reader("둘리"), 
										new Work("길동"), 
										new Student("마이콜") };

		for (int i = 0; i < obj.length; i++) {

			if (obj[i] instanceof Speakable) {
				Speakable speaker = (Speakable)obj[i];
//				System.out.print(speaker.speak());
			
			}
		}

	}

}
