package chap05;

import java.util.Arrays;

public class Hjs_Q1 {
	public static void main(String[] args) {
		
		int[]arr1 = new int [100] ;
		// for 문을 사용해서 arr1 배열의 각 방에 값을 입력
		for(int i = 0; i< arr1.length ;i++) {
			arr1[i] = i+1;                     // arr1[0~99] = i+1; 배열변수에 값을 넣어준다.
		}
		for(int i = 0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("=========");
		for(int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=========");
		System.out.println(Arrays.toString(arr1));
		
	}

}
