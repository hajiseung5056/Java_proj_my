package chap05;

import java.util.Arrays;

public class Hjs_Q1 {
	public static void main(String[] args) {
		
		int[]arr1 = new int [100] ;
		// for ���� ����ؼ� arr1 �迭�� �� �濡 ���� �Է�
		for(int i = 0; i< arr1.length ;i++) {
			arr1[i] = i+1;                     // arr1[0~99] = i+1; �迭������ ���� �־��ش�.
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
