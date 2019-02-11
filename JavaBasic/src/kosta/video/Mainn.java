package kosta.video;

public class Mainn {
	public static void main(String[] args) {

		Video v1 = new Video("1", "1987", "하정우");
		Video v2 = new Video("2", "신과함께", "마동석");
		
//		int count; 
		
		

		
		GeneralMember arr[] = {
				new GeneralMember("a", "홍길동", "가산동", v1), 
				new SpecialMember("b", "박길동", "강남", v2,  1200)
		};

		
		for(int i = 0; i<arr.length; i++){
			arr[i].printMember();
		}
		
		
		
		GeneralMember gm = 
				new GeneralMember("a", "홍길동", "가산동", v1);
		
//		gm.printMember();
		
		
		SpecialMember sm = 
				new SpecialMember("b", "박길동", "강남", v2, 1000);
		
//		sm.printMember();
		
	
		
	}

}
