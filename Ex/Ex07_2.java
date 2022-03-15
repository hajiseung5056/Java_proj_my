package Ex;

import java.util.Scanner;

public class Ex07_2 {
	public static void main(String[] args) {
		System.out.println("====해답====");
		System.out.println("양의 정수 10개를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int [10];
		
		for (int i = 0; i < arr1.length ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		
		// 3의 배수만 출력
		System.out.print("3의 배수는 : ");
		for (int i = 0 ; i<arr1.length;i++) {
			if (arr1[i] % 3 ==0) {
				System.out.print(arr1[i] + " , ");
			}
		}
		sc.close();
	}

}
