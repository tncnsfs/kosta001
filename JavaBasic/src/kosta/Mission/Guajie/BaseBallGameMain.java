//            *BaseBallGame
//
//            ����: �����Ǽ� 3�ڸ��� ���ڸ� ���ߴ� ����
//            123
//            134
//            1S1B
//            -> �����ڸ��� ���� ��ġ => ��Ʈ����ũ
//            -> ���δٸ��ڸ� ���� ��ġ => ��
//            ������ ���� -> 3Strike
//
//            1. �ߺ����� �ʴ� 1-9 ���� 3���� ���Ѵ�. => �迭
//            2. Ű����� ���� 3���� ���ڸ� �Է� �޴´�. => �迭
//            3. ��Ʈ����ũ, ���� ������ üũ
//            4. ��� ���
//            5. 8��° ����
//
//            --------------------------------------------------
//            12
package kosta.Mission.Guajie;
import java.util.Random;
import java.util.Scanner;
public class BaseBallGameMain {
       private BaseBallArr baseArr;
       
       public BaseBallGameMain() {
              baseArr = new BaseBallArr();
//            baseArr.baseBallDifferent();
       }
       
       
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              
              
              String menu = null;
              
              BaseBallGameMain baseM = new BaseBallGameMain();
       
              System.out.print(""
                           + "1�� ���δٸ� �� ����ϱ� , " + "\n"
                           + "2�� ���� ������ ," + "\n"
                           + "3�� :,"+ "\n"
                           + "����ġ�� �������� : ");
              menu = sc.nextLine();
              
              while (true) {
                     
                     switch (menu) {
                     case "1":
                           baseM.baseArr.baseBallDifferent();
                           return;
                           
                     case "2":
                           baseM.baseArr.baseBallTheSame();
                           return;
                           
                     case "3":
                           
                           break;
                           
                     default:
                           break;
                     }
              
              }             
              
              
       
       }
}