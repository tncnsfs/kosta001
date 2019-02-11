package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// �̸�, ������ �ѽ������� Map �ڷᱸ���� ��������. 
		// ���ڹ� : 90 , ���ڹ� : 80 
		// ����, ���, �ִ����� , �ּ����� 
		
		Map<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 70);
		map.put("���ڹ�", 50);
		map.put("���ڹ�", 60);
		map.put("���ڹ�", 54);
		map.put("���ڹ�", 60);
		map.put("���ڹ�", 75);
		
		// key �� ����
		Set<String> set = map.keySet();
		System.out.println("������: "  + set);

		// key�� ���� 
		// Map = > Collection => Iterator 
		Collection<Integer> values = map.values();
		Iterator<Integer> iter =values.iterator();
		
		System.out.println("�������� :" + map.values());
//		System.out.println(map.values().iterator());
		
		int total = 0; 
		while(iter.hasNext()){
			int num = iter.next();
			total += num;
		}
		
		System.out.println("����: " + total);
		System.out.println("����: " + total/map.size());
		System.out.println("�ְ�����: " + Collections.max(values));
		System.out.println("��������: " + Collections.min(values));
		
		
		
//-------------------------------------------------------------
		//		Map<String, Integer> map = new HashMap<>();
//		
//		map.put("���ڹ�", 90);
//		map.put("���ڹ�", 80);
//		
//		int kim = map.get("���ڹ�");
//		int park = map.get("���ڹ�");
//		
//		int total = kim + park;
//		int aver = total/map.size();
//		int maxv = (kim > park)? kim:park;
//		int miniv = (kim < park)? kim:park;
//		
//		System.out.println("������ => " + total + "\n"	+ "�������=> " + aver + 
//		"\n"	+ "�ִ����� => " + maxv + "\n"+ "�ּ����� => " + miniv);
//		
//		
//-------------------------------------------------------------
		
		
		
	}

}
