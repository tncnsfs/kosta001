package kosta.model;

import java.io.Serializable;

public class SubBoard implements Serializable{
	private int s_no;
	private String title;
	private String writer;
	private String contexts;
	private String regdate;
	private int seq;
	
	public SubBoard(){}

	public SubBoard(int s_no, String title, String writer, String contexts, String regdate, int seq) {
		this.s_no = s_no;
		this.title = title;
		this.writer = writer;
		this.contexts = contexts;
		this.regdate = regdate;
		this.seq = seq;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContexts() {
		return contexts;
	}

	public void setContexts(String contexts) {
		this.contexts = contexts;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "SubBoard [s_no=" + s_no + ", title=" + title + ", writer=" + writer + ", contexts=" + contexts
				+ ", regdate=" + regdate + ", seq=" + seq + "]";
	}
	
	
	
}
