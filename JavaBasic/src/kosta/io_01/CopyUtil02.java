// 카피 파일 source => dest 로 파일복사 

package kosta.io_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyUtil02{
	
	// 디렉토리 복사하기  
	public static void copyDirectory(File source, File dest) throws Exception{
		dest.mkdir();
		
		File[] fileList = source.listFiles();
		for(int i=0; i<fileList.length; i++){
			File sourceFile = fileList[i]; 
			
			if(sourceFile.isDirectory()){
				File s_destFile = new File(dest, sourceFile.getName());
				copyDirectory(sourceFile, s_destFile);
			}else{
				File destFile = new File(dest, sourceFile.getName());
				copyFile(sourceFile, destFile);
			}
		}
	}

		
	
	
//	파일 복사하기 
	public static void copyFile(File source, File dest) throws Exception {
		FileInputStream in =null; 
		FileOutputStream out = null; 
		byte arr[] = new byte[5000];
		int count =0;
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			
			while((count  = in.read(arr)) != -1){
				out.write(arr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( in != null){
					in.close();
				}
				if(out != null){
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
