package kosta.oop2_1;

public class ServiceDB {
	private String name;
	private Role role;
	
	
	public ServiceDB() {
	}


	public ServiceDB(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	
	public void doIt(){
		role.doIt();
	}
	
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public Role getRole() {
//		return role;
//	}
//
//
//	public void setRole(Role role) {
//		this.role = role;
//	} 
//	
	
	
	
	

}
