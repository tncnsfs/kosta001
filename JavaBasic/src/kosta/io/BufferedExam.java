package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedExam {

	public static void main(String[] args) {
		// 기존 Scanner 객체를 이용하지 않고 
		// System.in => InputStream => InnputSteamReader <-- 바이트를 문자스트림으로 읽어오기  => BufferedReader 와 연결 
		
//		InputStream in = System.in;	<=		InputStreamReader isr = new InputStreamReader(in);	<=		BufferedReader br = new BufferedReader(isr);

//		InputStream in = System.in;			
//		InputStreamReader isr = new InputStreamReader(in);			
//		BufferedReader br = new BufferedReader(isr);
		
//		BufferedReader br = new BufferedReader(isr); 
//		InputStreamReader isr = new InputStreamReader(in);
//		InputStream in = System.in;			

		
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.print("입력: ");
			while((str = br.readLine()) != null){
				str += "\n"; 
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
