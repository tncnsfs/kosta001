package kosta.basic;

public class B06_ArraySortExam {

	public static void main(String[] args) {
		//��������
		//1ȸ��:(1�� 2��)-> (1�� 3��) -> (1�� 4��) 
		// 2ȸ��: (2�� 3��) -> (2�� 4��) 
		// 3ȸ��: (3�� 4��) 
		
		int arr[]= {23,59,12,98,25,87,7};
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		for(int n : arr){
			System.out.print(n + ",");
		}
		
		
		
	}
}
