package kosta.Mission.Guajie;

public class BaseBallGame {
       
       // ��ǻ�� ���̽��� ���� ��;
       int a, b, c ;
       // ���� �Է��� ���� ���� ��;
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
              System.out.println("Strike �� ���Խ��ϴ�.");
              else
              System.out.println("Strike �� ������ �ʾҽ��ϴ�.");
              
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
