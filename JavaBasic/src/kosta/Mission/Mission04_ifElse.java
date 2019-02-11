package kosta.Mission;
import java.util.Scanner;

public class Mission04_ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m_id = "kosta";
		String m_pass = "1234";
		
		// 키보드로부터 id, password 입력 받아서 
		// id, password 일치하면 => 로그인 성공 
		// id 불일치 => 해당 아이디가 존재하지 않습니다. 
		// password 가 불일치 => 비밀번호가 일치하지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("m_id: ");
		String id = sc.nextLine();
		System.out.print("m_pass");
		String pw = sc.nextLine();
		
		
//		if(id.trim().equals("kosta") && pw.trim().equals("1234")){
//			System.out.println("로그인 성공");
//		}else if(id.equals("kosta")){
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		}else{
//			System.out.println("해당 아이디가 존재하지 않습니다.");
//		}
		
//		 --------------------------------------------

		if(id.equals(m_id) && pw.equals(m_pass)){
			System.out.println("로그인 성공");
		}else{
			if(!id.equals(m_id)){
				System.out.println("해당 아이디가 존재하지 않습니다");
			}else{
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}
}
