// �迭�� ����߿� �ִ밪�� ����ϼ��� . 
		// �迭 ������

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
	
	// �� ����� Ű�� �Է� �޾Ƽ� 
	// �Է� ���� �迭�� �ִ밪�� ��� �ϱ� .
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.print("����� ��: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		// �� ����� Ű�� �Է� �޾Ƽ�
		for(int i=0; i<height.length; i++){
			System.out.print("height[" + i + "]: ");
			height[i] = sc.nextInt();
		}
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
	}

}
