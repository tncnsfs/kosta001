// File 클래스 
// Input/OutputStream 사용 
// FileInput/FileOutputStream 사용 

package kosta.io_01;

import java.io.File;

public class FileMisson04 {

	public static void main(String[] args) {
		
		
		String source= "C:\\Users\\KOSTA\\Documents\\testF";
		String dest =  "C:\\Users\\KOSTA\\Documents\\testFTest001";
		
		
//		File f = new File("C:\\Users\\KOSTA\\Documents\\testF\\test00", "\\test01.txt");
		
		
		try {
			
			CopyUtil04.copyDirectory(new File(source), new File(dest));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
