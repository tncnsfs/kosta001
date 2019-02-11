package kosta.project01_final02.copy;

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
							System.out.println("[ȸ�� : " + id + "] �α���  �Ǿ����ϴ�. ");
							a = 0;
							m.show();
						} else if (id.equals(m.getId()) && !pw.equals(m.getPw())) {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
							break;
						}
					} else {
						a = 1;
						continue;
					}
				}

				if (a == 1) {
					if (!id.equals(m.getId())) {
						System.out.println("ȸ�� ������ �����ϴ�.");
					}
				}
			}
		} else if (input == 2) {
			Scanner cancelsc = new Scanner(System.in);

			System.out.println("�̸� : ");
			String inputName = cancelsc.nextLine();
			System.out.println("�ڵ�����ȣ : ");
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
			System.out.print("ȸ�� ���������� ����Ͻ÷��� 1, ��ȸ�� ���������� ����Ͻ÷��� 2�� �Է��ϼ��� : ");
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
