package kosta.Mission.Guajie;

import java.util.Scanner;


public class   BaseBallArr  {
       
       BaseBallGame[] arrs;
       int count;
       String names[] = {"1������", "2������", "3������"};
       
       
       public BaseBallArr() {
              super();
              arrs = new BaseBallGame[10];
       }
       
       public void baseBallDifferent() {
              System.out.println("bDcount00/ī��Ʈ üũ => " + count + "\n");
       
              
              for(int i=0; i<5; i++) {
	              int x = (int)(Math.random()*9+1);
	              System.out.println("ù��° ������: " + x);
	              int y = (int)(Math.random()*9+1);
	              System.out.println("�ι�° ������: " + y);
	              int z = (int)(Math.random()*9+1);
	              System.out.println("����° ������: " + z);
	              count ++;
              
                     if(x == y || x == z || y == z) {
                    	 System.out.println("�ߺ�==> ���� "+ "\n");
                    	 	break;
                     }
                     else {
                    	 
	                     System.out.println(
	                    		 "\n"
	                    				 + "x : " +   x  + "\t" + ", "
	                    				 +      "y :"  +   y + "\t" + ", "
	                    				 +      "z : " +   z  + "\n ");
	                     	System.out.println("�ߺ�==> ���� "+ "\n");
                     }
                    	 
              }
              System.out.println("bDcount01/ī��Ʈ üũ => " + count + "\n");
       
       }
       
       
       Scanner sc = new Scanner(System.in);
       public void baseBallTheSame() {
              System.out.println("baseCount => " + count + "\n");
              
              for(int i = 0; i<count; i++) {
                     System.out.println("���� �Է��� ���� ���� �� a1: "
                                  + "\t");
                     arrs[i].a1 = sc.nextInt();
                     System.out.println("���� �Է��� ���� ���� �� b1: "
                                  + "\t");
                     arrs[i].b1 = sc.nextInt();
                     System.out.println("���� �Է��� ���� ���� �� c1: "
                                  + "\t");
                     arrs[i].c1 = sc.nextInt();
                     System.out.println("\n"
                                           +  "a1 : " + arrs[i].a1
                                  + "\t" + "b1 : " + arrs[i].b1
                                  + "\t" + "c1 : " + arrs[i].c1
                                  + "\t");
              }
              
              
              
       }
       
}