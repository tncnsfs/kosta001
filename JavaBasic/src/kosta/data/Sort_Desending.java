package kosta.data;

import java.util.Comparator;

public class Sort_Desending implements Comparator<Integer> {
	
//	public Desending() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// 새로운 정렬기준 정의만 하면 됨. 
		if(o1 < o2){
			return 1;
		}else if(o1 > o2){
			return -1;
		}
		
		return 0;
		
		
		
	}

}
