package chap06_07.Ex06;

import chap06_07.Ex05.A;

// 다른 패키지에서 class A 접근
public class Ex_A {

	public static void main(String[] args) {
		
		// 다른 패키지의 객체를 사용하는 방법
			// 1. 전체 클래스 이름을 사용
		chap06_07.Ex05.A a = new chap06_07.Ex05.A ();		// 클래스의 전체이름을 사용 : 패키지명.클래스명
		//a.m = 10;  // 접근불가 : default 는 같은 패키지 내에서만 접근 가능
		a.k = 50;
		a.print2();
	}

}
