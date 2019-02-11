package kosta.io_01;

import java.io.File;

import javax.swing.text.AbstractDocument.LeafElement;

public class FileExample {

	public static void main(String[] args) {

		File file = new File(".");
		File arr[] = file.listFiles();
		
		for(int cnt = 0; cnt < arr.length; cnt++){
			String name = arr[cnt].getName();
			if(arr[cnt].isFile())
//				System.out.println("%-25s%7d ",name , arr[cnt].length());
			System.out.printf(name, arr[cnt].length(), arr[cnt]);
			else 
				System.out.println();
				System.out.printf("\n" + "else-->" + name + "<--");
		}
		
		System.out.println("==> :" + file.listFiles().length);
		
	}

}
