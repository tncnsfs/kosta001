package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqularExam2 {

	public static void main(String[] args) {
		
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "card",
				"date", "dic", "diraaa"
				
		};
		
		
//		Pattern p = Pattern.compile("c[a-z]*");
/*		Pattern p = Pattern.compile("[a-z]*a");
		
		for(int i = 0; i<data.length; i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches()){
				System.out.println(data[i]);
			}
			
		}*/

//		------------------------------------
		
//		String source = "abc?def?gh";
//		String pattern = "\\w*";
//		
//		Pattern pattern2 = Pattern.compile(pattern);
//		Matcher matcher2 = pattern2.matcher(source);
//		
//		while(matcher2.find()){
//			System.out.println(matcher2.group());
//			
//		}
		
//		------------------------------------
		String source2 = "HP : 010-1111-2222, HOME : 02-222-2222";
		
		String pattern1 = "(0\\d{1,2})-(\\d{3,4})-(\\d){4}";
		
		Pattern pattern3 = Pattern.compile(pattern1);
		Matcher macher3 = pattern3.matcher(source2);
		
		while(macher3.find()){
			System.out.println(macher3.group());
		}
				
		
		
		
	}

}
