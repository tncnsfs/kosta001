package kosta.project01_final02.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminManage {

	Member m = new Member();
	Nonmember nm = new Nonmember();

	public void manage(ArrayList<User> list) {

		Scanner admininput = new Scanner(System.in);
		System.out.println("1.������ ��ü��� 2. ��¥�� ��� 3. ȸ�� / ��ȸ�� ���� ��ȸ ");
		int adminin = admininput.nextInt();
		if (adminin == 1) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Member) {
					m = (Member) list.get(i);
					if (m.getDate() != 0)
						m.show();
				}	else if (list.get(i) instanceof Nonmember) {
					if (list.get(i) instanceof Nonmember) {
						nm = (Nonmember) list.get(i);
						nm.show();
					}
				}
			}
		} else if (adminin == 2) {
			System.out.print("��¥�� �Է��ϼ��� : ");
			adminin = admininput.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Nonmember) {
					nm = (Nonmember) list.get(i);
					if (nm.getDate() == adminin) {
						nm.show();
					}
				} else if (list.get(i) instanceof Member) {
					m = (Member) list.get(i);
					if (m.getDate() == adminin) {
						m.show();
					}
				}
			}
		} else if (adminin == 3) {
			System.out.print("ȸ�� ���������� ����Ͻ÷��� 1, ��ȸ�� ���������� ����Ͻ÷��� 2�� �Է��ϼ��� : ");
			Scanner sc = new Scanner(System.in);
			int print = sc.nextInt();

			if (print == 1) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) instanceof Member) {
						m = (Member) list.get(i);
						if (m.getDate() != 0)
							m.show();
						continue;
					}
				}
			} else if (print == 2) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) instanceof Nonmember) {
						nm = (Nonmember) list.get(i);
						nm.show();
						continue;
					}
				}
			}
		}
	}
}
