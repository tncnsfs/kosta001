package kosta.data;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedList_01 {
	
	public static void main(String[] args) {
		
		
		// stack: LinkedList �ڷ� ���� 
		
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
		
		// ť : LinkedList �ڷᱸ�� 
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
		while(!queue.isEmpty()){
			String str = queue.poll();
			System.out.println(str);
		}
		
//		-----------------------------
		
		
		
		
		
	}
}
