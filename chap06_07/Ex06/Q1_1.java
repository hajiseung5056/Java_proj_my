package chap06_07.Ex06;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		/* ������ � �̸��� �ְ� �ش� ��� ���������� �־ ����ϴ� ���α׷��� �ۼ� ��,
		 * ��ü �հ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * ��)
		 * �Է�>>
		 * Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
		 * 
		 * ���>>
		 * Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
		 * ������� �������� ���հ� : 
		 * ������� ��� �������� : 
		 * 
		 * "�׸�" �̶�� �Է��ϸ� ���α׷� ����
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("��̸� ���������� ������ �̿��ؼ� �Է��ϼ���.");
		System.out.println("��) �Է�>>> Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
		
		String str;		// ��ü String���� ��ǲ�޴� ����
		String[] arr;		// ������ �������� �߶� �迭�� �����ϴ� ����
		
		do {
			int sum = 0; 	// ���������� ���� �����ϴ� ����
			double avg = 0;	// ������� �������� ����� �����ϴ� ���� : (double)sum/�����
			int b = 0; 		// �� ������ ���������� ��� ����
			int memberCount = 0;		
			str = sc.nextLine();	// sc.next() : ��������� String�� ����
			arr = str.split(" ");		// sc.nextLine() : ����(enter) ���� ��ü�� String�� ����
			if(str.equals("�׸�")) {	// str�� ������ �������� �߶� arr �迭�� ����
				break;
			}
			for(int i = 0 ; i < arr.length ; i++) {
				if(i%2 != 0) {		// i : ���ǹ�ȣ, ���ڸ�������´�
					b = Integer.parseInt(arr[i]);	// ������ Ÿ���� ������ ��ȯ
					sum += b;
					memberCount++;	
				}
				
			}
			avg = (double)sum/memberCount;
			
			System.out.println(str);
			System.out.println("�������� ���� : " + sum);
			System.out.println("�������� ��� : " + avg);
			
		}while(true);
		
		
		
		
		
		
	}

}
