package chap06_07.Ex02;

import chap06_07.Ex03.Aaaa;



public class ExternalCallMethods {

	public static void main(String[] args) {
		// 객체생성
		Aaaa a = new Aaaa();   // 같은 패키지 내의 클래스는 import없이 호출해서 사용가능
		
		// 메소드 호출
		a.print();
		int k = a.data();       // 3
		System.out.println(k);

		double result = a.sum(3, 5.2);
		System.out.println(result);  // 8.2
		
		a.printMethod(1);      // 1 ~ 12
		a.printMethod(25);
		
		// 주의
		System.out.println(a.data());  // 출력구문에 호출 가능한 메소드 (리턴이 있는 메소드,)
		//System.out.println(a.print());  // 메소드안에 출력구문이 있는경우 출력구문에호출하면 오류발생
		
		
		
	}

}
