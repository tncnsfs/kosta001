package kosta.phone_ArrayList_01;

//import java.util.ArrayList;

//����(name, phoneNo, birth) : String
//���(show) - ���

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
     System.out.println("�̸� :" + name);
     System.out.println("��ȭ��ȣ :" + phoneNo);
     System.out.println("���� :" + birth);
}

}



