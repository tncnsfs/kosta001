package kosta.project01_final02.copy;

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
		
//		userlist.add(new Member("sunang", "sunang"));
//		userlist.add(new Member("babo", "babo"));
//		userlist.add(new Member("mm", "mm"));
		while (true) {
			System.out.println("1.�α��� 2. ���� ��ȸ 3.���� ���");
			menu = sc.nextInt();
			if (menu == 1) {

				
				System.out.println("0. ȸ������   1. ȸ�� 2.��ȸ�� 3.������ ");
				input = sc.nextInt();
				switch (input) {
				
				case 0:
					Scanner scc = new Scanner(System.in);
					System.out.print("ȸ������ id �Է�:");
					String ids = scc.nextLine();
					System.out.println("ȸ������ pw �Է�:");
					String pws = scc.nextLine();
					userlist.add(new Member(ids, pws));
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�. ");
					
					break;
				case 1:
					m = mlogin.login(userlist, m);
					break;

				case 2:
					nm = nmlogin.login();
					userlist.add(nm);
					break;
				case 3: // ������
					Scanner sc1 = new Scanner(System.in);
					while (true) {
						System.out.print("������ ID: ");
						String ad_id = sc1.nextLine();
						System.out.print("������ PW: ");
						String ad_pw = sc1.nextLine();
						if (ad_id.equals("admin") && ad_pw.equals("admin")) {
							System.out.println("�����ڴ� ȯ���մϴ�! �����ϼ���! \n");
							loginSuccess = 2;
							break;
						} else if (!ad_id.equals("admin") || !ad_pw.equals("admin")) {
							System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ��� . ");
							continue;
						}
					}
					break;

				}

				// ------------------------------------------------------------------------------------------------
				if (input == 1) { // ȸ��
					// �α��� ���� ��
					System.out.println("������ ���� �մϴ� .");
					date = reserv.showCalender();
					m.setDate(date);
					movieNum = reserv.selectMovie();
					m.setTitleNum(movieNum);
					time = reserv.showTime(movieNum);
					m.setTime(time);
					reserv.selectSeat(date, movieNum);

					System.out.println("������ ���� �մϴ� .");

				} else if (input == 2) { // ��ȸ��
					// �α��� ���� ��
					System.out.println("������ ���� �մϴ� .");
					date = reserv.showCalender();
					nm.setDate(date);
					movieNum = reserv.selectMovie();
					nm.setTitleNum(movieNum);
					time = reserv.showTime(movieNum);
					nm.setTime(time);
					reserv.selectSeat(date, movieNum);

				} else if (input == 3) { // ������
					AdminManage admin = new AdminManage();
					admin.manage(userlist);
				}
			} else if (menu == 2) { // ���� ��ȸ
				Scanner cancelsc = new Scanner(System.in);
				System.out.println("���� ��ȸ�� �����մϴ�. ");
				System.out.println("ȸ���̸� 1, ��ȸ���̸� 2�� �Է��ϼ���.");
				input = sc.nextInt();
				reservCk.check(userlist, input);

			} else if (menu == 3) { // ���� ���
				Scanner cancelsc = new Scanner(System.in);
				System.out.println("���� ��Ҹ� �����մϴ�. ");
				System.out.println("ȸ���̸� 1, ��ȸ���̸� 2�� �Է��ϼ���.");
				input = sc.nextInt();
				if (input == 1) {
					m = (Member) reCancel.cancel(userlist, input);
					reserv.RemoveSeat(m.getDate(), m.getTitleNum(), m.getRow(), m.getColumn());
					m.setDate(0);
					m.setTitleNum(0);
					m.setTime(0);
					System.out.println("��Ұ� �Ϸ� �Ǿ����ϴ�. ");
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
