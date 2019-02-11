package koata.data.h1811;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {
		public static void main(String[] args) {
			
			// 2018년 11월 캘린더 만들기 
			Calendar gc = Calendar.getInstance();
//			int n = gc.getActualMaximum(Calendar.DATE);
//			System.out.println(n);
			
			int menu,mon,day,week1; 
			Scanner sc = new Scanner(System.in);
			System.out.print(" 월 입력: ");
			menu = sc.nextInt();
			mon = menu -1;
			gc.set(2018,mon,01);
			
			System.out.print(" 일 입력: ");
			day= sc.nextInt();
			
			
			gc.set(2018,mon,menu);
			gc.set(menu, mon, day);
			week1 = gc.get(Calendar.DAY_OF_WEEK);
			
			

			char [] week = {'일', '월', '화', '수', '목', '금', '토'};
			int [] arr;
			char c = 0;
			
			for(int i = 1; i<week.length; i++){
					c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			}
			int d= gc.getActualMaximum(Calendar.DATE);
			
			String daTe = gc.get(Calendar.DATE) + "일";
			
			System.out.println("d는 :" + d);
			System.out.println("요일 c는 :" + c);
			System.out.println("daTe는 :" + daTe);
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
