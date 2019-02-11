package kosta.phone_ArrayList_01;

import java.util.ArrayList;
import java.util.Scanner;
public class Manager {

    
    ArrayList<String> arrli01 = new ArrayList<String>();
    
    PhoneInfo arr[];
//          int count;
//          String names1[] = {"이름", "전번", "생년월일"};
          
//          public Manager() {
//                    arr = new PhoneInfo[10];
//          }
          int num;

//        ------------------------------------------------
    public void addPhoneInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        arrli01.add(sc.nextLine());
        num = arrli01.size();

        System.out.print("전화번호 : ");
        arrli01.add(sc.nextLine());
        System.out.print("생일 : ");
        arrli01.add(sc.nextLine());
    }
          
    public void listPhoneInfo() {

//        for (int cnt = 0; cnt < num; cnt++) {
//                str = arrli01.get(cnt);
//                System.out.print(str + ", ");
//        }
        System.out.println(arrli01);
        
        // System.out.print(arrli01.get(0) + ", ");
        // System.out.print(arrli01.get(1) + ", ");
        // System.out.println(arrli01.get(2) + ", ");
        // ------------------------------------------------
    }
          
          
    public void searchPhoneInfo() {
        
//         이름 입력 => PhoneInfo 객체 찾아 출력
//        System.out.println("searchCount=>" + count);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String names = sc.nextLine();
        int index = -1;
        for (int i = 0; i < num; i++) {
//            if (names.equals(arr[i].name)) {
            if (names.equals(arrli01.get(i))){
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("대상을 찾을수 없습니다.");
        } else {
            String str = arrli01.get(index);
            System.out.println(str);
//            arr[index].show();
        }

    }

    // 리스트 내용 수정
    public void updatePhoneInfo() {
        // 이름 입력 => PhoneInfo 객체 찾고
        // 전화번호 입력 => 해당 PhoneInfo 객체의 전화번호 수정
        // 2개 입력 받는것 => 1. 이름 입력받고 2. 입력받은 이름으로 전화번호 입력 받아서 수정.

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String str2 = sc.nextLine();
        int index = arrli01.indexOf(str2);
        if (index != -1) {
            System.out.print("수정내용: ");
            arrli01.set(index, sc.nextLine());
            System.out.println("수정후 출력 => " + arrli01 + "\n"
                    + "수정 완료 했습니다.");
            
        } else {
            System.out.println("대상을 찾을수 없습니다.");
        }

    }

    public void deletePhoneInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String str3 = sc.nextLine();
        int index = arrli01.indexOf(str3);
        System.out.println(index);
        if(index != -1) {
            System.out.print("삭제내용: ");
            arrli01.remove(index);
            
            System.out.println(arrli01);
        }
        // -------------------------------

    }
}