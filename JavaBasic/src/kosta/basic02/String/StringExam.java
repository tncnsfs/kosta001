package kosta.basic02.String;

public class StringExam {
	public static void main(String[] args) {
		String str= "ABC";
		String str2 = new String("abc");
		
		// String       불변성 
		String str3 = str.concat("DEF");
		System.out.println(str);
		System.out.println(str3);
		
		String sql = "select * from board";
		int num =10;
		if(num == 10){
			sql +=" where num = 10";
		}
		
		System.out.println(sql); 
		
		// StringBuffer, StringBuilder  가변성 역할 
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		
		System.out.println(sb);
		
		// 해당 문자열의 위치파악 => indexOf() => 0시작, 없으면 -1 리턴 
		System.out.println(sql.indexOf("$"));
		System.out.println(sql.indexOf("l"));
		
		
		// 문자열 길이 length() 메소드 사용 
		System.out.println(sql.length());
		
		// 문자열 부분추출 
		System.out.println(sql.substring(0, 12));
		
		// board 위치 파악하기 
//		System.out.println(sql.indexOf("board"));
//		System.out.println(sql.substring(14, 19));
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		
		//  부분위치 추출 미션 
		String fileName = "kosta.jpg";
		
		String head = "";
		String pattern = "";
		
//		head = (fileName.substring(fileName.indexOf("kosta"), fileName.indexOf(".")));  // kosta 
		head = (fileName.substring(0, fileName.indexOf(".")));  // kosta 
		
//		pattern = (fileName.substring(fileName.indexOf(".")+1)); // jpg
		pattern = (fileName.substring(fileName.indexOf(".")+1, fileName.length())); // jpg
		
		
		System.out.println("head : " + head);
		System.out.println("pattern : " + pattern);
		
		
		// trim 키워드로 앞뒤 공백 문자 제거----------------------------------------
		
		String id = "kosta";
		String m_id = "kosta ";
		
		if(id.trim().equals(m_id.trim())){
			System.out.println("같다");
		}else{
			System.out.println("다르다.");
		}
		
		
		// 문자열 => 배열변환 --split 키워드 사용 --------------------------------------
		// split 키워드 사용

		String fruit = "사과,배,포도,수박";
		String arr[] = fruit.split(",");
		
		for(String name : arr){
			System.out.println(name);
		}
		
		// 정수형 => 문자열 변환 --------------------------------------
		// 정수형  문자열 연산시 문자열 변환 --------------------------------------
		int n = 100; 
		String s = n + "";
		
		
		
		//	fileName --> 확장자 gif, jpg 인지 찾기 => 이미지 파일: endsWith() 
		// 		String fileName = "kosta.jpg";
		if(fileName.endsWith("gif") || fileName.endsWith("jpg")){
			System.out.println("이미지 파일 ");
		}
		
	}
//	--------------------------------------
	
	
	
	
	

}
