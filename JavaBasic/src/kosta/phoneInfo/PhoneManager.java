package kosta.phoneInfo;

import java.awt.print.Printable;
import java.util.Scanner;

public class PhoneManager {

	Scanner sc = new Scanner(System.in);

	PhoneInfor[] pm;
	int count;

	PhoneManager() {
		pm = new PhoneInfor[5];

	}

	public void addValue() {
		System.out.println("addCount 01 =>:" + count);
		System.out.println("추가기능: ");
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("폰넘버 입력: ");
		String phoneNo = sc.nextLine();
		System.out.print("생일 입력: ");
		String birth = sc.nextLine();

		pm[count++] = new PhoneInfor(name, phoneNo, birth);

		System.out.println();
		System.out.println("addCount 02 =>:" + count);
		System.out.println();
	}

	public void listValue() {
		System.out.println();
		System.out.println("전체조회기능: ");
		System.out.println();

		for (int i = 0; i < count; i++) {
			pm[i].print();
			System.out.println();
		}
	}

	public void searchValue() {
		System.out.println("searchCount =>:" + count);
		System.out.print("\n" + "서치기능: ");

		String names = sc.nextLine();
		int index = -1;

		for (int i = 0; i < count; i++) {

			 if(names.equals(pm[i].name)){
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("대상을 찾을수 없습니다.");
		} else {
			pm[index].print();
		}

	}

	public void updateValue() {
		System.out.println("업데이트기능: ");

		System.out.println("searchCount =>:" + count);
		System.out.print("\n" + "서치기능: ");
		String names = sc.nextLine();

		int index = -1;

		for (int i = 0; i < count; i++) {
			 if(names.equals(pm[i].name)){
				index = i;
				
				System.out.print("이름수정: ");
				pm[index].name = sc.nextLine();
				System.out.print("전화번호 수정: ");
				pm[index].phoneNo = sc.nextLine();
				System.out.print("생일 수정: ");
				pm[index].birth = sc.nextLine();
				break;

			 }
		}
		if (index == -1) {
			System.out.println("대상을 찾을수 없습니다.");
		} else {
			System.out.println("수정을 완료 하였습니다.");
		}

		
	}

	public void deleteValue() {
		System.out.println("삭제기능: ");

		System.out.println("searchCount =>:" + count);
		System.out.print("\n" + "이름 입력: ");

		String names = sc.nextLine();
		int index = -1;

		for (int i = 0; i < count; i++) {

			 if(names.equals(pm[i].name)){
				index = i;
				break;
			}
		}
		
		
		if (index != -1) {
			for (int i = 0; i<count; i++){
				
				if(i != pm.length){
					pm[i] = pm[i+ 1];
				}
			}
			
			System.out.println("deleteCount 01 =>" + count + "\n"
					+ "-------------------");
			pm[count -1] = null;
			count --;
			System.out.println("deleteCount 01 =>" + count + "\n"
					+ "-------------------");
		}

		System.out.println("관련 내용 조회 할수 없습니다.");
		

	}

}
