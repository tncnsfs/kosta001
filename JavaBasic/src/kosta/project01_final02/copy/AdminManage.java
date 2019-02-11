package kosta.project01_final02.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminManage {

	Member m = new Member();
	Nonmember nm = new Nonmember();

	public void manage(ArrayList<User> list) {

		Scanner admininput = new Scanner(System.in);
		System.out.println("1.예약자 전체출력 2. 날짜별 출력 3. 회원 / 비회원 정보 조회 ");
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
			System.out.print("날짜를 입력하세요 : ");
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
			System.out.print("회원 예매정보를 출력하시려면 1, 비회원 예매정보를 출력하시려면 2를 입력하세요 : ");
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
