package kosta.thread;

public class MultithreadExample1 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();	// 스레드를 생성 
		thread.start();
		for(char ch = 'A'; ch<= 'Z'; ch++){
			System.out.println(ch);
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}		
		
	}

}
