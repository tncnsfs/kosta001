package kosta.data;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		int num = list.size();
		
		for(int cnt = 0; cnt<num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
			System.out.println(list.size());
		}
		
	}

}
