package Ex;

import java.util.Scanner;

public class Ex07_2 {
	public static void main(String[] args) {
		System.out.println("====�ش�====");
		System.out.println("���� ���� 10���� �Է� �ϼ���.");
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int [10];
		
		for (int i = 0; i < arr1.length ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		
		// 3�� ����� ���
		System.out.print("3�� ����� : ");
		for (int i = 0 ; i<arr1.length;i++) {
			if (arr1[i] % 3 ==0) {
				System.out.print(arr1[i] + " , ");
			}
		}
		sc.close();
	}

}
