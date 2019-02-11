// 배열의 요소중에 최대값을 출력하세요 . 
		// 배열 생성후

package kosta.Mission;

import java.util.Scanner;

public class Mission08_for {
	
	static int maxOf(int[] arr){
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	// 각 사람의 키를 입력 받아서 
	// 입력 받은 배열의 최대값을 출력 하기 .
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람의 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		// 각 사람의 키를 입력 받아서
		for(int i=0; i<height.length; i++){
			System.out.print("height[" + i + "]: ");
			height[i] = sc.nextInt();
		}
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
	}

}
