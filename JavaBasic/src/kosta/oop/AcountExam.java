package kosta.oop;

import java.util.Scanner;

public class AcountExam {

	public static void main(String[] args) {
		
		
		Acount arr[] = {(new Acount("�츮����", "1111-111", 10)),
								(new Acount("��������", "222-222", 20)),
								new Acount("��������", "333-333", 30)};
		
		
		
		
		for(int i =0; i<arr.length; i++){
			arr[i].sangtae(arr[i].value);
			arr[i].jineng();
			
		}
		
		
		
		
	}

}
