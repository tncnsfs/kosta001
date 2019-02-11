package kosta.basic;

public class B07_ArrayExam2 {

	public static void main(String[] args) {
//		int arr[][]; //2차원 배열 선언 
//		arr = new int[3][2];
//		
//		// 2차원의 배열의 크기를 상이하게 
//		int arr2[][] = new int[3][];
//		arr[0] = new int[2];
//		arr[1] = new int[4];
//		arr[2] = new int[8];
//		
//		//3. 2차원배열 선언, 생성, 초기화
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};
		
		for(int i=0; i<=arr3.length; i++){
//			System.out.println(i);
			for(int j = 0; j<arr3[i].length; j++){
				System.out.println("값은 =>"+"[" +i +"][" + "["+j+"]=" + arr3[i][j]);
			}
		}
		
//		-----------------------------------
		String oldArr[] = new String[5];
		oldArr[0] = "10";
		oldArr[1] = "20";
		oldArr[2] = "30";
		
//		for(int i =0; i<oldArr.length; i++){
//			if(oldArr[i].equals("30")){
//				System.out.println("30");
//			}
//		}

		String newArr[] = new String[3];
		
		
		
		System.arraycopy(oldArr, 0, newArr, 0, newArr.length);
		
		
		for(int i =0; i<newArr.length; i++){
		if(newArr[i].equals("30")){
			System.out.println("30");
		}
	}
		
	}
}
