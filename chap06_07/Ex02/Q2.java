package chap06_07.Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	static void math (String...val) {
		int sum = 0;    // ������ ������ ���ϴ� ����
		double avg;     // ����� �����ϴ� ����
		
		for(int i = 0; i < val.length ; i++) {
			// sum += values[i];  // values[i] ��° ���� ���� String Ÿ���̹Ƿ�  ����Ÿ������ ��ȯ
			// sum = sum + Integer.parseInt(values[i]);
					// Integer.parseInt(String) : ������String Ÿ���� ������ ��ȯ
			sum += Integer.parseInt(val[i]);
		}
		
		avg = (double) sum / val.length; // ����� : double Ÿ���̾���Ѵ�.
		System.out.println();
		System.out.println("�Է��� ���Ǽ��� : " + val.length);
		System.out.println("���Ƿ� ���� ���� �հ�� : " + sum);
		System.out.println("���Ƿ� ���� ���� ����� : " + avg);
	}
	
	public static void main(String[] args) {
		// ��ĳ�ʷ� ������ ���� ���� �Ҵ� �޾Ƽ� �հ�� ����� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �־ �Է��ϼ���");
		
		String num = sc.nextLine();  // ������ ���Ƿ� ��ü ���� ���� String
		String[] array1 = num.split(" ");  // splite �� �����ڸ� �������� ���ڸ� �߶� �迭�� ����
		
		System.out.println();
		System.out.println("����� �Է��� ������ : ");
		for (int i = 0 ; i < array1.length ; i++) {    // �Է� ���� ���
			System.out.print(array1[i] + " ");
		}
		math(array1);    // ���� ���� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� array1�� �־��ش�.
	}
	


}
