

package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class SortExam2 {

	public static void main(String[] args) {
//		TreeSet<Integer> set = new TreeSet<>(new SortPerson3());
		List<SortPerson2> list = new ArrayList<>();
		
		list.add(new SortPerson2("���ڹ�", 10));
		list.add(new SortPerson2("���ڹ�", 20));
		list.add(new SortPerson2("���ڹ�", 30));
		list.add(new SortPerson2("���ڹ�",	43));
		list.add(new SortPerson2("���ڹ�", 90));
		list.add(new SortPerson2("���ڹ�", 60));
		list.add(new SortPerson2("���ڹ�", 70));
		list.add(new SortPerson2("���ڹ�",	83));
		list.add(new SortPerson2("���ڹ�", 50));
		
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println(list.get(0).getName());
		
		Collections.sort(list, new Comparator<SortPerson2>() {

			@Override
			public int compare(SortPerson2 o1, SortPerson2 o2) {
				// �̸��� �������� ��������
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				} else if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println(list);

		

//		for(int i =0; i<list.size(); i++){
//			for(int j =0; j<i; j++){
//			int num = (list.get(i).getName()).compareTo((list.get(j).getName()));
//				set.add(num);
//			}
//			System.out.println(list.get(i));
//		}
		
		

		
		
		
		
	}

}
