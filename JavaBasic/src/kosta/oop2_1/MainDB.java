package kosta.oop2_1;

public class MainDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ServiceDB s = new ServiceDB("홍길동", new OracleDB());
//		s.doIt();
		
		ServiceDB m = new ServiceDB("박길동", new MySQLDB());
		m.doIt();
		
	}

}
