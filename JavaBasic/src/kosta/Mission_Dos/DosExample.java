//미니 도스(DOS)를 만들어 보자.
//
//>ls
//=> 파일목록 출력
//
//>cd kosta
//=>디렉토리 이동
//
//>cd..
//=> 부모디렉토리 이동
//
//>mkdir kosta
//=> 새로운 디렉토리 생성
//
//>cp /home/test
//=>현재디렉토리에 /home/test에 있는 모든 파일 복사
package kosta.Mission_Dos;
//미니 도스(DOS)를 만들어 보자.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DosExample {
       public static void main(String[] args) throws Exception {
              Scanner sc = new Scanner(System.in);
              Dos d = new Dos();
              DosExample de ;
              String menu;
              
//              String source = "C:\\Users\\csc01\\Documents\\testF";
//              String source0 = "C:\\Users\\kosta\\Documents";
              String source = "C:\\Users\\kosta\\Documents\\testF";
              
              
              while (true) {
            	  
                     System.out.print("\n"
                                  + "Microsoft Windows [Version 10.0.17134.407]" +  "\n"
                                  + "(c) 2018 Microsoft Corporation. All rights  reserved." + "\n"
                                  + "\n" + source + ": ");
                     
                     menu = sc.nextLine();
                     System.out.println();
                     switch (menu) {
                     case "ls":
                     case "ls ":
                     case "LS":
                     case "LS ":
                           // 기본주소 C:\\Users\\KOSTA\\Documents\\testF
                           // d.lsTest(new File(source));
                           d.readAll(new File(source));
                           
//                           d.readDirecToryFile(new File(source));
                           break;
                           
                     
					 case ("[\\d]{3}"):
					 case "cd":
					 case "cd ":
					 case "CD":
					 case "CD ":
                           try {
                                 d.readDirecToryFile(new File(source));
                                  
                           } catch (Exception e) {
                                  e.printStackTrace();
                           }
                           break;
                           
                     case "cd..":
                           break;
                     case "mkdir kosta":
                           break;
                     case "cp /home/test":
                           // =>현재디렉토리에 /home/test에 있는 모든 파일 복사
                           break;
                     default:
                           return;
                     }
              }
       }
}