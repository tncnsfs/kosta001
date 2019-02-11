package kosta.project01;

public class Login extends Movie{
	
//	private String id, pw;
	private String id, pw;

	public Login() {}

	public Login(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", pw=" + pw + "]";
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
	
	
	



}
