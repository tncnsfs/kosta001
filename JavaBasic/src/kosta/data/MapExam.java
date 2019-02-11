package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> map = 
				new HashMap<>();
		
		map.put("1", "SK");
		map.put("2", "�λ�");
		map.put("3", "�ؼ�");
		
		System.out.println("��� ����: " + map.size());
		
		if(map.containsValue("�λ�")){
			map.remove("2");
		}
		System.out.println("��� ����: " + map.size());
		
		
		
		// Map���� => ��ü��� 
		// Map = Set => Iterator �� ��ȯ 
		
		Set set = map.entrySet(); 
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			Map.Entry<String, String> e= 
					(Map.Entry<String, String>)iter.next();
			
			System.out.println("key: "  + e.getKey() + ", value: " + e.getValue());
		
		}
		
		

	
	
	
	}
}










