package kosta.project01_final02.copy;

public class Movie {
	private int titleNum = 0;
	private int date = 0;
	private int time = 0;
	private int row = 0;

	static String movie[] = { "null", "1. 보헤미안 랩소디", "2. 신비한 동물사전" };

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
		System.out.println(time + "시 영화 " + movie[titleNum - 1] + " 예약되었습니다. ");
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
