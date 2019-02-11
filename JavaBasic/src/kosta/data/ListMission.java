package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void show(List<String> list){
		// 리스트 내용을 출력 
//		System.out.println(list);
//		int num = list.size();
		
		
//		for(int cnt = 0; cnt<num; cnt++){
//			String str = list.get(cnt);
//			System.out.print(str+ ",");
//			
////			-----------------------------
////			System.out.println(list.size());
//		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + ", ");
		}
		
		System.out.println();
	}
	
////			-----------------------------
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		
		int idx = -1;
		while(true){
			System.out.println("1.추가   2.수정    3. 삭제    4. 종료");
			System.out.print("선택:");
			String menu = sc.nextLine();
			
			switch (menu) {
			
					case "1":
				// 키보드 입력값을 list에 추가후 show() 호출해서 전체 출력 
						// 리스트 내용 추가 
						System.out.print("입력: ");
						String str = sc.nextLine();
						list.add(str);
						show(list);
						break;
						
					case "2":
						// 리스트 내용 수정 
						System.out.print("입력: ");
						String str2 = sc.nextLine();
						idx = list.indexOf(str2);
						if(idx != -1){
							System.out.print("수정내용: ");
							list.set(idx, sc.nextLine());
						}
						show(list);
						break;
						
					case "3":
						// ArrayList 삭제
						System.out.print("입력: ");
						String str3 = sc.nextLine();
						idx = list.indexOf(str3);
						if(idx != -1){
							System.out.print("삭제내용: ");
							list.remove(idx);
						}
						show(list);
						break;
						
					case "4":
						System.out.println("종료");
						return;
			}
		}
		
	}
}
