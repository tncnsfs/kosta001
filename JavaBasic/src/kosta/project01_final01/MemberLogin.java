package kosta.project01_final01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class MemberLogin {

	String id;
	String pw;

	Member m = new Member();
	int a;

	public Member login(ArrayList<User> list, User user) {
		while (true) {
			Scanner scLine = new Scanner(System.in);

			System.out.print("ID :");
			String id = scLine.nextLine();
			System.out.print("PW :");
			String pw = scLine.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Member) {
					m = (Member) list.get(i);
					if (id.equals(m.getId())) {
						if (id.equals(m.getId()) && pw.equals(m.getPw())) {
							System.out.println("[회원 : " + id + "] 로그인  되었습니다. ");
							a = 0;
							return m;
						} else if (id.equals(m.getId()) && !pw.equals(m.getPw())) {
							System.out.println("비밀번호가 틀렸습니다.");
							a = 0;
							break;
						}

					} else {
						a = 1;
						continue;
					}
				}
			}

			if (a == 1) {
				if (!id.equals(m.getId())) {
					System.out.println("회원 정보가 없습니다.");

				}
			}
		}
	}

	public MemberLogin() {
		super();
	}
}
