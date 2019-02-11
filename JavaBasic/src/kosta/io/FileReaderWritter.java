// 카피 파일 만들기. 
package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWritter {
	public static void main(String[] args) {
		
		FileReader reader1 = null;
		char arr[] = new char[50];
		
		
		FileWriter writer1 = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력: ");
		String str = "";
		String poem = "";
		
		while (!(str = arr.toString()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		
		try {
			reader1 = new FileReader("poem2.txt");
			reader1.read(arr);
			System.out.println(arr);
			
			
			str = arr.toString();
			writer1 = new FileWriter("poem3_copy.txt");
			writer1.write(poem);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader1.close();
				writer1.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
