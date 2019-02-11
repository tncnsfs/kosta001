package kosta.phone_00;


import java.util.Scanner;

public class Manager {
	String names[] = {"이름", "전번", "생년월일"};
	int count;

	
	PhoneInfo arr[];

	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	
	
	

	public void addPhoneInfo() {
		System.out.println("addCount1=>" + count);
		
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();
//		arr[count++] = new PhoneInfo(name, phoneNo, birth);

		
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println("addCount2=>" + count);

	}

	public void listPhoneInfo() {
		
		
		for (int i = 0; i < count; i++) {
			arr[i].show();
			System.out.println();
		}
		System.out.println("printCount=>" + count);
	}

	public void searchPhoneInfo() {
		
		
		
		System.out.println("searchCount=>" + count);
		// 이름 입력 => PhoneInfo 객체 찾아 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String names = sc.nextLine();
		
		int index = -1; 
		
		
		for(int i =0; i <count; i++){
			if(names.equals(arr[i].getName())){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("대상을 찾을수 없습니다.");
		}else{
			arr[index].show();
		}
	}

	public void updatePhoneInfo() {
		// 이름 입력 => PhoneInfo 객체 찾고 
		// 전화번호 입력 => 해당 PhoneInfo 객체의 전화번호 수정 
		// 2개 입력 받는것 => 1. 이름 입력받고 2. 입력받은 이름으로 전화번호 입력 받아서 수정. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String names = sc.nextLine();
		int index = -1; 
		
		for(int i =0; i <count; i++){
			if(names.equals(arr[i].getName())){
				index = i;
				
				System.out.print("이름 수정 : ");
				arr[index].setName(sc.nextLine());
//				arr[index].setName(name) = sc.nextLine();	
				
				
				System.out.print("전화번호 수정 : ");
//				arr[index].phoneNo = sc.nextLine();
				arr[index].setPhoneNo(sc.nextLine());
				
				
//				System.out.print("생일 수정 : ");
//				arr[index].birth = sc.nextLine();
				break;
			}
		}
		
		if(index == -1){
			System.out.println("대상을 찾을수 없습니다.");
		}else{
			System.out.println("수정 완료 했습니다.");
		}
		
		
	}

	public void deletePhoneInfo() {
		// 대상찾기 
		// 찾은 대상 한자리씩 앞으로 당기기 및 마지막 인덱스 삭제 , count-- 사용 

		// 이름 입력 => PhoneInfo 객체 찾아 출력

		// 이름 입력 => PhoneInfo 객체 찾고 
		// 전화번호 입력 => 해당 PhoneInfo 객체의 전화번호 수정 
		// 2개 입력 받는것 => 1. 이름 입력받고 2. 입력받은 이름으로 전화번호 입력 받아서 수정. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String names = sc.nextLine();
		int index = -1; 
		
//		-------------------------------
		for(int i =0; i <count; i++){
			if(names.equals(arr[i].getName())){
				index = i;
				
				break; 
			}
		}
		
//		-------------------------------
		
		if(index != -1){
			for(int i =0; i<count; i++){
				
				if(i != arr.length){
					arr[i] =arr[i+1];
				}
				
			}
			
			System.out.println("countDelete01=> " + count);
			arr[count-1] = null;
			count --; 
			System.out.println("countDelete02=> " + count);
			
		}
		
		
//		-------------------------------
		
	}
}
