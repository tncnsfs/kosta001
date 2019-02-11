package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로한 Map 자료구조를 구현하자. 
		// 김자바 : 90 , 박자바 : 80 
		// 총점, 평균, 최대점수 , 최소점수 
		
		Map<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("박자바", 70);
		map.put("조자바", 50);
		map.put("정자바", 60);
		map.put("한자바", 54);
		map.put("이자바", 60);
		map.put("임자바", 75);
		
		// key 값 추출
		Set<String> set = map.keySet();
		System.out.println("시험명단: "  + set);

		// key값 추출 
		// Map = > Collection => Iterator 
		Collection<Integer> values = map.values();
		Iterator<Integer> iter =values.iterator();
		
		System.out.println("시험점수 :" + map.values());
//		System.out.println(map.values().iterator());
		
		int total = 0; 
		while(iter.hasNext()){
			int num = iter.next();
			total += num;
		}
		
		System.out.println("총점: " + total);
		System.out.println("총점: " + total/map.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
		
		
		
//-------------------------------------------------------------
		//		Map<String, Integer> map = new HashMap<>();
//		
//		map.put("김자바", 90);
//		map.put("박자바", 80);
//		
//		int kim = map.get("김자바");
//		int park = map.get("박자바");
//		
//		int total = kim + park;
//		int aver = total/map.size();
//		int maxv = (kim > park)? kim:park;
//		int miniv = (kim < park)? kim:park;
//		
//		System.out.println("총점은 => " + total + "\n"	+ "평균점수=> " + aver + 
//		"\n"	+ "최대점수 => " + maxv + "\n"+ "최소점수 => " + miniv);
//		
//		
//-------------------------------------------------------------
		
		
		
	}

}
