package kosta.project01_final01;

import java.util.ArrayList;
import java.util.Scanner;

public class NonmemberLogin {
	String name;
	String phoneNo;


	public Nonmember login() {

		Scanner scLine = new Scanner(System.in);
		System.out.println("�̸� : ");
		name = scLine.nextLine();
		System.out.println("�ڵ��� ��ȣ : ");
		phoneNo = scLine.nextLine();

		Nonmember nm = new Nonmember(name,phoneNo);
		
		System.out.println("[��ȸ�� : " + name + "] �α���  �Ǿ����ϴ�. ");

		return nm;

	}

}
