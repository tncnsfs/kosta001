package kosta.Mission;
import java.util.Scanner;

public class Mission04_ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m_id = "kosta";
		String m_pass = "1234";
		
		// Ű����κ��� id, password �Է� �޾Ƽ� 
		// id, password ��ġ�ϸ� => �α��� ���� 
		// id ����ġ => �ش� ���̵� �������� �ʽ��ϴ�. 
		// password �� ����ġ => ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("m_id: ");
		String id = sc.nextLine();
		System.out.print("m_pass");
		String pw = sc.nextLine();
		
		
//		if(id.trim().equals("kosta") && pw.trim().equals("1234")){
//			System.out.println("�α��� ����");
//		}else if(id.equals("kosta")){
//			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
//		}else{
//			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
//		}
		
//		 --------------------------------------------

		if(id.equals(m_id) && pw.equals(m_pass)){
			System.out.println("�α��� ����");
		}else{
			if(!id.equals(m_id)){
				System.out.println("�ش� ���̵� �������� �ʽ��ϴ�");
			}else{
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}
	}
}
