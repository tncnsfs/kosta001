package kosta.model;

import java.io.Serializable;

public class Board implements Serializable{
	private int seq;
	private String writer;
	private String title;
	private String contents;
	private String regdate;
	private int hitcount;
	
	public Board(){}

	public Board(int seq, String writer, String title, String contents, String regdate, int hitcount) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.regdate = regdate;
		this.hitcount = hitcount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", writer=" + writer + ", title=" + title + ", contents=" + contents + ", regdate="
				+ regdate + ", hitcount=" + hitcount + "]";
	}

	
}
