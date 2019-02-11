package kosta.video;

public class GeneralMember{

	private String id, name, address;
	private Video rentalVideo; // ������ Ŭ������ ������ ���� ; 
	
	
	
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
		System.out.println("�̸�: " + name + "\n"
				+ "�ּ�: " + address+ "\n"
				+ "���̵� :" + id+ "\n"
				+ "�������� ��ȣ: " + getRentalVideo().getNum() + "\n"
				+ "�������� ����: " + getRentalVideo().getTitle() + "\n"
				+ "�������� ���: " + getRentalVideo().getActor());
	}
}
