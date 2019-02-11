package kosta.oop2_2_Interface;

public class Main_DB {
	
	public static void main(String[] args) {
		
	
	Role_DB r = new Role_DB(){

		@Override
		public void doIt() {
			System.out.println("MsDao 를 실행예정: ");
			}
		};
		
		MsSQL ms = new MsSQL();
		
		r.doIt();
		ms.doIt();

	}
}
