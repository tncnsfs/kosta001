package kosta.video;

public class GeneralMember{

	private String id, name, address;
	private Video rentalVideo; // 생성한 클래스의 변수를 선언 ; 
	
	
	
	public GeneralMember() {

	}



	public GeneralMember(String id, String name, String address, Video rentalVideo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rentalVideo = rentalVideo;
	}


//------------------------------------------
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Video getRentalVideo() {
		return rentalVideo;
	}



	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}
//------------------------------------------


	void printMember(){
		System.out.println("이름: " + name + "\n"
				+ "주소: " + address+ "\n"
				+ "아이디 :" + id+ "\n"
				+ "빌린비디오 번호: " + getRentalVideo().getNum() + "\n"
				+ "빌린비디오 제목: " + getRentalVideo().getTitle() + "\n"
				+ "빌린비디오 배우: " + getRentalVideo().getActor());
	}
}
