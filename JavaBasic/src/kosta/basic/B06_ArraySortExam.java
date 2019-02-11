package kosta.basic;

public class B06_ArraySortExam {

	public static void main(String[] args) {
		//선택정렬
		//1회전:(1번 2번)-> (1번 3번) -> (1번 4번) 
		// 2회전: (2번 3번) -> (2번 4번) 
		// 3회전: (3번 4번) 
		
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
