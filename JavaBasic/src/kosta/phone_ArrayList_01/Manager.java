package kosta.phone_ArrayList_01;

import java.util.ArrayList;
import java.util.Scanner;
public class Manager {

    
    ArrayList<String> arrli01 = new ArrayList<String>();
    
    PhoneInfo arr[];
//          int count;
//          String names1[] = {"�̸�", "����", "�������"};
          
//          public Manager() {
//                    arr = new PhoneInfo[10];
//          }
          int num;

//        ------------------------------------------------
    public void addPhoneInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸� : ");
        arrli01.add(sc.nextLine());
        num = arrli01.size();

        System.out.print("��ȭ��ȣ : ");
        arrli01.add(sc.nextLine());
        System.out.print("���� : ");
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
        
//         �̸� �Է� => PhoneInfo ��ü ã�� ���
//        System.out.println("searchCount=>" + count);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸� �Է�: ");
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
            System.out.println("����� ã���� �����ϴ�.");
        } else {
            String str = arrli01.get(index);
            System.out.println(str);
//            arr[index].show();
        }

    }

    // ����Ʈ ���� ����
    public void updatePhoneInfo() {
        // �̸� �Է� => PhoneInfo ��ü ã��
        // ��ȭ��ȣ �Է� => �ش� PhoneInfo ��ü�� ��ȭ��ȣ ����
        // 2�� �Է� �޴°� => 1. �̸� �Է¹ް� 2. �Է¹��� �̸����� ��ȭ��ȣ �Է� �޾Ƽ� ����.

        Scanner sc = new Scanner(System.in);
        System.out.print("�̸� �Է�: ");
        String str2 = sc.nextLine();
        int index = arrli01.indexOf(str2);
        if (index != -1) {
            System.out.print("��������: ");
            arrli01.set(index, sc.nextLine());
            System.out.println("������ ��� => " + arrli01 + "\n"
                    + "���� �Ϸ� �߽��ϴ�.");
            
        } else {
            System.out.println("����� ã���� �����ϴ�.");
        }

    }

    public void deletePhoneInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸� �Է�: ");
        String str3 = sc.nextLine();
        int index = arrli01.indexOf(str3);
        System.out.println(index);
        if(index != -1) {
            System.out.print("��������: ");
            arrli01.remove(index);
            
            System.out.println(arrli01);
        }
        // -------------------------------

    }
}