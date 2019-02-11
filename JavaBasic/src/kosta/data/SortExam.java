// 181115//  정렬기준을 재설정시 => Comparator
// 최초의 정렬기준 설정 => Comparable 
package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<>(new Sort_Desending());
		
		for(int i =0; set.size()<6; i++){
			int num = r.nextInt(45)+1;
			set.add(num);
		}
		
		System.out.println(set);
		
		
		
		
		
		
	}

}
