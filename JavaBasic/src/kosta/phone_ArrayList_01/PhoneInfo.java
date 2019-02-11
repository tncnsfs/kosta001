package kosta.phone_ArrayList_01;

//import java.util.ArrayList;

//상태(name, phoneNo, birth) : String
//기능(show) - 출력

import java.util.Scanner;

public class PhoneInfo {
//    ArrayList<String> arrli01 = new ArrayList<String>();
    
String name, phoneNo, birth;
public PhoneInfo(){}

public PhoneInfo(String name, String phoneNo, String birth) {
     super();
     this.name = name;
     this.phoneNo = phoneNo;
     this.birth = birth;
}

public void show(){
     System.out.println("이름 :" + name);
     System.out.println("전화번호 :" + phoneNo);
     System.out.println("생일 :" + birth);
}

}



