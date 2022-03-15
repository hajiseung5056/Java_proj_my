package chap06_07.Ex02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument2 {

	public static void main(String[] args) {
		// �迭�� ���̰� �������� �ʰ� ���������� ���
		// 1. method1 (int...values) <== �������̸� ó���ϴ� input �Űܺ��� ����
		method1 ();     // �޼ҵ� �������̵� : �޼ҵ���� ��� ����, �Ű������� Ÿ��, ������ ���� �ش� �޼ҵ����
		method1 (1,2);
		method1 (1,2,3);
		method1 (1,2,3,4);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
		
		
		method2 ("�ȳ�", "�氡");
		method2 ("��", "ȭ", "��", "��", "��", "��", "��");
		method2 ("�䳢", "ȣ����", "����", "��");
		
	}
	static void method1(int...values) {  // values �������� �迭�� ��´�
		System.out.println(values.length);
		System.out.println("====Arrays.toString=========="); 
		System.out.print(Arrays.toString(values));
		System.out.println();
		System.out.println("====for======================");
		for(int i = 0 ; i < values.length ; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("====enhanced for=============");
		for (int k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
	}
	static void method2(String...values) {
		System.out.println(values.length);
		System.out.println("====Arrays.toString=========="); 
		System.out.print(Arrays.toString(values));
		System.out.println();
		System.out.println("====for======================");
		for(int i = 0 ; i < values.length ; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("====enhanced for=============");
		for (String k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	/*
	static void method1() {
		System.out.print("�Ű������� ���� �޼ҵ� ȣ��");
		System.out.println();
	}
	static void method1(int a, int b) {
		System.out.print(a + " , " + b);
		System.out.println();
	}
	static void method1(int a, int b, int c) {
		System.out.print(a + " , " + b + " , " + c);
		System.out.println();
	}
	static void method1(int a, int b, int c, int d) {
		System.out.print(a + " , " + b + " , " + c + " , " + d);
		System.out.println();
	}
	static void method1(int a, int b, int c, int d, int e) {
		System.out.print(a + " , " + b + " , " + c + " , " + d + " , " + e);
		System.out.println();
	}
	*/
	
	
	
	
}
