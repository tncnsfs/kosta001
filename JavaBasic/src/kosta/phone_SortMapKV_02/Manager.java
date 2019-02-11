package kosta.phone_SortMapKV_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	int num;
	List<PhoneInfo> arrli01 = new ArrayList<>();

	// ------------------------------------------------
	// 01
	public void addPhoneInfo() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNo = sc.nextLine();
		System.out.print("생일 : ");
		String birth = sc.nextLine();
		arrli01.add(new PhoneInfo(name, phoneNo, birth));
		System.out.println(arrli01.get(num));
		num++;
		System.out.println();
	}

	// 02
	public void listPhoneInfo() {
		System.out.println(arrli01 + "\t");
		System.out.println();
		
	}

	// 03 검색 관련 
	public void searchPhoneInfo() {
		System.out.print("이름 입력: ");
		String names = sc.nextLine();
		int index = -1;
		for (int i = 0; i < num; i++) {
			if (names.equals(arrli01.get(i).name)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("대상을 찾을수 없습니다.");
		} else {
			String str = arrli01.get(index).getName();
			System.out.println(str);
			System.out.println(arrli01.get(index));
		}
	}

	// 리스트 내용 수정
	// 04
	public void updatePhoneInfo() {
		// 이름 입력 => PhoneInfo 객체 찾고
		// 전화번호 입력 => 해당 PhoneInfo 객체의 전화번호 수정
		// 2개 입력 받는것 => 1. 이름 입력받고 2. 입력받은 이름으로 전화번호 입력 받아서 수정.
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		int index = arrli01.indexOf(name);

		for (int i = 0; i < arrli01.size(); i++) {
			if (name.equals(arrli01.get(i).getName())) {
				index = i;
				System.out.print("바꿀번호: ");
				String name2 = sc.nextLine();
				
				arrli01.get(index).setPhoneNo(name2);
				
				System.out.println(arrli01.get(index).getPhoneNo());
			} else {
				System.out.println("대상을 찾을수 없습니다.");
			}
		}
	}

	// 05
	public void deletePhoneInfo() {
		System.out.print("이름 입력: ");
		int index = -1;
		String name3 = sc.nextLine();
		
		for (int i = 0; i < arrli01.size(); i++) {
			if (name3.equals(arrli01.get(i).getName())) {
				index = i;
				System.out.print("삭제번호: ");
				String name4 = sc.nextLine();
				
//				arrli01.get(index).setPhoneNo(name4);
				arrli01.remove(index);
				
				
//				System.out.println(arrli01.get(index).getPhoneNo());
			} else {
				System.out.println("대상을 찾을수 없습니다.");
			}
		}

			System.out.println(arrli01);
		}
	// -------------------------------
	// 06

	public void sortFL() {


		System.out.println("순서정열 " + "\n" 
									+ "a는 : 오름차순" + "\n" 
									+ "b는 : 내림차순" + "\n"
									+ "문자를 입력하세요: ");
		String menu = sc.nextLine();
		
		switch (menu) {
				
		case "a":
			Collections.sort(arrli01, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					// 이름을 기준으로 오름차순
					if (o1.getName().compareTo(o2.getName()) > 0) {
						return 1;
					} else if (o1.getName().compareTo(o2.getName()) < 0) {
						return -1;
					}
					return 0;
				}
			});
			System.out.println(arrli01);

			break;
			
			
		case "b":
			Collections.sort(arrli01, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					// 이름을 기준으로 오름차순
					if (o1.getName().compareTo(o2.getName()) > 0) {
						return -1;
					} else if (o1.getName().compareTo(o2.getName()) < 0) {
						return 1;
					}
					return 0;
				}
			});
			System.out.println(arrli01);

			break;
		}
		
		
		
		
		
		
	}

	
	
	
}