package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {
	
	Member m;
	
	
	// ���Ͽ� �ִ� Member ��ü�� ������ȭ <- ���� �����´ٴ� ��
	public void read(){
		ObjectInputStream ois = null;
		try {
			
			ois = new ObjectInputStream(new FileInputStream("object.csv"));
			m = (Member)ois.readObject(); // ������ȭ �ϼ� 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}  
	
	
	
	// Member ��ü�� ���� ���Ͽ� ����ȭ 
	public void write(){
		
		m = new Member("ȫ�浿", 20);
		ObjectOutputStream oos = null; 
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("object.csv"));
			oos.writeObject(m); // ���Ͽ� ����ȭ �ϼ� 
			
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
