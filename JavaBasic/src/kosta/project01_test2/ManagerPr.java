package kosta.project01_test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerPr {
	
	public ManagerPr() {	}
	
	Member mvi = new Member();
	ArrayList<Movie> mv = new ArrayList<>();
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void selectFirst(){
		
		
		
		
		while(true){
			System.out.println("�α����� �ϱ�");
			System.out.println("0. ȸ������ \t  1. ȸ�� \t 2.��ȸ�� \t 3.������");
			String aa = sc.nextLine();
			switch (aa) {
			
			
			case "0":
				System.out.println("ȸ������");
				
				System.out.println("������ id �Է�: ");
				mvi.setId(sc.nextLine()); 
				
				
				System.out.println("�Է��� ���̵��" + mvi.getId());
				
				
				System.out.println("������ pw �Է�: ");
				mvi.setPw(sc.nextLine());
				System.out.println("�Է��� ��й�ȣ��" + mvi.getPw());
				break;
				
				
			case "1":
				System.out.println("ȸ�� �α���");
				
				System.out.println("id �Է�:");
				String id = sc.nextLine();
				System.out.println("pw �Է�: ");
				String pw = sc.nextLine();
				
				
				try {
					if (id.equals(mvi.getId()) && pw.equals(mvi.getPw())) {
						System.out.println("�α��� ����");
					} else if (!mvi.getId().equals(id)) {
						System.out.println("�Է��� ID �� ��ġ���� ����");
					} else {
						System.out.println("��й�ȣ�� �߸� �Ǿ���");
					}
				} catch (Exception e) {
				System.out.println("ȸ�� ������ ���� ���� �����Դϴ�.\n ������ �ٽ� �õ��� �ּ���");
				}
				
				break;
				
				
			case "2":
				System.out.println("��ȸ�� �α���");
				
				System.out.println("name �Է�:");
				String name = sc.nextLine();
				System.out.println("pw �Է�: ");
				String phoneNo = sc.nextLine();
				
				
				
				
				break;
				
			case "3":
				System.out.println("������ �α���");
				
				break;
				
				
			}
		}
		
	}
	

}
