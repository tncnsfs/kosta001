package kosta.project01_final02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		ArrayList<User> userlist = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		Reservation reserv = new Reservation();
		MemberLogin mlogin = new MemberLogin();
		NonmemberLogin nmlogin = new NonmemberLogin();
		ReservationCheck reservCk = new ReservationCheck();
		ReservationCancel reCancel = new ReservationCancel();
		int date;
		int movieNum;
		int time;
		int row;
		int column;
		String name = null;
		String phoneNo = null;

		Member m = new Member();
		Nonmember nm = new Nonmember();

		int input = 0;
		int loginSuccess = 0;
		int menu = 0;

		userlist.add(new Member("sunang", "sunang"));
		userlist.add(new Member("babo", "babo"));
		userlist.add(new Member("mm", "mm"));
		while (true) {
			System.out.println("1.로그인 2. 예약 조회 3.예약 취소");
			menu = sc.nextInt();
			if (menu == 1) {

				System.out.println("1. 회원 2.비회원 3.관리자 ");
				input = sc.nextInt();
				switch (input) {
				case 1:
					m = mlogin.login(userlist, m);
					break;

				case 2:
					nm = nmlogin.login();
					userlist.add(nm);
					break;
				case 3: // 관리자
					Scanner sc1 = new Scanner(System.in);
					while (true) {
						System.out.print("관리자 ID: ");
						String ad_id = sc1.nextLine();
						System.out.print("관리자 PW: ");
						String ad_pw = sc1.nextLine();
						if (ad_id.equals("admin") && ad_pw.equals("admin")) {
							System.out.println("관리자님 환영합니다! 수고하세요! \n");
							loginSuccess = 2;
							break;
						} else if (!ad_id.equals("admin") || !ad_pw.equals("admin")) {
							System.out.println("아이디와 비밀번호를 확인하세요 . ");
							continue;
						}
					}
					break;

				}

				// ------------------------------------------------------------------------------------------------
				if (input == 1) { // 회원
					// 로그인 성공 시
					System.out.println("예약을 진행 합니다 .");
					date = reserv.showCalender();
					m.setDate(date);
					movieNum = reserv.selectMovie();
					m.setTitleNum(movieNum);
					time = reserv.showTime(movieNum);
					m.setTime(time);
					reserv.selectSeat(date, movieNum);

					System.out.println("예약을 진행 합니다 .");

				} else if (input == 2) { // 비회원
					// 로그인 성공 시
					System.out.println("예약을 진행 합니다 .");
					date = reserv.showCalender();
					nm.setDate(date);
					movieNum = reserv.selectMovie();
					nm.setTitleNum(movieNum);
					time = reserv.showTime(movieNum);
					nm.setTime(time);
					reserv.selectSeat(date, movieNum);

				} else if (input == 3) { // 관리자
					AdminManage admin = new AdminManage();
					admin.manage(userlist);
				}
			} else if (menu == 2) { // 예약 조회
				Scanner cancelsc = new Scanner(System.in);
				System.out.println("예약 조회를 진행합니다. ");
				System.out.println("회원이면 1, 비회원이면 2를 입력하세요.");
				input = sc.nextInt();
				reservCk.check(userlist, input);

			} else if (menu == 3) { // 예약 취소
				Scanner cancelsc = new Scanner(System.in);
				System.out.println("예약 취소를 진행합니다. ");
				System.out.println("회원이면 1, 비회원이면 2를 입력하세요.");
				input = sc.nextInt();
				if (input == 1) {
					m = (Member) reCancel.cancel(userlist, input);
					reserv.RemoveSeat(m.getDate(), m.getTitleNum(), m.getRow(), m.getColumn());
					m.setDate(0);
					m.setTitleNum(0);
					m.setTime(0);
					System.out.println("취소가 완료 되었습니다. ");
				} else if (input == 2) {
					nm = (Nonmember) reCancel.cancel(userlist, input);
					reserv.RemoveSeat(m.getDate(), m.getTitleNum(), m.getRow(), m.getColumn());
					userlist.remove(nm);
				}

			} else if (menu == 4)
				for (int i = 0; i < userlist.size(); i++)
					userlist.get(i).show();

		}
	}
}
