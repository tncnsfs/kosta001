package koata.data.h1811;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarExam {

	public static void main(String[] args) {

		// GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();

		// String gcc = gc.get(Calendar.YEAR) + "년";

		// System.out.println(gcc);

		String now = gc.get(Calendar.YEAR) + ", "
		+ (gc.get(Calendar.MONTH) + 1) + ", " 
		+ gc.get(Calendar.DATE) + ", "
//		+ nowDay
		// + gc.get(Calendar.HOUR) + "시 "
		// + gc.get(Calendar.MINUTE) + "분 "
		;
		
//		String nowDay = gc.get(Calendar.DAY_OF_MONTH) + " ";
		int nowDay = gc.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println(nowDay);
		
		

		for (int i = 0; i < 30; i++) {
			if ((now.length() % 7) == 0) {
				System.out.println();
				
			}
			int nowDay1 = (nowDay +i);
			System.out.print(nowDay1+ ",");
		}
//		System.out.println("현재시간 : " + now);

		// 100일 기념일

		// gc.add(Calendar.DATE, 100);
		// String future = gc.get(Calendar.YEAR) + "년 "
		// + (gc.get(Calendar.MONTH) +1) + "월 "
		// + gc.get(Calendar.DATE) + "일 "
		// + gc.get(Calendar.HOUR) + "시 "
		// + gc.get(Calendar.MINUTE) + "분 ";
		// System.out.println("100일 후 : " + future);

		// 첫 만남 날짜 2018/09/13일
		// gc.set(2018, 8, 13);
		// gc.add(Calendar.DATE, 100);
		//
		// SimpleDateFormat dataFormat =
		// new SimpleDateFormat("yyyy-MM-dd hh:mm");
		//
		// String str = dataFormat.format(gc.getTime());
		//
		// System.out.println(str);

		// 요일 관련

		// char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		//
		// for(int i = 2018; i < 2028; i++){
		// gc.set(i, 11, 15);
		// char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
		//
		// System.out.println(i + "년의 나의 생일은 " + c + "요일 입니다.");
		// }

	}

}
