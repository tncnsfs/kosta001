package kosta.project01;

public class MgLogin extends Movie{
	
	private String id, pw;

	public MgLogin() {
	}

	public MgLogin(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "MgLogin [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
	

}
