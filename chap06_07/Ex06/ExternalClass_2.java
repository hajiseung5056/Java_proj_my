package chap06_07.Ex06;

import chap06_07.Ex05.Bb;	// 다른 패키지의 클래스에서 클래스를 호출할때 public 접근제한자가 부여되어 있어야 한다.

// import chap06_07.Ex05.B ;		// class B는 접근 제어자가 default 이기 때문에 다른 패키지에서 접근 불가.

public class ExternalClass_2 {

	public static void main(String[] args) {

		// B b = new B();
		// 다른 패키지의 클래스에서 Bb클래스를 접근하는경우
			// 1. improt 를 먼저사용
			// 2. Bb 클래스의 클래스 접근제한자에 public키가 사용되어야한다.
			// 3. 필드, 메소드의 접근 제한자에 따라서 접근이 가능(protected(상속관계),public), 불가능(private, default)
		Bb bb = new Bb();		// 다른 패키지의 클래스 : 1. 클래스 접근 제어자에 public
		
		// bb.a = 10;	// private : 같은 클래스 내에서만 접근
		// bb.b = 10;	// default : 같은 패키지 내에서만 접근
		// bb.c = 10;	// protected : 같은 패키지 내에서접근 + 상속관계인 다른패키지에서 접근가능
		bb.d = 40;		// public : 다른패키지에서 접근 가능
		
		// 메소드 접근
		
		// bb.print1();	// private : 접근불가
		// bb.print2();	// default : 접근불가
		// bb.print3();	// protected : 접근불가	외부의 다른 패키지에서 접근 할려면 상속 관계가 필요.
		bb.print4();	// public : 접근가능
		
		
	}

}
