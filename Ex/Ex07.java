package Ex;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// ���� ������ 10�� �Է¹޾� �迭�� �����ϰ� �迭�� �ִ� �߼� �� 3�� ����� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 10���� �Է��ϼ���.");
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
