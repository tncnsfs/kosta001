package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void show(List<String> list){
		// ����Ʈ ������ ��� 
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
		// ArrayList ����
		ArrayList<String> list = new ArrayList<String>();
		
		int idx = -1;
		while(true){
			System.out.println("1.�߰�   2.����    3. ����    4. ����");
			System.out.print("����:");
			String menu = sc.nextLine();
			
			switch (menu) {
			
					case "1":
				// Ű���� �Է°��� list�� �߰��� show() ȣ���ؼ� ��ü ��� 
						// ����Ʈ ���� �߰� 
						System.out.print("�Է�: ");
						String str = sc.nextLine();
						list.add(str);
						show(list);
						break;
						
					case "2":
						// ����Ʈ ���� ���� 
						System.out.print("�Է�: ");
						String str2 = sc.nextLine();
						idx = list.indexOf(str2);
						if(idx != -1){
							System.out.print("��������: ");
							list.set(idx, sc.nextLine());
						}
						show(list);
						break;
						
					case "3":
						// ArrayList ����
						System.out.print("�Է�: ");
						String str3 = sc.nextLine();
						idx = list.indexOf(str3);
						if(idx != -1){
							System.out.print("��������: ");
							list.remove(idx);
						}
						show(list);
						break;
						
					case "4":
						System.out.println("����");
						return;
			}
		}
		
	}
}
