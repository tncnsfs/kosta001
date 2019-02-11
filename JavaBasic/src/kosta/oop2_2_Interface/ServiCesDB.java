package kosta.oop2_2_Interface;

public class ServiCesDB {
	private String name; 
	private Role_DB role01;
	
	public ServiCesDB() {
		super();
	}

	public ServiCesDB(String name, Role_DB role01) {
		super();
		this.name = name;
		this.role01 = role01;
	} 
	
	
	public void doIt(){
		role01.doIt();
	}
	

}
