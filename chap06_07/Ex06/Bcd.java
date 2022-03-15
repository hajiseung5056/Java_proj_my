package chap06_07.Ex06;

import chap06_07.Ex05.External_Abc;

public class Bcd {		// 부모클래스

	public int a = 10;
	protected int b = 20;	// 다른패키지의 자식클래스에서 접근이 가능
	int c = 30;
	private int d = 40;
	
	// Bcd(){} <== 기본생성자(생략되어있음) : 필드의 초기값을 부여해서 객체를 생성
	
	public void print1() {
		System.out.println("다른패키지에서 접근가능 : public");
	}
	protected void print2() {
		System.out.println("다른 패키지에서 접근 가능(상속관계가 구성될때) : protected");
	}
	void print3() {
		System.out.println("같은 패키지에서만 접근 가능 : default");
	}
	private void print4() {
		System.out.println("같은 클래스에서만 접근 가능 : private");
	}
}
