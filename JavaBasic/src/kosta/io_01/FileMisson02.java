// Input/OutputStream »ç¿ë 
package kosta.io_01;

import java.io.File;

public class FileMisson02 {

	public static void main(String[] args) {
		
		String source= "C:\\Users\\KOSTA\\Documents\\testF\\test00\\test01.txt";
		String dest = 	"C:\\Users\\KOSTA\\Documents\\testF\\test00\\test024.txt";
		
		
		try {
			CopyUtil02.copyFile(new File(source), new File(dest));
			
//			System.out.println(source);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
