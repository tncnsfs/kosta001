package koata.data.h1811;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {
		public static void main(String[] args) {
			
			// 2018�� 11�� Ķ���� ����� 
			Calendar gc = Calendar.getInstance();
//			int n = gc.getActualMaximum(Calendar.DATE);
//			System.out.println(n);
			
			int menu,mon,day,week1; 
			Scanner sc = new Scanner(System.in);
			System.out.print(" �� �Է�: ");
			menu = sc.nextInt();
			mon = menu -1;
			gc.set(2018,mon,01);
			
			System.out.print(" �� �Է�: ");
			day= sc.nextInt();
			
			
			gc.set(2018,mon,menu);
			gc.set(menu, mon, day);
			week1 = gc.get(Calendar.DAY_OF_WEEK);
			
			

			char [] week = {'��', '��', 'ȭ', '��', '��', '��', '��'};
			int [] arr;
			char c = 0;
			
			for(int i = 1; i<week.length; i++){
					c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			}
			int d= gc.getActualMaximum(Calendar.DATE);
			
			String daTe = gc.get(Calendar.DATE) + "��";
			
			System.out.println("d�� :" + d);
			System.out.println("���� c�� :" + c);
			System.out.println("daTe�� :" + daTe);
			System.out.println("week1 :" + week1);
			
			
			
			for(int i = 0; i<week.length; i++){
				System.out.print(week[i] + "\t");
			}
			System.out.println();
			
			System.out.println(c);
			int a = 0; 
			for( int i =1; i <= d; i++){
				System.out.print(i+ "\t");
			}
			System.out.println();
			
		}

}
