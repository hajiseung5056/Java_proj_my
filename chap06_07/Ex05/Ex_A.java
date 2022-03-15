package chap06_07.Ex05;

// 같은 패키지 내에서 class A 접근
public class Ex_A {

	public static void main(String[] args) {
		// A class 는 같은 패키지 내부에 존재하므로 import없이 사용가능
		
		A a = new A();		// import 없이 사용 : A class가 같은 패키지 내에 존재
		
		a.m = 10;	// A class 의 접근 제어자가 default, 같은패키지내의 다른클래스에서 접근가능
		a.n = 20;	
		
		a.print();	// default 접근제어자 이므로 접근이 가능 
	}

}
