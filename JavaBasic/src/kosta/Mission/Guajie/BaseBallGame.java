package kosta.Mission.Guajie;

public class BaseBallGame {
       
       // 컴퓨터 베이스볼 받을 값;
       int a, b, c ;
       // 내가 입력한 값을 받을 값;
       int a1,b1,c1;
       
       public BaseBallGame() {
              
       }
       
       
       public BaseBallGame(int a, int b, int c) {
              super();
              this.a = a;
              this.b = b;
              this.c = c;
       }
       public BaseBallGame(int a, int b, int c, int a1, int b1, int c1) {
              super();
              this.a = a;
              this.b = b;
              this.c = c;
              this.a1 = a1;
              this.b1 = b1;
              this.c1 = c1;
       }
       public void BaseShow() {
              if(true)
              System.out.println("Strike 가 나왔습니다.");
              else
              System.out.println("Strike 가 나오지 않았습니다.");
              
       }
       
       public int getA() {
              return a;
       }
       public void setA(int a) {
              this.a = a;
       }
       public int getB() {
              return b;
       }
       public void setB(int b) {
              this.b = b;
       }
       public int getC() {
              return c;
       }
       public void setC(int c) {
              this.c = c;
       }
       public int getA1() {
              return a1;
       }
       public void setA1(int a1) {
              this.a1 = a1;
       }
       public int getB1() {
              return b1;
       }
       public void setB1(int b1) {
              this.b1 = b1;
       }
       public int getC1() {
              return c1;
       }
       public void setC1(int c1) {
              this.c1 = c1;
       }
       
       
       
}
