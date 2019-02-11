package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWritter {

	public static void main(String[] args) {
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		String str = "";
		String poem = "";
		
		
		while (!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		
		
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
