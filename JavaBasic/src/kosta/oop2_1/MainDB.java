package kosta.oop2_1;

public class MainDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ServiceDB s = new ServiceDB("ȫ�浿", new OracleDB());
//		s.doIt();
		
		ServiceDB m = new ServiceDB("�ڱ浿", new MySQLDB());
		m.doIt();
		
	}

}
