package kosta.data;

import java.util.Comparator;

public class Sort_Desending implements Comparator<Integer> {
	
//	public Desending() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// ���ο� ���ı��� ���Ǹ� �ϸ� ��. 
		if(o1 < o2){
			return 1;
		}else if(o1 > o2){
			return -1;
		}
		
		return 0;
		
		
		
	}

}
