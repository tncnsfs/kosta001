package kosta.data;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedList_01 {
	
	public static void main(String[] args) {
		
		
		// stack: LinkedList 자료 구조 
		
//		LinkedList<Integer> stack = new LinkedList<Integer>();
//		
//		stack.addLast(new Integer(12));
//		stack.addLast(new Integer(59));
//		stack.addLast(new Integer(7));
//		
//		while(!stack.isEmpty()){
//			Integer num = stack.removeLast();
//			System.out.println(num);
//		}
		
		// 큐 : LinkedList 자료구조 
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		while(!queue.isEmpty()){
			String str = queue.poll();
			System.out.println(str);
		}
		
//		-----------------------------
		
		
		
		
		
	}
}
