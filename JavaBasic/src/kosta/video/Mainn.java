package kosta.video;

public class Mainn {
	public static void main(String[] args) {

		Video v1 = new Video("1", "1987", "������");
		Video v2 = new Video("2", "�Ű��Բ�", "������");
		
//		int count; 
		
		

		
		GeneralMember arr[] = {
				new GeneralMember("a", "ȫ�浿", "���굿", v1), 
				new SpecialMember("b", "�ڱ浿", "����", v2,  1200)
		};

		
		for(int i = 0; i<arr.length; i++){
			arr[i].printMember();
		}
		
		
		
		GeneralMember gm = 
				new GeneralMember("a", "ȫ�浿", "���굿", v1);
		
//		gm.printMember();
		
		
		SpecialMember sm = 
				new SpecialMember("b", "�ڱ浿", "����", v2, 1000);
		
//		sm.printMember();
		
	
		
	}

}
