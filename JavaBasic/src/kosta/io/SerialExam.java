package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {
	
	Member m;
	
	
	// 파일에 있는 Member 객체를 역직렬화 <- 파일 가져온다는 뜻
	public void read(){
		ObjectInputStream ois = null;
		try {
			
			ois = new ObjectInputStream(new FileInputStream("object.csv"));
			m = (Member)ois.readObject(); // 역직렬화 완성 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}  
	
	
	
	// Member 객체를 생성 파일에 직렬화 
	public void write(){
		
		m = new Member("홍길동", 20);
		ObjectOutputStream oos = null; 
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("object.csv"));
			oos.writeObject(m); // 파일에 직렬화 완성 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	} 
	
	
	
	public static void main(String[] args) {
		
		SerialExam se = new SerialExam();
		
		se.write();
		se.m = null; 
		
		se.read();
		
		System.out.println(se.m);
		
	}
}
