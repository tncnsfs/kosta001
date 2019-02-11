package kosta.project01_final01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Reservation {
	int seat[][] = new int[7][2];
	static int arr[][][] = new int[14][5][5];
	private int row;
	private int column;
	Calendar gc = Calendar.getInstance();
	private int todayDate = gc.get(Calendar.DATE);
	private int month = gc.get(Calendar.MONTH) + 1;
	private int week = gc.get(Calendar.DAY_OF_WEEK);

	// -------------------------------------- 캘린더 출력 및 날짜 선택
	public int showCalender() {
		Scanner sc = new Scanner(System.in);
		gc.set(2018, month, todayDate);

		System.out.println();
		System.out.println("-------------------<" + month + "월>-------------------");
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		System.out.println();

		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}

		for (int i = todayDate; i <= todayDate + 6; i++) {
			System.out.print(i + "\t");
			if ((week - todayDate + i) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("***********날짜를 선택하세요. ************ ");
		System.out.print(" 날짜 : ");
		int movieDate = sc.nextInt();

		return movieDate;

	}

	// ------------------------------영화선택
	public int selectMovie() {
		Scanner sc = new Scanner(System.in);

		System.out.println("***********영화를 선택하세요. ************ ");
		String[] movie = { "1. 보헤미안 랩소디", "2. 신비한 동물사전" };
		for (int i = 0; i < movie.length; i++) {
			System.out.println(movie[i]);
		}

		System.out.print("영화 번호 : ");
		int movieNum = sc.nextInt();

		return movieNum;
	}

	// -----------------------------------------------영화별 시간표 데이터 출력 및 선택
	public int showTime(int movieNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***********시간을 선택하세요. ************");
		System.out.println("-------------------시간표-------------------");
		String arr[] = { "11:00", "14:00" };

		for (int i = 0; i < arr.length; i++) {
			if (movieNum - 1 == i)
				System.out.println(arr[i]);
		}
		System.out.print("시간 :");
		while (true) {
			int time = sc.nextInt();
			if (movieNum == 1) {
				if (time != 11)
					System.out.print(time + "시에 상영하는 영화가 없습니다. \n다시 입력하세요. :");
				else
					return time;
			} else if (movieNum == 2) {
				if (time != 14)
					System.out.print(time + "시에 상영하는 영화가 없습니다. \n 다시 입력하세요. :");
				else
					return time;
			}
		}
	}

	// ---------------------------------------------좌석 출력 및 선택
	public void selectSeat(int date, int movie_num) {
		Scanner sc = new Scanner(System.in);
		int seatNum;

		for (int num = 1; num <= 14;) {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 2; j++) {
					seat[i][j] = num;
					num++;
				}
			}
		}

		for (int num = 1; num <= 14; num++) {
			if (seat[date - todayDate][movie_num - 1] == num) {

				System.out.println();
				System.out.println("***********좌석을 선택하세요. ************");
				System.out.println("-----screen-----");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++)
						System.out.print(arr[num][i][j] + " ");
					System.out.println("	");
				}

				System.out.println("원하시는 좌석을 선택하세요. ※0 선택가능/1 선택불가능");
				System.out.print("예 ) 1열 1행 : 1 1");
				System.out.println();
				row = sc.nextInt();
				column = sc.nextInt();

				arr[num][row - 1][column - 1] = 1;

				System.out.println("-----screen-----");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++)
						System.out.print(arr[num][i][j] + " ");
					System.out.println();
				}
			}
		}
	}

	public void RemoveSeat	(int date, int movie_num, int row, int column) {
		int deletenum = seat[date - todayDate][movie_num - 1];
		arr[deletenum][row][column] = 0;

	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Reservation() {
		super();
	}

}
