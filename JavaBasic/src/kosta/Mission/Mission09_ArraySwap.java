package kosta.Mission;

public class Mission09_ArraySwap {
//	static void swap(int[] arr, int idx1, int idx2) {
//		int temp = arr[idx1];
//		arr[idx1] = arr[idx2];
//		arr[idx2] = temp;
		
//		int a = 0, int b= 1, int c = 2 
		
//		int c = int a => int c -> 0
//		int a = int b => int a -> 1
//		int b = int a => int b -> 0
//	}

	
	static boolean equals(int[] a, int[] b){
		
		if(a.length != b.length){
			return false;
		}
		
		for(int i =0; i<a.length; i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
//		 arr3{1,2,3,4,5} �� ������ �ǵ��� ó��
//				int arr3[] = { 1, 2, 3, 4, 5 ,6};
//				swap(arr3, 0, 1);
//				for (int i = 0; i < arr3.length/2; i++) {
//			swap(arr3, i, arr3.length -i -1);
//		}
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println("arr3[" + i + "]=" + arr3[i]);
//		}
//		--------------------------------------------
		// �ΰ��� �迭 a,b�� ��� ��Ұ� ������ ? 
		
		int arr5[] = {1,2,3,4,5};
		int arr6[] = {1,2,3,4,5};
		
		System.out.println("�迭 arr5, arr6" + 
									(equals(arr5, arr6)? "�����ϴ�.": "���� �ʽ��ϴ�"));

	}
}
