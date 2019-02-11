package kosta.video;

public class Video {
	// 비디오 정보를 담고 있다.(번호, 제목, 배우) 
	
	private String num, title, actor; 
	
	public Video() {}

	public Video(String num, String title, String actor) {
		super();
		this.num = num;
		this.title = title;
		this.actor = actor;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
}
