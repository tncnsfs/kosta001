package kosta.project01_final01;

public class Movie {
	private int titleNum = 0;
	private int date = 0;
	private int time = 0;
	private int row = 0;

	static String movie[] = { "null", "1. ����̾� ���ҵ�", "2. �ź��� ��������" };

	public Movie() {
		super();
	}

	public Movie(int titleNum, int date, int time) {
		super();
		this.titleNum = titleNum;
		this.date = date;
		this.time = time;
	}

	public void show() {
		System.out.println();
		System.out.println(time + "�� ��ȭ " + movie[titleNum - 1] + " ����Ǿ����ϴ�. ");
	}

	public int getTitleNum() {
		return titleNum;
	}

	public void setTitleNum(int titleNum) {
		this.titleNum = titleNum;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	private int column = 0;

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

}
