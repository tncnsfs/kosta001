package kosta.project01_final02;

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

	// -------------------------------------- Ķ���� ��� �� ��¥ ����
	public int showCalender() {
		Scanner sc = new Scanner(System.in);
		gc.set(2018, month, todayDate);

		System.out.println();
		System.out.println("-------------------<" + month + "��>-------------------");
		System.out.print("��\t��\tȭ\t��\t��\t��\t��");
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
		System.out.println("***********��¥�� �����ϼ���. ************ ");
		System.out.print(" ��¥ : ");
		int movieDate = sc.nextInt();

		return movieDate;

	}

	// ------------------------------��ȭ����
	public int selectMovie() {
		Scanner sc = new Scanner(System.in);

		System.out.println("***********��ȭ�� �����ϼ���. ************ ");
		String[] movie = { "1. ����̾� ���ҵ�", "2. �ź��� ��������" };
		for (int i = 0; i < movie.length; i++) {
			System.out.println(movie[i]);
		}

		System.out.print("��ȭ ��ȣ : ");
		int movieNum = sc.nextInt();

		return movieNum;
	}

	// -----------------------------------------------��ȭ�� �ð�ǥ ������ ��� �� ����
	public int showTime(int movieNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***********�ð��� �����ϼ���. ************");
		System.out.println("-------------------�ð�ǥ-------------------");
		String arr[] = { "11:00", "14:00" };

		for (int i = 0; i < arr.length; i++) {
			if (movieNum - 1 == i)
				System.out.println(arr[i]);
		}
		System.out.print("�ð� :");
		while (true) {
			int time = sc.nextInt();
			if (movieNum == 1) {
				if (time != 11)
					System.out.print(time + "�ÿ� ���ϴ� ��ȭ�� �����ϴ�. \n�ٽ� �Է��ϼ���. :");
				else
					return time;
			} else if (movieNum == 2) {
				if (time != 14)
					System.out.print(time + "�ÿ� ���ϴ� ��ȭ�� �����ϴ�. \n �ٽ� �Է��ϼ���. :");
				else
					return time;
			}
		}
	}

	// ---------------------------------------------�¼� ��� �� ����
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
				System.out.println("***********�¼��� �����ϼ���. ************");
				System.out.println("-----screen-----");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++)
						System.out.print(arr[num][i][j] + " ");
					System.out.println("	");
				}

				System.out.println("���Ͻô� �¼��� �����ϼ���. ��0 ���ð���/1 ���úҰ���");
				System.out.print("�� ) 1�� 1�� : 1 1");
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

	public void RemoveSeat(int date, int movie_num, int row, int column) {
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
