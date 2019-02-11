package kosta.bean;

public class MemberDao {
	
	private static MemberDao dao = new MemberDao();
	
	// ½Ì±ÛÅæ ¹æ½Ä 
	public static MemberDao getInstance(){
		return dao;
	}
	
	public void insertMember(Member member1){
		System.out.println(member1);
		
	}

}
