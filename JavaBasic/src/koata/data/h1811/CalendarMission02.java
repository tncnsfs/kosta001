// Scanner �޷� �Է� �ޱ� 
// �� �Է�: 12 
// <2018 12��> 
// �� �� ȭ �� �� �� �� 
// 							1 
// 2	3	4	5	6	7	8
package koata.data.h1811;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission02 {
		public static void main(String[] args) {
			
			// 2018�� 11�� Ķ���� ����� 
			Calendar gc = Calendar.getInstance();
			int n = gc.getActualMaximum(Calendar.DATE);
			System.out.println(n);
			
			
			// Scanner �޷� �Է� �ޱ� 
			// �� �Է�: 12 
			// <2018 12��> 
			// �� �� ȭ �� �� �� �� 
			// 							1 
			// 2	3	4	5	6	7	8
			
			gc.set(2018, 11, 1); // 2018.12.01
			int week = gc.get(Calendar.DAY_OF_WEEK);
			
			System.out.println("<2018 12��> ");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			for(int i=1; i<week; i++){
				System.out.print("\t");
			}
			
			for(int i =1; i< gc.getActualMaximum(Calendar.DATE); i++){
				System.out.print(i + "\t");
				if((week-1 +i )%7==0)
					System.out.println();
			}
			
			System.out.println(week);
			
//			int menu; 
			
//			Scanner sc = new Scanner(System.in);
//			System.out.print(" �� �Է�: ");
//			menu = sc.nextInt();
//			mon = menu -1;
//			gc.set(2018,mon,01);
			
		}

}
