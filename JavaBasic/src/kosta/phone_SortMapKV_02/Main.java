// 181115// 정열 오름차순/내림차순 하기 



//1. 추가 2. 전체출력 3. 종료
//1번추가 -> 배열 입력 -> 출력
package kosta.phone_SortMapKV_02;


import java.util.Scanner;

public class Main {

public static void main(String[] args) {

     Manager m = new Manager();
     Scanner sc = new Scanner(System.in);
     
     while (true) {
     System.out.println("1. 추가 , 2. 전체출력, 3. 검색, 4. 수정,  5.삭제,  6.정열(오름차순/내림차순),  7, 종료");
     System.out.print(" 메뉴선택 : ");
     String menu = sc.nextLine();
     
     switch (menu) {
     case "1":
         m.addPhoneInfo();
         break;
         
     case "2":
         m.listPhoneInfo();
         break;
         
     case "3":
         m.searchPhoneInfo();
         break;
     case "4":
         m.updatePhoneInfo();
         break;
     case "5":
         m.deletePhoneInfo();
         break;
     case "6":
    	 m.sortFL();
         System.out.println("정열오름차순/내림차순");
         break;
     case "7":
    	 System.out.println("종료");
    	 return;
         }
     }        

     
     
     
}
}

