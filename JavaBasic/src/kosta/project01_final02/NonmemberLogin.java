package kosta.project01_final02;

import java.util.ArrayList;
import java.util.Scanner;

public class NonmemberLogin {
	String name;
	String phoneNo;


	public Nonmember login() {

		Scanner scLine = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scLine.nextLine();
		System.out.print("핸드폰 번호 : ");
		phoneNo = scLine.nextLine();

		Nonmember nm = new Nonmember(name,phoneNo);
		
		System.out.println("[비회원 : " + name + "] 로그인  되었습니다. ");

		return nm;

	}

}
