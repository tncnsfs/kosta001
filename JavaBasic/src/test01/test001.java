package test01;

import java.util.LinkedList;

public class test001 {

	public static void main(String[] args) {
		
		test002 t = new test002();
		
		String a = "abc";
		double b; 
		int c = 10;
		
		
		LinkedList<Integer> ad = new LinkedList<>();
		LinkedList<String> as = new LinkedList<>();
		
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		
		ad.push(25);
		ad.push(5);
		ad.push(15);
		ad.push(35);

		
		int aad= ad.iterator().next();
		int aad1= ad.iterator().hashCode();
		boolean aad2= ad.iterator().hasNext();
		String aad3= ad.iterator().toString();
		ad.remove();
		
		
		System.out.println(ad);
		System.out.println(ad.remove());
		System.out.println(ad);
		System.out.println(aad);
		System.out.println(aad3);
		
	}

}


