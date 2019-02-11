package kosta.project01_test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerPr {
	
	public ManagerPr() {	}
	
	Member mvi = new Member();
	ArrayList<Movie> mv = new ArrayList<>();
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void selectFirst(){
		
		
		
		
		while(true){
			System.out.println("로그인을 하기");
			System.out.println("0. 회원가입 \t  1. 회원 \t 2.비회원 \t 3.관리자");
			String aa = sc.nextLine();
			switch (aa) {
			
			
			case "0":
				System.out.println("회원가입");
				
				System.out.println("가입할 id 입력: ");
				mvi.setId(sc.nextLine()); 
				
				
				System.out.println("입력한 아이디는" + mvi.getId());
				
				
				System.out.println("가입할 pw 입력: ");
				mvi.setPw(sc.nextLine());
				System.out.println("입력한 비밀번호는" + mvi.getPw());
				break;
				
				
			case "1":
				System.out.println("회원 로그인");
				
				System.out.println("id 입력:");
				String id = sc.nextLine();
				System.out.println("pw 입력: ");
				String pw = sc.nextLine();
				
				
				try {
					if (id.equals(mvi.getId()) && pw.equals(mvi.getPw())) {
						System.out.println("로그인 성공");
					} else if (!mvi.getId().equals(id)) {
						System.out.println("입력한 ID 가 일치하지 않음");
					} else {
						System.out.println("비밀번호가 잘못 되었음");
					}
				} catch (Exception e) {
				System.out.println("회원 가입을 하지 않은 정보입니다.\n 가입후 다시 시도해 주세요");
				}
				
				break;
				
				
			case "2":
				System.out.println("비회원 로그인");
				
				System.out.println("name 입력:");
				String name = sc.nextLine();
				System.out.println("pw 입력: ");
				String phoneNo = sc.nextLine();
				
				
				
				
				break;
				
			case "3":
				System.out.println("관리자 로그인");
				
				break;
				
				
			}
		}
		
	}
	

}
