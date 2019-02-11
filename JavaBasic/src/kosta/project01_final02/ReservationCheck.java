package kosta.project01_final02;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationCheck {

	private String name;
	private String phoneNo;
	private String id;
	private String pw;
	int a;

	public void check(ArrayList<User> list, int input) {
		Member m = new Member();
		Nonmember nm = new Nonmember();

		Scanner scLine = new Scanner(System.in);

		if (input == 1) {
			System.out.print("ID :");
			id = scLine.nextLine();
			System.out.print("PW :");
			pw = scLine.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Member) {
					m = (Member) list.get(i);
					if (id.equals(m.getId())) {
						if (id.equals(m.getId()) && pw.equals(m.getPw())) {
							System.out.println("[회원 : " + id + "] 로그인  되었습니다. ");
							a = 0;
							m.show();
						} else if (id.equals(m.getId()) && !pw.equals(m.getPw())) {
							System.out.println("비밀번호가 틀렸습니다.");
							break;
						}
					} else {
						a = 1;
						continue;
					}
				}

				if (a == 1) {
					if (!id.equals(m.getId())) {
						System.out.println("회원 정보가 없습니다.");
					}
				}
			}
		} else if (input == 2) {
			Scanner cancelsc = new Scanner(System.in);

			System.out.println("이름 : ");
			String inputName = cancelsc.nextLine();
			System.out.println("핸드폰번호 : ");
			String inputPhoneNo = cancelsc.nextLine();
			for (int i = 0; i < list.size(); i++)
				if (list.get(i) instanceof Nonmember) {
					nm = (Nonmember) list.get(i);
					if (inputName.equals(nm.getName()) && inputPhoneNo.equals(nm.getphoneNo())) {
						nm.show();
						break;
					}
				}

		} else if (input == 3) {
			System.out.print("회원 예매정보를 출력하시려면 1, 비회원 예매정보를 출력하시려면 2를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			int print = sc.nextInt();

			if (print == 1) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) instanceof Member) {
						m = (Member) list.get(i);
						m.show();
						break;
					}
				}
			} else if (print == 2) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) instanceof Nonmember) {
						nm = (Nonmember) list.get(i);
						nm.show();
						break;
					}
				}

			}
		}

	}
}
