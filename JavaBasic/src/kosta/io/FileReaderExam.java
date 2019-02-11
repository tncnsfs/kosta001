package kosta.io;

import java.io.FileReader;

public class FileReaderExam {

	public static void main(String[] args) {

		FileReader reader = null;
		char arr[] = new char[50];

		try {
			reader = new FileReader("poem.txt"); 
			// 배관에 연결됨

			reader.read(arr);
			System.out.print(arr);

			// while (true) {
			// int data = reader.read();
			// if(data == -1){
			// break;
			// }
			// char ch = (char)data;
			// System.out.print(ch);
			// }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

}
