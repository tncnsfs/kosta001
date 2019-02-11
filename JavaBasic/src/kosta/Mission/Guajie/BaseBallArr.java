package kosta.Mission.Guajie;

import java.util.Scanner;


public class   BaseBallArr  {
       
       BaseBallGame[] arrs;
       int count;
       String names[] = {"1번숫자", "2번숫자", "3번숫자"};
       
       
       public BaseBallArr() {
              super();
              arrs = new BaseBallGame[10];
       }
       
       public void baseBallDifferent() {
              System.out.println("bDcount00/카운트 체크 => " + count + "\n");
       
              
              for(int i=0; i<5; i++) {
	              int x = (int)(Math.random()*9+1);
	              System.out.println("첫번째 랜덤수: " + x);
	              int y = (int)(Math.random()*9+1);
	              System.out.println("두번째 랜덤수: " + y);
	              int z = (int)(Math.random()*9+1);
	              System.out.println("세번째 랜덤수: " + z);
	              count ++;
              
                     if(x == y || x == z || y == z) {
                    	 System.out.println("중복==> 있음 "+ "\n");
                    	 	break;
                     }
                     else {
                    	 
	                     System.out.println(
	                    		 "\n"
	                    				 + "x : " +   x  + "\t" + ", "
	                    				 +      "y :"  +   y + "\t" + ", "
	                    				 +      "z : " +   z  + "\n ");
	                     	System.out.println("중복==> 없음 "+ "\n");
                     }
                    	 
              }
              System.out.println("bDcount01/카운트 체크 => " + count + "\n");
       
       }
       
       
       Scanner sc = new Scanner(System.in);
       public void baseBallTheSame() {
              System.out.println("baseCount => " + count + "\n");
              
              for(int i = 0; i<count; i++) {
                     System.out.println("내가 입력한 값을 받을 값 a1: "
                                  + "\t");
                     arrs[i].a1 = sc.nextInt();
                     System.out.println("내가 입력한 값을 받을 값 b1: "
                                  + "\t");
                     arrs[i].b1 = sc.nextInt();
                     System.out.println("내가 입력한 값을 받을 값 c1: "
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