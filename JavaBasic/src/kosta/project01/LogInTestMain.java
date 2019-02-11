package kosta.project01;

import java.util.LinkedList;
import java.util.Scanner;

public class LogInTestMain {

	public static void main(String[] args) {

		LogInTestMain m = new LogInTestMain();
		m.loginInfo();
		// m.readSearch();
	}

	Scanner sc = new Scanner(System.in);

	LinkedList<Login> mv = new LinkedList<>();
	LinkedList<NoLogin> mv1 = new LinkedList<>();
	LinkedList<MgLogin> mv2 = new LinkedList<>();
	// Movie[] mv;
	int cnt, cnnt;

	public void loginInfo() {

		// String id = null;
		// String pw;
		// System.out.println("ȸ������ �����Է� ����: ");
		// System.out.println("id �Է�: ");
		// id = sc.nextLine();
		//
		// System.out.println("pw �Է�: ");
		// pw = sc.nextLine();
		// mv.add(new Login(id, pw));

		while (true) {

			System.out.print("1�� ȸ��,   2�� ��ȸ��,   3�� ������:");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				String id = null;
				String pw;
				// for (int i = 0; i < 3; i++) {
				// System.out.println("�α��� �����Է� ����: ");
				//
				// System.out.println("ȸ�� �α��� â");
				// System.out.println("id �Է�: ");
				// id = sc.nextLine();
				//
				// System.out.println("pw �Է�: ");
				// pw = sc.nextLine();
				// mv.add(new Login(id, pw));
				// }
				
				
				
				mv.add(new Login("a1", "a1"));
				mv.add(new Login("a2", "a2"));
				mv.add(new Login("a3", "a1"));
				mv.add(new Login("a4", "a1"));

				// -------------------------------

				System.out.println("�α��� �����Է� ����: ");
				System.out.println("ȸ�� �α��� â");
				System.out.println("id  �Է�: ");
				id = sc.nextLine();

				System.out.println("pw �Է�: ");
				pw = sc.nextLine();

				int index = -1;
				for (int i = 0; i < mv.size(); i++) {
					if (id.equals(mv.get(i).getId())&&pw.equals(mv.get(i).getPw())) {
						index = i;
					}
				}
				
				
				if (index == -1) {
					System.out.println("id Ȥ�� pw �� �߸��Ǿ����ϴ�.");
				} 

//					if(!id.equals(mv.get(index).getId())){
//						System.out.println("id�� �߸��Ǿ����ϴ�.");
//					}else{
//						System.out.println("pw �� �߸��Ǿ����ϴ�.");
//					}
				
				

				else {
					System.out.println("==========");
					System.out.println("�α��� id :" + id + "�� �α��� �Ǿ����ϴ�.");
					System.out.println("==========");
				}

				break;

			case "2":
				// -------------------------------
				System.out.println("�α��� �����Է� ����: ");
				System.out.println("ȸ�� �α��� â");
				System.out.println("name  �Է�: ");
				String names = sc.nextLine();

				System.out.println("phoneNo �Է�: ");
				String phoneNo = sc.nextLine();
				
				mv1.add(new NoLogin(names, phoneNo));
				
				System.out.println(mv1);
				
				int index1 = -1;
				for (int i = 0; i < mv1.size(); i++) {
					if (names.equals(mv1.get(i).getName())&&phoneNo.equals(mv1.get(i).getPhoneNo())) {
						index1 = i;
					}
				}
				
				if (index1 == -1) {
					System.out.println("�Է� ������ �߸��Ǿ����ϴ�.");
				} 

				else {
					System.out.println("==========");
					System.out.println("�α��� �̸� :" + names + "�� �α��� �Ǿ����ϴ�.");
					System.out.println("==========");
				}
				
				break;

			case "3":
				System.out.println("������ �α��� â");
				System.out.println("id  �Է�: ");
				String id1 = sc.nextLine();

				System.out.println("pw �Է�: ");
				String pw1 = sc.nextLine();

				mv2.add(new MgLogin(id1, pw1));

				break;

			}
		}
	}

	public void readSearch() {

		// System.out.print("Ŭ�� => 1�� ȸ�� �α���, 2�� ��ȸ�� �α���, 3�� ������ �α���:");
		String menu1 = sc.nextLine();

		switch (menu1) {
		case "1":
			System.out.println("ȸ��id �˻��Է�:");
			String id = sc.nextLine();

			int index = -1;

			// id check
			for (int i = 0; i < mv.size(); i++) {

				if (id.equals(mv.get(i).getId())) {
					index = i;
				}
				break;
			}

			if (index == -1) {
				System.out.println("id Ȥ�� pw �� �߸��Ǿ����ϴ�.");
			} else {
				System.out.println("==========");
				System.out.println("�α��� id :" + id + "�� �α��� �Ǿ����ϴ�.");
				System.out.println("==========");
			}

			break;

		case "2":
			System.out.println("��ȸ�� �̸� �˻��Է�:");
			String names = sc.nextLine();

			index = -1;

			// id check
			for (int i = 0; i < mv1.size(); i++) {
				if (names.equals(mv1.get(i).getName())) {
					index = i;
				}
				break;
			}

			if (index == -1) {
				System.out.println("id Ȥ�� pw �� �߸��Ǿ����ϴ�.");
			} else {
				System.out.println("==========");
				System.out.println("��ȸ���� �̸� :" + names + "���� ���� �Ǿ����ϴ�.");
				System.out.println("==========");
			}

			break;

		case "3":

		}

		// ------------------------------------
	}

	public void readAll() {
		System.out.println("ȸ�� ���� : " + mv);
		System.out.println("��ȸ�� ���� : " + mv1);
		System.out.println("������ ���� : " + mv2);
	}

}
