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
		// System.out.println("회원가입 정보입력 관련: ");
		// System.out.println("id 입력: ");
		// id = sc.nextLine();
		//
		// System.out.println("pw 입력: ");
		// pw = sc.nextLine();
		// mv.add(new Login(id, pw));

		while (true) {

			System.out.print("1번 회원,   2번 비회원,   3번 관리자:");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				String id = null;
				String pw;
				// for (int i = 0; i < 3; i++) {
				// System.out.println("로그인 정보입력 관련: ");
				//
				// System.out.println("회원 로그인 창");
				// System.out.println("id 입력: ");
				// id = sc.nextLine();
				//
				// System.out.println("pw 입력: ");
				// pw = sc.nextLine();
				// mv.add(new Login(id, pw));
				// }
				
				
				
				mv.add(new Login("a1", "a1"));
				mv.add(new Login("a2", "a2"));
				mv.add(new Login("a3", "a1"));
				mv.add(new Login("a4", "a1"));

				// -------------------------------

				System.out.println("로그인 정보입력 관련: ");
				System.out.println("회원 로그인 창");
				System.out.println("id  입력: ");
				id = sc.nextLine();

				System.out.println("pw 입력: ");
				pw = sc.nextLine();

				int index = -1;
				for (int i = 0; i < mv.size(); i++) {
					if (id.equals(mv.get(i).getId())&&pw.equals(mv.get(i).getPw())) {
						index = i;
					}
				}
				
				
				if (index == -1) {
					System.out.println("id 혹은 pw 가 잘못되었습니다.");
				} 

//					if(!id.equals(mv.get(index).getId())){
//						System.out.println("id가 잘못되었습니다.");
//					}else{
//						System.out.println("pw 가 잘못되었습니다.");
//					}
				
				

				else {
					System.out.println("==========");
					System.out.println("로그인 id :" + id + "로 로그인 되었습니다.");
					System.out.println("==========");
				}

				break;

			case "2":
				// -------------------------------
				System.out.println("로그인 정보입력 관련: ");
				System.out.println("회원 로그인 창");
				System.out.println("name  입력: ");
				String names = sc.nextLine();

				System.out.println("phoneNo 입력: ");
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
					System.out.println("입력 정보가 잘못되었습니다.");
				} 

				else {
					System.out.println("==========");
					System.out.println("로그인 이름 :" + names + "로 로그인 되었습니다.");
					System.out.println("==========");
				}
				
				break;

			case "3":
				System.out.println("관리자 로그인 창");
				System.out.println("id  입력: ");
				String id1 = sc.nextLine();

				System.out.println("pw 입력: ");
				String pw1 = sc.nextLine();

				mv2.add(new MgLogin(id1, pw1));

				break;

			}
		}
	}

	public void readSearch() {

		// System.out.print("클릭 => 1번 회원 로그인, 2번 비회원 로그인, 3번 관리자 로그인:");
		String menu1 = sc.nextLine();

		switch (menu1) {
		case "1":
			System.out.println("회원id 검색입력:");
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
				System.out.println("id 혹은 pw 가 잘못되었습니다.");
			} else {
				System.out.println("==========");
				System.out.println("로그인 id :" + id + "로 로그인 되었습니다.");
				System.out.println("==========");
			}

			break;

		case "2":
			System.out.println("비회원 이름 검색입력:");
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
				System.out.println("id 혹은 pw 가 잘못되었습니다.");
			} else {
				System.out.println("==========");
				System.out.println("비회원님 이름 :" + names + "으로 예약 되었습니다.");
				System.out.println("==========");
			}

			break;

		case "3":

		}

		// ------------------------------------
	}

	public void readAll() {
		System.out.println("회원 정보 : " + mv);
		System.out.println("비회원 정보 : " + mv1);
		System.out.println("관리자 정보 : " + mv2);
	}

}
