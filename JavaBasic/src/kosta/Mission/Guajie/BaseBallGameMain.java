//            *BaseBallGame
//
//            내용: 임의의수 3자리의 숫자를 맞추는 게임
//            123
//            134
//            1S1B
//            -> 같은자리의 숫자 일치 => 스트라이크
//            -> 서로다른자리 숫자 일치 => 볼
//            게임의 종료 -> 3Strike
//
//            1. 중복되지 않는 1-9 난수 3개를 구한다. => 배열
//            2. 키보드로 부터 3개의 숫자를 입력 받는다. => 배열
//            3. 스트라이크, 볼의 갯수를 체크
//            4. 결과 출력
//            5. 8번째 성공
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
                           + "1번 서로다른 수 출력하기 , " + "\n"
                           + "2번 아직 생각중 ," + "\n"
                           + "3번 :,"+ "\n"
                           + "스위치를 누르세요 : ");
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