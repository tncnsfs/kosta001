package kosta.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LIstMisson02 {

	public static void main(String[] args) {

		// �迭�� �̿��Ͽ� �ζ� 6��(1~45) �ߺ����� �ʴ� ���ڸ� ����Ͻÿ�.
		Random r = new Random();
		// int[] arr = new int[6];
		//
		//
		// for( int i =0; i<arr.length; i++){
		// arr[i] = r.nextInt(45)+1;
		// for(int j=0; j<i; j++){
		// if(arr[i] == arr[j]){
		// i = i-1;
		// }
		// }
		// }
		//
		// for(int i=0; i<arr.length; i++)
		// System.out.println(arr[i] + ", ");
		// System.out.println();

		// List �� �̿��Ͽ� �ζ� 6��(1~45) �ߺ����� �ʴ� ���ڸ� ����Ͻÿ�.

		List<Integer> list = new ArrayList<>();

		while (true) {
			int n = r.nextInt(45) + 1;
			if (list.contains(n)) {	
				continue;
			} else {
				list.add(n);
			}
			if (list.size() == 6) break;
		}
		
		
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + ", ");
				System.out.println();
		}
			
			
//	�ٿ���		--------------------------
		
	/*	 while(true){
	         int n= r.nextInt(45)+1;
	         if(list.contains(n)){   //?
	            continue;
	         }else{
	            list.add(n);
	         }
	         if(list.size()==6) break;
	      }
	      for(int i=0; i<list.size(); i++){
	         System.out.print(list.get(i) + ", ");*/
			
			
			
//			--------------------------

		// Set�� �̿��Ͽ� �ζ� 6��(1~45) �ߺ����� �ʴ� ���ڸ� ����Ͻÿ�.
		// Random r = new Random();
		//
		// Set<Integer> set = new HashSet<>();
		//
		// for(int i=0; set.size()<6; i++){
		// int n = r.nextInt(45)+1;
		// set.add(n);
		// }
		// System.out.println(set);
			
//			--------------------------
			
			

	}
}
