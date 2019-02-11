package kosta.basic02.String;

public class StringExam {
	public static void main(String[] args) {
		String str= "ABC";
		String str2 = new String("abc");
		
		// String       �Һ��� 
		String str3 = str.concat("DEF");
		System.out.println(str);
		System.out.println(str3);
		
		String sql = "select * from board";
		int num =10;
		if(num == 10){
			sql +=" where num = 10";
		}
		
		System.out.println(sql); 
		
		// StringBuffer, StringBuilder  ������ ���� 
		StringBuffer sb = new StringBuffer("������");
		sb.append("�󸶹�");
		
		System.out.println(sb);
		
		// �ش� ���ڿ��� ��ġ�ľ� => indexOf() => 0����, ������ -1 ���� 
		System.out.println(sql.indexOf("$"));
		System.out.println(sql.indexOf("l"));
		
		
		// ���ڿ� ���� length() �޼ҵ� ��� 
		System.out.println(sql.length());
		
		// ���ڿ� �κ����� 
		System.out.println(sql.substring(0, 12));
		
		// board ��ġ �ľ��ϱ� 
//		System.out.println(sql.indexOf("board"));
//		System.out.println(sql.substring(14, 19));
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		
		//  �κ���ġ ���� �̼� 
		String fileName = "kosta.jpg";
		
		String head = "";
		String pattern = "";
		
//		head = (fileName.substring(fileName.indexOf("kosta"), fileName.indexOf(".")));  // kosta 
		head = (fileName.substring(0, fileName.indexOf(".")));  // kosta 
		
//		pattern = (fileName.substring(fileName.indexOf(".")+1)); // jpg
		pattern = (fileName.substring(fileName.indexOf(".")+1, fileName.length())); // jpg
		
		
		System.out.println("head : " + head);
		System.out.println("pattern : " + pattern);
		
		
		// trim Ű����� �յ� ���� ���� ����----------------------------------------
		
		String id = "kosta";
		String m_id = "kosta ";
		
		if(id.trim().equals(m_id.trim())){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���.");
		}
		
		
		// ���ڿ� => �迭��ȯ --split Ű���� ��� --------------------------------------
		// split Ű���� ���

		String fruit = "���,��,����,����";
		String arr[] = fruit.split(",");
		
		for(String name : arr){
			System.out.println(name);
		}
		
		// ������ => ���ڿ� ��ȯ --------------------------------------
		// ������  ���ڿ� ����� ���ڿ� ��ȯ --------------------------------------
		int n = 100; 
		String s = n + "";
		
		
		
		//	fileName --> Ȯ���� gif, jpg ���� ã�� => �̹��� ����: endsWith() 
		// 		String fileName = "kosta.jpg";
		if(fileName.endsWith("gif") || fileName.endsWith("jpg")){
			System.out.println("�̹��� ���� ");
		}
		
	}
//	--------------------------------------
	
	
	
	
	

}
