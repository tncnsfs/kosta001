package koata.data.h1811;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		
		int a, b;
		String c, d; 
		
		
		System.out.println("�׽�Ʈ �Է�: ");
		Scanner sc = new Scanner(System.in);
		
		Calendar cd = Calendar.getInstance();
		
		Date tm = cd.getTime();
		
		System.out.println(tm);
		
		int tm2 = tm.getMonth()+1;
		
		long tm1 = tm.getDate();
		
		
		
		System.out.println("tm1��: " + tm1);
		System.out.println("tm2��" + tm2);
		
		
//		for(int i=0; i<)
		
		
	}

}
