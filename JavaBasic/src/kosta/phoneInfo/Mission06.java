package kosta.phoneInfo;

import java.util.Scanner;

public class Mission06 {
	static int count;
	static int[][] arr = new int[5][5];
	static String[] names = new String[5];
	static String subject[] = {"이름","국어", "영어", "수학","총점","평균"};
	
	public static void add(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		names[count] = sc.nextLine();
		for(int i=0;i<3;i++){
			System.out.print(subject[i+1] + " 입력: ");
			arr[count][i] = sc.nextInt();
			arr[count][3] += arr[count][i];
		}
		arr[count][4] = arr[count][3]/3;
		count++;
	}
	
	public static void print(){
		for(String s : subject){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		for(int i=0;i<count;i++){
			System.out.print(names[i] + "");
			for(int j=0;j<arr[i].length;j++){				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void search(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		int index = -1;
		
		for(int i=0;i<count;i++){
			if(name.equals(names[i])){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("대상을 찾을 수 없습니다.");
		}else{
			for(String s : subject){
				System.out.print(s + "\t");
			}
			System.out.println();
			System.out.print(name+"");
			for(int i=0;i<5;i++){
				System.out.print(arr[index][i] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]){
		//키보드로 부터 1~4를 입력 받는다.
		//1. 추가, 2.전체출력 3.검색 4.종료=>콘솔출력
		//입력: 1
		//추가기능이 선택
		//입력: 3
		//검색기능이 선택
		//입력: 4
		//프로그램이 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("1. 추가, 2.전체출력 3.검색 4.종료");
			System.out.print("입력: ");
			
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				add();
				break;
			case "2":
				print();
				break;
			case "3":
				search();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}		
	}
}

