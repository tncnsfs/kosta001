package koata.data.h1811;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		
		Random r = new Random();
		
//		int num1 = r.nextInt(9); // 0~9
		String temp[] = null;
		
		
		
		// ī����� 
		String cards[] = {"ī��1","ī��2","ī��3","ī��4","ī��5",
									"ī��6","ī��7","ī��8","ī��9","ī��10"};
		
		
		for(int i =1; i<100; i++){
			
			int num1 = r.nextInt(9); // 0~9
			int num2 = r.nextInt(9); // 0~9
			
			String temp1 = cards[num1];
			cards[num1] = cards[num2];
			cards[num2] = temp1;
		}
		
		for(String s : cards){
			System.out.println(s + ",");
		}
		
	}

}
