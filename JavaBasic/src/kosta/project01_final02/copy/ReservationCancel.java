package kosta.project01_final02.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationCancel {
	private String name;
	private String phoneNo;
	private String id;
	private String pw;
	int a;

	public User cancel(ArrayList<User> list, int input) {
		Member m = new Member();
		Nonmember nm = new Nonmember();
		Reservation reserv = new Reservation();

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
							System.out.println("취소를 진행 합니다. ");
							return m;
						} else if (id.equals(m.getId()) && !pw.equals(m.getPw())) {
							System.out.println("비밀번호가 틀렸습니다.");
							continue;
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
		} else {
			Scanner cancelsc = new Scanner(System.in);

			System.out.print("이름 : ");
			String inputName = cancelsc.nextLine();
			System.out.print("핸드폰번호 : ");
			String inputPhoneNo = cancelsc.nextLine();
			for (int i = 0; i < list.size(); i++)
				if (list.get(i) instanceof Nonmember) {
					nm = (Nonmember) list.get(i);
					if (inputName.equals(nm.getName()) && inputPhoneNo.equals(nm.getphoneNo())) {
						nm.show();
						System.out.println("취소를 진행 합니다. ");
						return nm;
					}
				}
		}
		return m;
	}
}
