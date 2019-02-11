package kosta.model;

import java.io.Serializable;

public class Board implements Serializable{
	private int seq;
	private String pass;
	private String title;
	private String writer;
	private String contexts;
	private String regdate;
	private int hitcount;
	
	public Board(){}

	public Board(int seq, String pass, String title, String writer, String contexts, String regdate, int hitcount) {
		this.seq = seq;
		this.pass = pass;
		this.title = title;
		this.writer = writer;
		this.contexts = contexts;
		this.regdate = regdate;
		this.hitcount = hitcount;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", pass=" + pass + ", title=" + title + ", writer=" + writer + ", contexts="
				+ contexts + ", regdate=" + regdate + ", hitcount=" + hitcount + "]";
	}
}
