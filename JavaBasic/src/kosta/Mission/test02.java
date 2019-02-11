package kosta.Mission;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n; 
		
		do{
			System.out.print("입력: ");
			n = sc.nextInt();
		}while(n<=0);
		
		int i02 = 1;
		int sum02 = 0;
		while(i02<=n){
			sum02 += i02;
			i02++;
		}
		
		System.out.println(n + "까지 합: " + sum02);

	}

}
