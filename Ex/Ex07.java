package Ex;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 양의 정수를 10개 입력받아 배열에 저장하고 배열에 있는 중수 중 3의 배수만 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하세요.");
		int[] a = new int[10];
		for(int i = 0 ; i < a.length ; i++) {
		a[i] = sc.nextInt();
			if(a[i]%3 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		
		sc.close();
	}

}
