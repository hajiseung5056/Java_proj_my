package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;

// import chap06_07.Ex06.Abc; <== Abc class에 접근제한자가 default : 외부패키지에서 접근불가

public class External_Abc extends Bcd {
			// 부모 클래스 Bcd, 자식클래스 External_Abc
	public static void main(String[] args) {
		// Abc abc2 = new Abc(); <== Abc class에 접근제한자가 default : 외부패키지에서 접근불가
		Bcd bcd1 = new Bcd();					// 부모 클래스 객체
		External_Abc ext = new External_Abc();	// 자식 클래스
		
		// 다른 패키지에서 필드 호출 : 1. import, 2. 객체생성, 3. 접근지정자 확인 후 접근 (필드, 메소드)
		bcd1.a = 1000;	// public : 다른 패키지에서 접근가능
		//bcd1.b = 2000;	// protected : 상속관계인 다른패키지에서 접근가능
		bcd1.print1();
		ext.b = 2000;	// 자식클래스에서 부모클래스의 protected를 다른패키지에서 접근
	}

}
