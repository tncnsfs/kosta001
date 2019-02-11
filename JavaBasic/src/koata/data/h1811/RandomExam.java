package koata.data.h1811;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		
		Random r = new Random();
		
//		int num1 = r.nextInt(9); // 0~9
		String temp[] = null;
		
		
		
		// 카드게임 
		String cards[] = {"카드1","카드2","카드3","카드4","카드5",
									"카드6","카드7","카드8","카드9","카드10"};
		
		
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
