package chap06_07.Ex02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument2 {

	public static void main(String[] args) {
		// 배열의 길이가 고정되지 않고 가변길이인 경우
		// 1. method1 (int...values) <== 가변길이를 처리하는 input 매겨변수 설정
		method1 ();     // 메소드 오버라이딩 : 메소드명은 모두 동일, 매개변수의 타입, 갯수에 따라 해당 메소드출력
		method1 (1,2);
		method1 (1,2,3);
		method1 (1,2,3,4);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
		
		
		method2 ("안녕", "방가");
		method2 ("월", "화", "수", "목", "금", "토", "일");
		method2 ("토끼", "호랑이", "여우", "곰");
		
	}
	static void method1(int...values) {  // values 변수에는 배열을 담는다
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
		System.out.print("매개변수가 없는 메소드 호출");
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
