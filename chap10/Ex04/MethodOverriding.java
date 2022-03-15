package chap10.Ex04;

// 메소드 오버라이딩 (MethodOverriding) :
	// 1. 반드시 상속 관계에서만 메소드 오버라이딩이 구현된다.
	// 2. 부모 클래스에서 선언된 메소드를 자식 클래스에서 새롭게 정의해서 사용하는것.
	// 3. @Override 라는 이노테이션을 사용하면 메소드 재정의시 오류를 줄일 수 있다.
	// 4. 시그니쳐가 같아야 한다. (메소드명, 매개변수 타입, 매겨변수 갯수)
	// 5. 메소드의 접근 제어자가 같거나 넚어야 한다.

class A {
	void print() {
		System.out.println("A 클래스");
	}
}

class B extends A{
	//@Override		// 메소드 오버라이딩시, 반드시 부모의 메소드를 재정의 하도록 설정.
					// @Override 어노테이션을 사용하지 않을 경우 : 오타가 나거나 형식에 맞지 않을 경우 별개의 메소드로 정의된다.
	void print() {
		System.out.println("B 클래스 ");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A 타입
		A aa = new A();
		aa.print();		// A클래스의 print() 출력
		
		
		// 2. B 타입
		B bb = new B();
		bb.print();		// B클래스의 print() 출력
		
		// 3. A 타입으로 업캐스팅	<== B를 업캐스팅해서 A타입으로 두면
		A ab = new B();		
		ab.print();		// B클래스의 print() 출력
			// ab.print() 는 A클래스의 print를 호출, 동적 바인딩에 의해서 B클래스의 print()를 출력
		
	}

}
